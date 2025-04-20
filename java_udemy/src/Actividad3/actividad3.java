package Actividad3;

class actividad3 {
    class Nodo {
        int info; Nodo izq,der;}
    Nodo raiz;
    public actividad3(){
        raiz=null;
    }
    public void insertar (int info){
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.info=info;
        nuevo.izq=null;
        nuevo.der=null;
        if (raiz==null) {
            raiz=nuevo;
        }
        else{
            Nodo anterior = null;
            Nodo refe = raiz;
            while (refe!=null) {
                anterior=refe;
                if (info<refe.info) {
                    refe = refe.izq;
                }
                else{
                    refe=refe.der;
                }
            }
            if (info<anterior.info) {
                anterior.izq=nuevo;
            }
            else{
                anterior.der=nuevo;
            }
        }
    }
    private void imprimirPre(Nodo refe){
        if (refe != null){
            System.out.print(refe.info+" ");
            imprimirPre(refe.izq);
            imprimirPre(refe.der);
        }
    }
    public void imprimirPre(){
        imprimirPre(raiz);
        System.out.println();
    }
    public void imprimirIn(Nodo refe){
        if (refe!=null) {
            imprimirIn(refe.izq);
            System.out.print(refe.info+" ");
            imprimirIn(refe.der);
        }
    }
    public void imprimirIn(){
        imprimirIn(raiz);
        System.out.println();
    }
    private void imprimirPost(Nodo refe){
        if (refe != null) {
            imprimirPost(refe.izq);
            imprimirPost(refe.der);
            System.out.print(refe.info+" ");
        }
    }
    public void imprimirPost(){
        imprimirPost(raiz);
        System.out.println();
    }
    public static void main(String[] args) {
        actividad3 abo = new actividad3();
        abo.insertar(60);
        abo.insertar(75);
        abo.insertar(66);
        abo.insertar(85);
        abo.insertar(42);
        abo.insertar(14);
        abo.insertar(73);
        abo.insertar(72);
        abo.insertar(2);
        abo.insertar(54);
        abo.insertar(27);
        /*abo.insertar(65);
        abo.insertar(85);
        abo.insertar(95);
        abo.insertar(110);
        abo.insertar(130);*/
        System.out.println("impresion preroden: ");
        abo.imprimirPre();
        System.out.println("impresion iorden: ");
        abo.imprimirIn();
        System.out.println("impresion postorden: ");
        abo.imprimirPost();
        }
    }

