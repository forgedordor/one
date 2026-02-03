package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esrd implements esrw {
    private final esob a;

    public esrd(esob esobVar) {
        this.a = esobVar;
    }

    @Override // defpackage.esrw
    public final /* synthetic */ estb a(esrs esrsVar) {
        return estb.a;
    }

    @Override // defpackage.esrw
    public final estb b(esrs esrsVar) {
        ejwl.m(true, "Cronet does not support CallOptions.withAuthority(). See https://github.com/grpc/grpc-java/issues/1767");
        fbnc fbncVarF = esrsVar.b;
        fbnb fbnbVar = esoa.a;
        esoa esoaVarB = (esoa) fbncVarF.h(fbnbVar);
        if (esoaVarB == null) {
            esoaVarB = this.a.b(esrsVar.c.b);
            esoaVarB.getClass();
            fbncVarF = fbncVarF.f(fbnbVar, esoaVarB);
        }
        return new estb(1, null, null, fbncVarF.f(drgj.a, esoaVarB.a()));
    }

    @Override // defpackage.esrw
    public final /* synthetic */ estb c() {
        return estb.a;
    }

    @Override // defpackage.esrw
    public final /* synthetic */ estb e() {
        return estb.a;
    }

    @Override // defpackage.esrw
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.esrw
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.esrw
    public final /* synthetic */ void d(esrr esrrVar) {
    }
}
