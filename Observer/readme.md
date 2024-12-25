

There is one subject and there are multiple observers (One to Many)

So our subject should be such that its loosely coupled with observers
Adding and Removing the observers can be done without changing any code in subject

Subject is trivial
Has List of Observer, Has add and remove and in notify call the update

Observer
It has the update method that does what it wants to do with the data.
It also has a reference to the subject just in case I want to be removed from a subject. 
But the bigger benefit is that I can pull data from the object and don't need to pass numerous parameters inside the update. (Since this would have been worse to maintain) 
Observer just pulls whatever it needs. We don't have to send all data to the observers since not every observer needs everything