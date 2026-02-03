package defpackage;

import android.net.Uri;
import android.os.Build;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djsp {
    public static final void a(final fdae fdaeVar, String str, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hmw hmwVar;
        final String str2 = str;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(552974201);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(5004770);
            int i4 = i2 & 14;
            hmw hmwVar2 = (hmw) hmlVarC;
            Object objS = hmwVar2.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new djsk(fdaeVar);
                hmwVar2.af(objS);
            }
            hmwVar2.ab();
            ics icsVarA = itf.a(icsVar, fdaeVar, (PointerInputEventHandler) objS);
            iby ibyVar = ibw.e;
            ixm ixmVarA = ecz.a(ibyVar, false);
            int iA = djsf.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar2.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
            fdae fdaeVar2 = jbb.a;
            hmlVarC.x();
            if (hmwVar2.z) {
                hmlVarC.j(fdaeVar2);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar = jbb.e;
            hsk.b(hmlVarC, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar2.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar4);
            edf edfVar = edf.a;
            ico icoVar = ics.e;
            ics icsVarA2 = edfVar.a(egq.c(icoVar, 1.0f), ibyVar);
            ixm ixmVarA2 = edl.a(ecr.e, ibw.k, hmlVarC, 54);
            int iA2 = djsf.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar2.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarA2);
            hmlVarC.x();
            if (hmwVar2.z) {
                hmlVarC.j(fdaeVar2);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA2, fdatVar);
            hsk.b(hmlVarC, hxiVarAk2, fdatVar2);
            if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmwVar2.af(numValueOf2);
                hmlVarC.h(numValueOf2, fdatVar3);
            }
            hsk.b(hmlVarC, icsVarB2, fdatVar4);
            ics icsVarK = egq.k(icoVar, 48.0f);
            long j = ije.a;
            ics icsVarA3 = dkl.a(icsVarK, ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.3f, ije.f(j)), evn.a);
            ixm ixmVarA3 = ecz.a(ibyVar, false);
            int iA3 = djsf.a(hmg.b(hmlVarC));
            hxi hxiVarAk3 = hmwVar2.ak();
            ics icsVarB3 = icj.b(hmlVarC, icsVarA3);
            hmlVarC.x();
            if (hmwVar2.z) {
                hmlVarC.j(fdaeVar2);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA3, fdatVar);
            hsk.b(hmlVarC, hxiVarAk3, fdatVar2);
            if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(iA3))) {
                Integer numValueOf3 = Integer.valueOf(iA3);
                hmwVar2.af(numValueOf3);
                hmlVarC.h(numValueOf3, fdatVar3);
            }
            hsk.b(hmlVarC, icsVarB3, fdatVar4);
            inz inzVarB = djrs.b(djrr.eL, hmlVarC);
            long j2 = ije.d;
            dtfn.a(inzVarB, null, egq.k(icoVar, 24.0f), j2, hmlVarC, 3456, 0);
            hmlVarC.n();
            hmlVarC.v(-2068587102);
            if (str != null) {
                egt.a(egq.e(icoVar, 4.0f), hmlVarC);
                hmwVar = hmwVar2;
                str2 = str;
                dthx.b(str2, efy.e(dkl.a(icoVar, ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.3f, ije.f(j)), evn.a(50)), 8.0f, 2.0f), j2, 0L, null, null, 0L, new khk(3), 0L, 0, false, 0, 0, null, glz.d(hmlVarC).n, hmlVarC, ((i2 >> 3) & 14) | 384, 0, 65016);
                hmlVarC = hmlVarC;
            } else {
                str2 = str;
                hmwVar = hmwVar2;
            }
            hmwVar.ab();
            hmlVarC.n();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djsg
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdae fdaeVar3 = fdaeVar;
                    String str3 = str2;
                    int i5 = i;
                    djsp.a(fdaeVar3, str3, icsVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final fdae fdaeVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(721514269);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ixm ixmVarA = ecz.a(ibw.i, false);
            int iA = djsf.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVar);
            fdae fdaeVar2 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar2);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar = jbb.e;
            hsk.b(hmlVarC, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar4);
            ico icoVar = ics.e;
            ics icsVarJ = efy.j(egq.m(icoVar, 56.0f, 50.0f), 0.0f, 0.0f, 8.0f, 2.0f, 3);
            hmlVarC.v(5004770);
            int i4 = i2 & 14;
            Object objS = hmwVar.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new djsm(fdaeVar);
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ics icsVarA = itf.a(icsVarJ, fdaeVar, (PointerInputEventHandler) objS);
            ixm ixmVarA2 = ecz.a(ibw.e, false);
            int iA2 = djsf.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarA);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar2);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA2, fdatVar);
            hsk.b(hmlVarC, hxiVarAk2, fdatVar2);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmwVar.af(numValueOf2);
                hmlVarC.h(numValueOf2, fdatVar3);
            }
            hsk.b(hmlVarC, icsVarB2, fdatVar4);
            ics icsVarM = egq.m(icoVar, 32.0f, 20.0f);
            long j = ije.a;
            dtfn.a(djrs.b(djrr.eK, hmlVarC), jqu.b(R.string.masked_glide_image_toggle, hmlVarC), dkl.a(icsVarM, ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.3f, ije.f(j)), evn.a(50)), ije.d, hmlVarC, 3072, 0);
            hmlVarC.n();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djsi
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdae fdaeVar3 = fdaeVar;
                    int i5 = i;
                    djsp.b(fdaeVar3, icsVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final Uri uri, final String str, final ics icsVar, final Uri uri2, final Uri uri3, iby ibyVar, final iva ivaVar, iva ivaVar2, float f, final Integer num, final Integer num2, final djse djseVar, final rok rokVar, fdae fdaeVar, final String str2, final fdae fdaeVar2, boolean z, hml hmlVar, final int i, final int i2, final int i3) {
        int i4;
        Uri uri4;
        int i5;
        Integer num3;
        boolean z2;
        boolean z3;
        int i6;
        ics icsVarA;
        hmw hmwVar;
        edf edfVar;
        boolean z4;
        hml hmlVar2;
        final fdae fdaeVar3;
        final boolean z5;
        final iby ibyVar2;
        final iva ivaVar3;
        final float f2;
        boolean z6;
        hml hmlVarC = hmlVar.c(-1407448235);
        if ((i & 6) == 0) {
            i4 = (true != hmlVarC.F(uri) ? 2 : 4) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= true != hmlVarC.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i4 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            uri4 = uri2;
            i4 |= true != hmlVarC.F(uri4) ? 1024 : 2048;
        } else {
            uri4 = uri2;
        }
        if ((i & 24576) == 0) {
            i4 |= true != hmlVarC.F(uri3) ? 8192 : 16384;
        }
        int i7 = i4 | 1769472;
        if ((i & 12582912) == 0) {
            i5 = 12582912;
            i7 |= true != hmlVarC.D(ivaVar) ? 4194304 : 8388608;
        } else {
            i5 = 12582912;
        }
        int i8 = i2 | 6;
        if ((i2 & 48) == 0) {
            i8 |= true != hmlVarC.D(num) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            num3 = num2;
            i8 |= true != hmlVarC.D(num3) ? 128 : 256;
        } else {
            num3 = num2;
        }
        int i9 = 1797120 | i8;
        if ((i2 & i5) == 0) {
            z2 = true;
            i9 |= true == ((i2 & 16777216) == 0 ? hmlVarC.D(djseVar) : hmlVarC.F(djseVar)) ? 8388608 : 4194304;
        } else {
            z2 = true;
        }
        if ((i2 & 100663296) == 0) {
            i9 |= z2 != hmlVarC.F(rokVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((i2 & 805306368) == 0) {
            i9 |= true != hmlVarC.F(fdaeVar) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        int i10 = i9;
        if ((i3 & 6) == 0) {
            z3 = true;
            i6 = i3 | (true != hmlVarC.D(str2) ? 2 : 4);
        } else {
            z3 = true;
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= z3 == hmlVarC.F(fdaeVar2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= z3 == hmlVarC.E(z) ? 256 : 128;
        }
        int i11 = 905969664 | i7;
        if ((i11 & 306783379) == 306783378 && (i10 & 306783379) == 306783378 && (i6 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            ibyVar2 = ibyVar;
            f2 = f;
            fdaeVar3 = fdaeVar;
            z5 = z;
            hmlVar2 = hmlVarC;
            ivaVar3 = ivaVar2;
        } else {
            iby ibyVar3 = ibw.e;
            iva ivaVar4 = iuz.a;
            if (z) {
                ico icoVar = ics.e;
                icoVar.getClass();
                icsVarA = icsVar.a(icj.g(icoVar, new dktn()));
            } else {
                icsVarA = icsVar;
            }
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = djsf.a(hmg.b(hmlVarC));
            hmw hmwVar2 = (hmw) hmlVarC;
            int i12 = i6;
            hxi hxiVarAk = hmwVar2.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
            fdae fdaeVar4 = jbb.a;
            hmlVarC.x();
            if (hmwVar2.z) {
                hmlVarC.j(fdaeVar4);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar2.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            edf edfVar2 = edf.a;
            hsf hsfVarB = ddu.b((fdaeVar2 != null || z) ? 80.0f : 0.0f, null, hmlVarC, 384, 10);
            ico icoVar2 = ics.e;
            ics icsVarD = egq.d(icoVar2, 1.0f);
            if (Build.VERSION.SDK_INT >= 31) {
                hmlVarC.v(-1803363854);
                if (fdaeVar2 != null) {
                    z6 = z;
                } else if (z) {
                    z6 = true;
                } else {
                    hmwVar = hmwVar2;
                    edfVar = edfVar2;
                    z4 = false;
                    hmwVar.ab();
                }
                float fD = d(hsfVarB);
                hmwVar = hmwVar2;
                edfVar = edfVar2;
                icsVarD = icsVarD.a(dkl.a(iep.a(icoVar2, fD, fD, new ieq(ieq.a).b), glz.a(hmlVarC).v, ikj.a));
                z4 = z6;
                hmwVar.ab();
            } else {
                hmwVar = hmwVar2;
                edfVar = edfVar2;
                hmlVarC.v(-1803135198);
                long j = glz.a(hmlVarC).v;
                long jF = ijg.f(ije.d(j), ije.c(j), ije.b(j), d(hsfVarB) / 80.0f, ije.f(j));
                icsVarD = icsVarD.a(new ick("com.google.android.libraries.communications.ux.components.image.foreground", new ije(jF), new djso(jF)));
                hmwVar.ab();
                z4 = z;
            }
            edf edfVar3 = edfVar;
            boolean z7 = z4;
            djrv.a(uri, str, icsVarD, uri4, uri3, ibyVar3, ivaVar, ivaVar4, 1.0f, num, num3, null, null, null, djseVar, rokVar, hmlVarC, i11 & 2147482750, i10 & 268435454, 0);
            hmlVar2 = hmlVarC;
            hmlVar2.v(-473782708);
            if (fdaeVar2 != null) {
                a(fdaeVar2, str2, egq.c(icoVar2, 1.0f), hmlVar2, 384 | ((i12 >> 3) & 14) | ((i12 << 3) & 112));
            }
            hmwVar.ab();
            hmlVar2.v(-473778550);
            if (fdaeVar != null) {
                fdaeVar3 = fdaeVar;
                b(fdaeVar3, edfVar3.a(egq.c(icoVar2, 1.0f), ibw.i), hmlVar2, (i10 >> 27) & 14);
            } else {
                fdaeVar3 = fdaeVar;
            }
            hmwVar.ab();
            hmlVar2.n();
            z5 = z7;
            ibyVar2 = ibyVar3;
            ivaVar3 = ivaVar4;
            f2 = 1.0f;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djsh
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    Uri uri5 = uri;
                    String str3 = str;
                    ics icsVar2 = icsVar;
                    Uri uri6 = uri2;
                    Uri uri7 = uri3;
                    iby ibyVar4 = ibyVar2;
                    iva ivaVar5 = ivaVar;
                    iva ivaVar6 = ivaVar3;
                    float f3 = f2;
                    Integer num4 = num;
                    Integer num5 = num2;
                    djse djseVar2 = djseVar;
                    rok rokVar2 = rokVar;
                    fdae fdaeVar5 = fdaeVar3;
                    String str4 = str2;
                    int i13 = i;
                    fdae fdaeVar6 = fdaeVar2;
                    int i14 = i2;
                    int iA2 = hpy.a(i13 | 1);
                    int iA3 = hpy.a(i14);
                    djsp.c(uri5, str3, icsVar2, uri6, uri7, ibyVar4, ivaVar5, ivaVar6, f3, num4, num5, djseVar2, rokVar2, fdaeVar5, str4, fdaeVar6, z5, (hml) obj, iA2, iA3, hpy.a(i3));
                    return fctx.a;
                }
            };
        }
    }

    private static final float d(hsf hsfVar) {
        return ((kir) hsfVar.a()).a;
    }
}
