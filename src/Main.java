public class Main{
    public static void main(String[] args){
        BurgerDirector director=new BurgerDirector();

        BurgerBuilder builder1=new BurgerBuilder();
        Burger cheeseburger=director.makeCheeseburger(builder1);
        System.out.println("Director's recipe: " + cheeseburger);

        BurgerBuilder builder2=new BurgerBuilder();
        Burger customBurger=builder2.setBun(Bun.GLUTEN_FREE)
                .setMeat(Meat.CHICKEN)
                .addTomato()
                .build();
        System.out.println("Custom recipe: " + customBurger);

        try{
            BurgerBuilder invalidBuilder=new BurgerBuilder();
            Burger errorBurger=invalidBuilder.addCheese().build();
        } catch (IllegalStateException e) {
            System.out.println("Error caught: " + e.getMessage());
        }
    }
}