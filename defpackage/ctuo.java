package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctuo {
    public static final ctte a(hsf hsfVar) {
        return (ctte) hsfVar.a();
    }

    public static final void b(final abs absVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-615875323);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(absVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (absVar == null) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: cttg
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            ctuo.b(null, (hml) obj, hpy.a(i | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            final lvj lvjVar = (lvj) hmlVarC.e(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            int i4 = adc.a;
            ach achVarA = adc.a(hmlVarC);
            if (achVarA == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            final ace aceVarC = achVarA.c();
            hmlVarC.v(-1746271574);
            boolean zF = hmlVarC.F(aceVarC) | hmlVarC.F(lvjVar) | hmlVarC.F(absVar);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new fdap() { // from class: ctth
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ((hny) obj).getClass();
                        ace aceVar = aceVarC;
                        lvj lvjVar2 = lvjVar;
                        abs absVar2 = absVar;
                        aceVar.b(lvjVar2, absVar2);
                        return new ctty(absVar2);
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hob.c(absVar, (fdap) objS, hmlVarC);
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: ctti
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    ctuo.b(absVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final ctrn ctrnVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1689376971);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(ctrnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dthx.b(jqu.b(R.string.group_rename_choose_unique_group_name_notice, hmlVarC), efy.j(ics.e, 0.0f, 16.0f, 0.0f, 0.0f, 13), glz.a(hmlVarC).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).n, hmlVarC, 48, 0, 65528);
            hmlVarC = hmlVarC;
            String strB = jqu.b(R.string.group_rename_duplicate_legacy_group_link, hmlVarC);
            hmlVarC.v(1632920646);
            jul julVar = new jul((byte[]) null);
            julVar.a(new jxx(glz.a(hmlVarC).a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            julVar.f(strB);
            julVar.b();
            juo juoVarB = julVar.b();
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            jyq jyqVar = glz.d(hmlVarC).l;
            hmlVarC.v(5004770);
            int i4 = i2 & 14;
            Object objS = hmwVar.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new fdap() { // from class: cttm
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ((Integer) obj).intValue();
                        ctrnVar.a.invoke();
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            exl.a(juoVarB, null, jyqVar, false, 0, 0, null, (fdap) objS, hmlVarC, 0, 122);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cttn
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    ctuo.c(ctrnVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(fdae fdaeVar, final cttd cttdVar, hml hmlVar, final int i) {
        int i2;
        long j;
        long j2;
        final fdae fdaeVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1172245726);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? hmlVarC.D(cttdVar) : hmlVarC.F(cttdVar)) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            fdaeVar2 = fdaeVar;
        } else {
            ics icsVarK = egq.k(gks.a(ics.e), 36.0f);
            boolean z = cttdVar.a;
            if (z) {
                hmlVarC.v(-6243744);
                j = glz.a(hmlVarC).c;
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(-6170429);
                j = glz.a(hmlVarC).D;
                ((hmw) hmlVarC).ab();
            }
            if (z) {
                hmlVarC.v(-6029410);
                j2 = glz.a(hmlVarC).d;
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(-5954297);
                j2 = glz.a(hmlVarC).q;
                ((hmw) hmlVarC).ab();
            }
            fdaeVar2 = fdaeVar;
            dtfk.a(fdaeVar2, icsVarK, false, null, dtfh.a(j, j2, hmlVarC, 12), ctrl.c, hmlVarC, (i2 & 14) | 1572864, 44);
            hmlVarC = hmlVarC;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cttt
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdae fdaeVar3 = fdaeVar2;
                    int i4 = i;
                    ctuo.d(fdaeVar3, cttdVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(dkri dkriVar, hml hmlVar, final int i) {
        int i2;
        final dkri dkriVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1137127037);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dkriVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            dkriVar2 = dkriVar;
        } else {
            ico icoVar = ics.e;
            ics icsVarC = dihi.c(efy.j(icoVar, 0.0f, jqr.a(R.dimen.group_name_top_padding, hmlVarC), 0.0f, 0.0f, 13));
            ixm ixmVarA = egk.a(ecr.a, ibw.m, hmlVarC, 0);
            int iA = cttf.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarC);
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
            dkriVar2 = dkriVar;
            dkrg.a(dkriVar2, egq.e(icoVar, 40.0f), 0, false, hmlVarC, (i2 & 14) | 48, 12);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cttw
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    ctuo.e(dkriVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(final dkri dkriVar, ctte ctteVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        ico icoVar;
        fdat fdatVar;
        fdat fdatVar2;
        hmw hmwVar;
        fdat fdatVar3;
        fdae fdaeVar;
        fdat fdatVar4;
        iby ibyVar;
        egp egpVar;
        float f;
        final ctte ctteVar2 = ctteVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(158940128);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(dkriVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(ctteVar2) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            ico icoVar2 = ics.e;
            ics icsVarJ = efy.j(icoVar2, 0.0f, jqr.a(R.dimen.group_name_top_padding, hmlVarC), 0.0f, 0.0f, 13);
            ixm ixmVarA = egk.a(ecr.a, ibw.n, hmlVarC, 48);
            int iA = cttf.a(hmg.b(hmlVarC));
            hmw hmwVar2 = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar2.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarJ);
            fdae fdaeVar2 = jbb.a;
            hmlVarC.x();
            if (hmwVar2.z) {
                hmlVarC.j(fdaeVar2);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar5 = jbb.e;
            hsk.b(hmlVarC, ixmVarA, fdatVar5);
            fdat fdatVar6 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar6);
            fdat fdatVar7 = jbb.f;
            if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar2.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar7);
            }
            fdat fdatVar8 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar8);
            egp egpVar2 = egp.a;
            ics icsVarA = egpVar2.a(icoVar2, 0.1f, true);
            iby ibyVar2 = ibw.a;
            int i4 = i2;
            ixm ixmVarA2 = ecz.a(ibyVar2, false);
            int iA2 = cttf.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar2.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarA);
            hmlVarC.x();
            if (hmwVar2.z) {
                hmlVarC.j(fdaeVar2);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA2, fdatVar5);
            hsk.b(hmlVarC, hxiVarAk2, fdatVar6);
            if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmwVar2.af(numValueOf2);
                hmlVarC.h(numValueOf2, fdatVar7);
            }
            hsk.b(hmlVarC, icsVarB2, fdatVar8);
            hmlVarC.n();
            ixm ixmVarA3 = ecz.a(ibyVar2, false);
            int iA3 = cttf.a(hmg.b(hmlVarC));
            hxi hxiVarAk3 = hmwVar2.ak();
            ics icsVarB3 = icj.b(hmlVarC, icoVar2);
            hmlVarC.x();
            if (hmwVar2.z) {
                hmlVarC.j(fdaeVar2);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA3, fdatVar5);
            hsk.b(hmlVarC, hxiVarAk3, fdatVar6);
            if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(iA3))) {
                Integer numValueOf3 = Integer.valueOf(iA3);
                hmwVar2.af(numValueOf3);
                hmlVarC.h(numValueOf3, fdatVar7);
            }
            hsk.b(hmlVarC, icsVarB3, fdatVar8);
            edf edfVar = edf.a;
            dkqr.h(dkriVar, dihi.c(egq.h(icoVar2, 96.0f)), hmlVarC, i4 & 14);
            hmlVarC.v(1657661866);
            int i5 = ctteVar2.d;
            if (i5 > 0) {
                iby ibyVar3 = ibw.e;
                ics icsVarA2 = iex.a(egq.k(edfVar.a(icoVar2, ibw.i), 48.0f), evn.a);
                long j = ije.a;
                ics icsVarA3 = dkl.a(icsVarA2, ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.6f, ije.f(j)), ikj.a);
                ixm ixmVarA4 = ecz.a(ibyVar3, false);
                int iA4 = cttf.a(hmg.b(hmlVarC));
                hxi hxiVarAk4 = hmwVar2.ak();
                ics icsVarB4 = icj.b(hmlVarC, icsVarA3);
                hmlVarC.x();
                if (hmwVar2.z) {
                    hmlVarC.j(fdaeVar2);
                } else {
                    hmlVarC.z();
                }
                hsk.b(hmlVarC, ixmVarA4, fdatVar5);
                hsk.b(hmlVarC, hxiVarAk4, fdatVar6);
                if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(iA4))) {
                    Integer numValueOf4 = Integer.valueOf(iA4);
                    hmwVar2.af(numValueOf4);
                    hmlVarC.h(numValueOf4, fdatVar7);
                }
                hsk.b(hmlVarC, icsVarB4, fdatVar8);
                String strG = a.g(i5, "+");
                long jEs = ((kio) hmlVarC.e(jmh.e)).es(24.0f);
                fdaeVar = fdaeVar2;
                fdatVar4 = fdatVar5;
                fdatVar2 = fdatVar8;
                ibyVar = ibyVar2;
                egpVar = egpVar2;
                fdatVar3 = fdatVar7;
                f = 0.1f;
                fdatVar = fdatVar6;
                hmwVar = hmwVar2;
                icoVar = icoVar2;
                dthx.b(strG, null, ije.d, jEs, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVarC, 384, 0, 131058);
                hmlVar2 = hmlVarC;
                hmlVar2.n();
            } else {
                hmlVar2 = hmlVarC;
                icoVar = icoVar2;
                fdatVar = fdatVar6;
                fdatVar2 = fdatVar8;
                hmwVar = hmwVar2;
                fdatVar3 = fdatVar7;
                fdaeVar = fdaeVar2;
                fdatVar4 = fdatVar5;
                ibyVar = ibyVar2;
                egpVar = egpVar2;
                f = 0.1f;
            }
            hmwVar.ab();
            hmlVar2.n();
            ics icsVarA4 = egpVar.a(icoVar, f, true);
            ixm ixmVarA5 = ecz.a(ibyVar, false);
            int iA5 = cttf.a(hmg.b(hmlVar2));
            hxi hxiVarAk5 = hmwVar.ak();
            ics icsVarB5 = icj.b(hmlVar2, icsVarA4);
            hmlVar2.x();
            if (hmwVar.z) {
                hmlVar2.j(fdaeVar);
            } else {
                hmlVar2.z();
            }
            hsk.b(hmlVar2, ixmVarA5, fdatVar4);
            hsk.b(hmlVar2, hxiVarAk5, fdatVar);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA5))) {
                Integer numValueOf5 = Integer.valueOf(iA5);
                hmwVar.af(numValueOf5);
                hmlVar2.h(numValueOf5, fdatVar3);
            }
            hsk.b(hmlVar2, icsVarB5, fdatVar2);
            ctteVar2 = ctteVar;
            fdae fdaeVar3 = ctteVar2.r;
            hmlVar2.v(-613808117);
            if (fdaeVar3 != null) {
                d(fdaeVar3, ctteVar2.s, hmlVar2, 0);
            }
            hmwVar.ab();
            hmlVar2.n();
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ctto
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkri dkriVar2 = dkriVar;
                    int i6 = i;
                    ctuo.f(dkriVar2, ctteVar2, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void g(final ctte ctteVar, final igr igrVar, final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(49404435);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(ctteVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(igrVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(str) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            String str2 = ctteVar.g;
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                int length = str2.length();
                long jA = jyp.a(length, length);
                long j = jyo.a;
                hpl hplVar = new hpl(new kew(str2, jA, 4), hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            final hox hoxVar = (hox) objS;
            hmwVar.ab();
            kew kewVar = (kew) hoxVar.a();
            ics icsVarA = igt.a(efy.e(egq.d(ics.e, 1.0f), 24.0f, 16.0f), igrVar);
            fae faeVar = new fae(3, null, 0, 0, 126);
            boolean z = ctteVar.n;
            hmlVarC.v(-1633490746);
            int i4 = i2 & 14;
            Object objS2 = hmwVar.S();
            if (i4 == 4 || objS2 == obj) {
                objS2 = new fdap() { // from class: cttu
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        kew kewVar2 = (kew) obj2;
                        kewVar2.getClass();
                        ctteVar.o.invoke(kewVar2.a());
                        ctuo.h(hoxVar, kewVar2);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            dtgi.b(kewVar, (fdap) objS2, icsVarA, false, null, hxe.d(1074266797, new cttz(ctteVar), hmlVarC), hxe.d(1377154188, new ctua(ctteVar), hmlVarC), hxe.d(1982928970, new ctuc(ctteVar, hoxVar), hmlVarC), hxe.d(-1189852612, new ctue(str, str2), hmlVarC), z, null, faeVar, null, 0, 0, null, null, hmlVar2, 819462144, 199686, 0);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cttv
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    ctte ctteVar2 = ctteVar;
                    igr igrVar2 = igrVar;
                    int i5 = i;
                    ctuo.g(ctteVar2, igrVar2, str, (hml) obj2, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void h(hox hoxVar, kew kewVar) {
        hoxVar.b(kewVar);
    }

    public static final void i(final ctte ctteVar, final igr igrVar, hml hmlVar, final int i) {
        int i2;
        String strB;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1660979504);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(ctteVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(igrVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            String str = ctteVar.g;
            if (str.length() <= 100) {
                hmlVarC.v(-77592830);
                strB = jqu.c(R.string.group_rename_remaining_text_count_text, new Object[]{Integer.valueOf(100 - str.length())}, hmlVarC);
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(-77445673);
                strB = jqu.b(R.string.group_rename_remaining_text_characters_limit_reached, hmlVarC);
                ((hmw) hmlVarC).ab();
            }
            int i4 = i2 & 126;
            if (ctteVar.s.a) {
                hmlVarC.v(-77302856);
                j(ctteVar, igrVar, strB, hmlVarC, i4);
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(-77207841);
                g(ctteVar, igrVar, strB, hmlVarC, i4);
                ((hmw) hmlVarC).ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cttx
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ctte ctteVar2 = ctteVar;
                    int i5 = i;
                    ctuo.i(ctteVar2, igrVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void j(final ctte ctteVar, final igr igrVar, String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        final String str2 = str;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1098117984);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(ctteVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(igrVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(str2) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            String str3 = ctteVar.g;
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                int length = str3.length();
                long jA = jyp.a(length, length);
                long j = jyo.a;
                hpl hplVar = new hpl(new kew(str3, jA, 4), hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            final hox hoxVar = (hox) objS;
            hmwVar.ab();
            kew kewVar = (kew) hoxVar.a();
            ics icsVarA = igt.a(efy.e(egq.d(ics.e, 1.0f), 24.0f, 16.0f), igrVar);
            fae faeVar = new fae(3, null, 0, 0, 126);
            boolean z = ctteVar.n;
            jyq jyqVar = glz.d(hmlVarC).k;
            eve eveVar = glz.c(hmlVarC).e;
            long j2 = dljt.a(hmlVarC).F;
            int i4 = i2;
            long j3 = dljt.a(hmlVarC).F;
            long j4 = dljt.a(hmlVarC).F;
            long j5 = dljt.a(hmlVarC).F;
            long j6 = ije.g;
            gxi gxiVarA = dthq.a(j2, j3, j4, j5, j6, j6, j6, j6, hmlVarC, 2147452687);
            hmlVarC.v(-1633490746);
            int i5 = i4 & 14;
            Object objS2 = hmwVar.S();
            if (i5 == 4 || objS2 == obj) {
                objS2 = new fdap() { // from class: cttp
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        kew kewVar2 = (kew) obj2;
                        kewVar2.getClass();
                        ctteVar.o.invoke(kewVar2.a());
                        ctuo.k(hoxVar, kewVar2);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            str2 = str;
            hmlVar2 = hmlVarC;
            dths.a(kewVar, (fdap) objS2, icsVarA, false, jyqVar, hxe.d(1291708229, new ctuf(ctteVar), hmlVarC), hxe.d(1311249351, new ctuh(ctteVar, hoxVar), hmlVarC), hxe.d(100522901, new ctuj(str2, str3), hmlVarC), z, null, faeVar, null, 0, 0, eveVar, gxiVarA, hmlVar2, 817889280, 1575942, 0);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cttq
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    ctte ctteVar2 = ctteVar;
                    igr igrVar2 = igrVar;
                    int i6 = i;
                    ctuo.j(ctteVar2, igrVar2, str2, (hml) obj2, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void k(hox hoxVar, kew kewVar) {
        hoxVar.b(kewVar);
    }

    public static final void l(final String str, final abs absVar, final boolean z, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-776363181);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(absVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        int i4 = i2;
        if ((i4 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            dlnp dlnpVar = new dlnp(str, null, null, false, null, null, null, 254);
            String strB = jqu.b(R.string.action_back, hmlVarC);
            djrr djrrVar = djrr.q;
            hmlVarC.v(5004770);
            boolean zF = hmlVarC.F(absVar);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new fdae() { // from class: cttr
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        abs absVar2 = absVar;
                        if (absVar2 != null) {
                            absVar2.b();
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            dlor.c(new dloh(dlnpVar, new dihq(strB, djrrVar, false, false, false, false, null, false, null, (fdae) objS, 1020), null, !z, false, null, null, 116), null, null, null, false, null, hmlVarC, 0, 62);
            hmlVar2 = hmlVarC;
            b(absVar, hmlVar2, (i4 >> 3) & 14);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ctts
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    abs absVar2 = absVar;
                    int i5 = i;
                    ctuo.l(str2, absVar2, z, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void m(final igr igrVar, hml hmlVar, final int i) {
        int i2;
        igrVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2034368354);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(igrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            View view = (View) hmlVarC.e(AndroidCompositionLocals_androidKt.f);
            dpir dpirVar = (dpir) hmlVarC.e(dpjg.a);
            hmlVarC.v(-1746271574);
            boolean zF = hmlVarC.F(dpirVar) | ((i2 & 14) == 4) | hmlVarC.F(view);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new ctun(igrVar, dpirVar, view, null);
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hob.g(igrVar, (fdat) objS, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cttj
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    ctuo.m(igrVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void n(final fdvc fdvcVar, final ics icsVar, final dpn dpnVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        hml hmlVarC = hmlVar.c(-48244357);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.F(fdvcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                dpnVar = dpc.a(0, hmlVarC, 0, 1);
            } else {
                hmlVarC.s();
            }
            hmlVarC.l();
            hsf hsfVarA = hro.a(fdvcVar, hmlVarC);
            if (!a(hsfVarA).m) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: cttk
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            fdvc fdvcVar2 = fdvcVar;
                            ics icsVar3 = icsVar;
                            int i3 = i;
                            ctuo.n(fdvcVar2, icsVar3, dpnVar, (hml) obj, hpy.a(i3 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            icsVar2 = icsVar;
            cye.b(a(hsfVarA).l, icsVar2, dae.l(null, 3), dae.m(null, 3), null, hxe.d(-912458157, new ctum(hsfVarA, dpnVar), hmlVarC), hmlVarC, (i2 & 112) | 200064, 16);
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: cttl
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdvc fdvcVar2 = fdvcVar;
                    ics icsVar3 = icsVar2;
                    int i3 = i;
                    ctuo.n(fdvcVar2, icsVar3, dpnVar, (hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
