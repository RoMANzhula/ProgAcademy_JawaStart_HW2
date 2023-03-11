import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        var date = Integer.parseInt(sdf.format(new Date()));

        Scanner scanner = new Scanner(System.in);
        System.out.println("What year were you born?");

        var yearBorn = scanner.nextInt();
        if (yearBorn < 1900 || yearBorn > date) {
            System.out.println("It's false. Goodbye.");
            return;
        }
        while (true) {
            System.out.println("What year is it now?");
            var yearNow = scanner.nextInt();

            if (yearNow != date) {
                System.out.println("It's false. Goodbye.");
                break;
            }
            var result = yearNow - yearBorn;
            System.out.println("Your age is " + result + " years.");
            System.out.println("-------------------------");
        }
    }
}
//Домашнє завдання до 2-го уроку:
//Написати програму, яка запитує користувача в якому році він народився, який рік сьогодні і виводить його вік у роках на консоль.
//‼️ Звертаю твою увагу на те, що в Java важливий регістр літер і крапки із комами після кожної команди.
//Тому практику роби максимально за аналогією з кодом відео уроку.
//Завдання можна викласти на перевірку у Telegram чаті учасників. Там же можна поставити будь-які питання, якщо щось не виходить.
//Завдання прохання викладати у вигляді скріншотів написаного коду.
