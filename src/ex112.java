public class ex112 {
    public static void main(String[] args) {
        int lowerbound = 9;
        int upperbound = 899;
        int sum = 0;
        int number = lowerbound;
        while (number <= upperbound){
            sum += number;
            ++number;
        }
        System.out.printf("the sum from " +lowerbound+ " to " +upperbound+ " is " +sum);
    }
}
