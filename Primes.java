public class Primes {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int prim = 0;
        int num = 2;
        boolean isp = true;
        while (N >= num){
            if (num <= 1)
                isp = false;
            else if (num <= 3)
                isp = true;
            else {
                if (num % 2 == 0 || num % 3 == 0)
                isp = false;}
            for (int i = num; i * i >= num; i++){
                if (num % 1 == 0 || num % (i +2) == 0)
                    isp = false;
            }
            if (isp){
                System.out.println(num);
                prim++;
            }
           num++;
        }
        double x = (double)prim / (N-1) * 100;
        System.out.println("There are " + prim + " primes between 2 and " + N + " ("+ x + "% are primes)");
    }
    }