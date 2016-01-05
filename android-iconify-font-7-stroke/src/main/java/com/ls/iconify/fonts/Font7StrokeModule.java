package com.ls.iconify.fonts;

import com.joanzapata.iconify.Icon;
import com.joanzapata.iconify.IconFontDescriptor;

public class Font7StrokeModule implements IconFontDescriptor {

    @Override
    public String ttfFileName() {
        return "iconify/android-iconify-font-7-stroke.ttf";
    }

    @Override
    public Icon[] characters() {
        return Font7StrokeIcons.values();
    }
}
