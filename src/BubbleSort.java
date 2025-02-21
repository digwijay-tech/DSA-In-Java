public class BubbleSort {
    public static void main(String[] args) {

        int[] array={4,5,8,3,22,39,55,78,1};

        int length =array.length;

        int temp = 0;

        System.out.println("Unsorted array");

        for( int n : array){

            System.out.print(n+" ");

        }

        for (int i = 0; i < length; i++){ // iteration

            for (int j = 0; j < length-i-1; j++) {

                 if(array[j] > array[j+1]){ //swapping

                     temp = array[j];

                     array[j] = array[j+1];

                     array[j+1] =temp;
                 }
            }
        }
        System.out.println();

        System.out.println("Sorted array");

        for( int n : array){

            System.out.print(n+" ");

        }

    }
}
