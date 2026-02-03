package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhvp {
    public final String a;
    public final dhun b;
    private final Map c;

    /* JADX WARN: Multi-variable type inference failed */
    public dhvp() {
        this((String) null, (dhun) (0 == true ? 1 : 0), 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhvp)) {
            return false;
        }
        dhvp dhvpVar = (dhvp) obj;
        return fdbq.f(this.a, dhvpVar.a) && this.b == dhvpVar.b && fdbq.f(this.c, dhvpVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Verdict(pv=" + this.a + ", action=" + this.b + ")";
    }

    public dhvp(String str, dhun dhunVar, Map map) {
        str.getClass();
        dhunVar.getClass();
        this.a = str;
        this.b = dhunVar;
        this.c = map;
    }

    public /* synthetic */ dhvp(String str, dhun dhunVar, int i) {
        this(1 == (i & 1) ? "UNKNOWN" : str, (i & 2) != 0 ? dhun.d : dhunVar, fcvp.a);
    }
}
