## Singleton

最简单的单例模式：
1. private instance
2. private constructor
3. get instance function

线程安全：
双重检验

## Simple Factory

不在 GOF 23 之中

一个 Factory，根据不同的输入，创建不同的 concrete product

## Factory method

每个concrete factory对应一个 concrete product

## Abstract Factory

一个 Factory 可以创建多个不一样的 concrete product

## Prototype

重点在于 clone 功能，但是现代已经很不常用了

## Builder

主要的好处：
1. 构建复杂对象 Builder 模式最主要的优势是帮助构建复杂的对象。当一个对象有大量的属性，且大部分属性是可选的时候，Builder 模式可以让对象的构建过程更加清晰和灵活。
2. 避免构造函数的"污染" 相比使用多个构造函数或者使用 setter 方法，Builder 模式可以：

- 减少构造函数的参数数量
- 避免创建大量重载的构造函数
- 防止对象在构造过程中处于不一致的状态

3. 链式调用 Builder 模式支持链式调用，使代码更加简洁和可读
4. 参数验证和默认值 可以在 build() 方法中进行参数的统一验证，确保对象的合法性

```c#
public User build() {
    // 可以在这里进行参数校验
    if (name == null) {
        throw new IllegalStateException("Name cannot be null");
    }
    return new User(this);
}
```

builder 可以通过 Lombok annotation 的方式直接使用