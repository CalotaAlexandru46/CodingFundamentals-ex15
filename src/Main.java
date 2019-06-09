import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int top;
        do{
            top=input.nextInt();
        } while(top>=1000);

        for(int i=0; i<top; i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isArmstrong(int nr){
        int copie=nr;
        int sum=0;
        while(nr!=0){
            sum+=Math.pow((nr%10),3);
            nr/=10;
        }
        if(sum==copie){
            return true;
        }
        return false;
    }

}
