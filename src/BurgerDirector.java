public class BurgerDirector {

    public Burger makeCheeseburger(BurgerBuilder builder){
        return builder.setBun(Bun.SESAME)
                .setMeat(Meat.BEEF)
                .addCheese()
                .build();
    }

    public Burger makeVeganBurger(BurgerBuilder builder){
        return builder.setBun(Bun.WHEAT)
                .setMeat(Meat.VEGAN)
                .addTomato()
                .build();
    }
}