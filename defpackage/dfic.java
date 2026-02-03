package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfic {
    public static final dfic a = new dfic(0, -1, 0, false, 0);
    public final int b;
    public final long c;
    public final boolean d;
    public final int e;
    private final int f;

    public dfic(int i, long j, int i2, boolean z, int i3) {
        this.b = i;
        this.c = j;
        this.f = i2;
        this.d = z;
        this.e = i3;
    }

    public final boolean a(dfib dfibVar) {
        return dfibVar.b(this.f);
    }

    public final String toString() {
        String string;
        int i = this.b;
        String str = i != 1 ? i != 2 ? "STATE_UNKNOWN" : "STATE_IMS_CONTACT" : "STATE_NON_IMS_CONTACT";
        Locale locale = Locale.US;
        Long lValueOf = Long.valueOf(this.c);
        int i2 = this.f;
        dfib dfibVar = dfib.HTTP_FT;
        if (i2 == 0) {
            string = "[ ]";
        } else {
            StringBuilder sb = new StringBuilder("[ ");
            for (dfib dfibVar2 : dfib.values()) {
                if (dfibVar2.b(i2)) {
                    sb.append(dfibVar2.toString());
                    sb.append(' ');
                }
            }
            sb.append(']');
            string = sb.toString();
        }
        return String.format(locale, "Status: %s, last activity: %d, capabilities: %s", str, lValueOf, string);
    }
}
