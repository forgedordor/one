package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esp {
    public static final boolean a(etv etvVar, fdjx fdjxVar) {
        if (!etvVar.g()) {
            return false;
        }
        fdil.d(fdjxVar, null, null, new esn(etvVar, null), 3);
        return true;
    }

    public static final boolean b(etv etvVar, fdjx fdjxVar) {
        if (!etvVar.h()) {
            return false;
        }
        fdil.d(fdjxVar, null, null, new eso(etvVar, null), 3);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.etv r29, defpackage.ics r30, defpackage.egc r31, defpackage.esa r32, int r33, float r34, defpackage.icc r35, defpackage.dzo r36, boolean r37, defpackage.iqp r38, defpackage.eaw r39, defpackage.dop r40, final defpackage.fdav r41, defpackage.hml r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esp.c(etv, ics, egc, esa, int, float, icc, dzo, boolean, iqp, eaw, dop, fdav, hml, int, int, int):void");
    }

    public static final void d(final etv etvVar, final ics icsVar, final egc egcVar, final esa esaVar, ibx ibxVar, final dzo dzoVar, boolean z, iqp iqpVar, final eaw eawVar, dop dopVar, final fdav fdavVar, hml hmlVar, final int i, final int i2) {
        int i3;
        dzo dzoVar2;
        eaw eawVar2;
        final ibx ibxVar2;
        final boolean z2;
        final iqp iqpVar2;
        final dop dopVar2;
        iqp iqpVarB;
        ibx ibxVar3;
        dop dopVarA;
        hml hmlVarC = hmlVar.c(-1590376023);
        boolean z3 = true;
        if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(etvVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.D(egcVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.D(esaVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != hmlVarC.B(2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != hmlVarC.A(8.0f) ? 65536 : 131072;
        }
        int i4 = i3 | 1572864;
        if ((12582912 & i) == 0) {
            dzoVar2 = dzoVar;
            i4 |= true != hmlVarC.D(dzoVar2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            dzoVar2 = dzoVar;
        }
        int i5 = i2 | 6;
        if ((i2 & 48) == 0) {
            i5 = i2 | 22;
        }
        if ((i2 & 384) == 0) {
            eawVar2 = eawVar;
            i5 |= true != hmlVarC.D(eawVar2) ? 128 : 256;
        } else {
            eawVar2 = eawVar;
        }
        if ((i2 & 3072) == 0) {
            i5 |= 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= true == hmlVarC.F(fdavVar) ? 16384 : 8192;
        }
        int i6 = i4 | 905969664;
        if (hmlVarC.J(((306783379 & i6) == 306783378 && (i5 & 9363) == 9362) ? false : true, i6 & 1)) {
            int i7 = i5 & (-7281);
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                ibx ibxVar4 = ibw.k;
                iqpVarB = ese.b(etvVar, dwm.a, hmlVarC, (i6 & 14) | 432);
                ibxVar3 = ibxVar4;
                dopVarA = dor.a(hmlVarC);
            } else {
                hmlVarC.s();
                ibxVar3 = ibxVar;
                z3 = z;
                iqpVarB = iqpVar;
                dopVarA = dopVar;
            }
            hmlVarC.l();
            int i8 = ((i6 >> 3) & 14) | 24576;
            int i9 = i6 << 3;
            int i10 = i6 & 896;
            int i11 = i6 >> 18;
            int i12 = i6 >> 6;
            int i13 = i6 << 12;
            int i14 = i6 >> 9;
            int i15 = i7 << 6;
            erv.a(icsVar, etvVar, egcVar, dwm.a, dzoVar2, z3, dopVarA, 2, 8.0f, esaVar, iqpVarB, ibxVar3, ibw.n, eawVar2, fdavVar, hmlVarC, (i11 & 7168) | i8 | (i9 & 112) | i10 | (i12 & 458752) | (i12 & 3670016) | (i13 & 234881024) | (i13 & 1879048192), (i14 & 7168) | (i14 & 14) | 24576 | (i15 & 896) | ((i7 << 9) & 458752) | (i15 & 3670016));
            z2 = z3;
            iqpVar2 = iqpVarB;
            ibxVar2 = ibxVar3;
            dopVar2 = dopVarA;
        } else {
            hmlVarC.s();
            ibxVar2 = ibxVar;
            z2 = z;
            iqpVar2 = iqpVar;
            dopVar2 = dopVar;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: esl
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    etv etvVar2 = etvVar;
                    ics icsVar2 = icsVar;
                    egc egcVar2 = egcVar;
                    esa esaVar2 = esaVar;
                    ibx ibxVar5 = ibxVar2;
                    dzo dzoVar3 = dzoVar;
                    boolean z4 = z2;
                    iqp iqpVar3 = iqpVar2;
                    eaw eawVar3 = eawVar;
                    dop dopVar3 = dopVar2;
                    int i16 = i;
                    esp.d(etvVar2, icsVar2, egcVar2, esaVar2, ibxVar5, dzoVar3, z4, iqpVar3, eawVar3, dopVar3, fdavVar, hmlVar2, hpy.a(i16 | 1), hpy.a(i2));
                    return fctx.a;
                }
            };
        }
    }
}
