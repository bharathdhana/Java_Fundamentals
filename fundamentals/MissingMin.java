//find the first minimum missing values from the array 
public class MissingMin {
    public int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int each:arr){
            if(each < min)
                min = each;
        }
        return min;
    }

    public boolean isAvailable(int[] arr, int search){
        for(int each:arr){
            if(each == search) 
                return true; 
        }
        return false;
    }
    public static void main(String[] args) {
        int[] bills = {0,1,2,3,4,5,6};
        MissingMin missing = new MissingMin();
        int found = missing.findMin(bills);
        found++;   

        while(true) { 
            if(missing.isAvailable(bills, found)) {
                missing.isAvailable(bills, found++);
            } else {
                System.out.println(found);
                break;
            }
        }
    }
}
