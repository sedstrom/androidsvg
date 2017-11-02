package com.caverock.androidsvg;


import java.util.HashMap;

public class SVGTheme {

    private final HashMap<String, Integer> colors;

    public SVGTheme(HashMap<String, Integer> colors) {
        this.colors = colors;
    }

    public Integer getColorForId(String id) {
        return colors.get(id);
    }

    public boolean hasColorForId(String id) {
        return colors.containsKey(id);
    }
}
