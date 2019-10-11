package boletin3_1;


public class Boletin3_1 {

   
    public static void main(String[] args) {
        // instanciar objetos
        
        
     Consumo consume = new Consumo();
        consume.setLitros(50);
        consume.setpGas(1.57f);
        Consumo consumo = new Consumo(400f, 50f, 80f, 1.57f);
        System.out.println("O consumo medio é "
                + consumo.consumoMedio() + " litros cada 100 km.");
        consumo.setLitros(156f);
        System.out.println("A velocidade media do 2º obxeto é "
                + consumo.getvMed() + ".");
        consumo.Visualizar();
    }
    
}



