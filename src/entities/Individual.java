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
public class Individual extends TaxPayer {
    
    private Double healthExpenditures;

    public Individual(Double healthExpenditures, String name, Double anualIncome) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }
    
    /**
     *
     * @return
     */
    @Override
    public Double tax(){
        double sum = 0.0;
        if (anualIncome < 20000.00){
            sum += anualIncome * 0.15;
        } else{
            sum += anualIncome * 0.25;
        }
        sum -= healthExpenditures * 0.5;
        return sum;
    }

    @Override
    public String toString() {
        return name + " $" + String.format("%.2f", tax());
    }
    
}
