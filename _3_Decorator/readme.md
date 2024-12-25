
When you want to modify the functionality of objects without changing the class (It violates open close principle)

Think of this when you see there is an issue of class explosion. Too many features of a thing and multiple combinations of those features. You can also have the same feature twice.
Having the toppings as data members is not a good design as it violates the open close principle when we want to add a new topping. Also one class should not have all the responsibility of calculating base pizza cost + toppings cost etc. 
So we use a base interface of pizza and have a basic getCost in it and derive it to as many classes as many bases you need. Concrete class

Now we create a ToppingDecorator that is a Pizza and has a Pizza (implements and also has a data member pizza) 
It needs to be a pizza to be able to successfully passed on to a further decorator and is has a pizza to actually get the earlier pizza through its constructor. And based on this pizza it calculates its next description and cost. So just create as many actual toppping decorators extending this ToppingDecorator class
We use ToppingDecorator as the base abstract class for all other decorators to have the shared code easily manageable. 
