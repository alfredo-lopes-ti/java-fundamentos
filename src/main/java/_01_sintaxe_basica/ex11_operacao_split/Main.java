package _01_sintaxe_basica.ex11_operacao_split;

public class Main {
    public static void main(String[] args) {

        String s = "Potato Tomato Onion Carrot";

        String[] vect = s.split(" "); // split() é um método da classe String que divide a string em partes com base no delimitador fornecido, neste caso, um espaço em branco.

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);
    }
}
