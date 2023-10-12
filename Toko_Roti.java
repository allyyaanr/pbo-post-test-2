/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package toko_roti;

import breads.bread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

final class Toko_Roti {
    private static final List<bread> breadList = new ArrayList<>();
    public final static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("List of Menu:");
            System.out.println(" =================");
            System.out.println(" ======MENU======");
            System.out.println(" 1. Add new Bread");
            System.out.println(" 2. List of Bread");
            System.out.println(" 3. Update Bread");
            System.out.println(" 4. Delete Bread");
            System.out.println(" 5.     Exit    ");
            System.out.println(" ================");
            System.out.print("Enter The Option : ");

            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    System.out.print("Insert Bread Number: ");
                    Integer insertNumber = Integer.valueOf(scanner.nextLine());
                    System.out.print("Insert Bread Name: ");
                    String insertName = scanner.nextLine();
                    System.out.print("Insert Bread Type: ");
                    String insertType = scanner.nextLine();
                    System.out.print("Insert Bread Price: ");
                    Integer insertPrice = Integer.valueOf(scanner.nextLine());
                    System.out.print("Insert Bread Stock: ");
                    Integer insertStock = Integer.valueOf(scanner.nextLine());
                    bread newbread = new bread(insertNumber, insertName,insertType, insertPrice, insertStock);
                    breadList.add(newbread);
                    break;
                    
                case "2":
                    if (breadList.isEmpty()) {
                        System.out.println("There's no Bread in List");
                    } else {
                        System.out.println("==================");
                        System.out.println("== List of Bread ==");
                        for (bread bread : breadList) {
                            System.out.println("Number : " + bread.getbreadNumber());  
                            System.out.println("Name : " + bread.getbreadName());
                            System.out.println("Type: " + bread.getType());
                            System.out.println("Price: " + bread.getPrice());
                            System.out.println("Stock: " + bread.getStock());
                            System.out.println("==================");
                        }
                    }
                    break;

                case "3":
                    System.out.print("Insert Bread Number: ");
                    Integer getbreadNo = Integer.valueOf(scanner.nextLine());
                    System.out.print("Insert New Price of Bread: ");
                    Integer updatePrice = Integer.valueOf(scanner.nextLine());
                    System.out.print("Insert New Stock of Bread: ");
                    Integer updateStock = Integer.valueOf(scanner.nextLine());
                    boolean findUpdate = false;
                    for (bread student : breadList) {
                                if (student.getbreadNumber().equals(getbreadNo)) {
                                    student.setPrice(updatePrice);
                                    student.setStock(updateStock);
                                    findUpdate = true;
                                    break;
                                }
                            }   if (!findUpdate) {
                                System.out.println("bread not found");
                            }   
                    break;
                case "4":
                    System.out.print("Insert Bread Number to Delete: ");
                    Integer deletebread = Integer.valueOf(scanner.nextLine());
                    boolean foundDelete = false;
                    Iterator<bread> iterator = breadList.iterator();
                    while (iterator.hasNext()) {
                        bread bread = iterator.next();
                        if (bread.getbreadNumber().equals(deletebread)) {
                            iterator.remove();
                            foundDelete = true;
                            break;
                        }
                    }   if (!foundDelete) {
                        System.out.println("Bread Not Found");
                    }   
                    break;
                        
                case "5":
                    System.out.println("Thank You!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choise. Please Choose Again.");
            }
        }
    }
}

