public class B0_BasicLoop extends World {
    public B0_BasicLoop() {
    }

    public void go() {
        this.plane.isTrail = true;
        this.plane.trailWidth = 5;
        this.plane.pausetime = 1;

        //  for (int x = 0; x < 900; x += 100) {

        //    System.out.println(x);
        //    this.plane.teleport(x + 10, 300);
        //    this.plane.square(100);

        //  rowOfSmallSquares();
        // columnOfSmallSquares();
        gridOfSmallSquares();
    }

    public void rowOfSmallSquares() {
        //in this method, create a long row of 10 pixel by 10 pixel squares
        plane.trailWidth = 2;

        //put your loop here
        for (int x = 0; x < 1000; x += 10) {

            System.out.println(x);
            this.plane.teleport(x + 10, 300);
            this.plane.square(10);

        }
    }

    public void columnOfSmallSquares() {
        //in this method, create a long column of 10 pixel by 10 pixel squares
        plane.trailWidth = 2;
        for (int y = 0; y < 1000; y += 10) {

            System.out.println(y);
            this.plane.teleport(300, y + 10);
            this.plane.square(10);


            //put your loop here

        }

    }

    public void gridOfSmallSquares() {
        //in this method, loop one of your previous two methods
        //your goal is to create a grid of squares
        //OPTIONAL EXTRA CHALLENGE can you make the squares fade from one color to another?
        //put your loop here
        plane.pausetime = 0;


        plane.trailWidth = 2;
        for (int x = 0; x < 1000; x = x + 10) {
            for (int y = 0; y < 1000; y = y + 10) {

                System.out.println("x: " + x + ", y:" + y);
                plane.teleport(y+10, x+10);
                plane.square(10);
                plane.setColor(255, x/4, x/5);





            }

        }


    }

}







// public void fitness (){
 //   for (int s = 0; s<5; s = s+1){
// System.out.println("sprint" + s);
// for (int p=0; p< 10; p=p+1){
// System.out.println("pushup" + p);
// }
































