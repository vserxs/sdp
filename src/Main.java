public class Main{
    public static void main(String[] args){
        BurgerDirector director = new BurgerDirector();

        //ORDER
        Burger cheeseburger=director.makeCheeseBurger(new BurgerBuilder());
        System.out.println(cheeseburger);

        Burger vegan=director.makeVeganBurger(new BurgerBuilder());
        System.out.println(vegan);

        Burger doubleMeat=director.makeDoubleMeatBurger(new BurgerBuilder());
        System.out.println(doubleMeat);

    }
}