package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rkc implements rfg {
    private final byte[] a;
    private final rkb b;

    public rkc(byte[] bArr, rkb rkbVar) {
        this.a = bArr;
        this.b = rkbVar;
    }

    @Override // defpackage.rfg
    public final Class a() {
        return this.b.a();
    }

    @Override // defpackage.rfg
    public final reb eX() {
        return reb.LOCAL;
    }

    @Override // defpackage.rfg
    public final void g(rbh rbhVar, rff rffVar) {
        rffVar.c(this.b.b(this.a));
    }

    @Override // defpackage.rfg
    public final void d() {
    }

    @Override // defpackage.rfg
    public final void e() {
    }
}
