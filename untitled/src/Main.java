import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner input= new Scanner(System.in);
//        ex-1

        System.out.println("enter the number :");
        int number=input.nextInt() ;

         for(int i=0;i<=number;i++){
             if(i%3==0){
                 System.out.println("Fizz");
             }else if(i%5==0){
                 System.out.println("Buzz");
             }else if(i%15==0){
                 System.out.println(" FizzBuzz ");
             }
         }


//         ex-2
      String Data= "xof nworb kciuq ehT";
        char[] letters = Data.toCharArray();
        System.out.print("reverse string: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }


//        ex-3

        System.out.print("Input a number: ");
        int num1 = input.nextInt();
        for( int i=0; i<10;i++){
            System.out.println(num1 + " x " + (i+1) + " = " +
                    (num1 * (i+1)));
        }
//       ex-4
        System.out.print("Enter any positive number: ");
        int num =  input.nextInt();
        int factorial = 1;
        for(int i = 1; i <= num; ++i){
            factorial *=i;
        }
       System.out.println(factorial);


//        ex-5
        System.out.print("Enter  number 1 : ");
        int n1 =  input.nextInt();
        System.out.print("Enter  number 2: ");
        int n2 =  input.nextInt();
        int power = 1;
        if(n2>=1){
            for (int i = 1; i <= n2; i++){
                power=power*n1;
            }
            System.out.println(power);
        }

//        ex-6
        int _number;
        char choice;
        int even = 0;
        int odd = 0;

        do
        {
            System.out.print("enter  number ");
            _number = input.nextInt();

            if( _number % 2 == 0)
            {
                even += _number;
            }
            else if(_number % 2 == 1)
            {
                odd += _number;
            }

            System.out.print("do you want to continue y/n? ");
            choice = input.next().charAt(0);

        }while(choice=='y');

        System.out.println("Sum of even numbers: " + even);
        System.out.println("Sum of odd numbers: " + odd);


//          ex-7
           System.out.print("enter a number :");
            int n = input.nextInt();
            boolean flag= false;
            for (int i = 1; i <= n / 2; ++i){
               if(n % i == 0){
                   flag = true;
                   break;
               }
            }
        if (!flag)
            System.out.println(n + " is a prime number");
        else
            System.out.println(n + " is not a prime number ");

//          ex-8

              int number_,
                countPositive = 0,
                countNegative = 0,
                countZero = 0;

              char _choice;
        do
        {
            System.out.print("enter number :");
            number_ = input.nextInt();

            if(number_ > 0)
            {
                countPositive++;
            }
            else if(number_ < 0)
            {
                countNegative++;
            }
            else
            {
                countZero++;
            }

            System.out.print("do you want to continue y/n? ");
            _choice = input.next().charAt(0);

        }while(_choice=='y');

        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zero numbers: " + countZero);

//      ex-9

         for(int i=1; i<=4;i++){
             System.out.println("week :  " +i);
             for(int j=0; j<7;j++)   {
                 System.out.println("day :" +j);
             }

         }
//         ex-10
             System.out.print("enter any string : ");
             String str = input.nextLine();
              int strLength = str.length();
              String reverseStr = "";
//
//
//
        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is  palindrome string.");
        }
        else {
            System.out.println(str + " is not  palindrome string.");
        }
          ////////////////
    }
}