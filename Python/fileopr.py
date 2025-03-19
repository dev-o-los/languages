def count(filename):
    with open(filename, "r") as file:
        lines = file.read()
        c = lines.title()
        print(c)
        # line_count = len(lines)
        # word_count = sum(len(line.split()) for line in lines)
        # chr_count = sum(len(line.strip()) for line in lines)

        # return line_count, word_count, chr_count


def onlynumbers(filename):
    new = []
    with open(filename, "r") as file:
        content = file.read()
        for word in content:
            if word.isdigit():
                new.append(word)
            else:
                continue

    print(new)


onlynumbers("C:/Users/utk27/Documents/languages/Python/abc.txt")

# print(f"Lines: {lc} Words: {wc} Characrter: {cc} ")
