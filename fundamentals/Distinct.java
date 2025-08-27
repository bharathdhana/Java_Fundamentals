//finding the distinct elements in the array
public class Distinct {
    public static void Updation(int[] arr, boolean[] dig){
        for(int each:arr){
            while(each>0){
                int index = each%10;
                dig[index] = true;
                each/=10;
            }
        }
    }
    public static void main(String[] args) {
        int[] elements = {11,65,9,3,45};
        boolean[] digits = new boolean[10];
        Distinct.Updation(elements,digits);
        for(int index=0;index<digits.length;index++){
            if(digits[index]){
                System.out.println(index+"");
            }
        }
    }
    
}
