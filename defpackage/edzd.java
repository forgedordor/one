package defpackage;

import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edzd {
    public static final Intent a(Uri uri) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", uri);
        intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
        intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
        intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
        return intent;
    }

    public static final void b(final int i, final fdae fdaeVar, final String str, final int i2, hml hmlVar, final int i3) {
        int i4;
        int i5 = i3 & 6;
        hml hmlVarC = hmlVar.c(-946780165);
        if (i5 == 0) {
            i4 = (true != hmlVarC.B(i) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != hmlVarC.D(str) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i4 |= true != hmlVarC.B(i2) ? 1024 : 2048;
        }
        if ((i4 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ecye.a(i2, hxe.d(-2005719963, new edyj(fdaeVar, str, i), hmlVarC), hmlVarC, ((i4 >> 9) & 14) | 48);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: edxt
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    fdae fdaeVar2 = fdaeVar;
                    String str2 = str;
                    edzd.b(i6, fdaeVar2, str2, i2, (hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(hox hoxVar, boolean z) {
        hoxVar.b(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.fdae r23, final defpackage.fdae r24, final defpackage.fdap r25, final defpackage.fdap r26, final boolean r27, final defpackage.edvs r28, final defpackage.fdap r29, final android.net.Uri r30, final defpackage.fdae r31, final boolean r32, defpackage.hml r33, final int r34) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edzd.d(fdae, fdae, fdap, fdap, boolean, edvs, fdap, android.net.Uri, fdae, boolean, hml, int):void");
    }

    public static final void e(final fdat fdatVar, final int i, final long j, final String str, final fdae fdaeVar, final int i2, hml hmlVar, final int i3) {
        fdat fdatVar2;
        int i4;
        int i5 = i3 & 6;
        hml hmlVarC = hmlVar.c(-1975709296);
        if (i5 == 0) {
            fdatVar2 = fdatVar;
            i4 = (true != hmlVarC.F(fdatVar2) ? 2 : 4) | i3;
        } else {
            fdatVar2 = fdatVar;
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != hmlVarC.B(i) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != hmlVarC.C(j) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i4 |= true != hmlVarC.D(str) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != hmlVarC.F(fdaeVar) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            i4 |= true != hmlVarC.B(i2) ? 65536 : 131072;
        }
        if ((74899 & i4) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.t();
            if ((i3 & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            ecye.a(i2, hxe.d(-485389574, new edyf(fdaeVar, str, fdatVar2, i, j), hmlVarC), hmlVarC, ((i4 >> 15) & 14) | 48);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: edxz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdat fdatVar3 = fdatVar;
                    int i6 = i;
                    long j2 = j;
                    String str2 = str;
                    fdae fdaeVar2 = fdaeVar;
                    edzd.e(fdatVar3, i6, j2, str2, fdaeVar2, i2, (hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void i(final inz inzVar, final int i, long j, final String str, final fdae fdaeVar, final int i2, hml hmlVar, final int i3) {
        int i4;
        long j2;
        hml hmlVar2;
        final long j3;
        hml hmlVarC = hmlVar.c(42328400);
        if ((i3 & 6) == 0) {
            i4 = (true != hmlVarC.F(inzVar) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != hmlVarC.B(i) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= true != hmlVarC.D(str) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != hmlVarC.F(fdaeVar) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            i4 |= true != hmlVarC.B(i2) ? 65536 : 131072;
        }
        if ((74899 & i4) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
            j3 = j;
            hmlVar2 = hmlVarC;
        } else {
            hmlVarC.t();
            if ((i3 & 1) == 0 || hmlVarC.G()) {
                j2 = glz.a(hmlVarC).q;
            } else {
                hmlVarC.s();
                j2 = j;
            }
            hmlVarC.l();
            hmlVar2 = hmlVarC;
            e(hxe.d(-463891204, new edyc(inzVar, j2), hmlVarC), i, j2, str, fdaeVar, i2, hmlVar2, (i4 & 112) | 6 | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
            j3 = j2;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: edya
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    inz inzVar2 = inzVar;
                    int i5 = i;
                    long j4 = j3;
                    String str2 = str;
                    fdae fdaeVar2 = fdaeVar;
                    edzd.i(inzVar2, i5, j4, str2, fdaeVar2, i2, (hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void j(final ioi ioiVar, final int i, long j, final String str, final fdae fdaeVar, final int i2, hml hmlVar, final int i3) {
        int i4;
        long j2;
        hml hmlVar2;
        final long j3;
        hml hmlVarC = hmlVar.c(1991706941);
        if ((i3 & 6) == 0) {
            i4 = (true != hmlVarC.D(ioiVar) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != hmlVarC.B(i) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= true != hmlVarC.D(str) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != hmlVarC.F(fdaeVar) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            i4 |= true != hmlVarC.B(i2) ? 65536 : 131072;
        }
        if ((74899 & i4) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
            j3 = j;
            hmlVar2 = hmlVarC;
        } else {
            hmlVarC.t();
            if ((i3 & 1) == 0 || hmlVarC.G()) {
                j2 = glz.a(hmlVarC).q;
            } else {
                hmlVarC.s();
                j2 = j;
            }
            hmlVarC.l();
            hmlVar2 = hmlVarC;
            e(hxe.d(452003561, new edyb(ioiVar, j2), hmlVarC), i, j2, str, fdaeVar, i2, hmlVar2, (i4 & 112) | 6 | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
            j3 = j2;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: edxu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ioi ioiVar2 = ioiVar;
                    int i5 = i;
                    long j4 = j3;
                    String str2 = str;
                    fdae fdaeVar2 = fdaeVar;
                    edzd.j(ioiVar2, i5, j4, str2, fdaeVar2, i2, (hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
