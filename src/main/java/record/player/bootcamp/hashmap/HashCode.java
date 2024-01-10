package record.player.bootcamp.hashmap;

import jdk.jfr.Percentage;
import lombok.Builder;

import java.util.HashMap;
import java.util.Map;

public class HashCode {
    public static void main(String[] args) {
        final int capacity = 1000;
        Map<Key,Object> map = new HashMap<>(capacity);

        for(int i=0; i<capacity;i++){
            map.put(new Key(i), new Object());
        }


        for(int i=0; i<capacity;i++){
            map.get(new Key(i));
        }
    }

static class Key {
    private Integer value;
    Key(int value){
        this.value = value;
    }

    void setValue(int value){
        this.value = value;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return value.equals(key.value);
    }

    @Override
    public int hashCode() {
        return 31;
        //     return value != null ? value.hashCode() : 0;
    }
}
}