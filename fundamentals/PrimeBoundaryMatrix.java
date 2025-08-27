public class PrimeBoundaryMatrix {
    public static void main(String[] args) {
        Boundaries boundaries = new Boundaries();
        boundaries.findPrime();
    }
}

class Boundaries{
    int[][] ranges= {{3,5,7},{10,15,20}};

    public boolean isPrime(int digit){
        for(int number =2;number<digit;number++){
            if(digit%number==0){
                return false;
            }
        }
        return true;
    }
        
        public void findPrime(){
        int sizeColumn = ranges[0].length;
        for(int column = 0;column < sizeColumn; column++){
            int value = ranges[1][column] - ranges[0][column];
            if(isPrime(value)){
                System.out.println(value+"");
            }
            else{
                System.out.println("-1");
            }
        }
    }
}
