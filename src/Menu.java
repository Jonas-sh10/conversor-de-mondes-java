import java.util.Scanner;

public class Menu {

    public void mostrarMenu(){
        Scanner lectura = new Scanner(System.in);
        ConsultaConversorMonedas consulta = new ConsultaConversorMonedas();
        int opcion = 0;
        do{
            System.out.println("--------------------------------------------");
            System.out.println("Bienvenido al Convertidor de Monedas");
            System.out.println("--------------------------------------------");
            System.out.println("1. Dólar =>> Peso Argentino");
            System.out.println("2. Peso Argentino =>> Dólar");
            System.out.println("3. Dólar =>> Real Brasileño");
            System.out.println("4. Real Brasileño =>> Dólar");
            System.out.println("5. Dólar =>> Peso Colombiano");
            System.out.println("6. Peso Colombiano =>> Dólar");
            System.out.println("7. Dólar =>> Peso Mexicano");
            System.out.println("8. Peso Mexicano =>> Dólar");
            System.out.println("9. Dólar =>> Soles Peruanos");
            System.out.println("10. Soles Peruanos =>> Dólar");
            System.out.println("0. Salir");
            System.out.println("Ingrese una opción válida:");
            System.out.println("--------------------------------------------");

            try{
                opcion = Integer.parseInt(lectura.nextLine());
//            ARGENTINA-ARS BRASIL-BRL COLOMBIA-COP MEXICO-MXN PERU-PEN
                String busquedaDeMoneda;
                double cantidadDeMoneda;
                double monedaConvertida;
                switch (opcion) {
                    case 1:
                        try {
                            System.out.println("Dólar =>> Peso Argentino");
                            busquedaDeMoneda = "USD";
                            MonedasApi monedasAPI = consulta.buscaMoneda(busquedaDeMoneda);
                            Monedas tipoDeMoneda = new Monedas(monedasAPI);
                            System.out.println("Monedas convertidas: " + tipoDeMoneda);
                            System.out.println("Ingrese el monto a convertir:");
                            cantidadDeMoneda = Double.parseDouble(lectura.nextLine());
                            monedaConvertida = tipoDeMoneda.getARS() * cantidadDeMoneda;
                            System.out.println("El valor " + cantidadDeMoneda + " [USD] corresponde al valor final de =>>" +
                                    " " + monedaConvertida + " [ARS]");
                        }catch (Exception e) {
                            System.out.println("Error no se encontro la moneda" + e.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            System.out.println("Peso Argentino =>> Dólar");
                            busquedaDeMoneda = "ARS";
                            MonedasApi monedasAPI = consulta.buscaMoneda(busquedaDeMoneda);
                            Monedas tipoDeMoneda = new Monedas(monedasAPI);
                            System.out.println("Monedas convertidas: " + tipoDeMoneda);
                            System.out.println("Ingrese el monto a convertir:");
                            cantidadDeMoneda = Double.parseDouble(lectura.nextLine());
                            monedaConvertida = tipoDeMoneda.getUSD() * cantidadDeMoneda;
                            System.out.println("El valor " + cantidadDeMoneda + " [ARS] corresponde al valor final de" +
                                    " =>>" +
                                    " " + monedaConvertida + " [USD]");
                        }catch (Exception e) {
                            System.out.println("Error no se encontro la moneda" + e.getMessage());
                        }
                        break;
                    case 3:
                        try {
                            System.out.println("Dólar =>> Real Brasileño");
                            busquedaDeMoneda = "USD";
                            MonedasApi monedasAPI = consulta.buscaMoneda(busquedaDeMoneda);
                            Monedas tipoDeMoneda = new Monedas(monedasAPI);
                            System.out.println("Monedas convertidas: " + tipoDeMoneda);
                            System.out.println("Ingrese el monto a convertir:");
                            cantidadDeMoneda = Double.parseDouble(lectura.nextLine());
                            monedaConvertida = tipoDeMoneda.getBRL() * cantidadDeMoneda;
                            System.out.println("El valor " + cantidadDeMoneda + " [USD] corresponde al valor final de =>>" +
                                    " " + monedaConvertida + " [BRL]");
                        }catch (Exception e) {
                            System.out.println("Error no se encontro la moneda" + e.getMessage());
                        }
                        break;
                    case 4:
                        try {
                            System.out.println("Real Brasileño =>> Dólar");
                            busquedaDeMoneda = "BRL";
                            MonedasApi monedasAPI = consulta.buscaMoneda(busquedaDeMoneda);
                            Monedas tipoDeMoneda = new Monedas(monedasAPI);
                            System.out.println("Monedas convertidas: " + tipoDeMoneda);
                            System.out.println("Ingrese el monto a convertir:");
                            cantidadDeMoneda = Double.parseDouble(lectura.nextLine());
                            monedaConvertida = tipoDeMoneda.getUSD() * cantidadDeMoneda;
                            System.out.println("El valor " + cantidadDeMoneda + " [BRL] corresponde al valor final de" +
                                    " =>>" +
                                    " " + monedaConvertida + " [USD]");
                        }catch (Exception e) {
                            System.out.println("Error no se encontro la moneda" + e.getMessage());
                        }
                        break;
                    case 5:
                        try {
                            System.out.println("Dólar =>> Peso Colombiano");
                            busquedaDeMoneda = "USD";
                            MonedasApi monedasAPI = consulta.buscaMoneda(busquedaDeMoneda);
                            Monedas tipoDeMoneda = new Monedas(monedasAPI);
                            System.out.println("Monedas convertidas: " + tipoDeMoneda);
                            System.out.println("Ingrese el monto a convertir:");
                            cantidadDeMoneda = Double.parseDouble(lectura.nextLine());
                            monedaConvertida = tipoDeMoneda.getCOP() * cantidadDeMoneda;
                            System.out.println("El valor " + cantidadDeMoneda + " [USD] corresponde al valor final de =>>" +
                                    " " + monedaConvertida + " [COP]");
                        }catch (Exception e) {
                            System.out.println("Error no se encontro la moneda" + e.getMessage());
                        }
                        break;
                    case 6:
                        try {
                            System.out.println("Peso Colombiano =>> Dólar");
                            busquedaDeMoneda = "COP";
                            MonedasApi monedasAPI = consulta.buscaMoneda(busquedaDeMoneda);
                            Monedas tipoDeMoneda = new Monedas(monedasAPI);
                            System.out.println("Monedas convertidas: " + tipoDeMoneda);
                            System.out.println("Ingrese el monto a convertir:");
                            cantidadDeMoneda = Double.parseDouble(lectura.nextLine());
                            monedaConvertida = tipoDeMoneda.getUSD() * cantidadDeMoneda;
                            System.out.println("El valor " + cantidadDeMoneda + " [COP] corresponde al valor final de" +
                                    " =>>" +
                                    " " + monedaConvertida + " [USD]");
                        }catch (Exception e) {
                            System.out.println("Error no se encontro la moneda" + e.getMessage());
                        }
                        break;
                    case 7:
                        try {
                            System.out.println("Dólar =>> Peso Mexicano");
                            busquedaDeMoneda = "USD";
                            MonedasApi monedasAPI = consulta.buscaMoneda(busquedaDeMoneda);
                            Monedas tipoDeMoneda = new Monedas(monedasAPI);
                            System.out.println("Monedas convertidas: " + tipoDeMoneda);
                            System.out.println("Ingrese el monto a convertir:");
                            cantidadDeMoneda = Double.parseDouble(lectura.nextLine());
                            monedaConvertida = tipoDeMoneda.getMXN() * cantidadDeMoneda;
                            System.out.println("El valor " + cantidadDeMoneda + " [USD] corresponde al valor final de =>>" +
                                    " " + monedaConvertida + " [MXN]");
                        }catch (Exception e) {
                            System.out.println("Error no se encontro la moneda" + e.getMessage());
                        }
                        break;
                    case 8:
                        try {
                            System.out.println("Peso Mexicano =>> Dólar");
                            busquedaDeMoneda = "MXN";
                            MonedasApi monedasAPI = consulta.buscaMoneda(busquedaDeMoneda);
                            Monedas tipoDeMoneda = new Monedas(monedasAPI);
                            System.out.println("Monedas convertidas: " + tipoDeMoneda);
                            System.out.println("Ingrese el monto a convertir:");
                            cantidadDeMoneda = Double.parseDouble(lectura.nextLine());
                            monedaConvertida = tipoDeMoneda.getUSD() * cantidadDeMoneda;
                            System.out.println("El valor " + cantidadDeMoneda + " [MXN] corresponde al valor final de" +
                                    " =>>" +
                                    " " + monedaConvertida + " [USD]");
                        }catch (Exception e) {
                            System.out.println("Error no se encontro la moneda" + e.getMessage());
                        }
                        break;
                    case 9:
                        try {
                            System.out.println("Dólar =>> Soles Peruano");
                            busquedaDeMoneda = "USD";
                            MonedasApi monedasAPI = consulta.buscaMoneda(busquedaDeMoneda);
                            Monedas tipoDeMoneda = new Monedas(monedasAPI);
                            System.out.println("Monedas convertidas: " + tipoDeMoneda);
                            System.out.println("Ingrese el monto a convertir:");
                            cantidadDeMoneda = Double.parseDouble(lectura.nextLine());
                            monedaConvertida = tipoDeMoneda.getPEN() * cantidadDeMoneda;
                            System.out.println("El valor " + cantidadDeMoneda + " [USD] corresponde al valor final de =>>" +
                                    " " + monedaConvertida + " [PEN]");
                        }catch (Exception e) {
                            System.out.println("Error no se encontro la moneda" + e.getMessage());
                        }
                        break;
                    case 10:
                        try {
                            System.out.println("Soles Peruanos =>> Dólar");
                            busquedaDeMoneda = "PEN";
                            MonedasApi monedasAPI = consulta.buscaMoneda(busquedaDeMoneda);
                            Monedas tipoDeMoneda = new Monedas(monedasAPI);
                            System.out.println("Monedas convertidas: " + tipoDeMoneda);
                            System.out.println("Ingrese el monto a convertir:");
                            cantidadDeMoneda = Double.parseDouble(lectura.nextLine());
                            monedaConvertida = tipoDeMoneda.getUSD() * cantidadDeMoneda;
                            System.out.println("El valor " + cantidadDeMoneda + " [PEN] corresponde al valor final de" +
                                    " =>>" +
                                    " " + monedaConvertida + " [USD]");
                        }catch (Exception e) {
                            System.out.println("Error no se encontro la moneda" + e.getMessage());
                        }
                        break;
                    case 0:
                        System.out.println("Gracias por usar el Convertidor de Monedas");
                        break;
                    default:
                        System.out.println("Ingrese una opción válida");
                        break;
                }
            }catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido para la opción.");
                lectura.nextLine();
            }

        }while ( opcion != 0 );
    }
}
