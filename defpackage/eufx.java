package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eufx {
    public final String a;

    public eufx(int i, String str) {
        this.a = String.format(Locale.US, "%s_v%d", str, Integer.valueOf(i));
    }
}
