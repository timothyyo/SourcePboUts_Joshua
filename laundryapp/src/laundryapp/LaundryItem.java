/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundryapp;

/**
 *
 * @author Nitor 5 GK
 */
public class LaundryItem {
    private String customerName;
    private String shoeType;
    private String serviceType;
    private boolean additionalService;
    private String notes;

    public LaundryItem(String customerName, String shoeType, String serviceType, boolean additionalService, String notes) {
        this.customerName = customerName;
        this.shoeType = shoeType;
        this.serviceType = serviceType;
        this.additionalService = additionalService;
        this.notes = notes;
    }

    // Getter dan Setter
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getShoeType() {
        return shoeType;
    }

    public void setShoeType(String shoeType) {
        this.shoeType = shoeType;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public boolean isAdditionalService() {
        return additionalService;
    }

    public void setAdditionalService(boolean additionalService) {
        this.additionalService = additionalService;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
