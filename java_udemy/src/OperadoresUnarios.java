public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("--- operadores unarios ---");
        int a =3, b = -2,resultado;
        var c = true;
        //operador unario +
        resultado = +a;
        System.out.println("a = " + resultado);
        //operador unario -
        resultado = -a;
        System.out.println("b = " + resultado);

        //operadores unarios incremento/decremento
        //pre-incremento
        a = 3;
        resultado = ++a; // pre-incremento,
        System.out.println("resultado ++a = " + resultado);
        System.out.println("a = " + a);

        //post-incremento
        a =3;
        resultado = a++; // primero se usa el valor y despues se incrementa
        System.out.println("resultado a++ = " + resultado);
        System.out.println("en este momento se incrementa = " + a);

        //pre-incremneto
        b = -2;
        resultado = --b;//primero se incrementa y despues se usa el valor
        System.out.println("resultado --b = " + resultado);
        System.out.println("b ya se decremento " + b);

        //post-decremento
        b = -2;
        resultado = b--;//primero se usa el valor, y despues de incrementa
        System.out.println("resultado b-- = " + resultado);
        System.out.println("b en este momento se decremento: " + b);

    }
}
