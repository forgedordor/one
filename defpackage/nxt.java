package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nxt {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static float a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long b(String str) {
        String[] strArrAi = mgb.ai(str, "\\.");
        long j = 0;
        for (String str2 : mgb.ah(strArrAi[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrAi.length == 2) {
            String strTrim = strArrAi[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(String.valueOf(strTrim)));
            }
            j2 += Long.parseLong(strTrim);
        }
        return j2 * 1000;
    }
}
