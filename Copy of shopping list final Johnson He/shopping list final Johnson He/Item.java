public class Item
{

    private int type;
    private String name;
    private double quantity;
    private double price;
    
    public Item()
    {
        type = 0;
        name = "";
        quantity = 0.00;
        price = 0.00;
    }

    public int getType()  {
        return type;
    }
    public void setType(int t) {
        type = t ;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public double getQuantity() {
        return quantity;
    }
    public void setQuantity(double q) {
        quantity = q ;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double p) {
        price = p ;
    }
    public double getCost() {
        double cost;
        if (type == 6 || type == 7){
            cost = price*quantity*1.0825;
        }
        else {
            cost = price*quantity*1.045;
        }
        return cost;
    }
   

    public Item(int type, String name, double quantity, double price) {
        this.type = type;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

}
