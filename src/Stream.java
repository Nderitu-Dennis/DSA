import java.util.Arrays;
import java.util.Optional;

import static java.util.Locale.filter;

public class Stream {
    public static void main(String[] args) {
        /*streams support both sequential and parallel execution
        * stream allows for easy and concise manipulation of data
        * once you have a stream you can apply intermediate operations such as filter()
        * */
        Integer[] numbers={1,2,3,4,5,6,7,8,9,10};
        Optional<Integer> firstEven= Arrays.stream(numbers).filter(n->n%2==0)
                .findFirst();
        if(firstEven.isPresent()) {
            System.out.println("First even number found: " + firstEven.get());
        }
        else{
            System.out.println("No even numbers found:");
        }

    }



}
