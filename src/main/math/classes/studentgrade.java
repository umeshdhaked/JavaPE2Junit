package math.classes;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class studentgrade {

public static int average(int n, int[] grade) {
 /*   System.out.println("Enter no. of Student : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    */

    int sum=0;

    for(int i=0;i<n;i++)
        sum=sum+grade[i];

return sum/n;

}

public static int min(int[] grade){

    Arrays.sort(grade);

return grade[0];
}

public static int max(int[] grade){

        Arrays.sort(grade);

        return grade[grade.length-1];
    }



}
