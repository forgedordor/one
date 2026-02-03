package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcmf {
    final fbqj a;
    final Object b;

    public fcmf(fbqj fbqjVar, Object obj) {
        this.a = fbqjVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fcmf fcmfVar = (fcmf) obj;
            if (ejwh.a(this.a, fcmfVar.a) && ejwh.a(this.b, fcmfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("provider", this.a);
        ejwfVarB.b("config", this.b);
        return ejwfVarB.toString();
    }
}
