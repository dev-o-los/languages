text = "Ramesh went to Patna and bought 20 Tomato apples in an orchard."
forbidden = {"Ramesh", "Tomato", "Patna"}

words = text.split()
cleaned_words = []

for word in words:
    if word.isdigit():  # Skip numbers
        continue
    if word[0].lower() in "aeiouAEIOU":  # Skip words starting with a vowel
        continue
    if word in forbidden:  # Skip forbidden nouns
        continue
    cleaned_words.append(word)

print(" ".join(cleaned_words))
