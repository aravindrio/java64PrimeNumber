public class PrimeNumber {

    public static void main(String[] args) {
        isPrime(10);
        int count = 0;

        for(int i = 0; i < 50; i++ ){
            if(isPrime(i)){
               count++;
               System.out.println("The Number " + i + " is a Prime Number.");
               if(count == 3){
                   System.out.println("Exiting for Loop");
                   break;
               }
            }
        }


    }

    public static boolean isPrime(int n){

        if(n == 1){
            return false;
        }

        for(int i = 2; n % 2 == 0 ; i++){

            return false;
        }

        return true;
    }
}
