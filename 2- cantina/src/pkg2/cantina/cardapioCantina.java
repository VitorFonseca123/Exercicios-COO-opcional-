
package pkg2.cantina;

/**
 *
 * @author vitor
 */
public class cardapioCantina implements Cardapio{
     private String[] itens;
    private double[] precos;

    public cardapioCantina(String[] itens, double[] precos) {
        this.itens = itens;
        this.precos = precos;
    }

    public String retornaItem(int indice_item) {
        return itens[indice_item];
    }

    public double retornaPreco(int indice_item) {
        return precos[indice_item];
    }
}
