public class App {
    public static void main(String[] args) {
        Map map = new Map();
        
        //map.getGrid().get(1).get(0).setTrace(new Trace(Trace.E));
        //map.getGrid().get(1).get(1).setTrace(new Trace(Trace.E));
        //map.getGrid().get(1).get(2).setTrace(new Trace(Trace.E));
        
        Sector sect = map.getGrid().get(4).get(4);
        Robot robot = new Robot(sect, "Robot", map);
        System.out.println(map);

        robot.moveSouth();
        robot.moveSouth();
        robot.moveSouth();
        robot.moveWest();
        robot.moveWest();
        robot.moveNorth();
        System.out.println(map);
    }
}
