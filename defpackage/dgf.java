package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgf implements dew {
    private final int a;
    private final der b;
    private final long c;
    private final int d = 1;

    public dgf(int i, der derVar, long j) {
        this.a = i;
        this.b = derVar;
        this.c = j;
    }

    @Override // defpackage.ddz
    public final /* bridge */ /* synthetic */ diw a(dib dibVar) {
        return new dji(this.a, this.b.a(dibVar), this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dgf)) {
            return false;
        }
        dgf dgfVar = (dgf) obj;
        if (dgfVar.a != this.a || !fdbq.f(dgfVar.b, this.b)) {
            return false;
        }
        int i = dgfVar.d;
        return dgm.a(dgfVar.c, this.c);
    }

    public final int hashCode() {
        int iHashCode = (this.a * 31) + this.b.hashCode();
        dge.a(1);
        return (((iHashCode * 31) + 1) * 31) + dgl.a(this.c);
    }
}
