import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {
    public static List<Product> GetExpensiveBooks (List<Product> products) {
        return products.stream().filter(product -> product.getType().equals("Book"))
                .filter(product -> product.getPrice() > 250)
                .toList();
    }

    public static List<Product> GetDiscountedBooks (List<Product> products) {
        return products.stream().filter(product -> product.getType().equals("Book"))
                .filter(Product::isDiscount)
                .peek(product -> product.setPrice(product.getPrice() * 0.9))
                .toList();
    }

    public static Product GetCheapestBook (List<Product> products) {
        return products.stream().filter(product -> product.getType().equals("Book"))
                .reduce((first, second) -> first.getPrice() < second.getPrice() ? first : second)
                .orElseThrow(() -> new RuntimeException("Product [category: category_name] not found"));
    }

    public static List<Product> GetLatestBooks (List<Product> products) {
        return products.stream().sorted(Comparator.comparing(Product::getCreateDate).reversed())
                .limit(3)
                .toList();
    }

    public static double GetTotalProductsValue (List<Product> products) {
        return products.stream().filter(product -> product.getCreateDate().getYear() == LocalDate.now().getYear())
                .filter(product -> product.getType().equals("Book"))
                .filter(product -> product.getPrice() <= 75)
                .mapToDouble(Product::getPrice)
                .reduce(Double::sum)
                .orElseThrow(() -> new RuntimeException("No such Products"));
    }

    public static Map GetGroupedProducts (List<Product> products) {
        return products.stream().collect(Collectors.groupingBy(Product::getType));
    }


}
