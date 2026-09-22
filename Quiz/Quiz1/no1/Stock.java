package Quiz.Quiz1.no1;

public class Stock {
    private Product produk;
    private int quantity;
    private int shopNo;

    public Stock(int quantity, int shopNo) {
        this.quantity = quantity;
        this.shopNo = shopNo;
        this.produk = null;
    }

    public Product getProduk() {
        return produk;
    }

    public void setProduk(Product produk) {
        this.produk = produk;
        if (produk != null && produk.getStok() != this) {
            produk.setStok(this);
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getShopNo() {
        return shopNo;
    }

    public void setShopNo(int shopNo) {
        this.shopNo = shopNo;
    }

    public void addStock() {
        if (this.produk != null) {
            System.out.println("Stock for product " + this.produk.getProductName() + " successfully added.");
        } else {
            System.out.println("Unknown Product");
        }
    }

    public void modifyStock(int newQuantity, int newShop) {
        if (newQuantity != 0) {
            this.quantity = newQuantity;
        } if (newShop != 0) {
            this.shopNo = newShop;
        }
    }

    public String getInfo() {
        String info = "";
        info += "Product Quantity   : " + this.quantity + "\n";
        info += "Inventory ID       : " + this.shopNo;

        return info;
    }
}
