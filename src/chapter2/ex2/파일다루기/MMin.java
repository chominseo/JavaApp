package chapter2.ex2.���ϴٷ��;

import java.util.Scanner;

public class MMin {

   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      final int WIDTH = 15;
      final int HEIGHT = 10;
      int[] colors = new int[100];
      int[] xs = new int[HEIGHT*WIDTH];
      int[] ys = new int[HEIGHT*WIDTH];

      int current = 0;
      int menu, selct;

      char[][] board = new char[HEIGHT][WIDTH];

      end: while (true) {
         System.out.println("��������������������������");
         System.out.println("��           ���θ޴�           ��");
         System.out.println("��������������������������");
         System.out.println("\t1. ���ӽ���");
         System.out.println("\t2. ����");

         System.out.print("\t����>");
         menu = scan.nextInt();

         switch (menu) {

         case 1:
            while (true) {
               for (int y = 1; y <= HEIGHT; y++)
                  for (int x = 1; x <= WIDTH; x++)

                     if (x == 1 && y == 1)
                        board[y - 1][x - 1] = '��';
                     else if (x == WIDTH && y == 1)
                        board[y - 1][x - 1] = '��';
                     else if (x == 1 && y == HEIGHT)
                        board[y - 1][x - 1] = '��';
                     else if (x == WIDTH && y == HEIGHT)
                        board[y - 1][x - 1] = '��';
                     else if (y == 1)
                        board[y - 1][x - 1] = '��';
                     else if (y == HEIGHT)
                        board[y - 1][x - 1] = '��';
                     else if (x == 1)
                        board[y - 1][x - 1] = '��';
                     else if (x == WIDTH)
                        board[y - 1][x - 1] = '��';
                     else
                        board[y - 1][x - 1] = '��';

               while (true) {
                  for (int y = 0; y < HEIGHT; y++) {
                     for (int x = 0; x < WIDTH; x++)

                        System.out.printf("%c", board[y][x]);

                     System.out.println();

                  }
                  
                  System.out.print("(x sp y) > ");

                  int x = scan.nextInt();
                  int y = scan.nextInt();

                  xs[current] = x;
                  ys[current] = y;
                  
                  if (current % 2 == 0)
                     board[y - 1][x - 1] = '��';
                  else
                     board[y - 1][x - 1] = '��';
                  
                  current++;
                  
               }
            }

         case 2:

            System.out.println("������ �������ϴ�.");
            break end;

         default:
            System.out.println("�޴��� ���� �����Դϴ�.");

         }

      }

   }

}