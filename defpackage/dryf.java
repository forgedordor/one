package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import java.util.Map;
import java.util.regex.PatternSyntaxException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dryf {
    public static final Map b;
    public static final String c;
    public static final eksp a = drua.a;
    private static final ejxk d = ejxk.b(':');

    static {
        csq csqVar = new csq();
        b = csqVar;
        csqVar.put("HARDWARE", Build.HARDWARE);
        csqVar.put("MODEL", Build.MODEL);
        csqVar.put("BRAND", Build.BRAND);
        csqVar.put("MANUFACTURER", Build.MANUFACTURER);
        StringBuilder sb = new StringBuilder();
        for (String str : csqVar.keySet()) {
            if (sb.length() == 0) {
                sb.append("[");
            } else {
                sb.append(" ");
            }
            sb.append(str);
            sb.append(" = ");
            sb.append((String) b.get(str));
        }
        sb.append("]");
        c = sb.toString();
    }

    public static String a(Context context, int i) {
        if (drxq.a) {
            return "#0x".concat(String.valueOf(Integer.toHexString(i)));
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Resources.NotFoundException unused) {
            return "#0x".concat(String.valueOf(Integer.toHexString(i)));
        }
    }

    public static boolean b(Map map, String str) throws drye {
        boolean z = true;
        for (String str2 : d.g(str)) {
            int iIndexOf = str2.indexOf(61);
            if (iIndexOf < 0) {
                throw new drye("Pattern has no '='", str);
            }
            String str3 = (String) map.get(str2.substring(0, iIndexOf));
            if (str3 == null) {
                throw new drye("Unknown key", str);
            }
            try {
                if (!str3.matches(str2.substring(iIndexOf + 1))) {
                    if (!drxl.a) {
                        return false;
                    }
                    z = false;
                }
            } catch (PatternSyntaxException e) {
                throw new drye("Syntax error", str, e);
            }
        }
        return z;
    }
}
