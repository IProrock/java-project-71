package hexlet.code;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

import java.util.Map;

public class Parser {
    public static Map<String, Object> parseToMap(String dataToParse, String dataType) throws Exception {

        Map<String, Object> parsedMap;
        ObjectMapper mapper = new ObjectMapper();

        if (dataType.equals("yml")) {
            mapper = new YAMLMapper();
        }

        parsedMap = mapper.readValue(dataToParse, new TypeReference<Map<String, Object>>() { });

        return parsedMap;
    }
}
