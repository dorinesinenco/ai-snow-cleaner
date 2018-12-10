public class App {
    public static void main(String[] args) {
        Map map = new Map();
        
        map.getGrid().get(1).get(0).setTrace(new Trace(Trace.E));
        map.getGrid().get(1).get(1).setTrace(new Trace(Trace.E));
        map.getGrid().get(1).get(2).setTrace(new Trace(Trace.E));
        
        System.out.println(map);
    }
}
