import java.util.*;
import java.text.SimpleDateFormat;

class Main{
    public static void main(String[] args) {

        long num = 100000000;
        long sum = 0;

        SimpleDateFormat format1 = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");

        Date time = new Date();

        //System.out.println(time.toString());
        System.out.println("START : " + format1.format(new Date()));
        for(long i=1;i<=num;i++) {
            sum+=i;
        }

        System.out.println(sum);
        System.out.println("END :"+ format1.format(new Date()));

    }
}
