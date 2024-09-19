import pandas as pd


# Function to calculate midpoints of class intervals
def class_midpoints(class_intervals):
    return [(i[0] + i[1]) / 2 for i in class_intervals]


# Function to calculate detailed steps for each row in the table
def detailed_steps(class_intervals, midpoints, frequencies, ref_value):
    table_data = {
        "CI": [],
        "Fr(f)": [],
        "Mid(x)": [],
        "(x-ref)": [],
        "(x-ref)*f": [],
        "(x-ref)^2*f": [],
        "(x-ref)^3*f": [],
        "(x-ref)^4*f": [],
    }

    for i in range(len(midpoints)):
        x = midpoints[i]
        f = frequencies[i]
        deviation = x - ref_value
        dev_sq = deviation**2
        dev_cube = deviation**3
        dev_quad = deviation**4

        table_data["CI"].append(f"{class_intervals[i][0]} - {class_intervals[i][1]}")
        table_data["Fr(f)"].append(f)
        table_data["Mid(x)"].append(x)
        table_data["(x-ref)"].append(round(deviation, 2))
        table_data["(x-ref)*f"].append(round(deviation * f, 2))
        table_data["(x-ref)^2*f"].append(round(dev_sq * f, 2))
        table_data["(x-ref)^3*f"].append(round(dev_cube * f, 2))
        table_data["(x-ref)^4*f"].append(round(dev_quad * f, 2))

    return table_data


# Function to calculate the moments
def calculate_moments(table_data):
    total_f = sum(table_data["Fr(f)"])

    m1 = sum(table_data["(x-ref)*f"])
    m2 = sum(table_data["(x-ref)^2*f"])
    m3 = sum(table_data["(x-ref)^3*f"])
    m4 = sum(table_data["(x-ref)^4*f"])

    moment_1 = m1 / total_f
    moment_2 = m2 / total_f
    moment_3 = m3 / total_f
    moment_4 = m4 / total_f

    m_m2 = moment_2 - moment_1**2
    m_m3 = moment_3 - 3 * moment_2 * moment_1 + 2 * moment_1**3
    m_m4 = (
        moment_4
        - 4 * moment_3 * moment_1
        + 6 * moment_2 * moment_1**2
        - 3 * moment_1**4
    )

    return {
        "Sigma m1": m1,
        "Sigma m2": m2,
        "Sigma m3": m3,
        "Sigma m4": m4,
        "1st Moment (about ref)": moment_1,
        "2nd Moment (about ref)": moment_2,
        "3rd Moment (about ref)": moment_3,
        "4th Moment (about ref)": moment_4,
        "1st Moment (about mean)": 0,
        "2nd Moment (about mean)": m_m2,
        "3rd Moment (about mean)": m_m3,
        "4th Moment (about mean)": m_m4,
    }


# Function to calculate skewness and kurtosis
def calculate_skewness_kurtosis(moments):
    variance = moments["2nd Moment (about mean)"]
    skewness = moments["3rd Moment (about mean)"] / (variance**1.5)
    kurtosis = moments["4th Moment (about mean)"] / (variance**2)
    return skewness, kurtosis


# Function to display detailed steps in table format
def display_detailed_table(table_data, ref_value, moments, skewness, kurtosis):
    df = pd.DataFrame(table_data)
    print("\n--- Detailed Calculation Table ---")
    print(df.to_string(index=False))

    print("\n--- Calculations ---")
    print(f"Reference Value: {ref_value:.2f}")
    for moment_name, value in moments.items():
        print(f"{moment_name}: {value:.2f}")
    print(f"Skewness: {skewness:.2f}")
    print(f"Kurtosis: {kurtosis:.2f}")


# Main function
def main():
    # Sample input of class intervals and frequencies
    class_intervals = [
        (10, 15),
        (15, 20),
        (20, 25),
        (25, 30),
        (30, 35),
        (35, 40),
        (40, 45),
        (45, 50),
        (50, 55),
    ]
    frequencies = [1, 4, 8, 19, 35, 20, 7, 5, 1]

    # Step-by-step calculation
    midpoints = class_midpoints(class_intervals)
    ref_value = sum(midpoints) / len(
        midpoints
    )  # Using the midpoint of the midpoints as reference value
    table_data = detailed_steps(class_intervals, midpoints, frequencies, ref_value)
    moments = calculate_moments(table_data)
    skewness, kurtosis = calculate_skewness_kurtosis(moments)

    # Display the final table with detailed steps
    display_detailed_table(table_data, ref_value, moments, skewness, kurtosis)


if __name__ == "__main__":
    main()
