package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbpp {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final eldz b = fbrg.d;

    public static fbrb a(String str, fbpo fbpoVar) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        int i = fbrb.d;
        return new fbre(str, z, fbpoVar);
    }
}
