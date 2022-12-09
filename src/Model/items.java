package Model;

public class items {
   String model;
    String Brand;
    int prize;
    int code;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public items(String model, String brand, int prize, int code) {
        this.model = model;
        Brand = brand;
        this.prize = prize;
        this.code = code;
    }
    public  void  print(){
        String model = this.model;
        String brand = this.Brand;
        int prize =this.prize;
        int code =this.code;
        System.out.println(this.model);
        System.out.println(this.Brand);
        System.out.println(this.prize);
        System.out.println(this.code);

    }

}
