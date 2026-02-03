package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtib {
    public static final void a(final hbl hblVar, final ics icsVar, final gyq gyqVar, hml hmlVar, final int i) {
        int i2;
        hblVar.getClass();
        hml hmlVarC = hmlVar.c(-898063705);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.F(hblVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 = i2 | 176;
        }
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                icsVar = ics.e;
                gyqVar = dthy.a(hmlVarC);
            } else {
                hmlVarC.s();
            }
            hmlVarC.l();
            hbj.D(hblVar, icsVar, gyqVar, hmlVarC, i3 & 126);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dtia
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hbl hblVar2 = hblVar;
                    ics icsVar2 = icsVar;
                    int i4 = i;
                    dtib.a(hblVar2, icsVar2, gyqVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final hbl hblVar, ics icsVar, gyq gyqVar, final int i, hml hmlVar, final int i2) {
        int i3;
        final ics icsVar2;
        final gyq gyqVar2;
        hblVar.getClass();
        hml hmlVarC = hmlVar.c(434161398);
        if ((i2 & 6) == 0) {
            i3 = (true != hmlVarC.F(hblVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if ((i2 & 384) == 0) {
            i4 = i3 | 176;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != hmlVarC.B(i) ? 1024 : 2048;
        }
        if ((i4 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
            gyqVar2 = gyqVar;
        } else {
            hmlVarC.t();
            if ((i2 & 1) == 0 || hmlVarC.G()) {
                icsVar = ics.e;
                gyqVar = dthy.a(hmlVarC);
            } else {
                hmlVarC.s();
            }
            ics icsVar3 = icsVar;
            gyq gyqVar3 = gyqVar;
            hmlVarC.l();
            hbj.E(hblVar, icsVar3, gyqVar3, i, hmlVarC, i4 & 7294);
            icsVar2 = icsVar3;
            gyqVar2 = gyqVar3;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dthz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hbl hblVar2 = hblVar;
                    ics icsVar4 = icsVar2;
                    gyq gyqVar4 = gyqVar2;
                    dtib.b(hblVar2, icsVar4, gyqVar4, i, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
