package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vbd {
    public static final void a(final ego egoVar, final String str, dpn dpnVar, final hox hoxVar, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        dpn dpnVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1738962866);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(egoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            dpnVar2 = dpnVar;
            i2 |= true != hmlVarC.D(dpnVar2) ? 128 : 256;
        } else {
            dpnVar2 = dpnVar;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(hoxVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (dpnVar2.b() - dpnVar2.c() < ((kio) hmlVarC.e(jmh.e)).em(kjm.c(14)) || !dpnVar2.h()) {
                hoxVar.b(true);
            }
            ics icsVarA = egoVar.a(egq.b(ics.e, 1.0f), 1.0f, true);
            evm evmVarB = evn.b(24.0f);
            egc egcVar = dtdc.a;
            dtdi.a(fdaeVar, icsVarA, ((Boolean) hoxVar.a()).booleanValue(), evmVarB, dtdc.b(glz.a(hmlVarC).a, glz.a(hmlVarC).b, hmlVarC, 12), null, null, null, hxe.d(-1170592162, new vbc(str), hmlVarC), hmlVarC, ((i2 >> 12) & 14) | 805502976, 448);
            hmlVarC = hmlVarC;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final dpn dpnVar3 = dpnVar2;
            hpxVarL.d = new fdat() { // from class: vaq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ego egoVar2 = egoVar;
                    String str2 = str;
                    dpn dpnVar4 = dpnVar3;
                    hox hoxVar2 = hoxVar;
                    vbd.a(egoVar2, str2, dpnVar4, hoxVar2, fdaeVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final boolean r57, final defpackage.fdae r58, final defpackage.fdae r59, final defpackage.fdae r60, final defpackage.fdae r61, final defpackage.fdae r62, defpackage.hml r63, final int r64) {
        /*
            Method dump skipped, instructions count: 1308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vbd.b(boolean, fdae, fdae, fdae, fdae, fdae, hml, int):void");
    }
}
