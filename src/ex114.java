public class ex114 {
    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 1000;
        int sum = 0;
        int number=lowerbound;
        while (number<=upperbound) {
            if (number % 7 == 0) {
            sum += number;
            }
            ++number;
        }
        System.out.printf("the sum from " +lowerbound+ " to " +upperbound+ " is " +sum);
    }
}
