package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlc implements hjk {
    private final ibx a;
    private final int b = 0;

    public hlc(ibx ibxVar) {
        this.a = ibxVar;
    }

    @Override // defpackage.hjk
    public final int a(kjd kjdVar, long j, int i, kji kjiVar) {
        int i2 = (int) (j >> 32);
        if (i >= i2) {
            return ibw.k.a(i, i2, kjiVar);
        }
        int i3 = i2 - i;
        return fddu.i(Math.round((i3 / 2.0f) * (((ibz) this.a).a + 1.0f)), 0, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlc)) {
            return false;
        }
        hlc hlcVar = (hlc) obj;
        if (!fdbq.f(this.a, hlcVar.a)) {
            return false;
        }
        int i = hlcVar.b;
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.a + ", margin=0)";
    }
}
