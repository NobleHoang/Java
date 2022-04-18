public class ex113 {
    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 1000;
        int sum = 0;
        int i;
        for (i=lowerbound; i<=upperbound; i++){
            if(i%7==0)
                sum=sum+i;
        }
        System.out.printf("the sum from " +lowerbound+ " to " +upperbound+ " is " +sum);
    }
}
