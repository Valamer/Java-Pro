import java.util.Date;

public class Product {
    String type;
    double price;
    boolean discount;
    Date createDate;

    public Product(String type, double price, boolean discount, Date createDate) {
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.createDate = createDate;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isDiscount() {
        return discount;
    }
    public Date getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        sb.append("\t");
        sb.append(price);
        sb.append("\t");
        sb.append(discount);
        sb.append("\t");
        sb.append(createDate);
        return sb.toString();
    }
}
