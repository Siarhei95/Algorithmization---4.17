package Question_17;
import java.util.*;

public class question_17 {
    public static void main(String[] args) {              // для а 2-х значном: (a%10 + a/10)
        Scanner scanner = new Scanner(System.in);         // для а 3-х значном: (a%10)+((a/10)%10)+((a/100)%10)
        System.out.print("Enter a: ");                   // для а 4-х значном: (a%10)+((a/10)%10)+((a/100)%10)+((a/1000)%10))
        int a = scanner.nextInt();                       // и т.д.
        int k = 0;
        searchNumberOfOperations(k,a);
    }

        static void searchNumberOfOperations(int k, int a){ // Из заданного числа вычли сумму его  цифр
        while (a > 0) {
            if(a<=99) {
                a = a - (a%10 + a/10);
                k = k + 1;
            }
            if(a<=999){
                a = a - ((a%10)+((a/10)%10)+((a/100)%10));
                k = k + 1;
            }
            if(a<=9999) {
                a = a - ((a % 10) + ((a / 10) % 10) + ((a / 100) % 10) + ((a / 1000) % 10));
                k = k + 1;
            }
        }
             System.out.println("Number of operations: "+k);
    }
}

//еще вариант нахождения суммы цифр числа

/*while (a > 0) { //Пока a>0 выполняем цикл
        s = s + a % 10; //Ищем остаток от деления числа n на 10, суммируем
        a = a / 10;  //Ищем целую часть от деления числа n  на 10
        }*/




































