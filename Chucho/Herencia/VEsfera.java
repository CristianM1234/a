package ejemploherencia;

public class VEsfera extends Acirculo{
    public VEsfera(){
    }
    public double cvesf(){
        double ve= 4*(super.calcularAreaC()*super.getR())/3;
        return ve;
    }
}
