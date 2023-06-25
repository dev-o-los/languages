import pygame , random , time


WHITE = (255,255,255)
BLUE = (0,0,255)
GREEN = (0,255,0)
width_screen,height_screen = 1000,900


pygame.init()
screen = pygame.display.set_mode((width_screen,height_screen))
pygame.display.set_caption('Maze Generator')
clock = pygame.time.Clock()


grid = []
stack = []
visted = []

def cell(x,y,w):
    pygame.draw.line(screen, WHITE,(x,y),(x,y+w))
    y = y+w
    pygame.draw.line(screen, WHITE,(x,y),(x+w,y))
    x = x+w
    pygame.draw.line(screen, WHITE,(x,y),(x,y-w))
    y = y-w
    pygame.draw.line(screen, WHITE,(x,y),(x-w,y))

def make_grid(x,y,w,row,col):
    x = x
    y = y
    org_x = x
    for i in range(row):    
        for j in range(col):
            cell(x, y,w)
            grid.append((x,y))
            x = x + w
        x = org_x
        y = y + w

def move_right(x,y,w):
    pygame.draw.rect(screen, BLUE, (x+1,y+1,2*w-1,w-1),0)        #right
    pygame.display.update()

def move_bottom(x,y,w):
    pygame.draw.rect(screen, BLUE, (x+1,y+1,w-1,2*w-1),0)       # bottom
    pygame.display.update()

def move_up(x,y,w):
    pygame.draw.rect(screen, BLUE, (x+1,y-w+1,w-1,2*w-1),0)   #up
    pygame.display.update()

def move_left(x,y,w):
    pygame.draw.rect(screen, BLUE, (x-w+1,y+1,2*w-1,w-1),0)   #left
    pygame.display.update()

def single_cell(x,y,w):
    pygame.draw.rect(screen, BLUE, (x+1,y+1,w-1,w-1))
    pygame.display.update()

def backtrack_cell(x,y,w):
    pygame.draw.rect(screen, GREEN, (x+1,y+1,w-1,w-1))
    pygame.display.update()

def make_maze(x,y,w):
    stack.append((x,y))
    visted.append((x,y))
    while(len(stack)>0):
        time.sleep(0.07)
        cell = []
        if (x+w,y) not in visted and (x+w,y) in grid:
            cell.append('right')
        if (x-w,y) not in visted and (x-w,y) in grid:
            cell.append('left')
        if (x,y+w) not in visted and (x,y+w) in grid:
            cell.append('bottom')
        if (x,y-w) not in visted and (x,y-w) in grid:
            cell.append('up')
        
        if len(cell)>0:
            choose_cell = random.choice(cell)

            if choose_cell == 'right':
                move_right(x, y, w)
                x = x+w
                stack.append((x,y))
                visted.append((x,y))
            
            elif choose_cell == 'left':
                move_left(x, y, w)
                x = x-w
                stack.append((x,y))
                visted.append((x,y))
            
            elif choose_cell == 'bottom':
                move_bottom(x, y, w)
                y = y+w
                stack.append((x,y))
                visted.append((x,y))
            
            elif choose_cell == 'up':
                move_up(x, y, w)
                y = y-w
                stack.append((x,y))
                visted.append((x,y))
            
        else:
            x,y = stack.pop()
            time.sleep(0.05)
            backtrack_cell(x, y, w)
            single_cell(x, y, w)
            

def generate_maze(start_pos_x:int,start_pos_y:int,cell_width:int,rows:int,cols:int):
    x,y,w=start_pos_x,start_pos_y,cell_width
    make_grid(x,y,w,rows, cols)
    make_maze(x, y, w)

generate_maze(90, 50, 20, 20, 40)


# ##### pygame loop #######
running = True
while running:
    # keep running at the at the right speed
    clock.tick(30)
    # process input (events)
    for event in pygame.event.get():
        # check for closing the window
        if event.type == pygame.QUIT:
            running = False