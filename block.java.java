public class Test {
    static {
        System.out.println("Outer static block");

         This is illegal and causes a compile-time error
        static {
            System.out.println("Inner static block");
        }
    }
}


public class Test {
    static {
        System.out.println("Static Block 1");
    }

    static {
        System.out.println("Static Block 2");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }
}


public class Test3 {
    {
        System.out.println("Outer instance block");

        //  Invalid nesting
        {
            {
                System.out.println("Nested instance block");
            }
        }
    }
}



public class Test4 {
    {
        System.out.println("Instance Block 1");
    }

    {
        System.out.println("Instance Block 2");
    }

    public Test4() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new Test4();
    }
}


public class Test5 {
    public static void main(String[] args) {
        {
            System.out.println("This is a nested code block inside main()");
        }
    }
}


public class TryExample {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try");

            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e);
            }

        } catch (Exception e) {
            System.out.println("Outer catch: " + e);
        }
    }
}

public class TryInvalid {
    public static void main(String[] args) {
        catch (Exception e) {  // Compile-time error
            System.out.println("This is invalid");
        }
    }
}



public class MultiCatch {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }
    }
}


public class SyncExample {
    public void methodA() {
        synchronized (this) {
            System.out.println("Outer synchronized block");

            synchronized (this) {
                System.out.println("Inner synchronized block");
            }
        }
    }

    public static void main(String[] args) {
        new SyncExample().methodA();
    }
}


public class InvalidSync {
    public static void main(String[] args) {
        synchronized void myMethod() {  //  Illegal
            System.out.println("Invalid use");
        }
    }
}


