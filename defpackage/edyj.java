package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edyj implements fdau {
    final /* synthetic */ fdae a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;

    public edyj(fdae fdaeVar, String str, int i) {
        this.a = fdaeVar;
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ecyg ecygVar = (ecyg) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        ecygVar.getClass();
        hwv hwvVarD = hxe.d(953746485, new edyi(this.c), hmlVar);
        hmlVar.v(5004770);
        final fdae fdaeVar = this.a;
        boolean zD = hmlVar.D(fdaeVar);
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            objF = new fdae() { // from class: edyg
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
        ico icoVar = ics.e;
        hmlVar.v(5004770);
        final String str = this.b;
        boolean zD2 = hmlVar.D(str);
        Object objF2 = hmlVar.f();
        if (zD2 || objF2 == hmk.a) {
            objF2 = new fdap() { // from class: edyh
                @Override // defpackage.fdap
                public final Object invoke(Object obj4) {
                    jto jtoVar = (jto) obj4;
                    jtoVar.getClass();
                    jtk.u(jtoVar, str);
                    return fctx.a;
                }
            };
            hmlVar.y(objF2);
        }
        hmlVar.o();
        dtfz.a(hwvVarD, fdaeVarA, jsh.c(icoVar, false, (fdap) objF2), null, false, null, null, hmlVar, 6, 504);
        return fctx.a;
    }
}
