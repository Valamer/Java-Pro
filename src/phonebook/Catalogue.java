package phonebook;

import java.util.ArrayList;

public class Catalogue {
    private ArrayList<Record> records = new ArrayList<>();

    public void add(Record r) {
        records.add(r);
    }

    public Record find(String name) {
        for (Record instance : records) {
            if(instance.getName().equals(name)) return instance;
        }
        return null;
    }

    public ArrayList<Record> findAll(String name) {
        ArrayList<Record> result = new ArrayList<>();
        for (Record instance : records) {
            if(instance.getName().equals(name)) result.add(instance);
        }
        if (result.isEmpty()) return null;
        else return result;
    }

}
