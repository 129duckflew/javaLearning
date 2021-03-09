package cn.duckflew.JavaShiyan.sss;

abstract class Animal
{ //定义抽象类
    String name;
    int age;

    abstract public void cry();//定义抽象方法，动物会叫
}

/*class Animal { // 定义基类
 String name;
 int age;
 public void cry() { 
 System.out.println("动物会叫");
 }
}*/
class Dog extends Animal
{ //定义子类Dog，继承抽象类Animal
    @Override
    public void cry()
    { //实现父类cry()方法
        System.out.println("汪汪叫...");
    }
}

class Cat extends Animal
{ //定义子类Cat，继承抽象类Animal
    @Override
    public void cry()
    { //实现父类cry()方法
        System.out.println("喵喵叫...");
    }
}

public class AnimalCry
{
    public static void main(String args[])
    {
        Dog dog = new Dog();
        dog.cry(); //调用子类方法，不会产生歧义，强耦合
        Cat cat = new Cat();
        cat.cry(); //调用子类方法，不会产生歧义，强耦合
        System.out.println("-------");
        Animal ani1 = new Dog(); //向上转型安全
        ani1.cry(); //后期绑定：根据对象类型选择相应的方法
        Animal ani2 = new Cat(); //向上转型安全
        ani2.cry(); //后期绑定：根据对象类型选择相应的方法
    }
} 