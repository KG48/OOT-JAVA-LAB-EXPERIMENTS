// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
   public ReadFile() {
   }

   public static void main(String[] var0) {
      try {
         File var1 = new File("myfile.txt");
         Scanner var2 = new Scanner(var1);

         while(var2.hasNextLine()) {
            String var3 = var2.nextLine();
            System.out.println(var3);
         }

         var2.close();
      } catch (FileNotFoundException var4) {
         System.out.println("An error has occurred.");
         var4.printStackTrace();
      }

   }
}