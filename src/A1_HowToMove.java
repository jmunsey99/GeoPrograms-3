public class A1_HowToMove extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {





        System.out.println("This message will be printed to the window below.");
        System.out.println("That window is called the dos window");

         plane.pausetime = 0;
        plane.isTrail = true;
        plane.trailWidth = 2000;
        plane.setColor(0,100,250);
        plane.teleport(0,0);
        plane.move(1000);
        plane.teleport(194,260);
        plane.startingAngle(0);
        plane.setColor(70,180,80);
        plane.trailWidth = 220;
        plane.move(200);
        plane.move(100);
        plane.isTrail = true;
        plane.move(200);
        plane.startingAngle(270);
        plane.move(200);
        plane.startingAngle(180);
        plane.move(500);
        plane.startingAngle (90);
        plane.move (200);
        plane.trailWidth = 250;
        plane.teleport(422,466);
        plane.setColor(150,75,0);
        plane.move(400);
        plane.teleport(673,550);
        plane.trailWidth =75;
        plane.startingAngle(315);
        plane.move(100);
        plane.teleport(284,121);
        plane.setColor(255,0,0);
        plane.trailWidth = 25;
        apple();
        plane.teleport(456, 189);
        apple();
        plane.teleport(759, 154);
        apple();
        plane.teleport(671,287);
        apple();
        plane.teleport(373,378);
        apple();
        plane.teleport(31,236);
        clouds();
        plane.teleport(156,559);
        clouds();
        plane.teleport(840,632);
        clouds();
        plane.teleport(0,0);
        plane.trailWidth = 80;
        plane.setColor(255,255,0);
        plane.startingAngle(0);
        plane.move(75);
        plane.startingAngle(90);
        plane.move(75);
        plane.startingAngle(180);
        plane.move(75);
        plane.startingAngle(270);
        plane.move(75);






    }

    public void apple (){plane.startingAngle(0);
        plane.move(20);
        plane.startingAngle(90);
        plane.move(20);
        plane.startingAngle(180);
        plane.move(20);
        plane.startingAngle(270);
        plane.move (20);}

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



}

/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.

*/