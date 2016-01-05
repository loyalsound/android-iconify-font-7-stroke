package com.ls.iconify.sample;

import com.joanzapata.iconify.IconFontDescriptor;
import com.ls.iconify.fonts.Font7StrokeModule;

public enum Font implements FontIconsViewPagerAdapter.FontWithTitle {

    FONT7STROKE("Font7Stroke", new Font7StrokeModule());

    private final String title;
    private final IconFontDescriptor descriptor;

    @Override
    public String getTitle() {
        return title;
    }

    public IconFontDescriptor getFont() {
        return descriptor;
    }

    Font(String title, IconFontDescriptor descriptor) {
        this.title = title;
        this.descriptor = descriptor;
    }
}