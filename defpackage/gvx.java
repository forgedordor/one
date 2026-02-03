package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvx {
    public static final dgg a = new dgg((byte[]) null);

    public static final void a(final boolean z, final fdap fdapVar, final ics icsVar, final boolean z2, final gvu gvuVar, hml hmlVar, final int i) {
        boolean z3;
        int i2;
        ebk ebkVar;
        ics icsVarA;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-263339167);
        if (i3 == 0) {
            z3 = z;
            i2 = (true != hmlVarC.E(z3) ? 2 : 4) | i;
        } else {
            z3 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(null) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.E(z2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.D(gvuVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.D(null) ? 524288 : 1048576;
        }
        int i4 = i2;
        if (hmlVarC.J((599187 & i4) != 599186, i4 & 1)) {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            hmlVarC.v(1768604058);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new ebk();
                hmwVar.af(objS);
            }
            ebk ebkVar2 = (ebk) objS;
            hmwVar.ab();
            if (fdapVar != null) {
                ebkVar = ebkVar2;
                icsVarA = euy.a(gks.a(ics.e), z3, ebkVar, null, z2, new jrw(2), fdapVar);
            } else {
                ebkVar = ebkVar2;
                icsVarA = ics.e;
            }
            int i5 = i4 << 3;
            int i6 = i4 >> 6;
            b(egq.i(egq.z(icsVarA, ibw.e, 2), 52.0f, 32.0f), z, z2, gvuVar, ebkVar, gsc.e(7, hmlVarC), hmlVarC, (i6 & 7168) | (i5 & 112) | (i6 & 896) | (i5 & 57344));
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gvv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    boolean z4 = z;
                    fdap fdapVar2 = fdapVar;
                    ics icsVar2 = icsVar;
                    int i7 = i;
                    gvx.a(z4, fdapVar2, icsVar2, z2, gvuVar, hmlVar2, hpy.a(i7 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.ics r18, boolean r19, boolean r20, final defpackage.gvu r21, final defpackage.ebk r22, final defpackage.ikp r23, defpackage.hml r24, final int r25) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gvx.b(ics, boolean, boolean, gvu, ebk, ikp, hml, int):void");
    }
}
