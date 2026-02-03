package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edzw implements fdau {
    final /* synthetic */ fdae a;
    final /* synthetic */ boolean b;

    public edzw(fdae fdaeVar, boolean z) {
        this.a = fdaeVar;
        this.b = z;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ecyg ecygVar = (ecyg) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        ecygVar.getClass();
        hmlVar.v(5004770);
        final fdae fdaeVar = this.a;
        boolean zD = hmlVar.D(fdaeVar);
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            objF = new fdae() { // from class: edzu
                @Override // defpackage.fdae
                public final Object invoke() {
                    fdaeVar.invoke();
                    return fctx.a;
                }
            };
            hmlVar.y(objF);
        }
        hmlVar.o();
        fdae fdaeVarA = ecygVar.a((fdae) objF);
        boolean z = this.b;
        ico icoVar = ics.e;
        hmlVar.v(1849434622);
        Object objF2 = hmlVar.f();
        if (objF2 == hmk.a) {
            objF2 = new fdap() { // from class: edzv
                @Override // defpackage.fdap
                public final Object invoke(Object obj4) {
                    jto jtoVar = (jto) obj4;
                    jtoVar.getClass();
                    jtk.u(jtoVar, "nameEdit");
                    return fctx.a;
                }
            };
            hmlVar.y(objF2);
        }
        hmlVar.o();
        dtfk.b(fdaeVarA, jsh.c(icoVar, false, (fdap) objF2), !z, null, null, edxr.f, hmlVar, 1572864, 56);
        return fctx.a;
    }
}
