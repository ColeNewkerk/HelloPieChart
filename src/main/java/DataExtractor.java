import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.javatuples.Pair;

import java.util.ArrayList;
import java.util.List;

public class DataExtractor {

    public static List<Pair<String, Integer>> extractDataFromJSON(String rawJson) {
        // TODO
        int SomeInt = 0;
        String string = "";
        JsonParser jsonParser = new JsonParser();
        JsonElement rootElement = jsonParser.parse(rawJson);
        JsonObject rootObject = rootElement.getAsJsonObject();
        Pair.with(string,SomeInt);
        return null;
    }

}
