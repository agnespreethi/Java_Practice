// Array
public class Array{
    public static void main(String[] args) {
        int num[] = {1,2,3};
        num[1] = 5;
        System.out.println(num[1]);
        int nums[] = new int[4];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 9;
        for(int i=0; i<=3; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
