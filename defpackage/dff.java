package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dff implements ddz {
    private final der a;
    private final long b;
    private final int c;

    public dff(der derVar, int i, long j) {
        this.a = derVar;
        this.c = i;
        this.b = j;
    }

    @Override // defpackage.ddz
    public final diw a(dib dibVar) {
        return new djf(this.a.b(dibVar), this.c, this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dff)) {
            return false;
        }
        dff dffVar = (dff) obj;
        return fdbq.f(dffVar.a, this.a) && dffVar.c == this.c && dgm.a(dffVar.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = this.c;
        dge.a(i);
        return ((iHashCode + i) * 31) + dgl.a(this.b);
    }
}
