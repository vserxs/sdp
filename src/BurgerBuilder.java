public class BurgerBuilder {
    private Bun bun;
    private Meat meat;
    private boolean hasCheese;
    private boolean hasTomato;

    public BurgerBuilder setBun(Bun bun){
        this.bun=bun;
        return this;
    }
    public BurgerBuilder setMeat(Meat meat){
        this.meat=meat;
        return this;
    }
    public BurgerBuilder addCheese(){
        this.hasCheese=true;
        return this;
    }
    public BurgerBuilder addTomato(){
        this.hasTomato=true;
        return this;
    }
    public Burger build(){
        if (bun==null || meat==null) {
            throw new IllegalStateException("Cannot build a burger without a bun and meat");
        }
        return new Burger(bun,meat,hasCheese,hasTomato);
    }
}