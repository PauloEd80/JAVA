public class Animal {
    private String nome;
    private float peso;
    private int recinto;

    public Animal(String nome, int recinto){
        this.nome = nome;
        this.recinto = recinto;
        this.peso = peso;
    }
    public Animal(){}

    public Animal(String nome, int recinto){
        this.nome = nome;
        this.recinto = recinto;
        this.peso= 0.0f; // peso padrão explico
    }

    // Get e Set
    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}
    public float getPeso() {return peso;}
    public void setPeso(float peso) {this.peso = peso;}
    public int getRecinto() {return recinto;}
    public void setRecinto(int recinto) {this.recinto = recinto;}

    public void andar(){
        this.recinto++;
    }
    @Override
    public String toString(){
        return "Animal - Nome: "+this.nome
                + "\t Peso: "+ this.peso
                + "\t Recinto: "+ this.recinto;
    }


}