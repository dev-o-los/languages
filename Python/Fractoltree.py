import turtle as tl

tl.penup()
tl.pencolor('green')
tl.setposition(0,-200)
tl.left(90)
tl.pendown()
tl.pensize(2)
tl.speed(300)

def drawTree(size,level,angle):
    if level > 0:
        tl.forward(size)
        tl.right(angle)
        drawTree(0.8*size, level-1, 45)
        tl.left(angle*2)
        drawTree(size*0.8, level-1, 45)
        tl.right(angle)
        tl.backward(size)

drawTree(80, 10, 30)

tl.hideturtle()
tl.done()