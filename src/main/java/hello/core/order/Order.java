package hello.core.order;

public class Order {

    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discountFixAmount;

    public Order(Long memberId, String itemName, int itemPrice, int discountFixAmount) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discountFixAmount = discountFixAmount;
    }

    public int calculatePrice() {
        return itemPrice * discountFixAmount;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDiscountFixAmount() {
        return discountFixAmount;
    }

    public void setDiscountFixAmount(int discountFixAmount) {
        this.discountFixAmount = discountFixAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", discountFixAmount=" + discountFixAmount +
                '}';
    }
}
