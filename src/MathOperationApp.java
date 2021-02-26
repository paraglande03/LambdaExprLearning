
public class MathOperationApp {
    public static void main(String[] args) {
        //use case 1
        //way 1 ---IMathFunction add = ( int a, int b)->a+b;
        IMathFunction add =Integer::sum;
        //multiply
        IMathFunction multiply = ( int a, int b)->a*b;
        //divison
        IMathFunction divison = ( int a, int b)->a/b;
        //subtract
        IMathFunction subtract = ( int a, int b)->a-b;

        System.out.println("Addition "+add.calculate(6 ,3));
        System.out.println("Multiply "+multiply.calculate(6 ,3));
        System.out.println("Division "+divison.calculate(6 ,3));
        System.out.println("Subtract "+subtract.calculate(6 ,3));

        //Passing Lambda Expression as Function Parameter yo Print Result using Static Function
        IMathFunction.printResult(6,3,"Addition",add);
        IMathFunction.printResult(6,3,"Subtract",subtract);
        IMathFunction.printResult(6,3,"Multiply",multiply);
        IMathFunction.printResult(6,3,"Division",divison);


    }
}
