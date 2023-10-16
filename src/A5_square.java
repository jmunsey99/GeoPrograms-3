public class A5_square extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {


        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 0;
        plane.setColor(200, 0, 0);
       plane.startingAngle(90);
      //  square();
      //  triangle();
       // house();

        tree();
        plane.teleport(500,500);
        clouds();
        plane.teleport(100,200);
        apple();









    }


   public void triangle (){
        plane.teleport(203,0);
        plane.trailWidth = 10;
        plane.startingAngle(0);
        plane.setColor(0,0,0);
        plane.move(111);
        plane.setColor(0,0,0);
        plane.turn(120);
        plane.move(111);
        plane.setColor(0,0,0);
        plane.turn(120);
        plane.move(111);
   }


    public void square() {
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(0, 0, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 0, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 0, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 0, 0);
        plane.move(111);
        plane.turn(90);
    }

    public void house(){
        square();
        triangle();
    }

    public void apple (){plane.startingAngle(0);
       plane.setColor(255,0,0);
        plane.move(20);
        plane.startingAngle(90);
        plane.move(20);
        plane.startingAngle(180);
        plane.move(20);
        plane.startingAngle(270);
        plane.move (20);

    }

    public void clouds (){plane.setColor(255,255,255);
        plane.trailWidth = 50;
        plane.startingAngle(0);
        plane.move(75);
        plane.startingAngle(90);
        plane.move(25);
        plane.startingAngle(180);
        plane.move(75);
        plane.startingAngle(25);
        plane.move(25);
    }

public void tree (){
        plane.setColor(0,200,0);
        plane.trailWidth = 20;
        plane.startingAngle(0);
        plane.move(200);
                plane.turn(90);
                plane.move(100);
                plane.turn(90);
                plane.move(200);
                plane.turn(90);
                plane.move(100);
                plane.turn(90);
                plane.move(100);
                plane.turn(270);
                plane.trailWidth = 50;
                        plane.setColor(150,75,15);
                plane.move(100);

}

}


/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- setColor(int r, int g, int b)
   setColor() sets the color of the plane's trail.
   plane.setColor(0, 0, 255); sets the color of the plane's trail to blue.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.
   
- turn(int x)
   turn() rotates the plane left by the number of degrees specified in the parameter.
   plane.turn(50); will turn the plane left 50 degrees.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.
   
- int trailWidth
   trailWidth controls the width of the trail left by the plane.
   plane.trailWidth = 10; sets the width of the trail to 10.

*/