import com.fasterxml.jackson.databind.ObjectMapper;
import model.Item;
import model.Order;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    //private static String pathname = "C:\\Users\\A666224\\Desktop\\JAVA\\";

    public static void main(String[] args) throws IOException {
        Item item1 = new Item("mleko","2","tesco");
        Item item2 = new Item("masło","5","tesco");
        Item item3 = new Item("chleb","2","tesco");

        List<Item> itemList = Arrays.asList(item1,item2,item3);
        Order order = new Order(itemList,1);

        ObjectMapper mapper = new ObjectMapper();

        File filename = new File("order.json");

        filename.createNewFile();
        //Object to JSON in file
        mapper.writeValue(filename, order);

        //Object to JSON in String
        //String jsonInString = mapper.writeValueAsString(z.pozycje);

        Order readorders =
                mapper.readValue(new File("order.json"),
                        Order.class);
        for(Item item: readorders.getItemList()){
            System.out.println(item.getName()+"\t"+item.getPrice());
        }
    }
}
