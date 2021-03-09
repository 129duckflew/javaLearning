package cn.duckflew.JavaShiyan;

interface ISay
{
    void sayHello();
}

/*class ISayImp implements ISay{ //非匿名用法
 @Override
 public void sayHello() {
 // TODO Auto-generated method stub
 
 System.out.println("Hello java!");
 }
}*/
public class TestAnonym
{
    public static void main(String[] args)
    {
        //创建接口ISay的匿名实现类对象say
        ISay say = new ISay()
        { //也可创建继承某个抽象类的匿名类的实例对象，请读者补充代码练习！
            @Override
            public void sayHello()
            {
                // TODO Auto-generated method stub
                System.out.println("Hello java!");
            }
        };
        //ISayImp say = new ISayImp(); //配合非匿名用法
        //使用say对象
        System.out.println();
        say.sayHello(); //调用接口方法
        //类Class是所有类的基类，其方法getClass()的返回结果是泛型类型Class<?>
        Class<? extends ISay> class1 = say.getClass();
        System.out.println(class1);
    }
}

