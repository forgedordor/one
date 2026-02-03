package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xwq {
    public static final void a(final dplu dpluVar, final ics icsVar, final xwn xwnVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(-251047232);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.F(dpluVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(xwnVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ybf ybfVar = (ybf) hsb.b(xwnVar.b, null, null, hmlVarC, 2).a();
            boolean z = ybfVar != null && ybfVar.c;
            ics icsVarC = egq.c(icsVar, 1.0f);
            hmlVarC.v(332598637);
            hsf hsfVarC = ddu.c(true != z ? 0.0f : 1.0f, null, null, hmlVarC, 0, 30);
            long j = dljt.a(hmlVarC).k;
            ics icsVarB = dkl.b(icsVarC, iix.d(fcva.g(new ije(ije.g), new ije(ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.7f, ije.f(j))), new ije(ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.9f, ije.f(j)))), 0.0f, 0.0f, 14), null, ((Number) hsfVarC.a()).floatValue(), 2);
            ((hmw) hmlVarC).ab();
            edj.a(icsVarB, null, hxe.d(-1890035798, new xwp(z, dpluVar, ybfVar), hmlVarC), hmlVarC, 3072, 6);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: xwo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dplu dpluVar2 = dpluVar;
                    ics icsVar2 = icsVar;
                    int i3 = i;
                    xwq.a(dpluVar2, icsVar2, xwnVar, (hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
