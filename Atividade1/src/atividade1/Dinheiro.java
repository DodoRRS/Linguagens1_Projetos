/* Douglas Rezende Rodrigues da Silveira    RA: 13.02016-0
   Fabio Kawasaki   RA: 13.02838-3
 */
package atividade1;

public class Dinheiro {

    private double valor;
    private String moeda;
    private static double taxaEuroDolar = 0.9249;
    private static double taxaRealDolar = 3.08;

    public double getValor() {
        return this.valor;
    }

    public double setValor(double v) {
        return this.valor = v;
    }

    public String getMoeda() {
        return this.moeda;
    }

    public String setMoeda(String md) {
        return this.moeda = md;
    }

    public double getTaxaEuroDolar() {
        return this.taxaEuroDolar;
    }

    public double getTaxaRealDolar() {
        return this.taxaRealDolar;
    }

    public void alterarTaxaRealDolar(double tx) {
        if (validarTaxa(tx)) {
            this.taxaRealDolar = tx;
        } else {
            System.out.println("Já é a moeda atual.");
        }
    }

    private boolean validarTaxa(double tx) {
        return true;
    }

    public void alterarTaxaEuroDolar(double tx) {
        if (validarTaxa(tx)) {
            this.taxaEuroDolar = tx;
        } else {
            System.out.println("Já é a moeda atual.");
        }
    }

    public boolean validarMoeda(String moeda) {
        String r = "real";
        String d = "dolar";
        String e = "euro";

        if (moeda.equals(r)) {
            return true;
        } else if (moeda.equals(d)) {
            return true;
        } else if (moeda.equals(e)) {
            return true;
        } else {
            return false;
        }

    }

    public void realParaDolar() {
        String r = "real";
        if (this.moeda.equals(r)) {
            this.valor = this.valor / this.taxaRealDolar;
        } else {
            System.out.println("Impossível realizar a conversão.");
        }
    }

    public void dolarParaReal() {
        String d = "dolar";
        if (this.moeda.equals(d)) {
            this.valor = this.valor * this.taxaRealDolar;
        } else {
            System.out.println("Impossível realizar a conversão.");
        }
    }

    public void euroParaDolar() {
        String e = "euro";
        if (this.moeda.equals(e)) {
            this.valor = this.valor / this.taxaEuroDolar;
        } else {
            System.out.println("Impossível realizar a conversão.");
        }
    }

    public void dolarParaEuro() {
        String d = "dolar";
        if (this.moeda.equals(d)) {
            this.valor = this.valor * this.taxaEuroDolar;
        } else {
            System.out.println("Impossível realizar a conversão.");
        }
    }

    public void valorEmReal() {
        String r = "real";
        String d = "dolar";
        if (this.moeda.equals(r)) {
            System.out.println("Valor já está em real.");
        } else if (this.moeda.equals(d)) {
            dolarParaReal();
        } else {
            euroParaDolar();
            dolarParaReal();
        }
    }

    public void valorEmDolar() {
        String r = "real";
        String d = "dolar";
        if (this.moeda.equals(d)) {
            System.out.println("Valor já está em dolar.");
        } else if (this.moeda.equals(r)) {
            realParaDolar();
        } else {
            euroParaDolar();
        }
    }

    public void valorEmEuro() {
        String e = "euro";
        String d = "dolar";
        if (this.moeda.equals(e)) {
            System.out.println("Valor já está em euro.");
        } else if (this.moeda.equals(d)) {
            dolarParaEuro();
        } else {
            realParaDolar();
            dolarParaEuro();
        }
    }
}
