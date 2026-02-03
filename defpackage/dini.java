package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dini {
    public static final void a(final ics icsVar, final dkpi dkpiVar, final String str, dkpc dkpcVar, final boolean z, final boolean z2, dike dikeVar, hml hmlVar, final int i) {
        int i2;
        dkpi dkpiVar2;
        dkpc dkpcVar2;
        final dike dikeVar2 = dikeVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-2058284516);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            dkpiVar2 = dkpiVar;
            i2 |= true != hmlVarC.D(dkpiVar2) ? 16 : 32;
        } else {
            dkpiVar2 = dkpiVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(str) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(dkpcVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.E(z) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.E(z2) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != ((2097152 & i) == 0 ? hmlVarC.D(dikeVar2) : hmlVarC.F(dikeVar2)) ? 524288 : 1048576;
        }
        if ((599187 & i2) == 599186 && hmlVarC.I()) {
            hmlVarC.s();
            dkpcVar2 = dkpcVar;
        } else {
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = dimy.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVar);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar = jbb.e;
            hsk.b(hmlVarC, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar2);
            fdat fdatVar3 = jbb.f;
            int i4 = i2;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar4);
            edf edfVar = edf.a;
            ico icoVar = ics.e;
            ics icsVarB2 = efm.b(efy.e(icoVar, 16.0f, 18.0f), 2);
            ixm ixmVarA2 = egk.a(ecr.a, ibw.n, hmlVarC, 48);
            int iA2 = dimy.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB3 = icj.b(hmlVarC, icsVarB2);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
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
            hsk.b(hmlVarC, icsVarB3, fdatVar4);
            dkqr.o(dkpiVar2, null, egq.k(icoVar, 36.0f), 0, null, hmlVarC, ((i4 >> 3) & 14) | 432, 24);
            egt.a(egq.o(icoVar, 12.0f), hmlVarC);
            ixm ixmVarA3 = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            int iA3 = dimy.a(hmg.b(hmlVarC));
            hxi hxiVarAk3 = hmwVar.ak();
            ics icsVarB4 = icj.b(hmlVarC, icoVar);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA3, fdatVar);
            hsk.b(hmlVarC, hxiVarAk3, fdatVar2);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA3))) {
                Integer numValueOf3 = Integer.valueOf(iA3);
                hmwVar.af(numValueOf3);
                hmlVarC.h(numValueOf3, fdatVar3);
            }
            hsk.b(hmlVarC, icsVarB4, fdatVar4);
            dthx.b(str, null, glz.a(hmlVarC).q, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, glz.d(hmlVarC).i, hmlVarC, (i4 >> 6) & 14, 3120, 55290);
            hmlVarC = hmlVarC;
            hmlVarC.v(-1041325577);
            if (((kio) hmlVarC.e(jmh.e)).ee() <= 1.0f) {
                d(hmlVarC, 0);
            }
            hmwVar.ab();
            hmlVarC.n();
            hmlVarC.v(-1159354525);
            if (z) {
                egt.a(egq.o(egq.e(icoVar, 1.0f), 20.0f), hmlVarC);
            }
            hmwVar.ab();
            hmlVarC.n();
            hmlVarC.v(693580325);
            if (dkpcVar == null) {
                dkpcVar2 = dkpcVar;
            } else {
                ics icsVarK = egq.k(edfVar.a(efy.j(icoVar, 0.0f, 0.0f, 8.0f, 8.0f, 3), ibw.i), 16.0f);
                hmlVarC.v(693589676);
                boolean z3 = z2 && diho.b(hmlVarC);
                hmwVar.ab();
                if (z3) {
                    icsVarK = icsVarK.a(dihi.c(icoVar));
                }
                dkpcVar2 = dkpcVar;
                dkpa.e(dkpcVar2, icsVarK, hmlVarC, 0);
            }
            hmwVar.ab();
            hmlVarC.v(693594415);
            if (dikeVar == null) {
                dikeVar2 = dikeVar;
            } else {
                hmlVarC.v(5004770);
                dikeVar2 = dikeVar;
                boolean zF = hmlVarC.F(dikeVar2);
                Object objS = hmwVar.S();
                if (zF || objS == hmk.a) {
                    objS = new ding(dikeVar2, null);
                    hmwVar.af(objS);
                }
                hmwVar.ab();
                hob.g(dikeVar2.a, (fdat) objS, hmlVarC);
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final dkpc dkpcVar3 = dkpcVar2;
            hpxVarL.d = new fdat() { // from class: dinb
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    dkpi dkpiVar3 = dkpiVar;
                    String str2 = str;
                    dkpc dkpcVar4 = dkpcVar3;
                    boolean z4 = z;
                    boolean z5 = z2;
                    dini.a(icsVar2, dkpiVar3, str2, dkpcVar4, z4, z5, dikeVar2, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final ics icsVar, final dike dikeVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1408805438);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? hmlVarC.D(dikeVar) : hmlVarC.F(dikeVar)) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            djuc.d(new djue(djrr.aZ, jqu.b(R.string.contact_view_fetch_failed_text, hmlVarC), null, false, false, 60), icsVar, hmlVarC, (i2 << 3) & 112);
            if (dikeVar != null) {
                hmlVarC.v(5004770);
                boolean zF = hmlVarC.F(dikeVar);
                hmw hmwVar = (hmw) hmlVarC;
                Object objS = hmwVar.S();
                if (zF || objS == hmk.a) {
                    objS = new dinh(dikeVar, null);
                    hmwVar.af(objS);
                }
                hmwVar.ab();
                hob.g(dikeVar.a, (fdat) objS, hmlVarC);
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dinc
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    int i4 = i;
                    dini.b(icsVar2, dikeVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1215268299);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            eve eveVar = glz.c(hmlVarC).f;
            ics icsVarE = efy.e(icsVar, 16.0f, 18.0f);
            ixm ixmVarA = egk.a(ecr.a, ibw.n, hmlVarC, 48);
            int iA = dimy.a(hmg.b(hmlVarC));
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
            f(iex.a(egq.k(icoVar, 36.0f), evn.a), hmlVarC, 0);
            egt.a(egq.o(icoVar, 12.0f), hmlVarC);
            ixm ixmVarA2 = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            int iA2 = dimy.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icoVar);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
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
            f(iex.a(egq.e(egq.o(icoVar, 82.0f), 14.0f), eveVar), hmlVarC, 0);
            egt.a(egq.e(icoVar, 4.0f), hmlVarC);
            f(iex.a(egq.e(egq.o(icoVar, 44.0f), 14.0f), eveVar), hmlVarC, 0);
            hmlVarC.n();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dinf
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dini.c(icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.hml r25, int r26) {
        /*
            r0 = -1815542279(0xffffffff93c905f9, float:-5.0745423E-27)
            r1 = r25
            hml r0 = r1.c(r0)
            if (r26 != 0) goto L1b
            boolean r1 = r0.I()
            r2 = 0
            if (r1 != 0) goto L15
            r24 = r2
            goto L1d
        L15:
            r0.s()
            r20 = r0
            goto L52
        L1b:
            r24 = r26
        L1d:
            r1 = 2132083562(0x7f15036a, float:1.980727E38)
            java.lang.String r1 = defpackage.jqu.b(r1, r0)
            hcr r2 = defpackage.glz.d(r0)
            jyq r2 = r2.l
            gda r3 = defpackage.glz.a(r0)
            long r3 = r3.s
            r22 = 3120(0xc30, float:4.372E-42)
            r23 = 55290(0xd7fa, float:7.7478E-41)
            r19 = r2
            r2 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 2
            r15 = 0
            r16 = 1
            r17 = 0
            r18 = 0
            r21 = 0
            r20 = r0
            defpackage.dthx.b(r1, r2, r3, r5, r7, r8, r9, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r2 = r24
        L52:
            hpx r0 = r20.L()
            if (r0 == 0) goto L5f
            dind r1 = new dind
            r1.<init>()
            r0.d = r1
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dini.d(hml, int):void");
    }

    public static final void e(final ics icsVar, final String str, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-328943889);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            djuc.d(new djue(djrr.aO, jqu.b(R.string.contact_downloadable_title, hmlVarC), jqu.c(R.string.contact_downloadable_subtitle, new Object[]{str}, hmlVarC), true, false, 48), icsVar, hmlVarC, (i2 << 3) & 112);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dine
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    int i4 = i;
                    dini.e(icsVar2, str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-161938889);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(-1004445579);
            ije ijeVar = ((Boolean) dljt.b(hmlVarC).c.invoke()).booleanValue() ? new ije(glz.a(hmlVarC).J) : null;
            ((hmw) hmlVarC).ab();
            ecz.b(dkto.d(icsVar, ijeVar, 6), hmlVarC, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dimz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dini.f(icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void g(final diky dikyVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(1644049492);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(dikyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            boolean z = dikyVar instanceof dikx;
            ico icoVar = ics.e;
            if (z) {
                hmlVarC.v(-616397891);
                c(icoVar, hmlVarC, (i3 >> 3) & 14);
                ((hmw) hmlVarC).ab();
            } else if (dikyVar instanceof diku) {
                hmlVarC.v(-616395005);
                b(icoVar, ((diku) dikyVar).a, hmlVarC, ((i3 >> 3) & 14) | 64);
                ((hmw) hmlVarC).ab();
            } else if (dikyVar instanceof dikw) {
                int i4 = (i3 >> 3) & 14;
                hmlVarC.v(-616390679);
                dikw dikwVar = (dikw) dikyVar;
                a(icoVar, dikwVar.b, dikwVar.a, dikwVar.c, dikwVar.d, dikwVar.e, dikwVar.f, hmlVarC, i4 | 2097152);
                ((hmw) hmlVarC).ab();
            } else {
                if (!(dikyVar instanceof dikt)) {
                    hmlVarC.v(-616399052);
                    ((hmw) hmlVarC).ab();
                    throw new fctg();
                }
                hmlVarC.v(-616377294);
                e(icoVar, ((dikt) dikyVar).a, hmlVarC, (i3 >> 3) & 14);
                ((hmw) hmlVarC).ab();
            }
            icsVar = icoVar;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dina
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    diky dikyVar2 = dikyVar;
                    int i5 = i;
                    dini.g(dikyVar2, icsVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
