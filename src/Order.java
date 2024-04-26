import java.util.ArrayList;

public class Order {
    
    private Float totalPrice;
    private ArrayList<Item> itens;

    public Order(){
        this.itens = new ArrayList();
        this.totalPrice = (float) 0.0;
    }

    public void addItemToCart(Item item){
        this.itens.add(item);
        this.totalPrice += item.getPrice();
    }

    public void addDiscountToOrder(Float discountValue){
        this.totalPrice -= discountValue;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }
}