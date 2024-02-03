import java.util.ArrayList;
import java.util.List;

class Car {
    private String brand;
    private String model;
    private int quantityInStock;
    private List<PurchaseRequest> purchaseRequests;
    private CarDealership carDealership;

    public Car(String brand, String model, int quantityInStock) {
        this.brand = brand;
        this.model = model;
        this.quantityInStock = quantityInStock;
        this.purchaseRequests = new ArrayList<>();
    }

    public CarDealership getCarDealership() {
        return carDealership;
    }

    public void setCarDealership(CarDealership carDealership) {
        this.carDealership = carDealership;
    }

    public List<PurchaseRequest> getPurchaseRequests() {
        return purchaseRequests;
    }

    public void addPurchaseRequest(PurchaseRequest request) {
        purchaseRequests.add(request);
        request.setCar(this);
    }

    public void removePurchaseRequest(PurchaseRequest request) {
        purchaseRequests.remove(request);
        request.setCar(null);
    }

    public int getAvailability() {
        return quantityInStock - purchaseRequests.size();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}

class PurchaseRequest {
    private String customerName;
    private double amount;
    private Car car;

    public PurchaseRequest(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmount() {
        return amount;
    }
}

class CarDealership {
    private String name;
    private List<Car> cars;

    public CarDealership(String name) {
        this.name = name;
        this.cars = new ArrayList<>();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        cars.add(car);
        car.setCarDealership(this);
    }

    public Car findCarByBrand(String brand) {
        for (Car car : cars) {
            if (car.getBrand().equals(brand)) {
                return car;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}