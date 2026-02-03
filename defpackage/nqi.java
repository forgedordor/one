package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqi implements nnu {
    public final long a;
    private final nnu b;

    public nqi(long j, nnu nnuVar) {
        this.a = j;
        this.b = nnuVar;
    }

    @Override // defpackage.nnu
    public final nox p(int i, int i2) {
        return this.b.p(i, i2);
    }

    @Override // defpackage.nnu
    public final void r() {
        this.b.r();
    }

    @Override // defpackage.nnu
    public final void w(noq noqVar) {
        this.b.w(new nqh(this, noqVar, noqVar));
    }
}
