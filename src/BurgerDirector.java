public class BurgerDirector{
    public Burger makeCheeseBurger(BurgerBuilder builder){
        return builder.setBun("Sesame")
                .setMeat("Beef")
                .addCheese()
                .build();
    }
    public Burger makeVeganBurger(BurgerBuilder builder){
        return builder.setBun("Wheat")
                .setMeat("Vegan")
                .addTomato()
                .build();
    }
    public Burger makeDoubleMeatBurger(BurgerBuilder builder){
        return builder.setBun("Sesame")
                .setMeat("Double beef")
                .addCheese()
                .addTomato()
                .build();
    }
}