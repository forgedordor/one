package defpackage;

import com.android.vcard.VCardConfig;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlhh {
    public static final void a(final ics icsVar, final String str, final long j, final float f, final List list, fdae fdaeVar, final boolean z, final dlhm dlhmVar, hml hmlVar, final int i) {
        int i2;
        long j2;
        hml hmlVar2;
        hmw hmwVar;
        ico icoVar;
        fdce fdceVar;
        hml hmlVar3;
        final fdae fdaeVar2 = fdaeVar;
        int i3 = i & 48;
        hml hmlVarC = hmlVar.c(-1985380311);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 16 : 32) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            j2 = j;
            i2 |= true != hmlVarC.C(j2) ? 128 : 256;
        } else {
            j2 = j;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.A(f) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(list) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar2) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.E(z) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != hmlVarC.D(dlhmVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((4793489 & i2) == 4793488 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            fdce fdceVar2 = new fdce();
            ico icoVar2 = ics.e;
            fdce fdceVar3 = fdceVar2;
            ixm ixmVarA = egk.a(ecr.a, ibw.m, hmlVarC, 0);
            int iA = dlgu.a(hmg.b(hmlVarC));
            hmw hmwVar2 = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar2.ak();
            int i4 = i2;
            ics icsVarB = icj.b(hmlVarC, icoVar2);
            fdae fdaeVar3 = jbb.a;
            hmlVarC.x();
            if (hmwVar2.z) {
                hmlVarC.j(fdaeVar3);
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
            egp egpVar = egp.a;
            hmlVarC.v(-54561377);
            Iterator it = list.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                int i6 = i4 & 112;
                Object next = it.next();
                int i7 = i5 + 1;
                if (i5 < 0) {
                    fcva.m();
                }
                dlgt dlgtVar = (dlgt) next;
                String str2 = dlgtVar.b;
                Iterator it2 = it;
                if (str2 == null) {
                    hmlVarC.v(-890558057);
                    ics icsVarE = e(icoVar2, i5, ((fcww) list).c);
                    if (z) {
                        icsVarE = icsVarE.a(efy.i(icoVar2, 0.0f, 8.0f, 1));
                    }
                    hmlVarC.v(5004770);
                    Object objS = hmwVar2.S();
                    if (i6 == 32 || objS == hmk.a) {
                        objS = new fdap() { // from class: dlgw
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj) {
                                jto jtoVar = (jto) obj;
                                jtoVar.getClass();
                                String str3 = str;
                                if (str3 != null) {
                                    jtk.k(jtoVar, str3);
                                }
                                return fctx.a;
                            }
                        };
                        hmwVar2.af(objS);
                    }
                    hmwVar2.ab();
                    ics icsVarC = jsh.c(icsVarE, false, (fdap) objS);
                    String str3 = dlgtVar.a;
                    kjm.e(j2);
                    icoVar = icoVar2;
                    fdceVar = fdceVar3;
                    hml hmlVar4 = hmlVarC;
                    hmwVar = hmwVar2;
                    dthx.b(str3, icsVarC, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new jyq(0L, kjm.d(kjl.b(j2), kjl.a(j2) * 0.85f), null, null, 0L, 0, 0L, 16777213), hmlVar4, 0, 0, 65532);
                    hmlVar3 = hmlVar4;
                    hmwVar.ab();
                } else {
                    hml hmlVar5 = hmlVarC;
                    hmwVar = hmwVar2;
                    icoVar = icoVar2;
                    fdceVar = fdceVar3;
                    hmlVar5.v(-889993981);
                    fdceVar.a = true;
                    boolean zBooleanValue = ((Boolean) hmlVar5.e(dkfh.a)).booleanValue();
                    djsq djsqVar = new djsq(str2, "animated_emoji");
                    ics icsVarE2 = e(icoVar, i5, ((fcww) list).c);
                    if (z) {
                        icsVarE2 = icsVarE2.a(efy.i(icoVar, 0.0f, 8.0f, 1));
                    }
                    ics icsVarB2 = egpVar.b(egq.k(icsVarE2, f), ibw.n);
                    hmlVar5.v(5004770);
                    Object objS2 = hmwVar.S();
                    if (i6 == 32 || objS2 == hmk.a) {
                        objS2 = new fdap() { // from class: dlgx
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj) {
                                jto jtoVar = (jto) obj;
                                jtoVar.getClass();
                                String str4 = str;
                                if (str4 != null) {
                                    jtk.k(jtoVar, str4);
                                }
                                return fctx.a;
                            }
                        };
                        hmwVar.af(objS2);
                    }
                    hmwVar.ab();
                    djsd.b(djsqVar, jsh.c(icsVarB2, false, (fdap) objS2), zBooleanValue ? new qrl() : null, hxe.d(-1798851884, new dlhb(f), hmlVar5), !zBooleanValue, 0, hmlVar5, 3072, 96);
                    hmlVar3 = hmlVar5;
                    if (i5 != r14.c - 1) {
                        egt.a(egq.k(icoVar, 2.0f), hmlVar3);
                    }
                    hmwVar.ab();
                }
                hmwVar2 = hmwVar;
                icoVar2 = icoVar;
                fdceVar3 = fdceVar;
                hmlVarC = hmlVar3;
                i5 = i7;
                it = it2;
                j2 = j;
            }
            hmlVar2 = hmlVarC;
            hmw hmwVar3 = hmwVar2;
            ico icoVar3 = icoVar2;
            fdce fdceVar4 = fdceVar3;
            hmwVar3.ab();
            dkpc dkpcVar = dlhmVar.o;
            hmlVar2.v(-54506479);
            if (dkpcVar != null) {
                hmlVar2.v(-54503300);
                boolean z2 = dlhmVar.k;
                if (z2) {
                    egt.a(egpVar.a(egq.e(icoVar3, 1.0f), 1.0f, true), hmlVar2);
                }
                hmwVar3.ab();
                ics icsVarH = egq.h(egpVar.b(icoVar3, ibw.o), 16.0f);
                if (z2) {
                    icsVarH = icsVarH.a(efs.b(icoVar3, -8.0f, -8.0f));
                }
                if (!z2) {
                    icsVarH = icsVarH.a(efs.c(icoVar3, -8.0f, 0.0f, 2));
                }
                if (diho.a(dlhmVar.i.d, hmlVar2)) {
                    icsVarH = icsVarH.a(dihi.c(icoVar3));
                }
                dkpa.e(dkpcVar, icsVarH, hmlVar2, 0);
            }
            hmwVar3.ab();
            hmlVar2.n();
            fdaeVar2 = fdaeVar;
            hob.g(Boolean.valueOf(fdceVar4.a), new dlhc(fdceVar4, fdaeVar2, null), hmlVar2);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlgy
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    String str4 = str;
                    long j3 = j;
                    float f2 = f;
                    List list2 = list;
                    fdae fdaeVar4 = fdaeVar2;
                    boolean z3 = z;
                    dlhh.a(icsVar2, str4, j3, f2, list2, fdaeVar4, z3, dlhmVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.dlhm r22, defpackage.ics r23, defpackage.ikp r24, defpackage.fdat r25, defpackage.hml r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlhh.b(dlhm, ics, ikp, fdat, hml, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.dlhm r29, final defpackage.dlhv r30, defpackage.kjl r31, defpackage.fdat r32, defpackage.hml r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlhh.c(dlhm, dlhv, kjl, fdat, hml, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.ede r52, final defpackage.dlhm r53, final defpackage.kjl r54, final defpackage.dkpc r55, defpackage.hml r56, final int r57) {
        /*
            Method dump skipped, instructions count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlhh.d(ede, dlhm, kjl, dkpc, hml, int):void");
    }

    private static final ics e(ics icsVar, int i, int i2) {
        return i2 == 1 ? efy.j(icsVar, 16.0f, 0.0f, 16.0f, 0.0f, 10) : i == 0 ? efy.j(icsVar, 16.0f, 0.0f, 0.0f, 0.0f, 14) : i == i2 + (-1) ? efy.j(icsVar, 0.0f, 0.0f, 16.0f, 0.0f, 11) : icsVar;
    }
}
