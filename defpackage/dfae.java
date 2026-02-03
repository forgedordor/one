package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dfae {
    FULL("full"),
    PARTIAL("partial"),
    DELETED("deleted"),
    NONE("none");

    public final String e;

    dfae(String str) {
        this.e = str;
    }

    public static dfae a(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        for (dfae dfaeVar : values()) {
            if (dfaeVar.e.equals(lowerCase)) {
                return dfaeVar;
            }
        }
        return NONE;
    }
}
