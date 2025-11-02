public class question3 {
    public static long power(long base, int exp){
        if (exp==0){
            return 1;
        }else{
            return base*power(base, exp -1);
        }
    }
    public static void main(String[] args){
        long base=3;
        int exp=2;
        System.out.println("base to the exp is" +power(base,exp));
    }

}
