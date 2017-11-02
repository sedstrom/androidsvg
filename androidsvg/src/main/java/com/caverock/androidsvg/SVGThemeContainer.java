package com.caverock.androidsvg;

class SVGThemeContainer {

    private final SVGTheme theme;

    private String id;

    SVGThemeContainer(SVGTheme theme) {
        this.theme = theme;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean hasColor() {
        return theme.hasColorForId(id);
    }

    public Integer getColor(){
        return theme.getColorForId(id);
    }

}
