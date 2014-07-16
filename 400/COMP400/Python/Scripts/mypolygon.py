from swampy.TurtleWorld import *
from math import *

world = TurtleWorld()
bob = Turtle()
bob.delay = 0.01

def square(t, length):
	for i in range(4):
		fd(t, length)
		lt(t)

def polygon(t, n, length):
        angle = 360. / n
	polyline(t, n, length, angle)

def circle(t, r):
        arc(t, r, 360)

def arc(t, r , angle):
        arc_length = 2 * pi * r * angle / 360
        n = int(arc_length / 3) + 1
        step_length = arc_length / n
        step_angle = float(angle) / n
        polyline(t, n, step_length, step_angle)
        
def polyline(t, n, length, angle):
        for i in range(n):
                fd(t, length)
                lt(t, angle)

square(bob, length=50)
polygon(bob, n=8, length=50)
circle(bob, r=90)
arc(bob, r=70, angle=180)

wait_for_user()
