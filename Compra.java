import java.util.ArrayList;

public class Compra {
    String idCompra;
    int data;
    float valor;
    public static ArrayList <Compra> listaCompras  = new ArrayList<Compra>();

public Compra(String idCompra, int data, float valor) {
    super();
    this.idCompra = idCompra;
    this.data = data;
    this.valor = valor;
    Compra.listaCompras.add(this); 
}

@Override
public String toString() {
    return "Compra [data=" + data + ", idCompra=" + idCompra + ", valor=" + valor + "]";
}

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + data;
    result = prime * result + ((idCompra == null) ? 0 : idCompra.hashCode());
    result = prime * result + Float.floatToIntBits(valor);
    return result;
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Compra other = (Compra) obj;
    if (data != other.data)
        return false;
    if (idCompra == null) {
        if (other.idCompra != null)
            return false;
    } else if (!idCompra.equals(other.idCompra))
        return false;
    if (Float.floatToIntBits(valor) != Float.floatToIntBits(other.valor))
        return false;
    return true;
}


}