# Задача №1 - Мили

## Исходный код task_31.class
```java
import java.util.Scanner;
public class task_31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a ticket price: ");
        int ticket_price_kop = in.nextInt();
        if (ticket_price_kop <= 0 || ticket_price_kop >= 2147483647){
            System.out.println("Are you sure?");
        } else {
            int bonus_miles = (int)ticket_price_kop / 20;
            System.out.println("You get " + bonus_miles + " bonus miles!");
        }
    }
}
```

Работа написана в следующем окружении:
* Windows 10 1903 18362.778
* openjdk version "11.0.7" 2020-04-14
* OpenJDK Runtime Environment AdoptOpenJDK (build 11.0.7+10)
* OpenJDK 64-Bit Server VM AdoptOpenJDK (build 11.0.7+10, mixed mode)