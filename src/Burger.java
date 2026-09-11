public class Burger{
    private final String bun;
    private final String meat;
    private final boolean hasCheese;
    private final boolean hasTomato;

    public Burger(String bun,String meat,boolean hasCheese,boolean hasTomato) {
        this.bun=bun;
        this.meat=meat;
        this.hasCheese=hasCheese;
        this.hasTomato=hasTomato;
    }
    @Override
    public String toString() {
        return "Burgers: bun:"+bun+",meat:"+meat+",cheese:"+hasCheese+",tomato:"+hasTomato;
    }
}