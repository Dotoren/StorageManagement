package Default;

import java.util.*;

public class Product {

    // Fields
    private String name;
    private int quantity;
    private int capacity;
    private int barcode;
    private double pricePurchase;
    private double priceSales;
    private String productGroup;
    private String supplier;
    private String locationStorage;
    private int stockQuantity;


    public Product() {

    }

    // Constructor
    public Product(String name, int quantity, int capacity, int barcode,
                   double pricePurchase, double priceSales, String productGroup,
                   String supplier, String locationStorage, int stockQuantity) {

        this.name = name;
        this.quantity = quantity;
        this.capacity = capacity;
        this.barcode = barcode;
        this.pricePurchase = pricePurchase;
        this.priceSales = priceSales;
        this.productGroup = productGroup;
        this.supplier = supplier;
        this.locationStorage = locationStorage;
        this.stockQuantity = stockQuantity;
    }

    //
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public double getPricePurchase() {
        return pricePurchase;
    }

    public void setPricePurchase(double pricePurchase) {
        this.pricePurchase = pricePurchase;
    }

    public double getPriceSales() {
        return priceSales;
    }

    public void setPriceSales(double priceSales) {
        this.priceSales = priceSales;
    }

    public String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getLocationStorage() {
        return locationStorage;
    }

    public void setLocationStorage(String locationStorage) {
        this.locationStorage = locationStorage;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
