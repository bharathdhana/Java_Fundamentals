public class Multitask {
    public static void main(String[] args) {
        CurrencyConverter cc = new CurrencyConverter();
        // Thread t1 = new Thread(cc);
        // t1.start();
    }
    
}
class CurrencyConverter implements Runnable {
 
    public void DollarToRupees(int dollar){
        System.out.println("Dollar to Rupees: " + (dollar * 87)+ " Rupees");

    }
    @Override
    public void run() {
        int[] salary = {9800,1200,5600,4000,500};
        for(int sal : salary) {

            // DollarToRupees(sal);
        }
    }
}
class DutchMan{
    public void sortTickets(int[] arr)
    {
        int start=0, current= 0,end=arr.length-1;
        while(current<=end){
            int temp;
            if(arr[current] == 0){
                temp=arr[start];
                arr[start]=arr[current];
                arr[current]=temp;
                start++;
                current++;
            }else if(arr[current]==1){
                current++;
            }else{
                temp=arr[current];
                arr[current]=arr[end];
                arr[end]=temp;
                end--;
            }
        }
    }
}
