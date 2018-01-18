/*
 * @author zhongqiu
 * 结构型设计模式
 * (1)适配器模式
 *    类的适配器：创建一个新类，继承原有的类，实现新的接口即可。实现了对原有类的功能适配
 *    对象的适配：创建一个新类，持有待适配的对象。实现新的接口。在新类的方法中，调用待适配对象的方法。实现了对原有对象的功能适配
 *    接口的适配：有时我们写的一个接口中有多个抽象方法，当我们写该接口的实现类时，必须实现该接口的所有方法，
 *               这明显有时比较浪费，因为并不是所有的方法都是我们需要的，有时只需要某一些，此处为了解决这个问题，
 *               我们引入了接口的适配器模式，借助于一个抽象类，该抽象类实现了该接口，实现了所有的方法，
 *               而我们不和原始的接口打交道，只和该抽象类取得联系，所以我们写一个类，继承该抽象类，重写我们需要的方法就行。
 * (2)装饰器模式:装饰模式就是给一个对象增加一些新的功能，而且是动态的，要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例
 * (3)代理模式：静态代理，动态代理。注意和装饰模式的区别
 *
 * (4)桥接模式:如果一个系统需要在抽象化和具体化之间增加更多的灵活性，避免在多个层次之间建立静态的继承关系，
 *            通过桥接模式可以使它们在抽象层建立一个关联关系。
 *            “抽象部分”和“实现部分”可以以继承的方式独立扩展而互不影响，在程序运行时可以动态将一个抽象化子类的对象和一个实现化子类的对象进行组合，
 *            即系统需要对抽象化角色和实现化角色进行动态耦合。
 *            使用桥接模式把两个角色之间的继承关系改为耦合关系，从而使这两者可以各自独立得变化
 *            一个类存在两个（或多个）独立变化的维度，且这两个（或多个）维度都需要独立进行扩展。
 *            参考：http://blog.csdn.net/yanbober/article/details/45366781
 * (5)外观模式：为了解决类与类之间的依赖关系的，像spring一样，可以将类和类之间的关系配置到配置文件中
 *             而外观模式就是将他们的关系放在一个Facade类中，降低了类类之间的耦合度，该模式中没有涉及到接口
 * (6)组合模式：将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树
 * (7)享元模式：一提到共享池，我们很容易联想到Java里面的JDBC连接池，想想每个连接的特点，
 *             我们不难总结出：适用于作共享的一些个对象，他们有一些共有的属性，就拿数据库连接池来说，
 *             url、driverClassName、username、password及dbname，这些属性对于每个连接来说都是一样的，所以就适合用享元模式来处理，
 *             建一个工厂类，将上述类似属性作为内部数据，其它的作为外部数据，在方法调用时，当做参数传进来，这样就节省了空间，减少了实例的数量。
 */
package zhongqiu.designpattern.struct;