# Windows-Paint

## Description: 
A simulator of Paints application on Windows but with more simpler functions, including choosing shapes to draw, border colors for shapes, save and open, undo and delete.
Here is a fun chicken image I drew using this app:

<img height = "400" src = "https://user-images.githubusercontent.com/122738041/223013140-7aa8202d-d108-43f7-b5be-83200ebe3e15.png">

## Build With: 
Java
  
## Data Structures and Tools used:
- JavaFX and Canvas: create graphics user interfaces

- Button: Border Color Button and Shapes Button
  * Border Color Button: to set the color of each shape drawn, including black, blue, green, orange, red and yellow
  * Shapes Button: select the shape to draw, including line, rectangle, and circle
 
- HashMap: to map color constants with their corresponding String form

- Shapes: including line, rectangle and circle. When each new shape is drawn, it is added into _**ArrayList paints**_ containing Shapes object. Each time a shape is drawn, canvas will have to clean everything and start drawing the existing shapes in the _**ArrayLis paintst**_

- Try - catch, File & FileWriter: 
  + Save Choice on Menu:
   * Save the drawn pictures into _.txt_ files, with the positions of starting and ending points of shapes and their colors 
  + Open Choice on Menu:
   * Read information in .txt files and convert it into shapes

- Multiple Windows: OpenBox and SaveBox
  + When Save or Open is clicked, these boxes appear to ask for the file name (in _.txt_ form)
  
- Undo Choice on Menu: undo the current shape drawn by deleting the outer element in _**ArrayLis paintst**_

- Delete Choice on Menu: Delete everything


## Instructions on how to use:
