// prime numbers 1-10

public class q4 {
    public static void main(String[] args) {
        for(int i=2; i<=10; i++){
            boolean prime = true;

            for(int j=2; j*j<=i; j++){
                if(i%j == 0){
                    prime = false;
                    break;
                }
            }

            if(prime){
                System.out.print(i + " ");
            }
        }
    }
}
