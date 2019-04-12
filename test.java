class Main{
    public static void main(String[] args) {

        long num = 100000000;
        long sum = 0;

        //SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");

        for(long i=1;i<=num;i++) {
            sum+=i;
        }

        System.out.println(sum);

    }
}