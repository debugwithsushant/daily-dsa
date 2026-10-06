public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {4, 2, 8, 6, 7};
        int target = 9;

        for(int i = 0; i <= arr.length-2; i++){
            for(int j = i+1; j <= arr.length-1; j++){
                if(arr[i] + arr[j] == target) System.out.println("Indexes: " + i + ", " + j);
            }
        }
    }
}