package defpackage;

import java.security.AccessControlException;
import java.security.AccessController;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffws {
    private static final ThreadLocal a = new ThreadLocal();

    public static int a(String str, int i) {
        String strB = b(str);
        return strB != null ? Integer.parseInt(strB) : i;
    }

    public static String b(String str) {
        String str2;
        String str3 = (String) AccessController.doPrivileged(new ffwq(str));
        if (str3 != null) {
            return str3;
        }
        Map map = (Map) a.get();
        return (map == null || (str2 = (String) map.get(str)) == null) ? (String) AccessController.doPrivileged(new ffwr(str)) : str2;
    }

    public static boolean c(String str) {
        try {
            String strB = b(str);
            if (strB == null || strB.length() != 4) {
                return false;
            }
            if (strB.charAt(0) != 't' && strB.charAt(0) != 'T') {
                return false;
            }
            if (strB.charAt(1) != 'r' && strB.charAt(1) != 'R') {
                return false;
            }
            if (strB.charAt(2) != 'u' && strB.charAt(2) != 'U') {
                return false;
            }
            if (strB.charAt(3) != 'e') {
                if (strB.charAt(3) != 'E') {
                    return false;
                }
            }
            return true;
        } catch (AccessControlException unused) {
        }
        return false;
    }
}
