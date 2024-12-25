

What if we had many to many relationship among subject and observer

Subject will need to send the instance in the update
And Observers will do what they want based on which concrete subject this belongs to
(using instanceof ) 
(That is when there are different classes of Subject)
But if there is only one class then it's straighforward typecasting

Note: We don't need to maintain any member of Subject in the observable. since we no longer pulling like that. It's kind of pure push.
