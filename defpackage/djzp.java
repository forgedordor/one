package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djzp {
    public static final void a(hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(-1752958801);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(null) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(null) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ecz.b(dkto.d(iex.a(egq.k(ics.e, 40.0f), evn.a), null, 4), hmlVarC, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djzi
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djzp.a((hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final float f, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(-1389127572);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(null) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(null) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.A(f) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ecz.b(dkto.d(iex.a(egq.e(egq.d(ics.e, f), 18.0f), glz.c(hmlVarC).c), null, 4), hmlVarC, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djzk
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i3 = i;
                    djzp.b(f, (hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(hml hmlVar, final int i) {
        int i2 = (i | 54) & 19;
        hml hmlVarC = hmlVar.c(-411525320);
        if (i2 == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dtfr.a(hxe.d(1242505622, new djzl(), hmlVarC), null, null, hxe.d(-869083303, new djzm(), hmlVarC), hxe.d(-1572946278, new djzn(), hmlVarC), hxe.d(2018158043, new djzo(), hmlVarC), null, hmlVarC, 224262, 454);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djzj
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djzp.d((hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
