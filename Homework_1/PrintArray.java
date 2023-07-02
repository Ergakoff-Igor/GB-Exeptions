public class PrintArray {
    
    public void printArray (int [] array){
        System.out.print("[ ");
        for (int i : array) {
            System.out.printf("%d ", i);
        }
        System.out.print("]\n");
    }


        public void printArray (double [] array){
        System.out.print("[ ");
        for (double i : array) {
            System.out.printf("%.2f ", i);
        }
        System.out.print("]\n");
    }
}
