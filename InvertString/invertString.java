    public class invertString {
        public static void main(String[] args) {
            String nome = "teste";
            String invertido = "";
            
            
            for (int i = nome.length() - 1 ; i>=0; i--) {
            invertido = invertido + nome.charAt(i);

            }
                    System.out.print("Sua string invertida e " + invertido);
  
        }
    
    }
    