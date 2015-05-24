package main;

/**
 * Created by Hernan Y.Ke on 2015/5/23.
 */
public final class Cafe {

    private int beansInStock = 0;
    private int milkInStock = 0;

    public Coffee brew(CoffeeType coffeeType){return brew(coffeeType,1);}

    public Coffee brew(CoffeeType coffeeType, int quantity){
        requirePositive(quantity);

        int requireBeans = coffeeType.getRequiredBeans() * quantity;
        int requiredMilk = coffeeType.getRequiredMilk() * quantity;

        if(requireBeans > beansInStock || requiredMilk > milkInStock){
            throw new IllegalStateException("Insufficient beans or milk");
        }
        beansInStock -= requireBeans;
        milkInStock -= requiredMilk;
        return new Coffee(coffeeType, requireBeans, requiredMilk);
    }

    public void restockBeans(int weightInGrans){
        requirePositive(weightInGrans);
        beansInStock+=weightInGrans;
    }

    private void requirePositive(int value){
        if(value<1){
            throw new IllegalArgumentException();
        }
    }

    public int getBeansInStock(){ return beansInStock;}
    public int getMilkInStock(){return  milkInStock;}



}
