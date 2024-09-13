public class Vehicle {

    //POJO:  Plain Old Java Object
    String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }
    public String getModel(){
        return model;
    }
   public void setModel(String model){
        this.model = model;
   }

    public void setMake(String make) {
        this.make = make;
    }

}
