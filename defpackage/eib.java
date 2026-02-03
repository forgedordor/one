package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eib extends icr implements jcd {
    public fdat a;
    public int b;

    public eib(int i, fdat fdatVar) {
        this.b = i;
        this.a = fdatVar;
    }

    @Override // defpackage.jcd
    public final ixn b(final ixp ixpVar, ixk ixkVar, long j) {
        int i = this.b;
        final iyl iylVarE = ixkVar.e(kim.d(i != 1 ? 0 : kil.d(j), kil.b(j), i == 2 ? kil.c(j) : 0, kil.a(j)));
        final int i2 = fddu.i(iylVarE.a, kil.d(j), kil.b(j));
        final int i3 = fddu.i(iylVarE.b, kil.c(j), kil.a(j));
        return ixpVar.ej(i2, i3, fcvp.a, new fdap() { // from class: eia
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                int i4 = i2;
                ((iyk) obj).t(iylVarE, ((kjb) this.a.a.a(new kjg(((i4 - r1.a) << 32) | ((i3 - r1.b) & 4294967295L)), ixpVar.q())).a, 0.0f);
                return fctx.a;
            }
        });
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int e(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.a(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int f(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.b(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int g(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.c(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int h(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.d(this, ivuVar, ivtVar, i);
    }
}
