package JVM;

public class Jvm {
    public static void main(String[] args) {
        Newclass1 nc = new Newclass1();
        nc.add(2, 4);
        System.out.println(nc.a);
        Newclass2.run();
    }
}
