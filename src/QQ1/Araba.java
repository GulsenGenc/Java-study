package QQ1;

public class Araba {//POJO : planing old java object-->modal class

    private String model;
    private String renk;
    private int motor;
    private int yıl;

    @Override
    public String toString() {
        return "Araba{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yıl=" + yıl +
                '}';
    }

    public Araba(int motor, int yıl) {//iki parametrelı cons
        this.motor = motor;
        this.yıl = yıl;
    }

    public Araba() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if (motor < 1000) {
            System.out.println("hatalı motor hacmi girişi");
        } else {
            this.motor = motor;
        }


        public void setYıl(int yıl){
            this.yıl = yıl;
        }

    public Araba(String model, String renk, int motor, int yıl){//parametrelı constractor
            this.model = model;
            this.renk = renk;
            this.motor = motor;
            this.yıl = yıl;
        }


    }

    public int getYıl() {
        return yıl;
    }
}