public class question2 {
    public static int sumDigits(int n){
        int sum=0;
        if (n<10){
            return n;
        }else {
            return (n%10) +sumDigits(n/10);
        }
    }
    public static void main(String[] args){
        int number=789;
        System.out.println(" sum of digits of" + number+ "is " +(sumDigits(number)));
    }

}
