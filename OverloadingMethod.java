public class OverloadingMethod {    //method yang namanya serupa dalam satu class namun berbeda parameter dan tipe data
    public int plusMethodInt(int x, int y) {
        return x + y;
      }
    public double plusMethodInt(double x, double y) {
        return x - y;
      }

    public static void main(String[] args) {
        OverloadingMethod obj = new OverloadingMethod();

        int num1 = obj.plusMethodInt(3, 2);
        double num2 = obj.plusMethodInt(4, 2);
        System.out.println(num1);
        System.out.println(num2);
    }
}

