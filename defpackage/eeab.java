package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeab implements fdau {
    final /* synthetic */ boolean a;
    final /* synthetic */ fdae b;
    final /* synthetic */ ede c;
    final /* synthetic */ boolean d;

    public eeab(boolean z, fdae fdaeVar, ede edeVar, boolean z2) {
        this.a = z;
        this.b = fdaeVar;
        this.c = edeVar;
        this.d = z2;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ecyg ecygVar = (ecyg) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        ecygVar.getClass();
        hmlVar.v(5004770);
        final fdae fdaeVar = this.b;
        boolean zD = hmlVar.D(fdaeVar);
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            objF = new fdae() { // from class: edzy
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
        evm evmVar = evn.a;
        egd egdVar = new egd(0.0f, 0.0f, 0.0f, 0.0f);
        ics icsVarK = egq.k(this.c.a(ics.e, new icd(1.0f, 0.85f)), 56.0f);
        hmlVar.v(1849434622);
        Object objF2 = hmlVar.f();
        if (objF2 == hmk.a) {
            objF2 = new fdap() { // from class: edzz
                @Override // defpackage.fdap
                public final Object invoke(Object obj4) {
                    jto jtoVar = (jto) obj4;
                    jtoVar.getClass();
                    jtk.u(jtoVar, "photoEdit");
                    return fctx.a;
                }
            };
            hmlVar.y(objF2);
        }
        boolean z = this.a;
        hmlVar.o();
        ics icsVarC = jsh.c(icsVarK, false, (fdap) objF2);
        egc egcVar = dtdc.a;
        dtdi.b(fdaeVarA, icsVarC, !z, evmVar, null, dtdc.c(3.0f, hmlVar, 30), egdVar, hxe.d(-175222949, new eeaa(this.d), hmlVar), hmlVar, 817889280, 336);
        return fctx.a;
    }
}
