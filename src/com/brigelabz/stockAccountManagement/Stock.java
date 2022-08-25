package com.brigelabz.stockAccountManagement;

public class Stock {
    private String stockName;
    private int numberOfShare;
    private double sharePrice;
    private double totalValue;

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public void setNumberOfShare(int numberOfShare) {
        this.numberOfShare = numberOfShare;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

    @Override
    public String toString() {
        return "Stock { " +
                " Stock Name = " + stockName + '\'' +
                ", Number Of Share = " + numberOfShare +
                ", Share Price = " + sharePrice +
                ", Total Value is = " + totalValue +
                '}';
    }
}
