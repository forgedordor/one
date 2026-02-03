package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gos {
    public static final long a = ila.a(0.5f, 0.0f);

    public static final void a(final long j, final fdae fdaeVar, final boolean z, hml hmlVar, final int i) {
        int i2;
        ics icsVarC;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(951870469);
        if (i3 == 0) {
            i2 = (true != hmlVarC.C(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if (!hmlVarC.J((i2 & 147) != 146, i2 & 1)) {
            hmlVarC.s();
        } else if (j != 16) {
            hmlVarC.v(1799274230);
            final hsf hsfVarC = ddu.c(true != z ? 0.0f : 1.0f, gpg.b(4, hmlVarC), null, hmlVarC, 0, 28);
            final String strB = hjw.b(R.string.close_sheet, hmlVarC);
            if (z) {
                hmlVarC.v(1799565289);
                int i4 = i2 & 112;
                ico icoVar = ics.e;
                hmw hmwVar = (hmw) hmlVarC;
                Object objS = hmwVar.S();
                if (i4 == 32 || objS == hmk.a) {
                    objS = new gor(fdaeVar);
                    hmwVar.af(objS);
                }
                ics icsVarA = itf.a(icoVar, fdaeVar, (PointerInputEventHandler) objS);
                boolean zD = (i4 == 32) | hmlVarC.D(strB);
                Object objS2 = hmwVar.S();
                if (zD || objS2 == hmk.a) {
                    objS2 = new fdap() { // from class: gnq
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            jto jtoVar = (jto) obj;
                            long j2 = gos.a;
                            jtk.z(jtoVar, 1.0f);
                            jtk.k(jtoVar, strB);
                            final fdae fdaeVar2 = fdaeVar;
                            jtk.h(jtoVar, null, new fdae() { // from class: gnt
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    long j3 = gos.a;
                                    fdaeVar2.invoke();
                                    return true;
                                }
                            });
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS2);
                }
                icsVarC = jsh.c(icsVarA, true, (fdap) objS2);
                hmwVar.ab();
            } else {
                hmlVarC.v(1799991477);
                ((hmw) hmlVarC).ab();
                icsVarC = ics.e;
            }
            ics icsVarA2 = egq.c(ics.e, 1.0f).a(icsVarC);
            boolean zD2 = hmlVarC.D(hsfVarC) | ((i2 & 14) == 4);
            hmw hmwVar2 = (hmw) hmlVarC;
            Object objS3 = hmwVar2.S();
            if (zD2 || objS3 == hmk.a) {
                objS3 = new fdap() { // from class: gnr
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        imz imzVar = (imz) obj;
                        long j2 = gos.a;
                        imzVar.r(j, 0L, (126 & 4) != 0 ? imy.c(imzVar.b(), 0L) : 0L, (126 & 8) != 0 ? 1.0f : fddu.e(((Number) hsfVarC.a()).floatValue(), 0.0f, 1.0f), (126 & 16) != 0 ? inc.a : null, (126 & 32) != 0 ? null : null, (126 & 64) != 0 ? 3 : 0);
                        return fctx.a;
                    }
                };
                hmwVar2.af(objS3);
            }
            dlb.a(icsVarA2, (fdap) objS3, hmlVarC, 0);
            hmwVar2.ab();
        } else {
            hmlVarC.v(1800172765);
            ((hmw) hmlVarC).ab();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gns
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    long j2 = j;
                    int i5 = i;
                    gos.a(j2, fdaeVar, z, hmlVar2, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final float b(ikl iklVar, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (iklVar.r >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (kjx.b(0.0f, Math.min(kin.d(iklVar, 48.0f), fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    public static final float c(ikl iklVar, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (iklVar.r & 4294967295L));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (kjx.b(0.0f, Math.min(kin.d(iklVar, 24.0f), fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0262 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0303  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.fdae r29, final defpackage.ics r30, defpackage.gsp r31, final float r32, final boolean r33, final defpackage.ikp r34, final long r35, final long r37, final float r39, final long r40, final defpackage.fdat r42, final defpackage.fdat r43, final defpackage.got r44, final defpackage.fdau r45, defpackage.hml r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gos.d(fdae, ics, gsp, float, boolean, ikp, long, long, float, long, fdat, fdat, got, fdau, hml, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final defpackage.ede r38, final defpackage.ddp r39, final defpackage.fdjx r40, final defpackage.fdae r41, final defpackage.fdap r42, final defpackage.ics r43, final defpackage.gsp r44, final float r45, final boolean r46, final defpackage.ikp r47, final long r48, final long r50, final float r52, final defpackage.fdat r53, final defpackage.fdat r54, final defpackage.fdau r55, defpackage.hml r56, final int r57, final int r58) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gos.e(ede, ddp, fdjx, fdae, fdap, ics, gsp, float, boolean, ikp, long, long, float, fdat, fdat, fdau, hml, int, int):void");
    }

    public static final gsp f(boolean z, hml hmlVar, int i, int i2) {
        Object objF = hmlVar.f();
        if (objF == hmk.a) {
            objF = new fdap() { // from class: gnp
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    long j = gos.a;
                    return true;
                }
            };
            hmlVar.y(objF);
        }
        return gsi.a(1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1)), (fdap) objF, gsq.a, false, hmlVar, (i & 14) | 384, 56);
    }
}
