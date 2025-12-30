public class rekursi {
    public int Factorial(int n) {
        if (n>0) {
            return n * Factorial(n - 1);
        } else {
            return 1;
        }
    }
    
    public static void main(String[] args) {
        rekursi obj = new rekursi();
        int factorial = obj.Factorial(5); 
        System.out.println(factorial);
    }
}
