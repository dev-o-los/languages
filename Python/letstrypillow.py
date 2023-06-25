from PIL import ImageFont,ImageDraw,Image
import textwrap

height = width = 1080

image = Image.new('L',(height,width),'white')
draw = ImageDraw.Draw(image)
max_width = 50

font = ImageFont.truetype('FreeMono.ttf',30)

q1 = 'hello world'

quote = '''“For many years, I have been moved by the blue at the far edge of what can be seen, that color of horizons, of remote mountain ranges, of anything far away. The color of that distance is the color of an emotion, the color of solitude and of desire, the color of there seen from here, the color of where you are not. And the color of where you can never go. For the blue is not in the place those miles away at the horizon, but in the atmospheric distance between you and the mountains.

“Longing,” says the poet Robert Hass, “because desire is full of endless distances.” Blue is the color of longing for the distances you never arrive in, for the blue world.”'''

wrap_q = textwrap.wrap(quote,max_width)
h,w = draw.textsize(wrap_q[len(wrap_q)-1],font)

x = 100
y = (height-h)/2

for line in wrap_q:
    draw.text((x,y),line,font=font,fill='black')
    y+=50

image.save('img.jpg')