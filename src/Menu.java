import java.util.Scanner;

public class Menu {
    Scanner lectura = new Scanner(System.in);

    public void mostrarMenu(){
        int opcion = 0;
        do{
            mostrarOpciones();
            try{
                opcion = Integer.parseInt(lectura.nextLine());
                /*ARGENTINA-ARS BRASIL-BRL COLOMBIA-COP MEXICO-MXN PERU-PEN
                String busquedaDeMoneda;
                String monedaDePais;
                String conversionRealizada;*/

                switch (opcion) {
                    case 1:
                        try {
                            System.out.println("Dólar =>> Peso Argentino");
                            /*busquedaDeMoneda = "USD";
                            monedaDePais = "ARS";
                            conversionRealizada = conversionDeMonedas("USD", "ARS");
                            System.out.println(conversionRealizada);*/
                            System.out.println(conversionDeMonedas("USD", "ARS"));
                        }catch(NumberFormatException e){
                            System.out.println("Error al ingresar un número: " + e.getMessage());
                        }catch (Exception e) {
                            System.out.println("Error no se encontro la moneda: " + e.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            System.out.println("Peso Argentino =>> Dólar");
                            System.out.println(conversionDeMonedas("ARS", "USD"));
                        }catch(NumberFormatException e){
                            System.out.println("Error al ingresar un número: " + e.getMessage());
                        }catch (Exception e) {
                            System.out.println("Error no se encontro la moneda: " + e.getMessage());
                        }
                        break;
                    case 3:
                        try {
                            System.out.println("Dólar =>> Real Brasileño");
                            System.out.println(conversionDeMonedas("USD", "BRL"));
                        }catch(NumberFormatException e){
                            System.out.println("Error al ingresar un número: " + e.getMessage());
                        }catch (Exception e) {
                            System.out.println("Error no se encontro la moneda: " + e.getMessage());
                        }
                        break;
                    case 4:
                        try {
                            System.out.println("Real Brasileño =>> Dólar");
                            System.out.println(conversionDeMonedas("BRL", "USD"));
                        }catch(NumberFormatException e){
                            System.out.println("Error al ingresar un número: " + e.getMessage());
                        }catch (Exception e) {
                            System.out.println("Error no se encontro la moneda: " + e.getMessage());
                        }
                        break;
                    case 5:
                        try {
                            System.out.println("Dólar =>> Peso Colombiano");
                            System.out.println(conversionDeMonedas("USD", "COP"));
                        }catch(NumberFormatException e){
                            System.out.println("Error al ingresar un número: " + e.getMessage());
                        }catch (Exception e) {
                            System.out.println("Error no se encontro la moneda: " + e.getMessage());
                        }
                        break;
                    case 6:
                        try {
                            System.out.println("Peso Colombiano =>> Dólar");
                            System.out.println(conversionDeMonedas("COP", "USD"));
                        }catch(NumberFormatException e){
                            System.out.println("Error al ingresar un número: " + e.getMessage());
                        }catch (Exception e) {
                            System.out.println("Error no se encontro la moneda: " + e.getMessage());
                        }
                        break;
                    case 7:
                        try {
                            System.out.println("Dólar =>> Peso Mexicano");
                            System.out.println(conversionDeMonedas("USD", "MXN"));
                        }catch(NumberFormatException e){
                            System.out.println("Error al ingresar un número: " + e.getMessage());
                        }catch (Exception e) {
                            System.out.println("Error no se encontro la moneda: " + e.getMessage());
                        }
                        break;
                    case 8:
                        try {
                            System.out.println("Peso Mexicano =>> Dólar");
                            System.out.println(conversionDeMonedas("MXN", "USD"));
                        }catch(NumberFormatException e){
                            System.out.println("Error al ingresar un número: " + e.getMessage());
                        }catch (Exception e) {
                            System.out.println("Error no se encontro la moneda: " + e.getMessage());
                        }
                        break;
                    case 9:
                        try {
                            System.out.println("Dólar =>> Soles Peruano");
                            System.out.println(conversionDeMonedas("USD", "PEN"));
                        }catch(NumberFormatException e){
                            System.out.println("Error al ingresar un número: " + e.getMessage());
                        }catch (Exception e) {
                            System.out.println("Error no se encontro la moneda: " + e.getMessage());
                        }
                        break;
                    case 10:
                        try {
                            System.out.println("Soles Peruanos =>> Dólar");
                            System.out.println(conversionDeMonedas("PEN", "USD"));
                        }catch(NumberFormatException e){
                            System.out.println("Error al ingresar un número: " + e.getMessage());
                        }catch (Exception e) {
                            System.out.println("Error no se encontro la moneda: " + e.getMessage());
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

    public void mostrarOpciones() {
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
    }

    public String conversionDeMonedas(String buscandoMoneda, String monedaDePais) {
        ConsultaConversorMonedas consulta = new ConsultaConversorMonedas();

        double tasaDeCambio  = 0;
        double cantidadDeMoneda;
        double monedaConvertida = 0;

        MonedasApi monedasAPI = consulta.buscaMoneda(buscandoMoneda);
        Monedas tipoDeMoneda = new Monedas(monedasAPI);

        // Obtener la tasa de conversión para la moneda destino
        if (monedaDePais.equals("USD")) {
            tasaDeCambio = tipoDeMoneda.getUSD();
        } else if (monedaDePais.equals("ARS")) {
            tasaDeCambio = tipoDeMoneda.getARS();
        } else if (monedaDePais.equals("BRL")) {
            tasaDeCambio = tipoDeMoneda.getBRL();
        }else if (monedaDePais.equals("COP")) {
            tasaDeCambio = tipoDeMoneda.getCOP();
        }else if (monedaDePais.equals("MXN")) {
            tasaDeCambio = tipoDeMoneda.getMXN();
        }else if (monedaDePais.equals("PEN")) {
            tasaDeCambio = tipoDeMoneda.getPEN();
        }

        System.out.println("Monedas convertidas: " + tipoDeMoneda);
        System.out.println("Ingrese el monto a convertir:");
        cantidadDeMoneda = Double.parseDouble(lectura.nextLine());
        monedaConvertida = tasaDeCambio * cantidadDeMoneda;
        return "El valor " + cantidadDeMoneda + " [" + buscandoMoneda + "] " + "corresponde al valor final de =>>" +
                " " + monedaConvertida + " [" + monedaDePais + "] ";
    }
}
