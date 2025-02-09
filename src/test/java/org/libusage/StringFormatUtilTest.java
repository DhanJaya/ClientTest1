package org.libusage;

import org.junit.Assert;
import org.junit.Test;

public class StringFormatUtilTest {

    @Test
    public void testStringFormat() {
        StringFormatUtil stringFormatUtil = new StringFormatUtil();
        Assert.assertEquals("", stringFormatUtil.formatString(" "));
        Assert.assertEquals("Test String", stringFormatUtil.formatString(" Test String  "));
    }
}
