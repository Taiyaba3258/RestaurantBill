
import java.util.Scanner;



public class Test
{

    public static void main(String[] args) {
        
        String[] name;
        String[] qty;
        String[] unit_price;
        String[] total_price;
        double sum;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Total items : ");
            int total_items = input.nextInt();
            input.nextLine();
            name = new String[total_items];
            qty = new String[total_items];
            unit_price = new String[total_items];
            total_price = new String[total_items];
            int i = 0;
            sum = 0.0;
            do
            {
                System.out.print("Item's Name : ");
                name[i] = input.nextLine();
                if(name[i].equals("0")) break;
                
                System.out.print(name[i] + " Quantity : ");
                qty[i] = input.nextLine();
                
                System.out.print(name[i] + " Unit Price : ");
                unit_price[i] = input.nextLine();
                
                sum = sum + Integer.parseInt(qty[i]) * Double.parseDouble(unit_price[i]);
                total_price[i] = String.valueOf(sum);
                i++;
                
                System.out.println();
                
                
            }while(i <= total_items-1);
        }
        System.out.println("---------Printing Complete---------");
        System.out.println("Items List are : ");
        for(int count = 0; count<name.length; count++)
        {
            System.out.println();
            System.out.println("Item Name " + name[count]);
            System.out.println("Item Quantity " + qty[count]);
            System.out.println("Item Unit Price " + unit_price[count]);
            System.out.println("Item Total Price " + total_price[count]);
        }
        System.out.println();
        System.out.println("Sub Total = " + sum);
        System.out.println();
        System.out.println("---------Thank You-----------");
    }
}