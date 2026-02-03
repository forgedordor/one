package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtfu {
    public static final void a(ics icsVar, long j, List list, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        final long j2;
        final List list2;
        hml hmlVarC = hmlVar.c(-1639168813);
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
            list2 = list;
            j2 = j;
            icsVar2 = icsVar;
        } else {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                List list3 = dtfs.a;
                hmlVarC.v(974302091);
                j = dtdu.c(26, hmlVarC);
                ((hmw) hmlVarC).ab();
                list = dtfs.a;
            } else {
                hmlVarC.s();
            }
            long j3 = j;
            List list4 = list;
            hmlVarC.l();
            glv.b(icsVar, j3, list4, hmlVarC, i2 & 14);
            icsVar2 = icsVar;
            j2 = j3;
            list2 = list4;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dtft
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar3 = icsVar2;
                    long j4 = j2;
                    dtfu.a(icsVar3, j4, list2, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
