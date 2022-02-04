import java.time.LocalDate;
import java.util.Arrays;


public class Evaluator{
    
public static final int constSAint = 4;
public static final int constEQint = 3;
public static final int constSQint = 2;

// Math Class

public static double calcSphereSurface(double radius){
double surfaceArea = 0;
double radiusSquare = Math.pow(radius, 2);
double valuePI = Math.PI;
 
    surfaceArea =  constSAint * radiusSquare * valuePI  ;

return surfaceArea;
}


public static double myMathFunction(double x, double y, double theta){
double result = 0;
double tanTheta= Math.tan(theta);
double squareRootx = Math.sqrt(x);
double minValue = Math.min(x, y);
double quadY = Math.pow(y, 4.0);

result = tanTheta + (constSQint * squareRootx) - (constEQint * minValue) + quadY; 

return result;
}


// LocalDate Class


public static int howManyDays(){
LocalDate currentYear = LocalDate.now(); 

int month = currentYear.lengthOfMonth();

return month;
}


public static boolean isLeapYear(String date){

LocalDate currentDate = LocalDate.parse(date);

boolean leapYear = currentDate.isLeapYear();

return leapYear;
}


public static boolean hasItHappened(int month, int dayNum, int year){

LocalDate currentYear = LocalDate.now(); 
LocalDate inputYear = LocalDate.of(year,month,dayNum);

int compareDates = currentYear.compareTo(inputYear);

if(compareDates >= 0){
    return true;
}
else{
    return false;
}

}


// Array Class

public static boolean currentDate( int[] values, int findMe){
int isFound = Arrays.binarySearch(values, findMe);
if (isFound >=0){
    return true;
}
else{
    return false;
}
}


public static int[] getTheLastHalf(int [] values){
    int size = values.length;
    int startSize = (size/2);
    int endSize = size;
 
    return Arrays.copyOfRange(values, startSize, endSize);

}
}
