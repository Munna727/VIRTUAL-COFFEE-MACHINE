import java.util.Scanner;
public class coffemachine {
    static int milk=500;
    static int water=500;
    static int coffee=500;
    static int money=150;
     static void resources(){
        System.out.println("milk : "+milk+" ml");
        System.out.println("water : "+water +" ml");
        System.out.println("coffee : "+coffee +" g");
        System.out.println("money : "+money +" $");
    }
    static void payment(int price){
        System.out.println("pay " +price+"\n note that our machine accepts only 5 rs,10 rs,15 rs coins");
        Scanner d =new Scanner(System.in);
        System.out.println("enter 5 rs coins:");
        int c5=d.nextInt();
        System.out.println("enter 10 rs coins:");
        int c10=d.nextInt();
        System.out.println("enter 15 rs coins:");
        int c15=d.nextInt();
    int sum=(c5*5)+(c10*10)+(c15*15);
    if(sum==price){
        if(price==250){
            latte();
        }
        else if(price==300){
            espresso();
        }
        else if(price==150){
            cappucino();
        }

    }
    else if(sum>price){
        System.out.println("please take your change back"+(price-sum));
        if(price==250){
            latte();
        }
        else if(price==300){
            espresso();
        }
        else if(price==150){
            cappucino();
        }
    }
    else if(sum<price){
        System.out.println("sorry please enter the correct money");
    }
    else{
        System.out.println("hii");
    }
    money+=price;
    
    }
static void latte(){
    if(milk>=200 && water>=40 && coffee>=20){
        System.out.println("your latte is ready☕");
        milk=milk-200;
        water=water-40;
        coffee=coffee-20;
    }
}
static void espresso(){
    if(milk>=30 && water>=10 && coffee>=05){
        System.out.println("your espresso is ready");
        milk=milk-30;
        water=water-10;
        coffee=coffee-05;
}
}
static void cappucino(){
    if(milk>=60 && water>=25 && coffee>=15){
        System.out.println("your cappucino is ready");
        milk=milk-60;
        water=water-25;
        coffee=coffee-15;
}
}   
    public static void main(String[] args) {
        while (true) {
         System.out.println("what would you like to have?(1-latte/2-espresso/3-cappucino)"); 
        System.out.println("enter your choice: ");
        Scanner s=new Scanner(System.in);
        int item=s.nextInt();
        switch (item) {
            case 1:
                payment(250);
                break;
            case 2:
                payment(300);
                break;
            case 3:
                payment(150);
                break;
            case 4:
                resources();
                break;
            case 5:
                System. exit(0);
                break;
            default:
            System.out.println("enter the correct prompt");
                break;
        }
    }
    }
}

