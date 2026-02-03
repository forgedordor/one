package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgyz {
    private static Map a;

    static {
        try {
            String property = System.getProperty("dnsjava.options");
            if (property != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(property, ",");
                while (stringTokenizer.hasMoreTokens()) {
                    String strNextToken = stringTokenizer.nextToken();
                    int iIndexOf = strNextToken.indexOf(61);
                    if (iIndexOf == -1) {
                        if (a == null) {
                            a = new HashMap();
                        }
                        a.put(strNextToken.toLowerCase(), "true");
                    } else {
                        String strSubstring = strNextToken.substring(0, iIndexOf);
                        String strSubstring2 = strNextToken.substring(iIndexOf + 1);
                        if (a == null) {
                            a = new HashMap();
                        }
                        a.put(strSubstring.toLowerCase(), strSubstring2.toLowerCase());
                    }
                }
            }
        } catch (SecurityException unused) {
        }
    }

    public static boolean a(String str) {
        Map map = a;
        return (map == null || map.get(str.toLowerCase()) == null) ? false : true;
    }
}
