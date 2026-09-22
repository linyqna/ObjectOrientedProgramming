package Quiz.Quiz1.no1;

public class Product {
    private String productID;
    private String productName;
    private float productPrice;
    private String productType;
    private Stock stok;

    public Product(String productName, String productID, float productPrice, String productType) {
        this.productName = productName;
        this.productID = productID;
        this.productPrice = productPrice;
        this.productType = productType;
        this.stok = null;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void createStock(int quantity, int shopNo) {
        // 1. Buat objek Stock baru
        Stock newStock = new Stock(quantity, shopNo);
        
        // 2. Hubungkan secara dua arah
        this.stok = newStock;
        newStock.setProduk(this); // Memastikan Stock tahu produk apa yang dimilikinya
        
        System.out.println("Stock successfully initialized for product: " + this.productName);
    }

    public Stock getStok() {
        return stok;
    }

    public void setStok(Stock stok) {
        this.stok = stok;
    }

    public void addProduct() {
        System.out.println("Product is succesfully added.");
    }

    public void modifyProduct(String newName, float newPrice, String newType) {
        if (newName != null) {
            this.productName = newName;
        } if (newPrice != 0) {
            this.productPrice = newPrice;
        } if (newType != null) {
            this.productType = newType;
        }

        System.out.println("Product data is updated");
    }

    public void selectProduct(String cariPoduct) {
        if (this.productID.equals(cariPoduct)) {
            System.out.println(getInfo());
        } else {
            System.out.println("Product is not found.");
        }
    }

    public String getInfo() {
        String info = "";
        info += "\n===== PRODUCT DETAIL =====\n";
        info += "\nNo ID      : " + this.productID + "\n";
        info += "Name       : " + this.productName + "\n";
        info += "Price      : " + String.format("%.0f", productPrice) + "\n";
        info += "Type       : " + this.productType + "\n";
        if (this.stok != null) {
            info += this.stok.getInfo() + "\n";
        } else {
            info += "Product Quantity: No stock assigned\n";
        }

        return info;
    }

    public void addStock(Stock stok) {
        this.stok = stok;
        if (stok.getProduk() != this) {
            stok.setProduk(this);
        }
    }

    public void selectStock(String cariProductID) {
        if (this.stok != null) {
            if (this.productID.equals(cariProductID)) {
                System.out.println("--- Stock Found via Product ---");
                System.out.println(this.stok.getInfo());
            } else {
                System.out.println("Stock is not found for this product ID.");
            }
        } else {
            System.out.println("This product does not have any stock assigned yet.");
        }
    }
}
