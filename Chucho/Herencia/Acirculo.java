package ejemploherencia;

import java.util.Scanner;

public class Acirculo {
    private double r;
    public Acirculo(){
        
    }
    public void setr(double r){
        this.r=r;
    }
    public double getR(){
        return this.r;
    }
    public double pedirDato(String x){
        System.out.print("Digite un valor "+ x);
        Scanner s=new Scanner(System.in);
        return s.nextDouble();
    }
    public double calcularAreaC(){
        r=pedirDato("para el radio ");
        return Math.PI*Math.pow(r, 2);
    }
    public void mostrar(double v, String z){
        System.out.println(z + v);
    }
}
