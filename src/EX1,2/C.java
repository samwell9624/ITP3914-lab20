public class C {
    public C() {
        this(30);
        System.out.println("From A(): " + 20);
    }

    public C(int n) {
        System.out.println("From A(int): " + (n - 5));
    }
}
