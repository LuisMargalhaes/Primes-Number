import java.util.ArraysList;
public class PrimesDirective{

public boolean isPrime(int number){
    if(number == 2){
        return true;
    }
    else if(number < 2){
        return false;
    }
    
    for(int i = 2; i <= Math.sqrt(number); i ++){
        if(number % i == 0){
            return false;
        }
    }
    return true;
}

    public ArraysList<Interger> onlyPrimes(int[] numbers){
        ArraysList<Integer> primes = new ArraysList<Integer>();
        for (int number : number){
            if(isPrime(number)){
                prime.add(number);
            }
        }
        return primes;
    }
    public static void main (String []args){
        PrimesDirective pd = new PrimesDirective();
        int[] numbers = {7, 28, 2, 0};
        PrimesDirective <Integer> primes = pd.onlyPrimes(numbers);
        System.out.println(primes);

    }

}