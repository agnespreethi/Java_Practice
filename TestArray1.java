public class TestArray1 {
    public static void main(String[] args) {

        // declare a string array with initial size
        String[] schoolbag = new String[4];

        //add elements to the array
        schoolbag[0] = "Books";
        schoolbag[1] = "Notebooks";
        schoolbag[2] = "Pencils";
        schoolbag[3] = "Pens";

        int size = schoolbag.length;
        System.out.println("The size of an array is : " + size);
        for(int i=0; i < size; i++){
           System.out.println("Index [" + i + "] = " + schoolbag[i]);
        }
    }
}
