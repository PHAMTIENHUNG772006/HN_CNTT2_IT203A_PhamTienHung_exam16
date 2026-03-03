public class ElectronicProduct extends Product{
    private int warrantyMonths;
    public ElectronicProduct(String id, String name, int price,int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    double calculateFinalPrice() {
        return super.getPrice();
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    void displayInfo(){
        System.out.printf("ID : %s , Name : %s , Price : %d, Bảo hành :  %d tháng \n",super.getId(),super.getName(),super.getPrice(),this.warrantyMonths);
    }
}
