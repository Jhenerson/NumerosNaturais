/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author jhenerson
 */
public class NumerosNaturais {

    //Atributos
    private int numero = 0;

    // Construtor
    public NumerosNaturais(int numero) {
        this.numero = numero;
    }

    public NumerosNaturais() {
    }

    public NumerosNaturais(NumerosNaturais objeto) {
        this.numero = objeto.numero;
    }

    //Métodos
    public int calculcarFatorial() {
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;

    }

    public boolean numeroPerfeito() {
        int soma = 0;

        for (int i = 1; i < numero; i++) {  
            if (numero % i == 0) {
                soma += +i;
            }
        }
        if (soma == numero) {  
            return true;

        } else {
            return false;
        }
    }

    public NumerosNaturais MDC(NumerosNaturais objeto) {
        int resto;
        NumerosNaturais retorno = new NumerosNaturais();
        while (objeto.getNumero() != 0) {
            resto = numero % objeto.getNumero();
            numero = objeto.getNumero();
            objeto.setNumero(resto);
            retorno = objeto;

        }
        return retorno;
    }

    public NumerosNaturais MMC(NumerosNaturais objeto) {
        int a = numero;
        int b = objeto.getNumero();
        int resposta;
        int mmc;
        NumerosNaturais resultado = new NumerosNaturais();
        do {
            resposta = a % b;
            a = b;
            b = resposta;
        } while (resposta != 0);
        
        mmc = (numero * objeto.getNumero()) / a;
        resultado.setNumero(mmc);

        return resultado;
    }

    public String base2() {
        String base2 = Integer.toBinaryString(numero);
        return base2;
    }

    public String base8() {
        String base8 = Integer.toOctalString(numero);
        return base8;
    }

    public String base16() {
        String base16 = Integer.toHexString(numero);
        return base16;
    }

    public boolean numeroPrimo() {
        if (numero == 1) {
            return false;
        }

        for (int i = 2; i <= numero / 2; i++) {
            if ((numero % i) == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean numeroPrimoEntresi(NumerosNaturais objeto){
        int n;
        if(objeto.getNumero() > numero){
            n = objeto.getNumero();
        }else{
            n = numero;
        }
        for (int i = 2; i < n; i++) {
            if(numero%i == 0 && objeto.getNumero()%i == 0){
                return false;
            }
            
        }
        
        return true;
    }
    public boolean numeroCapicua(){
        String numeroParaString = Integer.toString(numero);
        String numeroInverso = new StringBuilder(numeroParaString).reverse().toString();
        return numeroParaString.equals(numeroInverso);
    }
    public boolean quadradoPerfeito(){
        return (int)Math.sqrt(numero)%2 == 0;
    }

}
