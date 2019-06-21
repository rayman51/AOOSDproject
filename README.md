# AOOSDproject
Advanced Object-Oriented Programming Project 2018

**Author:** Ray Mannion
Student Number: G00340315

## Introduction:

This is an isometric 2d game with very simple game play. The goal of the game is to collect four chests placed throughout the map.
 The player starts at the top right of the screen, at point 0.0, and using the arrow keys can walk around the map, 
but only on certain tiles that don’t have other obstacles placed on them such as trees, water or logs. 
Once the player has collected all four chests the game ends.

### Singleton Pattern:
The singleton pattern is used to generate a single instance of the game window. 
This only allows one instance of the game window to be created and removes any further instances being created.
This ensures only one instance of the game is running at a time.

### Factory Pattern:
The factory pattern is used to create the player in the game. 
There are four characters in the game but only one is used. 
The factory pattern allows the program to generate players using sprites and it returns an object of that type.

### Builder Pattern:
The builder pattern is used to create tiles in the game using the Sprite Builder, 
Item Builder and the Ground Builder classes. This allows objects to be built when needed without having multiple constructors for each object.

### Iterator Pattern:
The iterator pattern is used to iterate through the resource folder that contains the sprite images required for objects in the game.

### Run the game:
To run the game, simply add the package and resource folder to a project in eclipse and run as normal. 
To run as a jar file, cd to the location of the jar and run the command

java --module-path ./isogame.jar --module gmit.software/ie.gmit.sw.Runner

Make sure the resource folder in the same location as the jar file.


