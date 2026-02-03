package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edza implements fdau {
    final /* synthetic */ hox a;
    final /* synthetic */ boolean b;
    final /* synthetic */ fdap c;
    final /* synthetic */ edvs d;

    public edza(hox hoxVar, boolean z, fdap fdapVar, edvs edvsVar) {
        this.a = hoxVar;
        this.b = z;
        this.c = fdapVar;
        this.d = edvsVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ecyg ecygVar = (ecyg) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        ecygVar.getClass();
        hmlVar.v(5004770);
        Object objF = hmlVar.f();
        final hox hoxVar = this.a;
        Object obj4 = hmk.a;
        if (objF == obj4) {
            objF = new fdae() { // from class: edyq
                @Override // defpackage.fdae
                public final Object invoke() {
                    edzd.c(hoxVar, true);
                    return fctx.a;
                }
            };
            hmlVar.y(objF);
        }
        hmlVar.o();
        fdae fdaeVarA = ecygVar.a((fdae) objF);
        ico icoVar = ics.e;
        hmlVar.v(1849434622);
        Object objF2 = hmlVar.f();
        if (objF2 == obj4) {
            objF2 = new fdap() { // from class: edyr
                @Override // defpackage.fdap
                public final Object invoke(Object obj5) {
                    jto jtoVar = (jto) obj5;
                    jtoVar.getClass();
                    jtk.u(jtoVar, "dropdownButton");
                    return fctx.a;
                }
            };
            hmlVar.y(objF2);
        }
        hmlVar.o();
        dtfk.b(fdaeVarA, egq.h(jsh.c(icoVar, false, (fdap) objF2), 48.0f), false, null, null, hxe.d(-2053179218, new edyz(hoxVar, this.b, this.c, this.d), hmlVar), hmlVar, 1572864, 60);
        return fctx.a;
    }
}
