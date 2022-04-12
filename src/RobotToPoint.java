public class RobotToPoint {

    public static void moveRobot(Robot myRobot, int toX, int toY) {
        int x = myRobot.getX();
        int y = myRobot.getY();
        int deltaX = toX - x;
        int deltaY = toY - y;
        int newDeltaX;
        int newDeltaY;

        myRobot.stepForward(); // your implementation here
        newDeltaX = myRobot.getX();
        while(newDeltaX > deltaX)
        {
            myRobot.turnRight();
            myRobot.stepForward();
            newDeltaX = myRobot.getX();
        }
        while(newDeltaX != toX)
        {
            myRobot.stepForward();
        }
        y = myRobot.getY();
        myRobot.turnRight();
        myRobot.stepForward();
        newDeltaY = myRobot.getY();
        int direction = 1;
        if(newDeltaY > y)
        {
            myRobot.turnRight();
            myRobot.turnRight();
        }
        while(newDeltaY != toY)
        {
            myRobot.stepForward();
            newDeltaY = myRobot.getY();
        }
        System.out.println("Робот дошел до цели!");
    }
}
