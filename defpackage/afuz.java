package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afuz {
    public static final void a(final List list, boolean z, final boolean z2, hml hmlVar, final int i, final int i2) {
        int i3;
        List listB;
        final boolean z3;
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(1387645390);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.F(list) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        boolean z4 = i5 == 0;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.E(z2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.E(false) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            z3 = z;
        } else {
            boolean z5 = z4 & z;
            boolean z6 = !list.isEmpty();
            if (z5 && list.size() == 1) {
                djqp djqpVar = (djqp) list.get(0);
                listB = fcva.b(new djqp(djqpVar.a, djqpVar.b, djqpVar.c, null));
            } else {
                listB = list;
            }
            cye.b(z6, null, dae.k(null, null, 15).a(dae.l(null, 3)), dae.q(null, null, 15).a(dae.m(null, 3)), null, hxe.d(2008956582, new afuy(z2, listB), hmlVarC), hmlVarC, 196608, 18);
            z3 = z5;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: afut
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    List list2 = list;
                    boolean z7 = z3;
                    afuz.a(list2, z7, z2, (hml) obj, hpy.a(i | 1), i2);
                    return fctx.a;
                }
            };
        }
    }
}
