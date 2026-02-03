package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqww {
    public static final String[] a = new String[0];
    public static final ekgp b;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("NULL", "@null");
        ekgiVar.i("true", "true");
        ekgiVar.i("TRUE", "true");
        ekgiVar.i("false", "false");
        ekgiVar.i("FALSE", "false");
        b = ekgiVar.c();
    }

    public static void a(List list, StringBuilder sb) {
        if (sb.length() > 0) {
            list.add(sb.toString());
        } else {
            list.add("");
        }
    }
}
