import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

    @Nested
    public class MapUtilsTest {

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
        public void testMergeKeys_AlreadyHasMergedKey() {
            Map<String, Integer> map = new HashMap<>();
            map.put("jack", 10);
            map.put("john", 5);
            map.put("jack_john", 99);

            MapUtils.mergeKeys(map, "jack", "john");

        }
    }

