public class Primes {
    public static boolean IsPrime(int number){
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i * i <= number) {
            if (number % i == 0 || number % (i+2) == 0){
                return false;
            }
            i += 6;
        }
        return true;
    }
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int prim = 0;
        System.out.println("Prime numbers up to " + N + ":");
        for(int i = 0; i <= N; i++){
            if(IsPrime(i)){
                prim++;
                System.out.println(i);
            }
        }
        double x = (double)prim / N * 100;
        System.out.println("There are " + prim + " primes between 2 and " + N + " ("+ (int)x + "% are primes)");
    }
}