public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

//        Объявите три массива:
//        1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
//        2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
//        3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
        System.out.println("Часть 1");

        int[] numbers = new int[3] ;
        numbers [0] = 1;
        numbers [1] = 2;
        numbers [2] = 3;
        int number1 = numbers[0];
        int number2 = numbers[1];
        int number3 = numbers[2];
        System.out.println("Вывожу целочисленный массив: " + number1 +","+ number2 +","+ number3+".");

        System.out.println("Часть 2");

        double [] fractions = {1.57, 7.654, 9.986};
        System.out.println("Вывожу массив дробных чисел: " + fractions[0] +","+ fractions[1] +","+ fractions[2]+".");

        System.out.println("Часть 3");

        char [] symbols = {35, 36, 37};
        System.out.println("Вывожу массив символов: "+ symbols[0] +","+ symbols[1] +","+ symbols[2] +".");

        System.out.println("Задача 2");

        System.out.println("Вывожу значения всех массивов:\n" + number1 +","+ number2 +","+ number3+"\n"+ fractions[0] +","+ fractions[1] +","+ fractions[2]+"\n"+ symbols[0] +","+ symbols[1] +","+ symbols[2] +".");

        System.out.println("Задача 3");

        System.out.println("Вывожу значения всех массивов в обратном порядке:\n" + number3 +","+ number2 +","+ number1+"\n"+ fractions[2] +","+ fractions[1] +","+ fractions[0]+"\n"+ symbols[2] +","+ symbols[1] +","+ symbols[0] +".");

        System.out.println("Задача 4");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                System.out.println(numbers[i]);
           }else{
                numbers[i]+=1;
                System.out.println(numbers[i]);
            }
        }
    }
}