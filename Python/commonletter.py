def find_common(a, b):
    set1 = set(a)
    set2 = set(b)

    com_lett = set1.intersection(set2)
    com_lett = sorted(com_lett)
    for lett in com_lett:
        print(lett)


d = {"A": 100, "B": 100, "C": 100}

print(sum(d.values()))

find_common("Hari", "Hale")


num = [1, 2, 3, 4, 5]

square = lambda x: x**2

squared = [square(n) for n in num]

print(squared)
