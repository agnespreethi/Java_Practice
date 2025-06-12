public class TestArray {
    public static void main(String[] args) {
        double[] myList = {1.2, 3.5, 2, 0.3, 4.2};

        // Print all the array element
        for(int i=0; i < myList.length; i++){
            System.out.println(myList[i]);
        }

        // Adding all array element
        double total = 0;
        for(int i=0; i < myList.length; i++){
            total += myList[i];
        }
        System.out.println("The total is : " + total);    
    }
}
