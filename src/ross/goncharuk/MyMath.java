package ross.goncharuk;

public class MyMath {
    public static int findMin(int[] arr){

        int min = arr[0];

        for(int arrayElement: arr){
            if(arrayElement<min){
                min = arrayElement;
            }
        }
        return min;
    }

    public static int findMax(int[] arr){

        int max = arr[0];

        for (int arrayElement:arr){
            if(arrayElement>max){
                max=arrayElement;
            }
        }
        return max;
    }

    public static final double PI = 3.14;

    public static double areaOfCircle(double radius){

        double square = PI*Math.pow(radius,2);
        return square;
    }
}
