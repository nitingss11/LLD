This has to be used whenever you have different objects that do a same functionality in different ways.

So different ducks that fly in different ways. So we can't be having the fly method in the superclass duck

We also can't be having interface flyable, this would lead to lot of code duplication when all the child duck implement the fly method in their concrete classes

So here comes the strategy patter. Where we have a strategy member in the superclass and that is initialized through the constructor. This member calls the fly method.

We code the strategy to an interface. And initialize it to concrete strategy definitions when we create the super class object. Clean!!

Concrete strategy classes actually implement the method in contention in their own ways.


Side note: 
You can make the base class abstract so that our code is more extensible and promote common code usage. And then create extension classes of this base class with their strategies so that users life is made easier when it tries to create objects (it doesn't need to know the strategy)

We can also have the strategy setters in the Duck class to maybe change the behaviour at runtime