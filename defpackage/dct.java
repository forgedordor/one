package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dct {
    public final ddp a;
    public long b;

    public dct(ddp ddpVar, long j) {
        this.a = ddpVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dct)) {
            return false;
        }
        dct dctVar = (dct) obj;
        return fdbq.f(this.a, dctVar.a) && kjg.e(this.b, dctVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + kjf.a(this.b);
    }

    public final String toString() {
        return "AnimData(anim=" + this.a + ", startSize=" + ((Object) kjg.c(this.b)) + ')';
    }
}
