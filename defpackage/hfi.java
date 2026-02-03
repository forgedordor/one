package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfi implements hjk {
    private final ibx a;
    private final ibx b;
    private final int c;

    public hfi(ibx ibxVar, ibx ibxVar2, int i) {
        this.a = ibxVar;
        this.b = ibxVar2;
        this.c = i;
    }

    @Override // defpackage.hjk
    public final int a(kjd kjdVar, long j, int i, kji kjiVar) {
        int iA = this.b.a(0, kjdVar.b(), kjiVar);
        return kjdVar.b + iA + (-this.a.a(0, i, kjiVar)) + (kjiVar == kji.a ? this.c : -this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfi)) {
            return false;
        }
        hfi hfiVar = (hfi) obj;
        return fdbq.f(this.a, hfiVar.a) && fdbq.f(this.b, hfiVar.b) && this.c == hfiVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public final String toString() {
        return "Horizontal(menuAlignment=" + this.a + ", anchorAlignment=" + this.b + ", offset=" + this.c + ')';
    }
}
