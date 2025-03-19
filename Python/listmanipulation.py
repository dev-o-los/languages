import math

a = [1, 2, 3, 4, 5, 6, 7, 8, 9]


# print(a)

# print(a[len(a) : 0 : -1])
# print(a[2 : len(a) - 1])
# print(a[2 : len(a) - 1])
# print(a[len(a) // 2 :])
# aa = a[len(a) // 2 :: -1] + a[(len(a) + 1) // 2 :]
# print(aa)

# remd = lambda x: x % 2

# remlist = [remd(num) for num in a]
# print(remlist)

# mapa = map(lambda x: x, a)

# print(mapa)


# def perfectsrw(num):
#     sqrt = math.isqrt(num)
#     if sqrt * sqrt == num:
#         print(1)
#     else:
#         print(-1)


# perfectsrw(25)


# aa = "Hello world"

# print(",".join(word[::-1] for word in aa.split(",")))


def fun(str, n):
    if n >= len(str):
        print(str)
    else:
        print(str[:n] + str[n + 1 :])


fun("MANG0", 3)
