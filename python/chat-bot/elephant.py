import turtle

# Function to draw the elephant's trunk
def draw_trunk():
  turtle.color('gray')
  turtle.pensize(60)
  turtle.right(90)
  turtle.forward(70)
  turtle.left(40)
  turtle.forward(40)
  turtle.right(30)
  turtle.forward(30)
  turtle.left(10)
  turtle.forward(25)
  turtle.right(5)
  turtle.forward(10)
  turtle.left(20)
  turtle.forward(45)

# Function to draw the elephant's ear
def draw_ear():
  turtle.color('gray')
  turtle.pensize(60)
  turtle.right(120)
  turtle.forward(120)
  turtle.left(120)
  turtle.forward(85)
  turtle.left(90)
  turtle.forward(30)

# Function to draw the elephant's body
def draw_body():
  turtle.color('gray')
  turtle.pensize(60)
  turtle.right(30)
  turtle.forward(125)
  turtle.left(20)
  turtle.forward(100)
  turtle.right(45)
  turtle.forward(70)
  turtle.right(90)
  turtle.forward(45)
  turtle.right(180)
  turtle.forward(60)
  turtle.right(45)
  turtle.forward(90)
  turtle.left(180)
  turtle.forward(80)
  turtle.right(90)
  turtle.forward(100)

# Initialize the turtle and set the starting position
turtle.setup(800, 600)
turtle.penup()
turtle.goto(-200, 0)
turtle.pendown()

# Call the functions to draw the elephant's trunk, ear, and body
draw_trunk()
draw_ear()
draw_body()

# Exit the turtle graphics window
turtle.exitonclick()
