class Evento{
    private int id;
    private Data ocorrencia;
    private String nome;

    public Evento(){
        this.ocorrencia = new Data();
    }
    public Data getOcorrenicia(){
        return this.ocorrencia;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return this.id;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public String getNome(){
        return this.nome;
    }
}