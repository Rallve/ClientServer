package client;

public class Main {
    public static void main(String[] args) {
        Model m = new Model("10.80.45.106", 1234);
        View v = new View();
        Controller c = new Controller(m, v);
        m.getStreams();
        ListenerThread l = new ListenerThread(m.in, System.out);
        Thread listener = new Thread(l);
        listener.start();
    }
}
