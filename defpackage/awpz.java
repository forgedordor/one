package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awpz {
    public final awmp a;
    public final awmp b;

    public awpz(awmp awmpVar, awmp awmpVar2) {
        awmpVar2.getClass();
        this.a = awmpVar;
        this.b = awmpVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awpz)) {
            return false;
        }
        awpz awpzVar = (awpz) obj;
        return fdbq.f(this.a, awpzVar.a) && fdbq.f(this.b, awpzVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "GroupUpdateResult(before=" + this.a + ", after=" + this.b + ")";
    }
}
