package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdgc {
    public final String a;
    private final fddq b;

    public fdgc(String str, fddq fddqVar) {
        fddqVar.getClass();
        this.a = str;
        this.b = fddqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdgc)) {
            return false;
        }
        fdgc fdgcVar = (fdgc) obj;
        return fdbq.f(this.a, fdgcVar.a) && fdbq.f(this.b, fdgcVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ")";
    }
}
