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

    public static SVGTheme fromIntArray(int[] colors) {
        HashMap<String, Integer> colorsMap = new HashMap<>();
        for(int i = 0; i < colors.length; i++) {
            colorsMap.put(String.valueOf(i), colors[i]);
        }
        return new SVGTheme(colorsMap);
    }
}
