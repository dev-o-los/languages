def count(filename):
    with open(filename, "r") as file:
        lines = file.read()
        c = lines.title()
        print(c)
        # line_count = len(lines)
        # word_count = sum(len(line.split()) for line in lines)
        # chr_count = sum(len(line.strip()) for line in lines)

        # return line_count, word_count, chr_count


count("C:/Users/utk27/Documents/languages/Python/abc.txt")

# print(f"Lines: {lc} Words: {wc} Characrter: {cc} ")
