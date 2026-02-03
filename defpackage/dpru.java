package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpru implements fdat {
    final /* synthetic */ hox a;
    final /* synthetic */ kph b;
    final /* synthetic */ dplv c;
    final /* synthetic */ dpsb d;
    final /* synthetic */ dprl e;
    final /* synthetic */ fdap f;
    final /* synthetic */ fdav g;

    public dpru(hox hoxVar, kph kphVar, dplv dplvVar, dpsb dpsbVar, dprl dprlVar, fdap fdapVar, fdav fdavVar) {
        this.a = hoxVar;
        this.b = kphVar;
        this.c = dplvVar;
        this.d = dpsbVar;
        this.e = dprlVar;
        this.f = fdapVar;
        this.g = fdavVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            this.a.b(fctx.a);
            kph kphVar = this.b;
            kphVar.c();
            hmlVar.v(-875912250);
            dplv dplvVar = this.c;
            kow kowVarA = kphVar.a();
            dprw.b(dplvVar, dpqj.a(ics.e, kphVar, kowVarA), this.d, this.e, this.f, hmlVar, 4096);
            hmlVar.v(-1136629892);
            fdav fdavVar = this.g;
            if (fdavVar != null) {
                fdavVar.a(kphVar, kowVarA, hmlVar, 8);
            }
            hmlVar.o();
            hmlVar.o();
            hmlVar.v(1659148056);
            hmlVar.o();
        }
        return fctx.a;
    }
}
