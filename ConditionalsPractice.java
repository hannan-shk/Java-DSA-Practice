import java.util.Scanner;

public class ConditionalsPractice {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your Gender: ");
//        String gender=sc.next();
//        System.out.print("Enter you age: ");
//        int age=sc.nextInt();
//
//        if(gender.equalsIgnoreCase("Male")||gender.equalsIgnoreCase("male") ){
//            if(age>=18){
//                System.out.println("He is eligible to vote.");
//            }else {
//                System.out.println("He is not eligible to vote.");
//            }
//        }else{
//            if(age>=18){
//                System.out.println("She is eligible to vote.");
//            }else {
//                System.out.println("She is not eligible to vote.");
//            }
//        }

//       System.out.print("Enter a character: ");
//       char character=sc.next().charAt(0);
//
//
//
//
//       if(character>=65&&character<=90){
//           System.out.println((char)(character+32));
//       }else if (character>=97&&character<=122){
//           System.out.println((char)(character-32));
//       }

       System.out.print("Enter Number One: ");
       int num1=sc.nextInt();
       System.out.print("Enter Number Two: ");
       int num2=sc.nextInt();
       System.out.print("Enter Number Three: ");
       int num3=sc.nextInt();
       System.out.print("Enter Number Four: ");
       int num4=sc.nextInt();
       System.out.print("Enter Number Five: ");
       int num5=sc.nextInt();

       int totalNum=400;

       int least=num1;

       if(num2<least){
           least=num2;
       }
       if (num3<least) {
           least=num3;
       }
       if (num4<least) {
           least=num4;
       }
       if (num5<least) {
           least=num5;
       }

       float sum=(num1+num2+num3+num4+num5)-least;
       float per=(sum/totalNum)*100;
       System.out.println(per);

       sc.close();
    }
}
