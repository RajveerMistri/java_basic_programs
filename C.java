interface A {

   
    private void name() {
        System.out.println("Hello from private method in interface A");
    }

    default void set() {
        name();   
        System.out.println("Default method in interface A");
    }

  
    void nam();
}

interface B {
    int sub(int m, int n);
}

class C implements A, B {

    public void nam() {
        System.out.println("Implementing nam() from interface A");
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int m, int n) {
        return m - n;
    }

    public static void main(String args[]) {
        C obj = new C();

        System.out.println("Sum : " + obj.sum(10, 5));
        System.out.println("Sub : " + obj.sub(10, 5));

        obj.set();   
        obj.nam();   
    }
}