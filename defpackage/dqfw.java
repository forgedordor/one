package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqfw {
    public static final void a(final boolean z, boolean z2, final ics icsVar, final dqfx dqfxVar, final dqbw dqbwVar, hml hmlVar, final int i) {
        int i2;
        final boolean z3;
        ics icsVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1004109865);
        if (i3 == 0) {
            i2 = (true != hmlVarC.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z3 = z2;
            i2 |= true != hmlVarC.E(z3) ? 16 : 32;
        } else {
            z3 = z2;
        }
        if ((i & 384) == 0) {
            icsVar2 = icsVar;
            i2 |= true != hmlVarC.D(icsVar2) ? 128 : 256;
        } else {
            icsVar2 = icsVar;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(dqfxVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.D(dqbwVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            int i4 = i2 >> 3;
            czd.a(Boolean.valueOf(z3), icsVar2, null, null, hxe.d(1080009784, new dqft(dqfxVar, z, dqbwVar), hmlVarC), hmlVarC, (i4 & 14) | 24576 | (i4 & 112), 12);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dqfr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z4 = z;
                    boolean z5 = z3;
                    ics icsVar3 = icsVar;
                    dqfx dqfxVar2 = dqfxVar;
                    dqfw.a(z4, z5, icsVar3, dqfxVar2, dqbwVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
