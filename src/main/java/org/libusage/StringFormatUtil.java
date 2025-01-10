package org.libusage;

import org.apache.commons.lang3.StringUtils;

public class StringFormatUtil {
    public static void main(String[] args) {
        System.out.println("This is a test class for the lib usage");
        StringFormatUtil stringFormatUtil = new StringFormatUtil();
        stringFormatUtil.formatString();
    }


    public void formatString() {
        System.out.println(StringUtils.capitalize("this is a test"));
    }
}
