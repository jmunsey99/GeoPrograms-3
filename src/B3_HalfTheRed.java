public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);
        plane.showBackGround();
        System.out.println(plane.howMuchRed());

        for (int row = 1; row < 800; row = row + 1) {
            //change
            for (int col = 1; col < 1000; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if(red>190 && blue > 20 && green <50) {
                    plane.setPixelColor(178,166, 126);
                }else{ plane.setPixelColor( red, green, blue);




                }
                if (col<129){

                    plane.setPixelColor(col/4, green/4, row/4);
                }

                if (col>675){
                    plane.setPixelColor(col/4,green/4,row/4);
                }

                if(row<65){
                    plane.setPixelColor(col/4,green/4,row/4);
                }

                if(row>739){
                    plane.setPixelColor(col/4,green/4,row/4);




                }


    //            plane.teleport(col, 800 - row);
             //   plane.setPixelColor(col/4, green/2, row/4);
            }




        }
        plane.teleport(129,66);
        plane.isTrail = true;
        plane.pausetime = 0;
        plane.setColor(0,0,0);
        plane.trailWidth = 20;
        plane.startingAngle(0);
        plane.move(100);
        plane.turn(270);
        plane.move(120);
        plane.turn(330);
        plane.move(200);
        plane.turn(210);
        plane.move(290);
        plane.turn(270);
        plane.move(90);
        plane.turn(270);
        plane.move(100);
        plane.turn(330);
        plane.move(155);
        plane.turn(210);
        plane.move(220);
        plane.turn(270);
        plane.move(70);
        plane.turn(270);
        plane.move(90);
        plane.turn(325);
        plane.move(90);
        plane.turn(215);
        plane.trailWidth = 30;
        plane.move(150);
        plane.turn(270);
        plane.move(50);
        plane.turn(270);
        plane.move(80);
        plane.teleport(180,120);
        plane.trailWidth=30;
        plane.startingAngle(90);
        plane.move(100);
        plane.teleport(209,129);
        plane.move(65);
        plane.teleport(203,452);
        plane.trailWidth = 60;
        plane.move(220);
        plane.turn(270);
        plane.move(75);
        plane.teleport(161,674);
        plane.startingAngle(270);
        plane.move(220);
        plane.turn(180);
       plane.teleport(129,455);
       plane.move(220);
       plane.teleport(207,410);
       plane.startingAngle(180);
       plane.move(78);
       plane.teleport(161,408);
       plane.startingAngle(220);
       plane.move(40);
       plane.teleport(540,68);
       plane.trailWidth = 130;
       plane.startingAngle(90);
       plane.move(335);
       plane.teleport(492,68);
       plane.trailWidth = 50;
       plane.move(170);
       plane.teleport(493,68);
       plane.startingAngle(180);
       plane.move(150);
       plane.teleport(580,532);
       plane.startingAngle(45);
       plane.trailWidth = 40;
       plane.move(70);
       plane.teleport(607,519);
       plane.startingAngle(45);
       plane.move(35);
       plane.teleport(658,532);
       plane.startingAngle(270);
      plane.trailWidth = 20;
       plane.move(460);
       plane.startingAngle(90);
       plane.teleport(645,552);
       plane.trailWidth = 33;
       plane.move(150);
       plane.teleport(516,669);
       plane.trailWidth = 68;
       plane.startingAngle(270);
       plane.move(30);
       plane.turn(50);
       plane.move(10);
       plane.teleport(537,632);
       plane.trailWidth = 30;
       plane.move(30);
       plane.teleport(127,732);
       plane.startingAngle(0);
       plane.trailWidth=10;
       plane.move(540);
       plane.teleport(127,64);
       plane.startingAngle(0);
       plane.move(540);


    }

}


/* 

// Below is a list of the variables in plane and how to set them:

   plane.anglefacing=90 ;     // Sets the angle the plane is facing
	plane.xpos=100;            // Sets the xposition of the plane
	plane.ypos=100;            // Sets the yposition of the plane
   plane.isTrail=false;       // Sets if the plane has a trail
   plane.trailWidth=1;        // Sets the width of the trail from the plane
   plane.pausetime=1;         // Sets how long the plane pauses each time it moves, 
                                 make this bigger to watch the drawing happen
   
// Below are all the methods the plane can use:

   System.out.println("fun" + variable);  // Prints text to the window + the value of the variable
   plane.drawWords("this is fun");  // Prints text to the applet at the location of the plane
   plane.circle(10);                // Draws a circle of radius 10
   plane.square(50);                // Draws a square with side length 50, 
                                      the plane finishes in the same direction it starts  
   plane.house(100);                // Draws a house with a bottom edge of 100
   plane.fillCircle(100);           // Draws a circle of radius 100 and fills it in
   plane.move(100);                 // Moves the plane forward (the direction it is facing) 100 pixels
   plane.teleport(111, 222);        // Relocates the plan to the x position 111 and the y position 222, 
                                      there is no trail with teleport
   plane.turn(90);                  // Turns the plan 90 degrees counterclockwise
   plane.setColor(255, 255, 255);   // Sets the trail color Red, Green, Blue; max value of 255, min 0
   plane.setPixelColor(255, 255, 255);  // Sets the pixel color at the plane's location to Red, Green, Blue; max value of 255, min 0
   plane.howMuchBlue();             // Returns a number between 0 and 255 describing how much blue there is
   plane.howMuchGreen();            // Returns a number between 0 and 255 describing how much green there is
   plane.howMuchRed();              // Returns a number between 0 and 255 describing how much red there is
   plane.random(0, 100);            // Returns an integer on the interval 0 to 99
   
*/