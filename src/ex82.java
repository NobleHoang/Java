public class ex82 {
    public static void main(String[] args) {
        double radius , height , totalArea,circleReference;
        radius = 6;
        height = 5;
        final double PI = 3.14;
        totalArea = 2 * PI * radius * height + 2 * PI * radius * radius;
        circleReference = PI * radius * radius * height;
        System.out.printf("totalArea is:");
        System.out.println(totalArea);
        System.out.printf("circleReference is:");
        System.out.println(circleReference);
    }
}
