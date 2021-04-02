package org.example;

import java.util.HashMap;
import java.util.Map;

public class DiBean {

    private String name;

    public DiBean(String name) {
        this.name = name;
    }

    public void doMyInit() {
        System.out.println("Инит метод для бина DiBean");
    }

    public void doDestroyMethod() {
        System.out.println("Дестрой метод для бина");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getFavoriteDiSong() {
        System.out.println("Gojira - Gift the guilt");
    }



    public void collection() {
        Map<String, String> coll = new HashMap<>();
        coll.put("день1", "Понедельник");
        coll.put("день2", "Вторник");
        coll.put("день3", "Среда");

        for (String value: coll.values()){
            System.out.println(value);

        }
    }
}
