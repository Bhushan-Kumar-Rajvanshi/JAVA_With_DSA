package Basic_Java;

public class LoopFirstQ {
    public static void main(String[] args) {
        int num = 1;

        while (true) {
            if((num%5==0) && (num%7==0)) {
                System.out.println(num);
                break;
            }
            num++;
        }


        for(int n=1; n<=50; n++){
            if(n%3==0){
                continue;
            }
            System.out.print(" " + n);
        }
    }
}
