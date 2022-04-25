package parte4_8;

public class GetSetJava {
    public int idade;

    private void saudacoes() {
        Person pessoa = new Person(25);
        pessoa.getIdade();
        pessoa.setIdade(26);
    }
}