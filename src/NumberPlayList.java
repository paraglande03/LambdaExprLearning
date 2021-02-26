import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
public class NumberPlayList {
    public static void main(String[] args) {

        //creating sample collection
        List<Integer> myNumberList = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            myNumberList.add(i);
        }
        //Method1:Explicit Lambda Function
        Consumer<Integer> myListAction = n -> {
            System.out.println("METHOD1:for each lambda impl value::" + n);
        };
        myNumberList.forEach(myListAction);
        //method2:Explicit Lambda Function
        myNumberList.forEach(n -> {
            System.out.println("METHOD2: forEach Lambda impl Value :: " + n);
        });
        //method3: Implicit Lambda Function to print double value
        Function<Integer, Double> toDoubleFunction = Integer::doubleValue;
        // Function<Integer, Double> toDoubleFunction = n-> n.doubleValue;
        myNumberList.forEach(n -> {
            System.out.println("method3:for each Lambda double Value::" +
                    toDoubleFunction.apply(n));
        });
        //Implicit Lambda Function to check even or odd
        Predicate<Integer> isEvenFunction = n -> n > 0 && n % 2 == 0;
        myNumberList.forEach(n -> {
            System.out.println("method4: forEach value of " + n + " check for even: " + isEvenFunction.test(n));
        });
    }
}
