package edu.cursor.servise;

import java.util.Scanner;
public class Exercise182 {
 public void ex182() {
	 @SuppressWarnings("resource")
  Scanner sc = new Scanner(System.in);
  System.out.println("Даны натуральное число n, целые числа а1,..., аn. \n"
    + "Найти количество и сумму тех членов данной последовательности,\n"
    + "которые делятся на 5 и не делятся на 7 \n" + "Введите число n.");
  while (true) {
   if(!sc.hasNextInt()) {
    System.out.println("Некорректный ввод");
    sc = new Scanner(System.in);
   } else {
    break;
   }   
  }
  int n = sc.nextInt();
  System.out.println("---");
  int[] array = new int[n];
  for (int i = 0; i < n; i++) {
   array[i] = i;
  }
  int sum = 0;
  int k = 0;
  for (int a : array) {
   if (a % 5 == 0 && a % 7 != 0) {
    k++;
    System.out.println(a);
    sum += a;
   }
  }
  System.out.println("--------------");
  System.out.println("Кількість: " + k);
  System.out.println("Сума: " + sum);
  
 }
}
