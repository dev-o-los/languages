import random

randnum = random.randint(0,100)

inp = int(input('Guess num: '))

while(inp != random):
    if(inp<randnum):
        print('Guess little higher')
    elif(inp>randnum):
        print('Guess little lower')
    elif(inp==randnum):
        print('You got it!, Yes',randnum,'was the hidden number')
        exit(0)
    inp = int(input('Guess num: '))