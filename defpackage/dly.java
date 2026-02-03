package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dly extends icr implements jbp {
    public boolean a;
    public boolean b;
    public boolean c;
    public final ebk d;

    public dly(ebk ebkVar) {
        this.d = ebkVar;
    }

    @Override // defpackage.icr
    public final void dU() {
        fdil.d(E(), null, null, new dlx(this, null), 3);
    }

    @Override // defpackage.jbp
    public final void r(imw imwVar) {
        imwVar.p();
        if (this.a) {
            long j = ije.a;
            imwVar.r(ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.3f, ije.f(j)), 0L, (126 & 4) != 0 ? imy.c(imwVar.b(), 0L) : imwVar.b(), (126 & 8) != 0 ? 1.0f : 0.0f, (126 & 16) != 0 ? inc.a : null, (126 & 32) != 0 ? null : null, (126 & 64) != 0 ? 3 : 0);
        } else if (this.b || this.c) {
            long j2 = ije.a;
            imwVar.r(ijg.f(ije.d(j2), ije.c(j2), ije.b(j2), 0.1f, ije.f(j2)), 0L, (126 & 4) != 0 ? imy.c(imwVar.b(), 0L) : imwVar.b(), (126 & 8) != 0 ? 1.0f : 0.0f, (126 & 16) != 0 ? inc.a : null, (126 & 32) != 0 ? null : null, (126 & 64) != 0 ? 3 : 0);
        }
    }

    @Override // defpackage.jbp
    public final /* synthetic */ void t() {
    }
}
