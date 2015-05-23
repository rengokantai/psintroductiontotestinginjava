package main;

/**
 * Created by Hernan Y.Ke on 2015/5/23.
 */
public final class Coffee {


    private final CoffeeType type;
    private final int beans;
    private final int milk;


    public Coffee (CoffeeType coffeeType, int beans, int milk){
        this.type=coffeeType;
        this.beans=beans;
        this.milk=milk;
    }

    public CoffeeType getType(){
        return type;
    }

    public int getBeans(){
        return beans;
    }

    public int getMilk(){
        return milk;
    }

    @Override
    public String toString(){
        return "Coffee(" + "Type-" + type +"";
    }
}
