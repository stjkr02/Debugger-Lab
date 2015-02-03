```
Josh Russett
CSCI II Lab
27 Jan 2015
```
#Debugger Lab Answers 

####Question 1:
The variable `cutoff` is not a parameter for the `playTurn` method because `cutoff` is assigned as private copy, local only to the `PigGame` class, of the cutoff value, `cutoffValue`. This in turn eliminates the redundancy and need to pass the `cutoff` variable to the `playTurn` method each time.


####Question 2:
The code: `ScoreSheet s = new ScoreSheet(); System.out.println(s.getTurnAverage());` would simply return the value `0.0` as the code intializes a new `ScoreSheet` object referenced by `s`, and then prints the query for the average (`s.getTurnAverage()`), which, if `numTurns == 0`, simply returns `0.0`.

####Question 3:
In the `playGame` method, the body of the while-loop  checks the score of the turn played and increments `numBusts` by one if `score == 0`; rather than increment `numBusts` in that while-loop, one could instead incrememt `numBusts` immediated after a 1 is rolled in the `playTurn` method.

####Question 4:
I believe, with my current understanding of the code, that the problem is most likely going to be in the **PigGame.java** portion of this program, especially the `playTurn` method, as it is where "everything is happening" in the sense that the most complicated part of the pig game (rolling dice multiples times for a turn score) is coded. Another possibility is the **Die.Java**, as the `Die` class looks a little strange in the implementation.  As for the rest of the files, **Main.java** looks pretty straightforward as it is only calling the other classes and **ScoreSheet.java** only records, stores and returns values.

 