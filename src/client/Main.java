package client;

public class Main {
    public static void main(String[] args) {
        Model m = new Model("10.80.45.106", 1234);
        View v = new View();
        Controller c = new Controller(m, v);
    }
}
