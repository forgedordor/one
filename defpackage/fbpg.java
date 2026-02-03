package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbpg {
    public final String a;
    public final fbpf b;
    public final long c;
    public final fbpt d;
    public final fbpt e;

    public fbpg(String str, fbpf fbpfVar, long j, fbpt fbptVar) {
        this.a = str;
        fbpfVar.getClass();
        this.b = fbpfVar;
        this.c = j;
        this.d = null;
        this.e = fbptVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fbpg) {
            fbpg fbpgVar = (fbpg) obj;
            if (ejwh.a(this.a, fbpgVar.a) && ejwh.a(this.b, fbpgVar.b) && this.c == fbpgVar.c) {
                fbpt fbptVar = fbpgVar.d;
                if (ejwh.a(null, null) && ejwh.a(this.e, fbpgVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), null, this.e});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("description", this.a);
        ejwfVarB.b("severity", this.b);
        ejwfVarB.g("timestampNanos", this.c);
        ejwfVarB.b("channelRef", null);
        ejwfVarB.b("subchannelRef", this.e);
        return ejwfVarB.toString();
    }
}
