package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddux implements dcfa {
    public final int a;
    private final String b = null;

    public ddux(dduw dduwVar) {
        this.a = dduwVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ddux)) {
            return false;
        }
        ddux dduxVar = (ddux) obj;
        if (this.a == dduxVar.a) {
            String str = dduxVar.b;
            if (dclc.a(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), null});
    }
}
