import java.util.*;

public class ATV1 {
    private static final Map<String, Integer> colorMap = new HashMap<>();
    static {
        colorMap.put("preto", 0);
        colorMap.put("marrom", 1);
        colorMap.put("vermelho", 2);
        colorMap.put("laranja", 3);
        colorMap.put("amarelo", 4);
        colorMap.put("verde", 5);
        colorMap.put("azul", 6);
        colorMap.put("violeta", 7);
        colorMap.put("cinza", 8);
        colorMap.put("branco", 9);
    }

    public static int colorCode(String color1, String color2) {
        return colorMap.get(color1) * 10 + colorMap.get(color2);
    }

    public static void main(String[] args) {
        System.out.println(colorCode("amarelo", "branco")); 
    }
}


        
