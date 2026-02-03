package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcar {
    public String a = "unknown-authority";
    public fbmw b = fbmw.a;
    public String c;
    public fbpd d;

    public final boolean equals(Object obj) {
        if (!(obj instanceof fcar)) {
            return false;
        }
        fcar fcarVar = (fcar) obj;
        return this.a.equals(fcarVar.a) && this.b.equals(fcarVar.b) && ejwh.a(this.c, fcarVar.c) && ejwh.a(this.d, fcarVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }
}
