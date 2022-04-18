public class ex115 {
    public static void main(String[] args){
        int lowerbound = 1;
        int upperbound = 100;
        int sum = 0;
        int p;
        int number=lowerbound;
        while (number<=upperbound){
            p = number*number;
            sum = sum + p;
            ++number;
        }
        System.out.print("The sum is: ");
        System.out.print(sum);
    }
}
