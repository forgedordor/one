package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yad implements fdau {
    final /* synthetic */ fdae a;
    final /* synthetic */ ekgb b;
    final /* synthetic */ boolean c;
    final /* synthetic */ edp d;

    public yad(fdae fdaeVar, ekgb ekgbVar, edp edpVar, boolean z) {
        this.a = fdaeVar;
        this.b = ekgbVar;
        this.d = edpVar;
        this.c = z;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        ((cyg) obj).getClass();
        if (Float.compare(80.0f, 0.0f) <= 0) {
            throw new IllegalArgumentException("The refresh trigger must be greater than zero!");
        }
        Object objF = hmlVar.f();
        Object obj4 = hmk.a;
        if (objF == obj4) {
            hnm hnmVar = new hnm(hob.a(fcyi.a, hmlVar));
            hmlVar.y(hnmVar);
            objF = hnmVar;
        }
        fdae fdaeVar = this.a;
        fdjx fdjxVar = ((hnm) objF).a;
        hsf hsfVarA = hsc.a(fdaeVar, hmlVar);
        final fdcf fdcfVar = new fdcf();
        final fdcf fdcfVar2 = new fdcf();
        kio kioVar = (kio) hmlVar.e(jmh.e);
        fdcfVar.a = kioVar.en(80.0f);
        fdcfVar2.a = kioVar.en(56.0f);
        boolean zD = hmlVar.D(fdjxVar);
        Object objF2 = hmlVar.f();
        if (zD || objF2 == obj4) {
            objF2 = new fws(fdjxVar, hsfVarA, fdcfVar2.a, fdcfVar.a);
            hmlVar.y(objF2);
        }
        final fws fwsVar = (fws) objF2;
        boolean zF = hmlVar.F(fwsVar) | hmlVar.A(fdcfVar.a) | hmlVar.A(fdcfVar2.a);
        Object objF3 = hmlVar.f();
        if (zF || objF3 == obj4) {
            objF3 = new fdae() { // from class: fwt
                @Override // defpackage.fdae
                public final Object invoke() {
                    fws fwsVar2 = fwsVar;
                    if (fwsVar2.f()) {
                        fwsVar2.b.b(false);
                        fwsVar2.d(0.0f);
                        fwsVar2.g(0.0f);
                    }
                    fdcf fdcfVar3 = fdcfVar2;
                    fwsVar2.e.h(fdcfVar.a);
                    hrg hrgVar = fwsVar2.f;
                    float f = fdcfVar3.a;
                    if (hrgVar.c() != f) {
                        hrgVar.h(f);
                        if (fwsVar2.f()) {
                            fwsVar2.g(f);
                        }
                    }
                    return fctx.a;
                }
            };
            hmlVar.y(objF3);
        }
        hob.i((fdae) objF3, hmlVar);
        ics icsVarA = iqu.a(ics.e, new fwn(new fwk(fwsVar), new fwl(fwsVar)), null);
        ekgb ekgbVar = this.b;
        if (ekgbVar.isEmpty()) {
            hmlVar.v(742085992);
            yam.e(icsVarA, hmlVar, 0);
        } else {
            hmlVar.v(742086937);
            yam.k(this.d, icsVarA, ekgbVar, this.c, hmlVar, 0);
        }
        hmlVar.o();
        return fctx.a;
    }
}
