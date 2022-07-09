package core.immutable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class Person {

    private final int id;
    private final String name;
    private final HashMap<Integer, String> someCollection;
    private final Address address;

    public Person(int id, String name, Map<Integer, String> someCollection, Address address) {
        this.id = id;
        this.name = name;

        HashMap<Integer, String> tempMap = new HashMap<>();
        Iterator<Integer> keys = someCollection.keySet().iterator();
        while (keys.hasNext()) {
            tempMap.put(keys.next(), someCollection.get(keys.next()));
        }
        this.someCollection = tempMap;

        Address addressClone = new Address(address.getHouseNumber(), address.getStreetAddress());
        this.address = addressClone;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public HashMap<Integer, String> getSomeCollection(){
        return (HashMap<Integer, String>) someCollection.clone();
    }

    public Address getAddress() {
        Address addressClone = new Address(this.address.getHouseNumber(), this.address.getStreetAddress());
        return addressClone;
    }

}