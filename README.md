# DesignPatterns 设计模式
### 开发不是炫技，不一定要用最好的设计模式，也许在业务开发中，不用设计模式才是最好的设计模式

|设计模式|最佳使用|优点|缺点|
|:-------|:-------|--------|--------|
|  [单例模式](./src/main/java/com/javaniuniu/singletom) |   [饿汉式](./src/main/java/com/javaniuniu/singletom/Mgr01.java)   | 1.由于只有一个实例对象，所以 __占用内存很少__ <br />2.对象不用重复new了，当然就 __解放了对资源的重复占用__，提升了性能可以让代码更具有逻辑信 |1.扩展性差了，想扩展每次都得改代码<br />2.使用的场景比较单调，如果是在多场景不断变化的实例对象最好不要使用单例，数据容易出问题<br />3.最好不要用到连接池那块，N多对象共享一个连接池，容易导致连接池溢出的|
|  [策略模式](./src/main/java/com/javaniuniu/strategy) |      | 1.策略模式的功能就是通过抽象、封装来定义一系列的算法，使得这些算法可以相互替换，所以为这些算法定义一个公共的接口，以约束这些算法的功能实现。如果这些算法具有公共的功能，可以将接口变为抽象类，将公共功能放到抽象父类里面。<br />2.策略模式的一系列算法是可以相互替换的、是平等的，写在一起就是if-else组织结构，如果算法实现里又有条件语句，就构成了多重条件语句，可以用策略模式，避免这样的多重条件语句。    <br />3.扩展性更好：在策略模式中扩展策略实现非常的容易，只要新增一个策略实现类，然后在使用策略实现的地方，使用这个新的策略实现就好了 |1.客户端必须了解所有的策略，清楚它们的不同：      <br />如果由客户端来决定使用何种算法，那客户端必须知道所有的策略，清楚各个策略的功能和不同，这样才能做出正确的选择，但是这暴露了策略的具体实现。<br />2.增加了对象的数量：<br />由于策略模式将每个具体的算法都单独封装为一个策略类，如果可选的策略有很多的话，那对象的数量也会很多。<br />3.只适合偏平的算法结构：<br />由于策略模式的各个策略实现是平等的关系（可相互替换），实际上就构成了一个扁平的算法结构。即一个策略接口下面有多个平等的策略实现（多个策略实现是兄弟关系），并且运行时只能有一个算法被使用。这就限制了算法的使用层级，且不能被嵌套。|
| 生产模式 |      |  |灵活控制生产过程，权限，修饰，日志。。。。|
|  |      |  ||
|  |      |     ||
|  |      |     ||
|  |      |     ||
|  |      |     ||

### 开发中需要注意的点
- 关于继承
    - 慎用继承，因为继承的父子类是强关系，父类变化，子类不得不变
- 关于参数传递：
    - 传参数的方式，每次都会出现new一个新的对象，所以要改成单例模式
    - 作为成员变量，会加大代码的负责性，不够简介