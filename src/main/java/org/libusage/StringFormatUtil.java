package org.libusage;

import org.aucklanduni.util.StringUtils;

public class StringFormatUtil {
    public static void main(String[] args) {
        System.out.println("This is a test class for the lib usage");
        StringFormatUtil stringFormatUtil = new StringFormatUtil();
        stringFormatUtil.formatString(".");
    }


    public String formatString(String str1) {
        if(!StringUtils.isEmpty(str1)) {
            return StringUtils.trim(str1);
        } else {
            return str1;
        }
       // System.out.println(StringUtils.trim("this is a test"));
    }
}
