import turtle as tl

tl.bgcolor('black')
tl.pencolor('white')


def triangle(cood:tuple=(0,0),isinverted = False):
    tl.penup()
    tl.setpos(cood)
    tl.pendown()
    for _ in range(3):
        tl.forward(100)
        if not isinverted:
            tl.left(120)
        else:
            tl.right(120)
        tl.forward(100)

def star(cood:tuple):
    triangle(cood)    
    triangle((cood[0],cood[1]+110),True)

star((0,0))

tl.hideturtle()
tl.done()