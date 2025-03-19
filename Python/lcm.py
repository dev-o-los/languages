import math


def findlcm(x, y):
    gcd = math.gcd(x, y)
    lcm = (x * y) // gcd
    return lcm


res = findlcm(12, 18)
print(res)
