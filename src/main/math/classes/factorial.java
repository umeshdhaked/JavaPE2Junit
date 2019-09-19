package math.classes;

public class factorial {

    public static int fact(int num){
        int result=1;
        if(num<13) {
            for (int i = 1; i < num + 1; i++)
                result = result * i;
            return result;
        }
        else {
            return 0;
        }

    }


}
