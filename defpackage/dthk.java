package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dthk {
    public static final dthk a = new dthk();

    private dthk() {
    }

    public static final long a(hml hmlVar) {
        hmlVar.v(291271527);
        long jC = dtdu.c(35, hmlVar);
        hmlVar.o();
        return jC;
    }

    public static final long b(hml hmlVar) {
        hmlVar.v(1269314295);
        long jC = dtdu.c(18, hmlVar);
        hmlVar.o();
        return jC;
    }

    public final void c(final ics icsVar, float f, long j, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(1305604946);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                int i3 = dtix.a;
                j = dtdu.c(26, hmlVarC);
                f = 3.0f;
            } else {
                hmlVarC.s();
            }
            hmlVarC.l();
            ecz.b(dkl.a(egq.e(egq.d(icsVar, 1.0f), f), j, ikj.a), hmlVarC, 0);
        }
        final float f2 = f;
        final long j2 = j;
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dthj
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dthk dthkVar = this.a;
                    ics icsVar2 = icsVar;
                    float f3 = f2;
                    dthkVar.c(icsVar2, f3, j2, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
