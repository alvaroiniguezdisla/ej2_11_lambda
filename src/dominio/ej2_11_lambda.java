package dominio;
import java.util.stream.Stream;

public class ej2_11_lambda {
    public static int productoescalar(int[]lista1,int[]lista2){
        return Stream.iterate(0,i->i+1).limit(lista1.length).map(i->lista1[i]*lista2[i]).reduce(0,(a,b)->a+b);
    }
}
