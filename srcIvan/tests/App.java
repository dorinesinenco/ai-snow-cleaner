public class App {
    public static void main(String[] args) {
        Map map = new Map();
        map.getSector(2, 2).setSectorType(Sector.BUILDING);;
        Robot robot = new Robot("CleanerRobot #1",map.getGrid().get(0).get(0),map);
        System.out.println(robot.getX() + "\n" + robot.getY());
        robot.moveEst();
        robot.moveEst();
        robot.moveSouth();
        robot.moveSouth();
        robot.moveSouth();

        System.out.println(map);
    }
}
