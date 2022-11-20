package Exercise_17_Review;

import java.util.HashMap;
import java.util.Map;

public class ClothingFlyweight {

    Map<String, Clothing> clothingMap = new HashMap<>();

    public Clothing clothesFactory(String size, String type, Boolean isNew, Boolean isImported) {

        String KeyCode = "Key: " + size + ":" + type + ":" + isNew + ":" + isImported;
        Clothing clothing = new Clothing(size, type, isNew,isImported);

        if (!clothingMap.containsKey(KeyCode)){
            clothingMap.put(KeyCode, clothing);
            System.out.println("----> 🟢 " + clothing.getType() + " Manufactured");
            return clothingMap.get(KeyCode);

        }else {
            System.out.println("------> ⁜ " + clothing.getType() + " Obtained");
            return clothingMap.get(KeyCode);
        }

    }
}
