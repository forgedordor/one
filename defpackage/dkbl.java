package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkbl {
    /* JADX WARN: Type inference failed for: r0v9, types: [dew, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v12, types: [dew, java.lang.Object] */
    public static final void a(final String str, djrr djrrVar, final String str2, final boolean z, final fdap fdapVar, hml hmlVar, final int i) {
        int i2;
        Object objE;
        hmw hmwVar;
        Object objE2;
        int i3;
        final djrr djrrVar2;
        hzg hzgVarA;
        fdap fdapVarK;
        hzg hzgVarB;
        hmw hmwVar2;
        int i4 = i & 6;
        hml hmlVarC = hmlVar.c(917158681);
        if (i4 == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.B(djrrVar.ordinal()) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(str2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.E(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
            djrrVar2 = djrrVar;
        } else {
            dhk dhkVarD = dhy.d(Boolean.valueOf(z), null, hmlVarC, (i2 >> 9) & 14, 2);
            dkbd dkbdVar = new dkbd(dhkVarD);
            boolean zBooleanValue = ((Boolean) dhkVarD.f()).booleanValue();
            hmlVarC.v(764178251);
            long jF = f(zBooleanValue, hmlVarC);
            hmw hmwVar3 = (hmw) hmlVarC;
            hmwVar3.ab();
            ilg ilgVarF = ije.f(jF);
            boolean zD = hmlVarC.D(ilgVarF);
            Object objS = hmwVar3.S();
            if (zD || objS == hmk.a) {
                objS = cys.a.invoke(ilgVarF);
                hmwVar3.af(objS);
            }
            dib dibVar = (dib) objS;
            if (dhkVarD.t()) {
                hmlVarC.v(1666852333);
                hmwVar3.ab();
                objE = dhkVarD.e();
            } else {
                hmlVarC.v(1666598288);
                boolean zD2 = hmlVarC.D(dhkVarD);
                objE = hmwVar3.S();
                if (zD2 || objE == hmk.a) {
                    hzgVarA = hzf.a();
                    fdapVarK = hzgVarA != null ? hzgVarA.k() : null;
                    hzgVarB = hzf.b(hzgVarA);
                    try {
                        Object objE3 = dhkVarD.e();
                        hzf.e(hzgVarA, hzgVarB, fdapVarK);
                        hmwVar3.af(objE3);
                        objE = objE3;
                    } finally {
                    }
                }
                hmwVar3.ab();
            }
            boolean zBooleanValue2 = ((Boolean) objE).booleanValue();
            hmlVarC.v(764178251);
            long jF2 = f(zBooleanValue2, hmlVarC);
            hmwVar3.ab();
            ije ijeVar = new ije(jF2);
            boolean zD3 = hmlVarC.D(dhkVarD);
            Object objS2 = hmwVar3.S();
            if (zD3 || objS2 == hmk.a) {
                dkaw dkawVar = new dkaw(dhkVarD);
                hxn hxnVar = hrp.a;
                objS2 = new hnt(dkawVar, null);
                hmwVar3.af(objS2);
            }
            boolean zBooleanValue3 = ((Boolean) ((hsf) objS2).a()).booleanValue();
            hmlVarC.v(764178251);
            long jF3 = f(zBooleanValue3, hmlVarC);
            hmwVar3.ab();
            ije ijeVar2 = new ije(jF3);
            boolean zD4 = hmlVarC.D(dhkVarD);
            Object objS3 = hmwVar3.S();
            if (zD4 || objS3 == hmk.a) {
                dkax dkaxVar = new dkax(dhkVarD);
                hxn hxnVar2 = hrp.a;
                objS3 = new hnt(dkaxVar, null);
                hmwVar3.af(objS3);
            }
            hsf hsfVarF = dhy.f(dhkVarD, ijeVar, ijeVar2, dkbdVar.a(((hsf) objS3).a(), hmlVarC, 0), dibVar, hmlVarC, 0);
            dkbe dkbeVar = dkbe.a;
            dib dibVar2 = diu.c;
            if (dhkVarD.t()) {
                hmwVar = hmwVar3;
                hmlVarC.v(1666852333);
                hmwVar.ab();
                objE2 = dhkVarD.e();
            } else {
                hmlVarC.v(1666598288);
                boolean zD5 = hmlVarC.D(dhkVarD);
                objE2 = hmwVar3.S();
                if (zD5 || objE2 == hmk.a) {
                    hzgVarA = hzf.a();
                    fdapVarK = hzgVarA != null ? hzgVarA.k() : null;
                    hzgVarB = hzf.b(hzgVarA);
                    try {
                        Object objE4 = dhkVarD.e();
                        hzf.e(hzgVarA, hzgVarB, fdapVarK);
                        hmwVar2 = hmwVar3;
                        hmwVar2.af(objE4);
                        objE2 = objE4;
                    } finally {
                    }
                } else {
                    hmwVar2 = hmwVar3;
                }
                hmwVar2.ab();
                hmwVar = hmwVar2;
            }
            boolean zBooleanValue4 = ((Boolean) objE2).booleanValue();
            hmlVarC.v(606798346);
            float fG = g(zBooleanValue4, hmlVarC);
            hmwVar.ab();
            kir kirVar = new kir(fG);
            boolean zD6 = hmlVarC.D(dhkVarD);
            Object objS4 = hmwVar.S();
            if (zD6 || objS4 == hmk.a) {
                dkay dkayVar = new dkay(dhkVarD);
                hxn hxnVar3 = hrp.a;
                objS4 = new hnt(dkayVar, null);
                hmwVar.af(objS4);
            }
            boolean zBooleanValue5 = ((Boolean) ((hsf) objS4).a()).booleanValue();
            hmlVarC.v(606798346);
            float fG2 = g(zBooleanValue5, hmlVarC);
            hmwVar.ab();
            kir kirVar2 = new kir(fG2);
            boolean zD7 = hmlVarC.D(dhkVarD);
            Object objS5 = hmwVar.S();
            if (zD7 || objS5 == hmk.a) {
                dkaz dkazVar = new dkaz(dhkVarD);
                hxn hxnVar4 = hrp.a;
                i3 = i2;
                objS5 = new hnt(dkazVar, null);
                hmwVar.af(objS5);
            } else {
                i3 = i2;
            }
            ics icsVarA = iex.a(ics.e, evn.b(((kir) dhy.f(dhkVarD, kirVar, kirVar2, dkbeVar.a(((hsf) objS5).a(), hmlVarC, 0), dibVar2, hmlVarC, 0).a()).a));
            hmlVarC.v(1849434622);
            Object objS6 = hmwVar.S();
            Object obj = hmk.a;
            if (objS6 == obj) {
                objS6 = new ebk();
                hmwVar.af(objS6);
            }
            ebk ebkVar = (ebk) objS6;
            hmwVar.ab();
            jrw jrwVar = new jrw(0);
            hmlVarC.v(-1633490746);
            boolean z2 = (i3 & 57344) == 16384;
            boolean z3 = (i3 & 14) == 4;
            Object objS7 = hmwVar.S();
            if ((z2 | z3) || objS7 == obj) {
                objS7 = new fdae() { // from class: dkau
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        fdapVar.invoke(str);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS7);
            }
            hmwVar.ab();
            djrrVar2 = djrrVar;
            dtfr.a(hxe.d(-1906523785, new dkba(str2), hmlVarC), dli.c(icsVarA, ebkVar, null, false, null, jrwVar, (fdae) objS7, 12), null, null, hxe.d(408540795, new dkbb(djrrVar2, z), hmlVarC), hxe.d(987306940, new dkbc(z), hmlVarC), dtfp.a(((ije) hsfVarF.a()).i, hmlVarC, 510), hmlVarC, 221190, 396);
            hmlVarC = hmlVarC;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkav
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    String str3 = str;
                    djrr djrrVar3 = djrrVar2;
                    String str4 = str2;
                    boolean z4 = z;
                    dkbl.a(str3, djrrVar3, str4, z4, fdapVar, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final boolean z, hml hmlVar, final int i) {
        int i2;
        ddz ddzVarC;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(140482802);
        if (i3 == 0) {
            i2 = (true != hmlVarC.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            float f = true != z ? 0.0f : 1.0f;
            hmlVarC.v(1859992685);
            if (z) {
                ddzVarC = new dgg(0);
            } else {
                hmlVarC.v(-98570256);
                dljl dljlVar = dljt.d(hmlVarC).q;
                ddzVarC = dea.c(150, 0, dljt.d(hmlVarC).r.d, 2);
                ((hmw) hmlVarC).ab();
            }
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            hsf hsfVarC = ddu.c(f, ddzVarC, null, hmlVarC, 0, 28);
            qrs qrsVarD = qsm.d(new qrx(R.raw.lottie_checkmark), hmlVarC);
            final qrk qrkVarA = qqp.a(qrsVarD.a(), z, false, null, 0.0f, 0, hmlVarC, (i2 << 3) & 112, 1020);
            qsa qsaVarA = qsc.a(new qse[]{qsc.b(qok.a, Integer.valueOf(ijg.b(glz.a(hmlVarC).q)), new String[]{"**"}, hmlVarC)}, hmlVarC);
            final Float fC = dljt.c(hmlVarC);
            ics icsVarA = ien.a(ics.e, ((Number) hsfVarC.a()).floatValue());
            qnm qnmVarA = qrsVarD.a();
            hmlVarC.v(-1633490746);
            boolean zD = hmlVarC.D(fC) | hmlVarC.D(qrkVarA);
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = new fdae() { // from class: dkas
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        Float f2 = fC;
                        return Float.valueOf(f2 != null ? f2.floatValue() : ((Number) qrkVarA.a()).floatValue());
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            qrj.b(qnmVarA, (fdae) objS, icsVarA, 0, qsaVarA, null, null, false, hmlVarC, VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS, 0, 7928);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkat
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dkbl.b(z, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [dew, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [dew, java.lang.Object] */
    public static final void c(final djrr djrrVar, final boolean z, hml hmlVar, final int i) {
        int i2;
        Object objE;
        Object objE2;
        hzg hzgVarA;
        fdap fdapVarK;
        hzg hzgVarB;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2027350783);
        if (i3 == 0) {
            i2 = (true != hmlVarC.B(djrrVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dhk dhkVarD = dhy.d(Boolean.valueOf(z), null, hmlVarC, (i2 >> 3) & 14, 2);
            dkbj dkbjVar = new dkbj(dhkVarD);
            boolean zBooleanValue = ((Boolean) dhkVarD.f()).booleanValue();
            hmlVarC.v(-1031697558);
            long jH = h(zBooleanValue, hmlVarC);
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            ilg ilgVarF = ije.f(jH);
            boolean zD = hmlVarC.D(ilgVarF);
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = cys.a.invoke(ilgVarF);
                hmwVar.af(objS);
            }
            dib dibVar = (dib) objS;
            if (dhkVarD.t()) {
                hmlVarC.v(1666852333);
                hmwVar.ab();
                objE = dhkVarD.e();
            } else {
                hmlVarC.v(1666598288);
                boolean zD2 = hmlVarC.D(dhkVarD);
                objE = hmwVar.S();
                if (zD2 || objE == hmk.a) {
                    hzgVarA = hzf.a();
                    fdapVarK = hzgVarA != null ? hzgVarA.k() : null;
                    hzgVarB = hzf.b(hzgVarA);
                    try {
                        Object objE3 = dhkVarD.e();
                        hzf.e(hzgVarA, hzgVarB, fdapVarK);
                        hmwVar.af(objE3);
                        objE = objE3;
                    } finally {
                    }
                }
                hmwVar.ab();
            }
            boolean zBooleanValue2 = ((Boolean) objE).booleanValue();
            hmlVarC.v(-1031697558);
            long jH2 = h(zBooleanValue2, hmlVarC);
            hmwVar.ab();
            ije ijeVar = new ije(jH2);
            boolean zD3 = hmlVarC.D(dhkVarD);
            Object objS2 = hmwVar.S();
            if (zD3 || objS2 == hmk.a) {
                dkbf dkbfVar = new dkbf(dhkVarD);
                hxn hxnVar = hrp.a;
                objS2 = new hnt(dkbfVar, null);
                hmwVar.af(objS2);
            }
            boolean zBooleanValue3 = ((Boolean) ((hsf) objS2).a()).booleanValue();
            hmlVarC.v(-1031697558);
            long jH3 = h(zBooleanValue3, hmlVarC);
            hmwVar.ab();
            ije ijeVar2 = new ije(jH3);
            boolean zD4 = hmlVarC.D(dhkVarD);
            Object objS3 = hmwVar.S();
            if (zD4 || objS3 == hmk.a) {
                dkbg dkbgVar = new dkbg(dhkVarD);
                hxn hxnVar2 = hrp.a;
                objS3 = new hnt(dkbgVar, null);
                hmwVar.af(objS3);
            }
            hsf hsfVarF = dhy.f(dhkVarD, ijeVar, ijeVar2, dkbjVar.a(((hsf) objS3).a(), hmlVarC, 0), dibVar, hmlVarC, 0);
            dkbk dkbkVar = new dkbk(dhkVarD);
            boolean zBooleanValue4 = ((Boolean) dhkVarD.f()).booleanValue();
            hmlVarC.v(2113014335);
            long jI = i(zBooleanValue4, hmlVarC);
            hmwVar.ab();
            ilg ilgVarF2 = ije.f(jI);
            boolean zD5 = hmlVarC.D(ilgVarF2);
            Object objS4 = hmwVar.S();
            if (zD5 || objS4 == hmk.a) {
                objS4 = cys.a.invoke(ilgVarF2);
                hmwVar.af(objS4);
            }
            dib dibVar2 = (dib) objS4;
            if (dhkVarD.t()) {
                hmlVarC.v(1666852333);
                hmwVar.ab();
                objE2 = dhkVarD.e();
            } else {
                hmlVarC.v(1666598288);
                boolean zD6 = hmlVarC.D(dhkVarD);
                objE2 = hmwVar.S();
                if (zD6 || objE2 == hmk.a) {
                    hzgVarA = hzf.a();
                    fdapVarK = hzgVarA != null ? hzgVarA.k() : null;
                    hzgVarB = hzf.b(hzgVarA);
                    try {
                        Object objE4 = dhkVarD.e();
                        hzf.e(hzgVarA, hzgVarB, fdapVarK);
                        hmwVar.af(objE4);
                        objE2 = objE4;
                    } finally {
                    }
                }
                hmwVar.ab();
            }
            boolean zBooleanValue5 = ((Boolean) objE2).booleanValue();
            hmlVarC.v(2113014335);
            long jI2 = i(zBooleanValue5, hmlVarC);
            hmwVar.ab();
            ije ijeVar3 = new ije(jI2);
            boolean zD7 = hmlVarC.D(dhkVarD);
            Object objS5 = hmwVar.S();
            if (zD7 || objS5 == hmk.a) {
                dkbh dkbhVar = new dkbh(dhkVarD);
                hxn hxnVar3 = hrp.a;
                objS5 = new hnt(dkbhVar, null);
                hmwVar.af(objS5);
            }
            boolean zBooleanValue6 = ((Boolean) ((hsf) objS5).a()).booleanValue();
            hmlVarC.v(2113014335);
            long jI3 = i(zBooleanValue6, hmlVarC);
            hmwVar.ab();
            ije ijeVar4 = new ije(jI3);
            boolean zD8 = hmlVarC.D(dhkVarD);
            Object objS6 = hmwVar.S();
            if (zD8 || objS6 == hmk.a) {
                dkbi dkbiVar = new dkbi(dhkVarD);
                hxn hxnVar4 = hrp.a;
                objS6 = new hnt(dkbiVar, null);
                hmwVar.af(objS6);
            }
            hsf hsfVarF2 = dhy.f(dhkVarD, ijeVar3, ijeVar4, dkbkVar.a(((hsf) objS6).a(), hmlVarC, 0), dibVar2, hmlVarC, 0);
            ico icoVar = ics.e;
            ics icsVarA = dkl.a(egq.k(icoVar, 40.0f), ((ije) hsfVarF.a()).i, evn.a);
            ixm ixmVarA = ecz.a(ibw.e, false);
            int iA = dkap.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
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
            dtfn.b(djrs.a(djrrVar, hmlVarC), null, egq.k(icoVar, 24.0f), ((ije) hsfVarF2.a()).i, hmlVarC, 384, 0);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkar
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djrr djrrVar2 = djrrVar;
                    int i4 = i;
                    dkbl.c(djrrVar2, z, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final dkbn dkbnVar, final ics icsVar, hml hmlVar, final int i) {
        int i2 = i & 6;
        hml hmlVarC = hmlVar.c(1165177695);
        int i3 = i2 == 0 ? (true != hmlVarC.D(dkbnVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            List<dkbm> list = dkbnVar.b;
            if (list.isEmpty()) {
                throw new IllegalArgumentException("SelectListItemUiData.items must not be empty.");
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (hashSet.add(((dkbm) obj).a)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() != list.size()) {
                throw new IllegalArgumentException("SelectListItemOption.id must be unique.");
            }
            ics icsVarA = iex.a(icsVar, glz.c(hmlVarC).f);
            ixm ixmVarA = edl.a(ecr.g(2.0f), ibw.j, hmlVarC, 6);
            int iA = dkap.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
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
            hmlVarC.v(1244136464);
            for (dkbm dkbmVar : list) {
                String str = dkbmVar.a;
                a(str, dkbmVar.b, dkbmVar.c, dkbnVar.a.contains(str), dkbnVar.c, hmlVarC, 0);
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkaq
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dkbn dkbnVar2 = dkbnVar;
                    int i4 = i;
                    dkbl.d(dkbnVar2, icsVar, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final /* synthetic */ dia e(boolean z, hml hmlVar) {
        int i;
        hmlVar.v(1180463392);
        if (z) {
            hmlVar.v(-7179862);
            dljl dljlVar = dljt.d(hmlVar).q;
            hmlVar.o();
            i = 250;
        } else {
            hmlVar.v(-7118389);
            dljl dljlVar2 = dljt.d(hmlVar).q;
            hmlVar.o();
            i = 150;
        }
        dia diaVarC = dea.c(i, 0, dljt.d(hmlVar).r.d, 2);
        hmlVar.o();
        return diaVarC;
    }

    private static final long f(boolean z, hml hmlVar) {
        long j;
        long jF;
        hmlVar.v(576990186);
        if (z) {
            hmlVar.v(436791869);
            long j2 = glz.a(hmlVar).t;
            jF = ijg.f(ije.d(j2), ije.c(j2), ije.b(j2), 0.16f, ije.f(j2));
            ((hmw) hmlVar).ab();
        } else {
            hmlVar.v(436793133);
            boolean zBooleanValue = ((Boolean) dljt.b(hmlVar).c.invoke()).booleanValue();
            hmw hmwVar = (hmw) hmlVar;
            hmwVar.ab();
            if (zBooleanValue) {
                hmlVar.v(436795185);
                j = glz.a(hmlVar).p;
                hmwVar.ab();
            } else {
                hmlVar.v(436795873);
                boolean zH = dljt.h(hmlVar);
                hmwVar.ab();
                if (zH) {
                    hmlVar.v(436797562);
                    j = glz.a(hmlVar).F;
                    hmwVar.ab();
                } else {
                    hmlVar.v(436799313);
                    j = glz.a(hmlVar).p;
                    hmwVar.ab();
                }
            }
            jF = j;
        }
        ((hmw) hmlVar).ab();
        return jF;
    }

    private static final float g(boolean z, hml hmlVar) {
        hmlVar.v(909057390);
        ((hmw) hmlVar).ab();
        return true != z ? 4.0f : 28.0f;
    }

    private static final long h(boolean z, hml hmlVar) {
        long j;
        hmlVar.v(-1814403322);
        if (z) {
            hmlVar.v(-725852602);
            j = glz.a(hmlVar).d;
            ((hmw) hmlVar).ab();
        } else {
            hmlVar.v(-725793144);
            j = glz.a(hmlVar).F;
            ((hmw) hmlVar).ab();
        }
        ((hmw) hmlVar).ab();
        return j;
    }

    private static final long i(boolean z, hml hmlVar) {
        long j;
        hmlVar.v(-1592782821);
        if (z) {
            hmlVar.v(205758458);
            j = glz.a(hmlVar).b;
            ((hmw) hmlVar).ab();
        } else {
            hmlVar.v(205809267);
            j = glz.a(hmlVar).s;
            ((hmw) hmlVar).ab();
        }
        ((hmw) hmlVar).ab();
        return j;
    }
}
