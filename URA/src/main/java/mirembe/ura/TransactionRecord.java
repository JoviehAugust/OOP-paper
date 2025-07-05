/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mirembe.ura;

/**
 *
 * @author ADMIN
 */
public class TransactionRecord {
    
    private final String buyerTIN;
    private final String sellerTIN;
    private double invoiceAmount;
    private String transactionTimestamp;

    // Constructor
    public TransactionRecord(String buyerTIN, String sellerTIN, double invoiceAmount, String transactionTimestamp) {
        this.buyerTIN = buyerTIN;
        this.sellerTIN = sellerTIN;
        this.invoiceAmount = invoiceAmount;
        this.transactionTimestamp = transactionTimestamp;
    }

    // Getters
    public String getBuyerTIN() {
        return buyerTIN;
    }

    public String getSellerTIN() {
        return sellerTIN;
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    }

    public String getTransactionTimestamp() {
        return transactionTimestamp;
    }

    // Setters with validation if needed
    public void setInvoiceAmount(double invoiceAmount) {
        if(invoiceAmount >= 0) {
            this.invoiceAmount = invoiceAmount;
        }
    }

    public void setTransactionTimestamp(String transactionTimestamp) {
        this.transactionTimestamp = transactionTimestamp;
    }
}


