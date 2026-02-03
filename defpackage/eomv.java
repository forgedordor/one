package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eomv extends eomw {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile("[+-]?(?:NaN|Infinity|(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?|0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?)".replace("#", "+"));
    }

    public static double a(double... dArr) {
        ejwl.a(true);
        double dMax = dArr[0];
        for (int i = 1; i < 3; i++) {
            dMax = Math.max(dMax, dArr[i]);
        }
        return dMax;
    }
}
