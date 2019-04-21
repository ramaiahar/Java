package com.pack1;

class A
{
    A()
    {
        System.out.println("A");
    }

    {
        System.out.println("init-A");
    }
}

class B extends A
{
    {
        System.out.println("init-B");
    }

    B()
    {
        System.out.println("B");

    }
}

class C
{
    C c = new C();

    private C()
    {
        System.out.println("Private const");
    }

    void m()
    {
        C c = new C();

    }

    void n()
    {
        C c = new C();
    }
}

public class ParentClassCon
{

    public static void main(String[] args)
    {
        A a = new B();
        // Can't create instance of a private constructor outside it's class
        // C c = new C();

    }

}
