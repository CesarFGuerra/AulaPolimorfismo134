/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaexerciciopolimorfismo134;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class AulaExercicioPolimorfismo134 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();
        
        System.out.print("Enter the number of tax payers:");
        int payer = sc.nextInt();
        
        for (int i = 1; i <= payer; i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or Company(i/c)?");
            sc.nextLine();
            char c = sc.nextLine().charAt(0);
            if (c == 'i'){
                System.out.print("Name: ");               
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(healthExpenditures, name, anualIncome));
            } else{
                System.out.print("Name: ");                
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(numberOfEmployees, name, anualIncome));
            }
            
        }   
            
        System.out.println();
        System.out.println("Taxes paid:");
        double total = 0.0;
        for (TaxPayer t : list){
                
        System.out.println(t);
        total += t.tax();
        }
        
        System.out.println();
        System.out.println("Total Taxes: $" + total);
        // TODO code application logic here
    }
    
}
