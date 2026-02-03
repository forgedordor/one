package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtcv {
    public static final void a(ics icsVar, long j, long j2, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        final long j3;
        final long j4;
        hml hmlVarC = hmlVar.c(-1012366174);
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
        int i3 = i2 | 3072;
        if ((i3 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            j4 = j2;
            j3 = j;
            icsVar2 = icsVar;
        } else {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                hmlVarC.v(-213021945);
                j = dtdu.c(2, hmlVarC);
                ((hmw) hmlVarC).ab();
                j2 = dtdu.a(j, hmlVarC);
            } else {
                hmlVarC.s();
            }
            long j5 = j;
            long j6 = j2;
            hmlVarC.l();
            fzc.a(icsVar, j5, j6, hmlVarC, i3 & 7182);
            icsVar2 = icsVar;
            j3 = j5;
            j4 = j6;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dtcu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar3 = icsVar2;
                    long j7 = j3;
                    dtcv.a(icsVar3, j7, j4, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
