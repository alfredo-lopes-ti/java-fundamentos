package _01_sintaxe_basica.ex09_funcoes_strings;

public class Main {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG   ";

        String s01 = original.toLowerCase(); // vai deixar todas as letras minúsculas
        String s02 = original.toUpperCase(); // vai deixar todas as letras maiúsculas
        String s03 = original.trim(); // vai eliminar os espaços em branco do começo e do final da string
        String s04 = original.substring(2, 5); // vai pegar a partir do índice 2 até o índice 5 (não inclui o índice 5)
        String s05 = original.replace("a", "x"); // vai substituir todas as ocorrências de "a" por "x"
        int i = original.indexOf("bc"); // vai retornar o índice da primeira ocorrência de "bc"
        int j = original.lastIndexOf("bc"); // vai retornar o índice da última ocorrência
        
        
        
        System.out.println(original);
        System.out.println(s01);
        System.out.println(s02);
        System.out.println(s03);
        System.out.println(s04);
        System.out.println(s05);
        System.out.println(i);
        System.out.println(j);


    }

}
