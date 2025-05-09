package hello.springtx;

public class Foo {
    // static 필드 3개
    static int S1 = initStatic("S1");
    static int S2 = initStatic("S2");
    static int S3 = initStatic("S3");

    // static 초기화 블록
    static {
        System.out.println("Static block");
    }

    // 인스턴스 필드
    int i1 = initInstance("i1");
    {
        System.out.println("Instance block");
    }
    public Foo() {
        System.out.println("Constructor");
    }

    private static int initStatic(String name) {
        System.out.println("Initializing static " + name);
        return 0;
    }

    public static int testMethod() {
        System.out.println("Test method");
        return 0;
    }

    public static int testStatic() {
        System.out.println("Test static block");
        return 0;
    }
    private int initInstance(String name) {
        System.out.println("Initializing instance " + name);
        return 0;
    }
}