package aed;

class Funciones {
    int cuadrado(int x) {
        int res = x*x;
        return res;
    }

    double distancia(double x, double y) {
        double res = Math.sqrt(x*x + y*y);
        return res;
    }

    boolean esPar(int n) {
        boolean res = n%2 == 0;
        return res;
    }

    boolean esBisiesto(int n) {
        boolean res = n%400==0 || (n%4 == 0 && n%100 != 0);
        return res;
    }

    int factorialIterativo(int n) {
        int res = 1;
        for (int i = 1; i < n; i++){
            res = res*(i+1);
        }
        return res;
    }

    int factorialRecursivo(int n) {
        int res;
        if (n==0){
            res = 1;
        } else{
            res = n*(factorialRecursivo(n-1));
        }
        return res;
    }

    int cantidadDivisores(int n){
        int res = 0;
        for (int i = 1; i<=n; i++){
            if (n%i==0){
                res++;
            }
            }
        return res;
        }

    boolean esPrimo(int n) {

        boolean res = cantidadDivisores(n) == 2;
        return res;
    }

    int sumatoria(int[] numeros) {
        int res = 0;
        for (int i:numeros){
            res += i;
        }
        return res;
    }

    int busqueda(int[] numeros, int buscado) {
        int res = 0;
        for (int i= 0; i < numeros.length; i++){

            if(numeros[i] == buscado){
                res = i;
            }
        }
        return res;
    }

    boolean tienePrimo(int[] numeros) {
        boolean res = false;

        for(int i = 0; i < numeros.length; i++){

            if (esPrimo(numeros[i])==true){
                res = true;
            }
        }
        return res;
    }

    boolean todosPares(int[] numeros) {
        boolean res = false;
        int contadorPares = 0;

        for(int i = 0; i < numeros.length; i++){
            if(esPar(numeros[i])==true){
                contadorPares += 1;
            }
        }
        if (contadorPares == numeros.length){
            res = true;
        }
        return res;
    }

    boolean esPrefijo(String s1, String s2) {
        boolean res = false;
        int contadorLetrasIguales = 0;
        
        if (s1.length()<=s2.length()){
            for (int i = 0; i < s1.length(); i++){
                if (s1.charAt(i)==s2.charAt(i)){
                    contadorLetrasIguales += 1;
                }
            }
        }
        if (contadorLetrasIguales == s1.length()){
            res = true;
        }
        return res;
    }

    boolean esSufijo(String s1, String s2) {
        boolean res = false;
        int contadorLetrasIguales = 0;
        int diferenciaDeLongitud = s2.length() - s1.length();
        
        if (s1.length()<=s2.length()){

            for (int i = s1.length() - 1; i > -1; i--){

                if (s1.charAt(i)==s2.charAt(i + diferenciaDeLongitud)){
                    contadorLetrasIguales += 1;
                }
            }
        }
        if (contadorLetrasIguales == s1.length()){
            res = true;
        }
        return res;
    }
}
