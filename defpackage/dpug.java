package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpug {
    public static final void a(final ede edeVar, final String str, final String str2, final boolean z, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(781679860);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(str2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.E(z) ? 1024 : 2048;
        }
        int i4 = i2;
        if ((i4 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            ecj ecjVar = ecr.g;
            icc iccVar = ibw.n;
            ico icoVar = ics.e;
            ics icsVarE = efy.e(egq.d(edeVar.a(icoVar, ibw.h), 1.0f), 12.0f, 14.0f);
            ixm ixmVarA = egk.a(ecjVar, iccVar, hmlVarC, 54);
            int iA = dptu.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarE);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            egp egpVar = egp.a;
            dia diaVar = dptr.a;
            dia diaVar2 = dptr.a;
            cye.c(egpVar, z, null, dae.l(diaVar2, 2), dae.m(diaVar2, 2), null, hxe.d(2014139960, new dpua(str), hmlVarC), hmlVarC, 1600518 | ((i4 >> 6) & 112), 18);
            hsf hsfVarC = ddu.c(true != z ? 0.52f : 0.0f, diaVar2, null, hmlVarC, 48, 28);
            egt.a(egpVar.a(icoVar, 1.0f, true), hmlVarC);
            b(null, str2, ((Number) hsfVarC.a()).floatValue(), hmlVarC, (i4 >> 3) & 112, 1);
            hmlVar2 = hmlVarC;
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dptz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ede edeVar2 = edeVar;
                    String str3 = str;
                    String str4 = str2;
                    dpug.a(edeVar2, str3, str4, z, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.ics r28, final java.lang.String r29, float r30, defpackage.hml r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpug.b(ics, java.lang.String, float, hml, int, int):void");
    }

    public static final void c(final ede edeVar, final boolean z, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        String strB;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1530401476);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            djrr djrrVar = z ? djrr.cN : djrr.df;
            long j = dljt.a(hmlVarC).i;
            long jF = ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.6f, ije.f(j));
            if (z) {
                hmlVarC.v(1112848273);
                strB = jqu.b(R.string.video_pause_button_content_description, hmlVarC);
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(1112930578);
                strB = jqu.b(R.string.video_play_button_content_description, hmlVarC);
                ((hmw) hmlVarC).ab();
            }
            ico icoVar = ics.e;
            dkfd.a(dkl.a(iex.a(edeVar.a(dihi.a(egq.k(icoVar, 48.0f), strB, true), ibw.e), evn.a), jF, ikj.a), dkl.a(egq.k(icoVar, 24.0f), ije.g, ikj.a), 0.0f, djrs.b(djrrVar, hmlVarC), null, dljt.a(hmlVarC).j, fdaeVar, hmlVarC, ((i2 << 12) & 3670016) | 24624, 4);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dpty
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ede edeVar2 = edeVar;
                    boolean z2 = z;
                    int i4 = i;
                    dpug.c(edeVar2, z2, fdaeVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final ics icsVar, final float f, final boolean z, final boolean z2, final fdap fdapVar, final fdae fdaeVar, hml hmlVar, final int i) {
        ics icsVar2;
        int i2;
        float f2;
        boolean z3;
        boolean z4;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-217910357);
        if (i3 == 0) {
            icsVar2 = icsVar;
            i2 = (true != hmlVarC.D(icsVar2) ? 2 : 4) | i;
        } else {
            icsVar2 = icsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            f2 = f;
            i2 |= true != hmlVarC.A(f2) ? 16 : 32;
        } else {
            f2 = f;
        }
        if ((i & 384) == 0) {
            z3 = z;
            i2 |= true != hmlVarC.E(z3) ? 128 : 256;
        } else {
            z3 = z;
        }
        if ((i & 3072) == 0) {
            z4 = z2;
            i2 |= true != hmlVarC.E(z4) ? 1024 : 2048;
        } else {
            z4 = z2;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 65536 : 131072;
        }
        if ((74899 & i2) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new ebk();
                hmwVar.af(objS);
            }
            ebk ebkVar = (ebk) objS;
            hmwVar.ab();
            long j = dljt.a(hmlVarC).j;
            long j2 = dljt.a(hmlVarC).j;
            long j3 = dljt.a(hmlVarC).j;
            gst gstVarC = dtgx.c(j, j2, ijg.f(ije.d(j3), ije.c(j3), ije.b(j3), 0.3f, ije.f(j3)), hmlVarC, 1012);
            dia diaVar = dptr.a;
            dia diaVar2 = dptr.a;
            cye.b(z3, icsVar2, dae.l(diaVar2, 2), dae.m(diaVar2, 2), null, hxe.d(-1431588733, new dpuf(f2, fdapVar, z4, fdaeVar, gstVarC, ebkVar), hmlVarC), hmlVarC, ((i2 >> 6) & 14) | 200064 | ((i2 << 3) & 112), 16);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dptw
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar3 = icsVar;
                    float f3 = f;
                    boolean z5 = z;
                    boolean z6 = z2;
                    fdap fdapVar2 = fdapVar;
                    dpug.d(icsVar3, f3, z5, z6, fdapVar2, fdaeVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final ics icsVar, final boolean z, final boolean z2, final boolean z3, final boolean z4, final String str, final String str2, final float f, final fdae fdaeVar, final fdap fdapVar, final fdae fdaeVar2, hml hmlVar, final int i, final int i2) {
        int i3;
        boolean z5;
        boolean z6;
        String str3;
        String str4;
        float f2;
        fdae fdaeVar3;
        fdae fdaeVar4;
        int i4;
        fdaeVar.getClass();
        fdapVar.getClass();
        fdaeVar2.getClass();
        int i5 = i & 6;
        hml hmlVarC = hmlVar.c(1244860817);
        if (i5 == 0) {
            i3 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            z5 = z2;
            i3 |= true != hmlVarC.E(z5) ? 128 : 256;
        } else {
            z5 = z2;
        }
        if ((i & 3072) == 0) {
            z6 = z3;
            i3 |= true != hmlVarC.E(z6) ? 1024 : 2048;
        } else {
            z6 = z3;
        }
        if ((i & 24576) == 0) {
            i3 |= true != hmlVarC.E(z4) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            str3 = str;
            i3 |= true != hmlVarC.D(str3) ? 65536 : 131072;
        } else {
            str3 = str;
        }
        if ((1572864 & i) == 0) {
            str4 = str2;
            i3 |= true != hmlVarC.D(str4) ? 524288 : 1048576;
        } else {
            str4 = str2;
        }
        if ((12582912 & i) == 0) {
            f2 = f;
            i3 |= true != hmlVarC.A(f2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            f2 = f;
        }
        if ((100663296 & i) == 0) {
            fdaeVar3 = fdaeVar;
            i3 |= true != hmlVarC.F(fdaeVar3) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            fdaeVar3 = fdaeVar;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != hmlVarC.F(fdapVar) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            fdaeVar4 = fdaeVar2;
            i4 = i2 | (true != hmlVarC.F(fdaeVar4) ? 2 : 4);
        } else {
            fdaeVar4 = fdaeVar2;
            i4 = i2;
        }
        if ((306783379 & i3) == 306783378 && (i4 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            fdae fdaeVar5 = fdaeVar3;
            edj.a(icsVar, null, hxe.d(650188647, new dpuc(z, z4, fdaeVar5, f2, z5, z6, fdapVar, fdaeVar4, str3, str4), hmlVarC), hmlVarC, (i3 & 14) | 3072, 6);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dptv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    boolean z7 = z;
                    boolean z8 = z2;
                    boolean z9 = z3;
                    boolean z10 = z4;
                    String str5 = str;
                    String str6 = str2;
                    float f3 = f;
                    fdae fdaeVar6 = fdaeVar;
                    fdap fdapVar2 = fdapVar;
                    int i6 = i;
                    dpug.e(icsVar2, z7, z8, z9, z10, str5, str6, f3, fdaeVar6, fdapVar2, fdaeVar2, hmlVar2, hpy.a(i6 | 1), hpy.a(i2));
                    return fctx.a;
                }
            };
        }
    }
}
