public class BurgerBuilder{
    private String bun;
    private String meat;
    private boolean hasCheese;
    private boolean hasTomato;

    public BurgerBuilder setBun(String bun){
        this.bun=bun;
        return this;}

    public BurgerBuilder setMeat(String meat){
        this.meat=meat;
        return this;}

    public BurgerBuilder addCheese() {
        this.hasCheese=true;
        return this;}

    public BurgerBuilder addTomato() {
        this.hasTomato=true;
        return this;}

    public Burger build(){
        if(bun==null||meat==null){
            throw new IllegalStateException("a burger cannot be created without a bun and meat");
        }
        return new Burger(bun,meat,hasCheese,hasTomato);
    }
}