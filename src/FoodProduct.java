public class FoodProduct extends Product {
    private int discountPercent ;
    public FoodProduct(String id, String name, int price,int discountPercent ) {
        super(id, name, price);
        this.discountPercent  = discountPercent ;
    }

    @Override
    double calculateFinalPrice() {
        return super.getPrice() - (super.getPrice() * discountPercent / 100);
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    void displayInfo(){
        System.out.printf("ID : %s , Name : %s , Price : %d, Phầm trăm giảm giá : %d \n",super.getId(),super.getName(),super.getPrice(),this.discountPercent);
    }
}
