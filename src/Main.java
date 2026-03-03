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

        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
        products.sort(comparator);
        System.out.println("Danh sách sản phẩm sau khi sắp xếp : ");
        for (Product product : products) {
            product.displayInfo();
        }

        Map<String,Integer> maps = new HashMap<>();

        for (Product product : products) {
            if (maps.containsKey(product)) {
                maps.put(product.getId(), maps.get(product) + 1);
            } else {
                maps.put(product.getId(), 1);
            }
        }


        System.out.println("Output (đã sắp xếp):");
        for (Map.Entry<String, Integer> entry : maps.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() );
        }


    }
}