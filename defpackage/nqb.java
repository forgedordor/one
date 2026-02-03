package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqb implements nnr {
    private final mfr a = new mfr(4);
    private final nos b = new nos(-1, -1, "image/heif");

    private final boolean h(nns nnsVar, int i) {
        mfr mfrVar = this.a;
        mfrVar.G(4);
        nnsVar.i(mfrVar.a, 0, 4);
        return mfrVar.r() == ((long) i);
    }

    @Override // defpackage.nnr
    public final int a(nns nnsVar, non nonVar) {
        return this.b.a(nnsVar, nonVar);
    }

    @Override // defpackage.nnr
    public final void c(nnu nnuVar) {
        this.b.c(nnuVar);
    }

    @Override // defpackage.nnr
    public final void e(long j, long j2) {
        this.b.e(j, j2);
    }

    @Override // defpackage.nnr
    public final boolean f(nns nnsVar) {
        nnsVar.g(4);
        return h(nnsVar, 1718909296) && h(nnsVar, 1751476579);
    }

    @Override // defpackage.nnr
    public final /* synthetic */ List x() {
        int i = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.nnr
    public final void d() {
    }

    @Override // defpackage.nnr
    public final /* synthetic */ void g() {
    }
}
