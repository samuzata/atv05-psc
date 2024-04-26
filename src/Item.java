public class Item {
    private String name;
    private Float price;

    public Item(String name, Float price){
        this.name = name;
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
       return this.name;
    }

    public void setPrice(Float price){
        this.price = price;
    }
    
    public Float getPrice(){
        return this.price;
    }
}