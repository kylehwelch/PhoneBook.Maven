package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public PhoneBook() {
        this.phonebook = new LinkedHashMap<>();
    }

    public void add(String name, String phoneNumber) {
        if (!phonebook.containsKey(name)) {
            List<String> freddy = new ArrayList<>();
            freddy.add(phoneNumber);
            phonebook.put(name, freddy);
        }else {
            List<String> gibi;
            gibi = phonebook.get(name);
            gibi.add(phoneNumber);
            phonebook.put(name, gibi);
        }
    }

    public void addAll(String name, String... phoneNumbers) {

        for (int i = 0 ; i < phoneNumbers.length ; i++) {
            add(name, phoneNumbers[i]);
        }
    }

    public void remove(String name) {
        phonebook.remove(name);
    }

    public Boolean hasEntry(String name, String phoneNumber) {
        List<String> marty;
        if (!phonebook.containsKey(name)) return false;
        else if (phonebook.containsKey(name)) {
            marty = phonebook.get(name);
            if (marty.contains(phoneNumber)) return true;
            else return false;
        }
        return false;
    }

    public List<String> lookup(String name) {
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        for (String key : phonebook.keySet()) {
            List<String> harold = phonebook.get(key);
            if (harold.contains(phoneNumber));
            return key;
        }
        return null;
    }

    public List<String> getAllContactNames() {
        List<String> gurty = new ArrayList<>(phonebook.keySet());
//        Collections.sort(gurty);
//        Collections.reverse(gurty);
        return gurty;
    }

    public Map<String, List<String>> getMap() {
        return phonebook;
    }
}
