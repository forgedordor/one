package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqdo implements dqdp {
    public final dojp a;

    public dqdo(dojp dojpVar) {
        this.a = dojpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqdo) && fdbq.f(this.a, ((dqdo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Stopped(audioFile=" + this.a + ")";
    }
}
