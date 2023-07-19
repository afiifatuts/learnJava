public class ExampleError {
    public void testArray(){
        try {
            int[] arr = {1,2,3,4,5,6,7};
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        }catch (Exception e){
            System.out.println(e);
           // e.printStackTrace();
        }
    }

    public void exampleThrow(){
        System.out.println("test");
        throw new IllegalArgumentException("Method tidak bisa diakses");
    }
}
