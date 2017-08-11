# ClubMembership

This is the project from Learn Java Well.  I am using it for fun, and to brush up on my Java coding.

It is a basic club membership management program for a fitness center which has three levels:  Club Mercury, Club Neptune and Club Jupiter.  

It also has two types of members: Single Club Members and Multi Club Memebers.

A single club member has access to only one of the three clubs.  A multi club member, on the other hand has access to all three clubs.

The membership fee of a member depends on whether the member is single club or multi club.  Single club members' fees also depend on which club they have access to.

Finally, multi club members are awarded membership points for joining the club.  Upon sign up, they are awarded 100 points which they can use 

to redeem gifts and drinks from the store.  This program does not handle the redemption process.  All it does is add 100 pints to the 

multi club members account.  This applications uses a csv file to store information about each member.  Whenever the app is launched the 

application, reads the information from the csv file and transfer it to a LinkedList.  When a member is added to the LinkedList or removed, 

the csv file is updated.
