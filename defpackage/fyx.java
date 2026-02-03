package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyx {
    public static final float a;
    private static final hpt b = new hnz(hsi.a, new fdae() { // from class: fys
        @Override // defpackage.fdae
        public final Object invoke() {
            float f = fyx.a;
            return gis.a;
        }
    });
    private static final float c;

    static {
        new hnz(hsi.a, new fdae() { // from class: fyt
            @Override // defpackage.fdae
            public final Object invoke() {
                float f = fyx.a;
                return git.a;
            }
        });
        new den(0.8f, 0.0f, 0.8f, 0.15f);
        c = 4.0f;
        a = 12.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00db, code lost:
    
        if (defpackage.dgv.j(r1, r2, r3, false, r5, r6, 4) == r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(final defpackage.hcq r9, float r10, defpackage.dep r11, defpackage.ddz r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fyx.a(hcq, float, dep, ddz, fcxy):java.lang.Object");
    }

    public static final void b(final ics icsVar, final fdat fdatVar, final jyq jyqVar, final jyq jyqVar2, final ibx ibxVar, final fdat fdatVar2, final fdau fdauVar, final float f, final ehc ehcVar, final hck hckVar, final hcn hcnVar, hml hmlVar, final int i, final int i2) {
        ics icsVar2;
        int i3;
        jyq jyqVar3;
        jyq jyqVar4;
        ibx ibxVar2;
        fdat fdatVar3;
        fdau fdauVar2;
        hck hckVar2;
        int i4;
        int i5;
        int i6 = i & 6;
        hml hmlVarC = hmlVar.c(-2033800111);
        if (i6 == 0) {
            icsVar2 = icsVar;
            i3 = (true != hmlVarC.D(icsVar2) ? 2 : 4) | i;
        } else {
            icsVar2 = icsVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.F(fdatVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            jyqVar3 = jyqVar;
            i3 |= true != hmlVarC.D(jyqVar3) ? 128 : 256;
        } else {
            jyqVar3 = jyqVar;
        }
        if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.F(null) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            jyqVar4 = jyqVar2;
            i3 |= true != hmlVarC.D(jyqVar4) ? 8192 : 16384;
        } else {
            jyqVar4 = jyqVar2;
        }
        if ((196608 & i) == 0) {
            ibxVar2 = ibxVar;
            i3 |= true != hmlVarC.D(ibxVar2) ? 65536 : 131072;
        } else {
            ibxVar2 = ibxVar;
        }
        if ((1572864 & i) == 0) {
            fdatVar3 = fdatVar2;
            i3 |= true != hmlVarC.F(fdatVar3) ? 524288 : 1048576;
        } else {
            fdatVar3 = fdatVar2;
        }
        if ((12582912 & i) == 0) {
            fdauVar2 = fdauVar;
            i3 |= true != hmlVarC.F(fdauVar2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            fdauVar2 = fdauVar;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != hmlVarC.A(f) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != hmlVarC.D(ehcVar) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            hckVar2 = hckVar;
            i4 = i2 | (true != hmlVarC.D(hckVar2) ? 2 : 4);
        } else {
            hckVar2 = hckVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 = i3;
            i4 |= true != hmlVarC.D(hcnVar) ? 16 : 32;
        } else {
            i5 = i3;
        }
        if (hmlVarC.J(((i5 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true, i5 & 1)) {
            ((gsr) hmlVarC.e(b)).a(new gss(icsVar2, fdatVar, jyqVar3, jyqVar4, ibxVar2, fdatVar3, fdauVar2, f, ehcVar, hckVar2, hcnVar), hmlVarC, 0);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fyp
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    ics icsVar3 = icsVar;
                    fdat fdatVar4 = fdatVar;
                    jyq jyqVar5 = jyqVar;
                    jyq jyqVar6 = jyqVar2;
                    ibx ibxVar3 = ibxVar;
                    fdat fdatVar5 = fdatVar2;
                    fdau fdauVar3 = fdauVar;
                    float f2 = f;
                    ehc ehcVar2 = ehcVar;
                    int i7 = i;
                    fyx.b(icsVar3, fdatVar4, jyqVar5, jyqVar6, ibxVar3, fdatVar5, fdauVar3, f2, ehcVar2, hckVar, hcnVar, hmlVar2, hpy.a(i7 | 1), hpy.a(i2));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final fdat fdatVar, final ics icsVar, final fdat fdatVar2, final fdau fdauVar, final float f, final ehc ehcVar, final hck hckVar, final hcn hcnVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1784421840);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdatVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdatVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.A(f) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.D(ehcVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.D(hckVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != hmlVarC.D(hcnVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if (hmlVarC.J((4793491 & i2) != 4793490, i2 & 1)) {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            int i4 = i2 << 12;
            hmlVar2 = hmlVarC;
            b(icsVar, fdatVar, hct.a(13, hmlVarC), jyq.a, ibw.j, fdatVar2, fdauVar, (kir.b(f, Float.NaN) || kir.b(f, Float.POSITIVE_INFINITY)) ? 64.0f : f, ehcVar, hckVar, hcnVar, hmlVar2, ((i2 >> 3) & 14) | 224256 | ((i2 << 3) & 112) | (i4 & 3670016) | (i4 & 29360128) | (i4 & 1879048192), (i2 >> 18) & 126);
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fyn
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar3 = (hml) obj;
                    ((Integer) obj2).intValue();
                    fdat fdatVar3 = fdatVar;
                    ics icsVar2 = icsVar;
                    fdat fdatVar4 = fdatVar2;
                    fdau fdauVar2 = fdauVar;
                    float f2 = f;
                    ehc ehcVar2 = ehcVar;
                    int i5 = i;
                    fyx.c(fdatVar3, icsVar2, fdatVar4, fdauVar2, f2, ehcVar2, hckVar, hcnVar, hmlVar3, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0407  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.ics r32, final defpackage.hil r33, final long r34, final long r36, final long r38, long r40, final defpackage.fdat r42, final defpackage.jyq r43, final defpackage.jyq r44, defpackage.fdae r45, final defpackage.ecq r46, final defpackage.ibx r47, final defpackage.fdat r48, defpackage.fdat r49, final float r50, defpackage.hml r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fyx.d(ics, hil, long, long, long, long, fdat, jyq, jyq, fdae, ecq, ibx, fdat, fdat, float, hml, int, int):void");
    }
}
