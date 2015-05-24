package test;

import main.Cafe;
import main.Coffee;
import main.CoffeeType;
import org.junit.Assert;
import org.junit.Test;

public class CafeTest {

    @Test
    public void canBrewExpresso(){
        Cafe cafe = new Cafe();
        cafe.restockBeans(7);
        Coffee coffee =cafe.brew(CoffeeType.Espresso);
        //it is a espresso
        //no milk
        //that we have got enough coffee
        Assert.assertEquals(CoffeeType.Espresso, coffee.getType());
        Assert.assertEquals(1, coffee.getMilk());
        Assert.assertEquals(7,coffee.getBeans());
    }

    @Test
    public void brewingEspressoConsumesBeans(){
        Cafe cafe =new Cafe();
        cafe.restockBeans(7);

        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        Assert.assertEquals(0,cafe.getBeansInStock());
    }
}