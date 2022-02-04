import java.util.Arrays;

public class Driver{

    static int [] x = new int[] {1,2,5,8,9,7,3,4};

public static void main(String args[]){

System.out.println(Evaluator.calcSphereSurface(1000));
System.out.println(Evaluator.myMathFunction(20, 40, 20));

System.out.println(Evaluator.howManyDays());
System.out.println(Evaluator.isLeapYear("2024-10-31"));
System.out.println(Evaluator.hasItHappened(02,20,2022));

System.out.println(Evaluator.currentDate(x,1));
System.out.println(Arrays.toString(Evaluator.getTheLastHalf(x)));


}


}