import java.util.*;
interface Student{
int Score=10;
void displayScore();
}
interface Sports{
int Score=25;
void displaySportsScore();
}
class Result implements Student,Sports{
public void displayScore()
{
System.out.println("\nAcademic score :"+Student.Score);
}
public void displaySportsScore()
{
System.out.println("Sports score :"+Sports.Score);
System.out.println();
}
}
class SportStudent{
public static void main (String[] args)
{
Result r=new Result();
r.displayScore();
r.displaySportsScore();
}
}


