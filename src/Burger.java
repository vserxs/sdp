public class Burger{
    private final Bun bun;
    private final Meat meat;
    private final boolean hasCheese;
    private final boolean hasTomato;


    Burger(Bun bun, Meat meat, boolean hasCheese, boolean hasTomato){
        this.bun=bun;
        this.meat=meat;
        this.hasCheese=hasCheese;
        this.hasTomato=hasTomato;
    }

    @Override
    public String toString(){
        return "Burger [Bun=" + bun + ", Meat=" + meat +
                ", Cheese=" + hasCheese + ", Tomato=" + hasTomato + "]";
    }
}