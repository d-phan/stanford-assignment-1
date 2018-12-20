import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.*;

/*
    The following program draws a pyramid of blocks.  The pyramid must be centered and the block sizes must be
    configurable in the program.
            Plan :
                1. Create methods to draw a block then a row
                2. Figure out where to draw first row
                3. Iterate via while loop to continue drawing rows while decreasing row size
                4. End while loop when row size reachs 0
            Considerations :
                1. Logic for staggering rows
                2. Starting location
         */
public class PyramidDraw extends GraphicsProgram {

    public void run() {

        // initialize variables
        int brickWidth = 30;
        int brickHeight = 12;
        int bricksInBase = 14;
        int currentWindowHeight = getHeight();
        int currentWindowWidth = getWidth();
        int currentRowSize = bricksInBase;
        int startX = currentWindowWidth/2 - (int) (brickWidth*((bricksInBase)/2.0));
        int startY = currentWindowHeight - brickHeight;

        // draw a row then decrement number of rows, changing x and y each time
        while(currentRowSize >= 1) {
            drawRow(startX, startY, currentRowSize, brickWidth, brickHeight);
            currentRowSize--;

            // logic for incrementing x and decrementing y
            startX += brickWidth/2;
            startY -= brickHeight;
        }


    }

    /*
        Create method to create block object and add it to canvas
     */
    public void drawBlock(int x, int y, int brickWidth, int brickHeight) {
        GRect block = new GRect(x, y, brickWidth, brickHeight);
        add(block);
    }

    /*
        Create a method to draw a row of blocks
     */
    public void drawRow(int x, int y, int rowSize, int brickWidth, int brickHeight) {
           for(int i = 0; i<rowSize; i++){
                drawBlock(x + brickWidth * i, y, brickWidth, brickHeight);
           }
    }

}