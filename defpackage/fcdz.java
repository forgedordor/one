package defpackage;

import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcdz {
    final int a;
    final long b;
    final Set c;

    public fcdz(int i, long j, Set set) {
        this.a = i;
        this.b = j;
        this.c = ekhx.o(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fcdz fcdzVar = (fcdz) obj;
            if (this.a == fcdzVar.a && this.b == fcdzVar.b && ejwh.a(this.c, fcdzVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.f("maxAttempts", this.a);
        ejwfVarB.g("hedgingDelayNanos", this.b);
        ejwfVarB.b("nonFatalStatusCodes", this.c);
        return ejwfVarB.toString();
    }
}
