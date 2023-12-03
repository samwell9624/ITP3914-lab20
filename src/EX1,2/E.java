public class E extends D {
    public E() {
        System.out.println("From E(): " + 5);
    }

    public E(int n) {
        super(n + 2);
        System.out.println("From E(int): " + (n + 10));
    }
}
