public class SistemaReservaHoteles {
    public static void main(String[] args) {
        System.out.println("---+--- sistema de reserva de hoteles ---+---");
        final var nombreCliente = "lucas";
        var diasEstancia = 10;
        var tarifaDiaria = 15000.00;
        var cuantaConVista = true;
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("cuantaConVista = " + cuantaConVista);
        System.out.println();
        diasEstancia = 5;
        tarifaDiaria = 10000.00;
        cuantaConVista = false;
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("cuantaConVista = " + cuantaConVista);



    }
}
