package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlkn {
    public static final hpt a = new hsg(new fdae() { // from class: dlkm
        @Override // defpackage.fdae
        public final Object invoke() {
            hpt hptVar = dlkn.a;
            return dlkn.a(dtip.a());
        }
    });

    public static final dlkl a(hcr hcrVar) {
        hpf hpfVar = new hpf(1.0f);
        kcc kccVar = kcc.h;
        jyq jyqVar = hcrVar.j;
        jyq jyqVarY = jyq.y(jyqVar, 0L, 0L, kccVar, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777211);
        jyq jyqVarY2 = jyq.y(jyqVar, 0L, kjm.c(20), null, null, null, null, 0L, null, 0, 0, kjm.c(24), null, null, 0, 16646141);
        jyq jyqVarY3 = jyq.y(hcrVar.k, 0L, 0L, null, new kbw(1), null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777207);
        long jC = kjm.c(9);
        long jC2 = kjm.c(9);
        return new dlkl(hpfVar, jyqVarY, jyqVarY2, jyqVarY3, jyq.y(hcrVar.o, 0L, jC, null, null, null, null, kjm.a(0.1d), null, 0, 0, jC2, null, null, 0, 16646013), jyq.y(hcrVar.g, 0L, kjm.c(18), null, null, null, null, 0L, null, 0, 0, kjm.c(24), null, null, 0, 16646141), jyq.y(hcrVar.i, 0L, 0L, null, null, null, null, 0L, null, 0, 0, kjm.c(18), null, null, 0, 16646143), hcrVar);
    }

    public static final jyq b(jyq jyqVar, hml hmlVar) {
        jyqVar.getClass();
        hmlVar.v(-572197895);
        float fFloatValue = ((Number) dljt.e(hmlVar).a.a()).floatValue();
        long jG = jyqVar.g();
        kjm.e(jG);
        long jD = kjm.d(kjl.b(jG), kjl.a(jG) * fFloatValue);
        if (Float.isNaN(kjl.a(jD)) || kjl.a(jD) < 0.0f) {
            jD = kjm.d(4294967296L, 10.0f);
        }
        long j = jD;
        long jI = jyqVar.i();
        kjm.e(jI);
        long jD2 = kjm.d(kjl.b(jI), kjl.a(jI) * fFloatValue);
        if (Float.isNaN(kjl.a(jD2)) || kjl.a(jD2) < 0.0f) {
            jD2 = kjm.d(4294967296L, 10.0f);
        }
        jyq jyqVarY = jyq.y(jyqVar, 0L, j, null, null, null, null, 0L, null, 0, 0, jD2, null, null, 0, 16646141);
        hmlVar.o();
        return jyqVarY;
    }
}
