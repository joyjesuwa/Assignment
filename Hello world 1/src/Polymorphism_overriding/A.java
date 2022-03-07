package Polymorphism_overriding;

 class A {
     public void fun1(int x)
     {
         x=200;
         System.out.println("First value:" +x);
     }


}
class B extends A{
    @Override
    public void fun1(int x) {
        x=500;
        System.out.println("Second value:" +x);
    }
}
