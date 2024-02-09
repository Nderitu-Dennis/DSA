import java.util.Arrays;

public class OneDimensionalArray {
    public static void main(String[] args) {
        //one-dimensional array
        int[] numbers ={1,2,3,4,5};


        System.out.println(Arrays.toString(numbers));
        System.out.println("length of the array is " + numbers.length);
        System.out.println("..............................\n");

        int[] numbers2=new int[5];
        numbers2[0]=100;
        numbers2[1]=200;
        numbers2[2]=300;
        numbers2[3]=400;
        numbers2[4]=500;

        System.out.println(Arrays.toString(numbers2));
        System.out.println("index 3: " + numbers2[3]);



    }


}
