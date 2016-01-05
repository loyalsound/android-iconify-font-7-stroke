package com.ls.iconify.fonts;

import com.joanzapata.iconify.Icon;

public enum Font7StrokeIcons implements Icon {
    pe_7s_user('\ue605')
    ;

    char character;

    Font7StrokeIcons(char character) {
        this.character = character;
    }

    @Override
    public String key() {
        return name().replace('_', '-');
    }

    @Override
    public char character() {
        return character;
    }
}
