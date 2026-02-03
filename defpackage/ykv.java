package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ykv {
    /* JADX WARN: Removed duplicated region for block: B:120:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.dkgq r21, final defpackage.eve r22, defpackage.evxl r23, defpackage.dkgv r24, java.lang.Object r25, defpackage.hml r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ykv.a(dkgq, eve, evxl, dkgv, java.lang.Object, hml, int, int):void");
    }

    public static final void b(final dlhu dlhuVar, eve eveVar, hml hmlVar, final int i) {
        int i2;
        final eve eveVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-2094734603);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(dlhuVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(eveVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            eveVar2 = eveVar;
        } else if (dlhuVar instanceof djvm) {
            hmlVarC.v(1299713495);
            eveVar2 = eveVar;
            djvc.e((djvm) dlhuVar, null, eve.d(eveVar2, new evi(0.0f), new evi(0.0f), null, null, 12), hmlVarC, 0);
            ((hmw) hmlVarC).ab();
        } else {
            eveVar2 = eveVar;
            if (dlhuVar instanceof zgm) {
                hmlVarC.v(1299718581);
                zgk.a((zgm) dlhuVar, null, hmlVarC, 0);
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(1636614059);
                ((hmw) hmlVarC).ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ykq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlhu dlhuVar2 = dlhuVar;
                    int i4 = i;
                    ykv.b(dlhuVar2, eveVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final yrx yrxVar, final eve eveVar, final evxl evxlVar, final dkgv dkgvVar, final Object obj, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1066737490);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(yrxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(eveVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(evxlVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.B(dkgvVar.ordinal()) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(obj) ? 8192 : 16384;
        }
        int i4 = i2;
        if ((i4 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dkgq dkgqVar = yrxVar.b;
            if (dkgqVar != null) {
                hmlVarC.v(713830501);
                dkgm.f(dkgvVar, null, hxe.d(-1661764345, new ykt(dkgqVar, eveVar, evxlVar, dkgvVar, obj, yrxVar), hmlVarC), hmlVarC, ((i4 >> 9) & 14) | 384);
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(714033148);
                divm.a(yrxVar.a, null, eveVar, hmlVarC, (i4 << 3) & 896);
                ((hmw) hmlVarC).ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: yks
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    yrx yrxVar2 = yrxVar;
                    eve eveVar2 = eveVar;
                    evxl evxlVar2 = evxlVar;
                    dkgv dkgvVar2 = dkgvVar;
                    ykv.c(yrxVar2, eveVar2, evxlVar2, dkgvVar2, obj, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
