import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository implements IRepository<Product>{
    List<Product> products = new ArrayList<>();

    @Override
    public boolean add(Product item) {
        Product product = findById(item.getId());

        if (product == null){
            return products.add(item);
        }
        return false;
    }


    @Override
    public boolean removeById(String id) {
        Product product = findById(id);

        if (product == null){
            return products.remove(id);
        }
        return false;
    }

    @Override
    public Product findById(String id) {
        Map<String,Product> maps = new HashMap<>((Map) products);

        for (Map.Entry<String, Product> product :  maps.entrySet()){
            if (product.getKey().equals(id)){
                return product.getValue();
            }
        }
        return null;
    }

    @Override
    public List findAll() {
        return List.of();
    }
}
