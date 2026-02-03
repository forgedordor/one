package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpsv implements fdat {
    final /* synthetic */ hox a;
    final /* synthetic */ kph b;
    final /* synthetic */ dplv c;
    final /* synthetic */ dpto d;
    final /* synthetic */ boolean e;
    final /* synthetic */ fdap f;
    final /* synthetic */ fdav g;

    public dpsv(hox hoxVar, kph kphVar, dplv dplvVar, dpto dptoVar, boolean z, fdap fdapVar, fdav fdavVar) {
        this.a = hoxVar;
        this.b = kphVar;
        this.c = dplvVar;
        this.d = dptoVar;
        this.e = z;
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
            hmlVar.v(-1719376428);
            dplv dplvVar = this.c;
            kow kowVarA = kphVar.a();
            dpti.h(dplvVar, dpqj.a(ics.e, kphVar, kowVarA), this.d, this.e, this.f, hmlVar, 0);
            hmlVar.v(-1302382398);
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
