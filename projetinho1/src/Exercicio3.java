public class Exercicio3 {

    //Repetição

    public static void main(String[] args) {
        String[] palavras = {"abc", "def", "ghi"};
        char letraProibida = 'a';
        boolean achou = false;
        for (String palavra : palavras) {
            for (int i = 0; i < palavra.length(); i++) {
                achou = palavra.charAt(i) == letraProibida;
                if (achou) {
                    break;
                }
            }

        }
        if (achou) {
            System.out.println("Encontrou a letra proibida");
        } else {
            System.out.println("Não encontrou a letra proibida");
        }
    }
        /*System.out.println(forbiddenLetter(new String[]{"abc", "def", "ghi"},'a'));
    }

    public static boolean forbiddenLetter (String[] palavras, char letraProibida){
        boolean achou=false;
        for(String palavra:palavras){
        for(int i=0;i<=palavra.length();i++){
        achou=palavra.charAt(i)==letraProibida;
        if(achou){
        break;
        }
        }
        if(achou){
        break;
        }
        }

        return achou;
        }*/
}



