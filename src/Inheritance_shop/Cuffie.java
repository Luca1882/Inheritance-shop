package Inheritance_shop;

class cuffie extends Prodotto {
    private String colore;
    private boolean wireless;

    public cuffie (int codice, String nome, String marca, double prezzo, double iva){
        super(codice, nome, marca, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public String getConnesione(){
        return wireless ? "Wireless" : "Cablata";
    }
}
