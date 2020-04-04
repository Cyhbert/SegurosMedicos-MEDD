package Entidades.Ordenamiento;

import java.util.Comparator;

public class OrdenarPagosAsc implements Comparator<Double> {
    @Override
    public int compare(Double a, Double b){
        return Double.compare(a, b);
    }
    
}
