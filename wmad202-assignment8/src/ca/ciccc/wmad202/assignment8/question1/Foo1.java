package ca.ciccc.wmad202.assignment8.question1;

public class Foo1 {
    private static int bar1;

    public Foo1(int x) {
        bar1 = x;
    }
    class Foo2{
        public Foo2(int x) {
            super();
        }

        public void show(){
            System.out.println("bar1 = " + bar1);
            System.out.println("((Foo1)this).bar1 = " + bar1);
            System.out.println("Foo1.this.bar1 = " + Foo1.this.bar1);
        }
    }

    public static void main() {
        Foo1 f1 = new Foo1(5);
        Foo1.Foo2 f2 = f1.new Foo2(6); f2.show();
    }
}
