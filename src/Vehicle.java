public class Vehicle {
    //POJO:  Plain Old Java Object
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.setMake(make);
        this.setModel(model);
    }

    public String getMake() {
        return make;
    }

    public String getModel(){
     return model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }
}
