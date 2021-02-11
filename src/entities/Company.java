/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Cesar
 */
public class Company extends TaxPayer{
    
    private Integer numberOfEmployees;

    public Company(Integer numberOfEmployees, String name, Double anualIncome) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployes() {
        return numberOfEmployees;
    }

    public String getName() {
        return name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setNumberOfEmployes(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }
    
    
    @Override
    public Double tax(){
        double sum = 0.0;
        if (numberOfEmployees > 10){
            sum += anualIncome * 0.14;
        } else {
            sum += anualIncome * 0.16;
        }
        return sum;
    }

    @Override
    public String toString() {
        return name + " $" + String.format("%.2f", tax());
    }
    
}
