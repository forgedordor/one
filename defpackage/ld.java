package defpackage;

import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ld {
    public static final ekfk a;

    static {
        ekfi ekfiVar = new ekfi();
        ekfiVar.d(0, "*");
        ekfiVar.d(3, "us-ascii");
        ekfiVar.d(4, "iso-8859-1");
        ekfiVar.d(5, "iso-8859-2");
        ekfiVar.d(6, "iso-8859-3");
        ekfiVar.d(7, "iso-8859-4");
        ekfiVar.d(8, "iso-8859-5");
        ekfiVar.d(9, "iso-8859-6");
        ekfiVar.d(10, "iso-8859-7");
        ekfiVar.d(11, "iso-8859-8");
        ekfiVar.d(12, "iso-8859-9");
        ekfiVar.d(17, "shift_JIS");
        ekfiVar.d(18, "euc-jp");
        ekfiVar.d(38, "euc-kr");
        ekfiVar.d(39, "iso-2022-jp");
        ekfiVar.d(40, "iso-2022-jp-2");
        ekfiVar.d(106, "utf-8");
        ekfiVar.d(113, "gbk");
        ekfiVar.d(114, "gb18030");
        ekfiVar.d(2025, "gb2312");
        ekfiVar.d(2026, "big5");
        ekfiVar.d(1000, "iso-10646-ucs-2");
        ekfiVar.d(1015, "utf-16");
        ekfiVar.d(2085, "hz-gb-2312");
        a = ekfiVar.c();
    }

    public static String a(int i) throws UnsupportedEncodingException {
        String str = (String) a.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        throw new UnsupportedEncodingException();
    }
}
