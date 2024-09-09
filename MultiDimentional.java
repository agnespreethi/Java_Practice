// MultiDimentional Array
public class MultiDimentional {
    public static void main(String []a){
       int nums[][] = new int[3][4];
        
       for(int i=0; i<3; i++){
        for(int j=0; j<4; j++){
            System.out.print(nums[i][j] + " ");
        }  
        System.out.println();  
       }
      
       System.out.println("-------------- To Get random values -----------------");
       
       for(int i=0; i<3; i++){
        for(int j=0; j<4; j++){
            nums[i][j] = (int)(Math.random()*100);
            System.out.print(nums[i][j] + " ");
        }  
        System.out.println();  
       }

       System.out.println("-------------- Using Enhanced For Loop -----------------");

       for(int n[] : nums){
        for(int m : n){
            System.out.print(m + " ");
        }
        System.out.println();  
       }
    }
}
