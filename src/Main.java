import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float precioCompraT=0;
        float precioCompraP = 0;
        float precioCompraC = 0;
        int opcion = 0;
        while (opcion != 4) {
            menuPrincipal();
            Scanner seleccion = new Scanner(System.in);
            opcion = seleccion.nextInt();
            switch (opcion) {
                case 1:
                    precioCompraT += compraPantalon();
                    break;
                case 2:
                    precioCompraT += compraCamisetas();
                    break;
                case 3:
                    System.out.println("Lo sentimos, no tenemos zapatos en este momento");
                    break;
                case 4:
                    System.out.println("El total de tu compra fue: "+precioCompraT);
                    break;
                default:
                    System.out.println("Opción no válida");

            }
        }
    }

    public static void menuPrincipal() {
        System.out.println(" *********************************************************** ");
        System.out.println("");
        System.out.println("Bienvenid@ a IzyShop, nos alegra que nos visites ");
        System.out.println("Te invitamos a Seleccionar el producto que deseas escribiendo el número del menú:  ");
        System.out.println("1.  Pantalones");
        System.out.println("2.  Camisetas");
        System.out.println("3.  Zapatos");
        System.out.println("4.  Salir y Finalizar compra");
        System.out.println("Selecciona la opición que deseas: ");
        System.out.println("");
    }

    public static float compraPantalon() {
        int precioPantalon = 50000;
        int tallaPantalon = 0;
        float precioCompraP=0;
        while (tallaPantalon != 3) {
            System.out.println("Selecciona la talla de pantalón adecuada. Promoción: Si llevas más de 15 pantalones te damos descuento del 10%");
            System.out.println("1.  Talla 30, precio " + precioPantalon);
            System.out.println("2.  Talla 32 " + precioPantalon);
            System.out.println("3.  Volver al menú anterior");
            System.out.println("Selecciona una opción: ");
            Scanner tallaP = new Scanner(System.in);
            tallaPantalon = tallaP.nextInt();
            switch (tallaPantalon) {
                case 1:
                    System.out.println("¿Cuantos pantalones talla 30 deseas llevar? :");
                    Scanner numeroP = new Scanner(System.in);
                    int numeroPantalones = numeroP.nextInt();
                    if (numeroPantalones >= 15) {
                        precioCompraP += numeroPantalones * precioPantalon * 0.9;
                    } else {
                        precioCompraP += numeroPantalones * precioPantalon;
                    }
                    break;

                case 2:
                    System.out.println("¿Cuantos pantalones talla 30 deseas llevar? :");
                    Scanner numeroP32 = new Scanner(System.in);
                    float numeroPantalones32 = numeroP32.nextFloat();
                    if (numeroPantalones32 >= 15) {
                        precioCompraP += numeroPantalones32 * precioPantalon * 0.9;
                    } else {
                        precioCompraP += numeroPantalones32 * precioPantalon;
                    }
                    break;
                case 3:
                    System.out.println("Regresando al menú principal");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo");

            }

        }
        return precioCompraP;
    }




    public static float compraCamisetas() {
        float precioCamisetasS = 20000;
        float precioCamisetasM = 25000;
        float precioCamisetasL = 30000;
        float precioCompraC=0;
        int tallaCamisetas = 0;
        while (tallaCamisetas != 4) {
            System.out.println("Selecciona la talla de Camisetas adecuada. Promoción: Si llevas más de 15 camisetas te damos descuento del 15%");
            System.out.println("1.  Talla S, precio " + precioCamisetasS);
            System.out.println("2.  Talla M, precio " + precioCamisetasM);
            System.out.println("3.  Talla L, precio " + precioCamisetasL);
            System.out.println("4.  Volver al menú anterior");
            System.out.println("Selecciona una opción: ");
            Scanner tallaC = new Scanner(System.in);
            tallaCamisetas = tallaC.nextInt();
            switch (tallaCamisetas) {
                case 1:
                    System.out.println("¿Cuantos camisetas talla S deseas llevar? :");
                    Scanner numeroCS = new Scanner(System.in);
                    int numeroCamisetasS = numeroCS.nextInt();
                    if(numeroCamisetasS>100) {
                        System.out.println("*************************************************************");
                        System.out.println("Lo sentimos, no tenemos camisetas suficientes para tu pedido");
                        System.out.println("*************************************************************");
                    }
                    if (numeroCamisetasS >= 30 && numeroCamisetasS <= 100) {
                        precioCompraC += numeroCamisetasS * precioCamisetasS * 0.85;
                    }
                    if(numeroCamisetasS < 30 && numeroCamisetasS <= 100) {
                        precioCompraC += numeroCamisetasS * precioCamisetasS;
                    }
                   break;

                case 2:
                    System.out.println("¿Cuantos camisetas talla M deseas llevar? :");
                    Scanner numeroCM = new Scanner(System.in);
                    int numeroCamisetasM = numeroCM.nextInt();
                    if(numeroCamisetasM>150) {
                        System.out.println("*************************************************************");
                        System.out.println("Lo sentimos, no tenemos camisetas suficientes para tu pedido");
                        System.out.println("*************************************************************");
                    }
                    if (numeroCamisetasM >= 30 && numeroCamisetasM <= 150) {
                        precioCompraC += numeroCamisetasM * precioCamisetasM * 0.85;
                    }
                    if(numeroCamisetasM < 30 && numeroCamisetasM <= 150) {
                        precioCompraC += numeroCamisetasM * precioCamisetasM;
                    }
                    break;
                case 3:
                    System.out.println("¿Cuantos camisetas talla L deseas llevar? :");
                    Scanner numeroCL = new Scanner(System.in);
                    int numeroCamisetasL = numeroCL.nextInt();
                    if(numeroCamisetasL>200) {
                        System.out.println("*************************************************************");
                        System.out.println("Lo sentimos, no tenemos camisetas suficientes para tu pedido");
                        System.out.println("*************************************************************");
                    }
                    if (numeroCamisetasL >= 30 && numeroCamisetasL <= 200) {
                        precioCompraC += numeroCamisetasL * precioCamisetasL * 0.85;
                    }
                    if(numeroCamisetasL < 30 && numeroCamisetasL <= 200) {
                        precioCompraC += numeroCamisetasL * precioCamisetasL;
                    }
                   break;
                case 4:
                    System.out.println("Regresando al menú principal");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo");

            }
        }
        return precioCompraC;
    }

}