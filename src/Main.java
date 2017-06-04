import java.util.BitSet;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;

/**
 * Created by Şeyma Yılmaz on 4.6.2017.
 */
public class Main {

    public static void main(String[] args) {

        /* */
        BitSet bitSet = new BitSet(5);
        bitSet.set(0);
        bitSet.clear(0);
        int kacTaneBir = bitSet.cardinality();

        /* */
        Vector vector = new Vector();
        vector.add("Şeyma");
        vector.capacity();
        vector.size();
        vector.remove("Şeyma");

        /* stack */
        Stack stack = new Stack();
        stack.push("Şeyma");
        stack.push("Burak");

        String name = (String) stack.pop();
        stack.peek();

        /* properties */
        Properties properties = new Properties();
        properties.setProperty("1", "Burak Köken");

    }

}
