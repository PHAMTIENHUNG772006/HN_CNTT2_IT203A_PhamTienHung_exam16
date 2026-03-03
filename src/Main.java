import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductRepository productRepository = new ProductRepository();
        ElectronicProduct product1 = new ElectronicProduct("P001","Quạt máy",200,3);
        ElectronicProduct product2 = new ElectronicProduct("P002","Tủ lạng",500,12);

        FoodProduct product3 = new FoodProduct("P002","Cơm tấm",20,12);
        FoodProduct product4 = new FoodProduct("P002","Vịt quay",50,20);

        List<Product>  products = productRepository.products;

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        System.out.println("Danh sách sản phẩm : ");
        for (Product product : products) {
            product.displayInfo();
            if (product instanceof FoodProduct){
                System.out.println("Thành tiền : " + product.calculateFinalPrice());;
            }
        }


//        System.out.println("Mời nhập id cần tìm kiếm ");
//        String id = sc.nextLine();

        System.out.println("Danh sách sản phẩm trước khi sắp xếp: ");
        for (Product product : products) {
            product.displayInfo();
        }

        Comparator<Product> comparator = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        };
        products.sort(comparator);
        System.out.println("Danh sách sản phẩm sau khi sắp xếp : ");
        for (Product product : products) {
            product.displayInfo();
        }

        Map<String,Integer> maps = new HashMap<>();

        for (Product product : products) {
            maps.put(product.getId(), maps.getOrDefault(product.getId(), 0) + 1);
        }


        System.out.println("Danh sách số lượng:");
        for (Map.Entry<String, Integer> entry : maps.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() );
        }


    }
}