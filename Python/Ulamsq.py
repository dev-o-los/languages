import turtle as tl


def move90(limit):
    a = 1
    b = 1
    d = 0
    list = []
    for i in range(limit):
        if (i == 0):
            continue
        if (i == 1):
            d = a+b
            list.append(d)
            continue
        d = d+b
        list.append(d)
        if (i % 2 == 0):
            b = b+1
    return list


def isPrime(n):
    if (n == 1):
        return False
    else:
        for i in range(2, n):
            while (n % i == 0):
                return False

    return True


def makeulamsq(limit):
    tl.color('black')
    list = move90(limit+1)
    for i in range(1, limit+1):
        if i in list:
            if (isPrime(i)):
                tl.dot(10)
            tl.left(90)
            tl.forward(17)
        else:
            if (isPrime(i)):
                tl.dot(10)
            tl.forward(17)

    tl.hideturtle()
    tl.ht()
    tl.done()


makeulamsq(1000)
