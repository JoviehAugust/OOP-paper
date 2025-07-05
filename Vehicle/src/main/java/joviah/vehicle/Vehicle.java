/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package joviah.vehicle;

/**
 *
 * @author ADMIN
 */
public class Vehicle {
    private final String vehicleId;
    private final int seats;
    private boolean available;

    public Vehicle(String vehicleId, int seats) {
        this.vehicleId = vehicleId;
        this.seats = seats;
        this.available = true;
    }

   
    public String getVehicleId() {
        return vehicleId;
    }

    
    public int getSeats() {
        return seats;
    }

    
    public boolean isAvailable() {
        return available;
    }

    
    public void setAvailable(boolean available) {
        this.available = available;
    }
}



