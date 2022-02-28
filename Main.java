import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;

public class Main {

     public static void main(String[] args) {

         MathContext arredondar = new MathContext(5);

         BigDecimal[] notas = new BigDecimal[5];
         notas[0] = new BigDecimal(8.35);
         notas[1] = new BigDecimal(8.77);
         notas[2] = new BigDecimal(4.95);
         notas[3] = new BigDecimal(7.72);
         notas[4] = new BigDecimal(5.80);

         BigDecimal total = notas[0].add(notas[1]).add(notas[2]).add(notas[3]).add(notas[4]);
         BigDecimal media = total.divide(BigDecimal.valueOf(notas.length));
         System.out.println(media.round(arredondar));

//         double[] notas = {8.35, 8.77, 4.95, 7.72, 5.80};
//         double total = 0;
//
//         for(double i : notas) {
//             total += i;
//         }
//
//         double media = total / notas.length;
//         System.out.println(media); // 7.117999999999999
    }
}