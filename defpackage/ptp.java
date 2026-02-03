package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ptp {
    public final pta a;

    public ptp() {
        this(pta.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ptp) {
            return fdbq.f(this.a, ((ptp) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ptp: {bounds=" + this.a + '}';
    }

    public ptp(pta ptaVar) {
        ptaVar.getClass();
        this.a = ptaVar;
    }
}
