####工厂模式
#####工厂模式包含以下几个核心角色：
1.抽象产品（Abstract Product）：定义了产品的共同接口或抽象类。它可以是具体产品类的父类或接口，规定了产品对象的共同方法。

2.具体产品（Concrete Product）：实现了抽象产品接口，定义了具体产品的特定行为和属性。

3.抽象工厂（Abstract Factory）：声明了创建产品的抽象方法，可以是接口或抽象类。它可以有多个方法用于创建不同类型的产品。

4.具体工厂（Concrete Factory）：实现了抽象工厂接口，负责实际创建具体产品的对象。