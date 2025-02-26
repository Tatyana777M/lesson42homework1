import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        class MapUtils {
            public static void mergeKeys(Map<String, Integer> map, String key1, String key2) {
                if (map.containsKey(key1) && map.containsKey(key2)) {
                    String newKey = key1 + "_" + key2;
                    int sum = map.get(key1) + map.get(key2);
                    map.put(newKey, sum);
                }
            }
        }

        @Nested
        class MapUtilsTest {

            @Test
            void testMergeKeys_Success() {
                Map<String, Integer> map = new HashMap<>();
                map.put("jack", 10);
                map.put("john", 5);

                MapUtils.mergeKeys(map, "jack", "john");

            }
            @Test
            void testMergeKeys_OneKeyMissing() {
                Map<String, Integer> map = new HashMap<>();
                map.put("jack", 10);

                MapUtils.mergeKeys(map, "jack", "john");


            }

            @Test
            void testMergeKeys_BothKeysMissing() {
                Map<String, Integer> map = new HashMap<>();

                MapUtils.mergeKeys(map, "jack", "john");

            }
            @Test
            void testMergeKeys_AlreadyHasMergedKey() {
                Map<String, Integer> map = new HashMap<>();
                map.put("jack", 10);
                map.put("john", 5);
                map.put("jack_john", 99); // Уже есть ключ "jack_john"

                MapUtils.mergeKeys(map, "jack", "john");

            }
        }
    }
}