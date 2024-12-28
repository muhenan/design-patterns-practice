## 1 - Adapter

适配器模式将现有接口转化为客户类所期望的接口，实现了对现有类的复用。
它是一种使用频率非常高的设计模式，在软件开发中得以广泛应用，在Spring等开源框架、驱动程序设计（例如JDBC中的数据库驱动程序）中也使用了适配器模式。

好处：
解耦目标类和适配者类，通过引入适配器类重用现有代码，无需修改原有结构。

最直接的逻辑: Target Interface -> Adapter Implementation -> Old Interface

## 2 - Bridge

