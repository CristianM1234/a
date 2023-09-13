public class Calculadora {
    private Suma objSuma=new Suma();
    private Resta objResta=new Resta();
    private Multiplicacion objMultiplicacion=new Multiplicacion();
    private Usuario objUsuario = new Usuario();
    public void operaciones(){
        System.out.println("1. Suma\nCualquier numero, Salir");
        System.out.println("2. Resta\nCualquier numero, Salir");
        System.out.println("3. Multiplicacion\nCualquier numero, Salir");
        System.out.println("Digite su opción ");
        int opcion = objUsuario.pedirNumero();
        if(opcion == 1){
            objSuma.mostrar(objSuma.sumar());
        }
        if(opcion == 2){
            objResta.mostrar(objResta.restar());
        }
        if(opcion == 3){
            objMultiplicacion.mostrar(objMultiplicacion.Multiplicar());
        }else{
            System.out.println("Gracias por usar nuestra Calculadora ");
        }
    }
}
