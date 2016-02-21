package ross.goncharuk;


public class Calculation {
    public static void main(String[] args) {

        int[] array1 = {6,3,8,2,3};
        int[] array2 = {21,432,53,12,75,21,22};

        int result1 = MyMath.findMin(array1);
        int result2 = MyMath.findMax(array1);
        System.out.println(result1);
        System.out.println(result2);

        int result3 = MyMath.findMin(array2);
        int result4 = MyMath.findMax(array2);
        System.out.println(result3);
        System.out.println(result4);

        double radius = 4;
        double result5 = MyMath.areaOfCircle(radius);
        System.out.println(result5);
    }
}
