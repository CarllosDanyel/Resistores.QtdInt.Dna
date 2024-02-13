public class ATV5 {
    public static void main(String[] args){
    String Dna1 ="NXNASKASKKSAKASKDA";
        String Dna2 = "KADHADAHDASDHASHAD";
        System.out.println("A distância de Hamming é: " + CalcularDistancia(Dna1, Dna2));
    }

    public static int CalcularDistancia(String Letra1, String Letra2) {
        if (Letra1.length() != Letra2.length()) {
            throw new IllegalArgumentException("As cadeias de Dna devem ter o mesmo comprimento");
        }
        int Distancia = 0;
        for (int i = 0; i < Letra1.length(); i++) {
            if (Letra1.charAt(i) != Letra2.charAt(i)) {
                Distancia++;
            }
        }
        return Distancia;
}
}
