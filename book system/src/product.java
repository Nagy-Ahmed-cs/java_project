import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class product {
   protected String name ;
   protected String production_date;
   protected String company;
   public static ArrayList<product>load_products() throws IOException {
      FileReader read=new FileReader("products.txt");
      BufferedReader my_file=new BufferedReader(read);
      ArrayList<product>my_product=new ArrayList<>();
      String line;

      while((line=my_file.readLine())!=null){
         product p=new product();
         p.name=line;
         p.production_date=my_file.readLine();
         p.company= my_file.readLine();
         my_product.add(p);
      }
      return my_product;
   }
   public static void view_products(ArrayList<product>my_product){
      System.out.println("\nWe have ("+my_product.size()+") products here !!!!");
      System.out.println("Name       || company  || production_date  ");
      for(int i=0; i<my_product.size(); i++){
         System.out.println("\n__________________________________\n");
         System.out.println(my_product.get(i).name+ "    "+my_product.get(i).company+"     "+my_product.get(i).production_date);

      }
   }
   public static void add_product(ArrayList<product>my_product) throws IOException {
      product p=new product();
      Scanner input=new Scanner(System.in);
      if(true){
         System.out.println("\nEnter the name of new product : ");
         p.name=input.next();
         System.out.println("Enter the production date ");
         p.production_date=input.next();
         System.out.println("Enter the name of the company : ");
         p.company=input.next();
         my_product.add(p);
         FileWriter write=new FileWriter("products.txt",true);
         BufferedWriter my_file=new BufferedWriter(write);
         my_file.write("\n"+ p.name);
         my_file.write("\n"+p.production_date);
         my_file.write("\n"+p.company);
         my_file.flush();
      }
      else{
         System.out.println("Sorry , you do  not have any access to add new book :( ");
      }
   }


}
