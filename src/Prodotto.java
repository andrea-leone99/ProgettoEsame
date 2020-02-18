//CLASSE PRODOTTO





public class Prodotto {
	
	private String nome;
    private String colore;
    private String taglia;
    private float prezzo;
    private int codprodotto;
    
    public Prodotto(String Nome, String Colore, String Taglia, float Prezzo, int CodProdotto) {
    	
    	this.nome = Nome;
    	this.colore = Colore;
    	this.taglia = Taglia;
    	this.prezzo = Prezzo;
    	this.codprodotto = CodProdotto;
    	
    }
    
    //getter
    
    public String getNome()
    {
        return nome;
    }
    
    
    public String getColore()
    {
        return colore;
    }
    
    
    public String getTaglia()
    {
        return taglia;
    }
    
    
   public float getPrezzo()
    {
        return prezzo;
    }
    
   
    public int getCodProdotto()
    {
        return codprodotto;
    }

    
}






