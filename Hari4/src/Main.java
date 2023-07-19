// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        try{
            ExampleError exampleError = new ExampleError();
            exampleError.exampleThrow();
        }catch (Exception e){
            e.printStackTrace();
        }

        for (int i = 0; i <5 ; i++) {
            System.out.println(5);
        }

        System.out.println("Finish");

    }
}

// System.out.println("Start");
//
//         ExampleError exampleError = new ExampleError();
//         exampleError.testArray();
//         System.out.println("Finish");
