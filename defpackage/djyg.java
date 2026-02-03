package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djyg {
    public static final long a(hox hoxVar) {
        return ((kjb) hoxVar.a()).a;
    }

    public static final ddp b(hox hoxVar) {
        return (ddp) hoxVar.a();
    }

    public static final void c(final List list, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-663546648);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(list) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                hpl hplVar = new hpl(false, hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            final hox hoxVar = (hox) objS;
            hmwVar.ab();
            hmlVarC.v(5004770);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new fdae() { // from class: djwr
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        djyg.d(hoxVar, true);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            dtfk.b((fdae) objS2, null, false, null, null, hxe.d(1534411142, new djxj(hoxVar, list), hmlVarC), hmlVarC, 1572870, 62);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djws
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int i4 = i;
                    djyg.c(list, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(hox hoxVar, boolean z) {
        hoxVar.b(Boolean.valueOf(z));
    }

    public static final void e(final djyu djyuVar, ics icsVar, ije ijeVar, eve eveVar, hml hmlVar, final int i, final int i2) {
        int i3;
        final ics icsVar2;
        final ije ijeVar2;
        final eve eveVar2;
        djyuVar.getClass();
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(2070809935);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(djyuVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != hmlVarC.D(ijeVar) ? 128 : 256;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.D(eveVar) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
            ijeVar2 = ijeVar;
            eveVar2 = eveVar;
        } else {
            if (i5 != 0) {
                icsVar = ics.e;
            }
            ics icsVar3 = icsVar;
            ije ijeVar3 = i6 != 0 ? null : ijeVar;
            eve eveVar3 = i7 != 0 ? null : eveVar;
            if (djyuVar instanceof djyp) {
                hmlVarC.v(1478496883);
                p((djyp) djyuVar, icsVar3, hmlVarC, i3 & 112);
                ((hmw) hmlVarC).ab();
            } else if (djyuVar instanceof djyt) {
                hmlVarC.v(1478499507);
                q((djyt) djyuVar, icsVar3, hmlVarC, i3 & 112);
                ((hmw) hmlVarC).ab();
            } else if (djyuVar instanceof djyl) {
                hmlVarC.v(1478501923);
                o((djyl) djyuVar, icsVar3, ijeVar3, eveVar3, hmlVarC, i3 & 8176);
                ((hmw) hmlVarC).ab();
            } else if (djyuVar instanceof djym) {
                hmlVarC.v(1478504901);
                f((djym) djyuVar, icsVar3, ijeVar3, eveVar3, hmlVarC, i3 & 8176);
                ((hmw) hmlVarC).ab();
            } else if (djyuVar instanceof djys) {
                hmlVarC.v(1478508040);
                s((djys) djyuVar, icsVar3, ijeVar3, eveVar3, hmlVarC, i3 & 8176);
                ((hmw) hmlVarC).ab();
            } else if (djyuVar instanceof djyr) {
                hmlVarC.v(1478511497);
                r((djyr) djyuVar, icsVar3, ijeVar3, eveVar3, hmlVarC, i3 & 8176);
                ((hmw) hmlVarC).ab();
            } else {
                if (!(djyuVar instanceof djyj)) {
                    hmlVarC.v(1478495637);
                    ((hmw) hmlVarC).ab();
                    throw new fctg();
                }
                hmlVarC.v(1478514760);
                n((djyj) djyuVar, icsVar3, ijeVar3, eveVar3, hmlVarC, i3 & 8176);
                ((hmw) hmlVarC).ab();
            }
            icsVar2 = icsVar3;
            ijeVar2 = ijeVar3;
            eveVar2 = eveVar3;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djww
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djyu djyuVar2 = djyuVar;
                    ics icsVar4 = icsVar2;
                    ije ijeVar4 = ijeVar2;
                    djyg.e(djyuVar2, icsVar4, ijeVar4, eveVar2, (hml) obj, hpy.a(i | 1), i2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(final djym djymVar, final ics icsVar, final ije ijeVar, final eve eveVar, hml hmlVar, final int i) {
        int i2;
        long j;
        long jF;
        long j2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1221356446);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djymVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(ijeVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(eveVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            djyi djyiVar = djymVar.h;
            hmlVarC.v(711921805);
            int iOrdinal = djyiVar.ordinal();
            if (iOrdinal == 0) {
                hmlVarC.v(1257059830);
                j = glz.a(hmlVarC).q;
                ((hmw) hmlVarC).ab();
            } else if (iOrdinal == 1) {
                hmlVarC.v(1257062036);
                j = glz.a(hmlVarC).a;
                ((hmw) hmlVarC).ab();
            } else {
                if (iOrdinal != 2) {
                    hmlVarC.v(1257057584);
                    ((hmw) hmlVarC).ab();
                    throw new fctg();
                }
                hmlVarC.v(1257064276);
                j = glz.a(hmlVarC).A;
                ((hmw) hmlVarC).ab();
            }
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            hmlVarC.v(1849434622);
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                hpl hplVar = new hpl(dcs.a(j), hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            hox hoxVar = (hox) objS;
            hmwVar.ab();
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                hpl hplVar2 = new hpl(false, hsi.a);
                hmwVar.af(hplVar2);
                objS2 = hplVar2;
            }
            final hox hoxVar2 = (hox) objS2;
            hmwVar.ab();
            hmlVarC.v(1849434622);
            Object objS3 = hmwVar.S();
            if (objS3 == obj) {
                objS3 = new ebk();
                hmwVar.af(objS3);
            }
            ebk ebkVar = (ebk) objS3;
            hmwVar.ab();
            hmlVarC.v(-1633490746);
            int i4 = i2 & 14;
            Object objS4 = hmwVar.S();
            if (i4 == 4 || objS4 == obj) {
                objS4 = new fdae() { // from class: djwo
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        djym djymVar2 = djymVar;
                        List list = djymVar2.e;
                        if (list == null || list.isEmpty()) {
                            djymVar2.i.invoke();
                        } else {
                            djyg.i(hoxVar2, true);
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS4);
            }
            hmwVar.ab();
            ics icsVarC = dli.c(icsVar, ebkVar, null, false, null, null, (fdae) objS4, 28);
            boolean z = djymVar.f;
            if (z) {
                icsVarC = icsVarC.a(iex.a(ics.e, evn.b(100.0f)));
            }
            if (!z && eveVar != null) {
                icsVarC = icsVarC.a(iex.a(ics.e, eveVar));
            }
            hmlVarC.v(-1326632258);
            hmlVarC.v(711693654);
            if (z) {
                hmlVarC.v(-1385155195);
                int iOrdinal2 = djyiVar.ordinal();
                if (iOrdinal2 == 0) {
                    hmlVarC.v(305724725);
                    j2 = glz.a(hmlVarC).s;
                    hmwVar.ab();
                } else if (iOrdinal2 == 1) {
                    hmlVarC.v(305727152);
                    j2 = glz.a(hmlVarC).t;
                    hmwVar.ab();
                } else {
                    if (iOrdinal2 != 2) {
                        hmlVarC.v(305722483);
                        hmwVar.ab();
                        throw new fctg();
                    }
                    hmlVarC.v(305729516);
                    j2 = glz.a(hmlVarC).A;
                    hmwVar.ab();
                }
                hmwVar.ab();
                jF = ijg.f(ije.d(j2), ije.c(j2), ije.b(j2), 0.16f, ije.f(j2));
            } else {
                jF = ijeVar != null ? ijeVar.i : ije.g;
            }
            hmwVar.ab();
            gku gkuVarA = dtfp.a(jF, hmlVarC, 510);
            hmwVar.ab();
            long j3 = j;
            dtfr.a(hxe.d(-1602326020, new djxn(djymVar, hoxVar), hmlVarC), icsVarC, null, hxe.d(133972415, new djxo(djymVar, hoxVar), hmlVarC), hxe.d(712738560, new djxq(djymVar), hmlVarC), hxe.d(1291504705, new djxs(djymVar, hoxVar, hoxVar2), hmlVarC), gkuVarA, hmlVarC, 224262, 388);
            hmlVarC.v(-1633490746);
            boolean zC = hmlVarC.C(j3);
            Object objS5 = hmwVar.S();
            if (zC || objS5 == obj) {
                objS5 = new djxt(j3, hoxVar, null);
                hmwVar.af(objS5);
            }
            hmwVar.ab();
            hob.g(djyiVar, (fdat) objS5, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djwp
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    djym djymVar2 = djymVar;
                    ics icsVar2 = icsVar;
                    ije ijeVar2 = ijeVar;
                    djyg.f(djymVar2, icsVar2, ijeVar2, eveVar, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void g(final boolean z, final List list, fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        final fdae fdaeVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(313155540);
        if (i3 == 0) {
            i2 = (true != hmlVarC.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(list) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            fdaeVar2 = fdaeVar;
        } else {
            fdaeVar2 = fdaeVar;
            dtfz.b(z, fdaeVar2, null, 0L, null, null, glz.c(hmlVarC).f, 0L, 0.0f, hxe.d(-489983409, new djxu(list, fdaeVar), hmlVarC), hmlVarC, (i2 & 14) | ((i2 >> 3) & 112), 48, 1980);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djwv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z2 = z;
                    List list2 = list;
                    int i4 = i;
                    djyg.g(z2, list2, fdaeVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void h(final djyn djynVar, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        long j;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-770583172);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djynVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (djynVar.d) {
                hmlVarC.v(-1796046461);
                j = glz.a(hmlVarC).a;
            } else {
                hmlVarC.v(-1796045211);
                j = glz.a(hmlVarC).q;
            }
            ((hmw) hmlVarC).ab();
            hwv hwvVarD = hxe.d(859213132, new djxw(djynVar, j), hmlVarC);
            hmlVarC.v(-1633490746);
            boolean z = (i2 & 14) == 4;
            boolean z2 = (i2 & 112) == 32;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if ((z | z2) || objS == hmk.a) {
                objS = new fdae() { // from class: djwq
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        djynVar.e.invoke();
                        fdaeVar.invoke();
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            dtfz.a(hwvVarD, (fdae) objS, null, null, false, null, null, hmlVarC, 6, 508);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djwt
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djyn djynVar2 = djynVar;
                    int i4 = i;
                    djyg.h(djynVar2, fdaeVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void i(hox hoxVar, boolean z) {
        hoxVar.b(Boolean.valueOf(z));
    }

    public static final void j(final long j, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1629901712);
        if (i3 == 0) {
            i2 = (true != hmlVarC.C(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dtfn.b(djrs.a(djrr.af, hmlVarC), null, efy.d(dkl.a(egq.k(ics.e, 40.0f), j, evn.a), 10.0f), glz.a(hmlVarC).b, hmlVarC, 0, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djwi
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    djyg.j(j, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final java.lang.String r26, final java.util.List r27, defpackage.ije r28, defpackage.hml r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djyg.k(java.lang.String, java.util.List, ije, hml, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final java.lang.String r26, defpackage.ije r27, defpackage.hml r28, final int r29, final int r30) {
        /*
            r0 = r26
            r1 = r30 & 1
            r2 = -103920094(0xfffffffff9ce4e22, float:-1.3389973E35)
            r3 = r28
            hml r2 = r3.c(r2)
            r3 = 1
            if (r1 == 0) goto L13
            r1 = r29 | 6
            goto L25
        L13:
            r1 = r29 & 6
            if (r1 != 0) goto L23
            boolean r1 = r2.D(r0)
            if (r3 == r1) goto L1f
            r1 = 2
            goto L20
        L1f:
            r1 = 4
        L20:
            r1 = r29 | r1
            goto L25
        L23:
            r1 = r29
        L25:
            r4 = r30 & 2
            if (r4 == 0) goto L2c
            r1 = r1 | 48
            goto L3f
        L2c:
            r5 = r29 & 48
            if (r5 != 0) goto L3f
            r5 = r27
            boolean r6 = r2.D(r5)
            if (r3 == r6) goto L3b
            r6 = 16
            goto L3d
        L3b:
            r6 = 32
        L3d:
            r1 = r1 | r6
            goto L41
        L3f:
            r5 = r27
        L41:
            r6 = r1 & 19
            r7 = 18
            if (r6 != r7) goto L54
            boolean r6 = r2.I()
            if (r6 != 0) goto L4e
            goto L54
        L4e:
            r2.s()
            r19 = r2
            goto La1
        L54:
            if (r4 == 0) goto L58
            r4 = 0
            goto L59
        L58:
            r4 = r5
        L59:
            ico r5 = defpackage.ics.e
            r6 = 0
            r7 = 1116733440(0x42900000, float:72.0)
            ics r3 = defpackage.egq.x(r5, r6, r7, r3)
            if (r4 == 0) goto L67
            long r5 = r4.i
            goto L69
        L67:
            long r5 = defpackage.ije.h
        L69:
            r1 = r1 & 14
            r20 = r1 | 48
            r21 = 3120(0xc30, float:4.372E-42)
            r22 = 120824(0x1d7f8, float:1.6931E-40)
            r19 = r2
            r1 = r4
            r24 = r5
            r6 = r3
            r2 = r24
            r4 = 0
            r7 = r1
            r1 = r6
            r6 = 0
            r8 = r7
            r7 = 0
            r10 = r8
            r8 = 0
            r11 = r10
            r10 = 0
            r13 = r11
            r11 = 0
            r14 = r13
            r13 = 2
            r15 = r14
            r14 = 0
            r16 = r15
            r15 = 1
            r17 = r16
            r16 = 0
            r18 = r17
            r17 = 0
            r23 = r18
            r18 = 0
            defpackage.dthx.b(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r5 = r23
        La1:
            hpx r1 = r19.L()
            if (r1 == 0) goto Lb2
            djwu r2 = new djwu
            r3 = r29
            r4 = r30
            r2.<init>()
            r1.d = r2
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djyg.l(java.lang.String, ije, hml, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final java.lang.String r26, final java.util.List r27, defpackage.ije r28, defpackage.hml r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djyg.m(java.lang.String, java.util.List, ije, hml, int, int):void");
    }

    public static final void n(final djyj djyjVar, final ics icsVar, final ije ijeVar, final eve eveVar, hml hmlVar, final int i) {
        int i2;
        ics icsVarE;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(776857518);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djyjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(ijeVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(eveVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                hpl hplVar = new hpl(new kjb(0L), hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            final hox hoxVar = (hox) objS;
            hmwVar.ab();
            hmlVarC.v(-764222819);
            if (djyjVar.g != null) {
                ico icoVar = ics.e;
                hmlVarC.v(5004770);
                Object objS2 = hmwVar.S();
                if (objS2 == obj) {
                    objS2 = new fdap() { // from class: djwj
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            ivy ivyVar = (ivy) obj2;
                            ivyVar.getClass();
                            hoxVar.b(new kjb(kjc.c(ivz.b(ivyVar))));
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS2);
                }
                hmwVar.ab();
                ics icsVarA = ixy.a(icoVar, (fdap) objS2);
                hmlVarC.v(-1633490746);
                int i4 = i2 & 14;
                Object objS3 = hmwVar.S();
                if (i4 == 4 || objS3 == obj) {
                    objS3 = new fdae() { // from class: djwk
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            hox hoxVar2 = hoxVar;
                            djyjVar.g.invoke(new djyq(kjb.a(djyg.a(hoxVar2)), kjb.b(djyg.a(hoxVar2))));
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS3);
                }
                hmwVar.ab();
                icsVarE = dli.e(icsVarA, false, null, (fdae) objS3, 15);
            } else {
                icsVarE = ics.e;
            }
            hmwVar.ab();
            ics icsVarA2 = icsVar.a(icsVarE);
            boolean z = djyjVar.h.a;
            if (z && eveVar != null) {
                icsVarA2 = icsVarA2.a(iex.a(ics.e, eveVar));
            }
            ics icsVar2 = icsVarA2;
            String str = djyjVar.d;
            hmlVarC.v(-764194411);
            hwv hwvVarD = str != null ? hxe.d(1088216213, new djxb(str, djyjVar), hmlVarC) : null;
            hmwVar.ab();
            dtfr.a(hxe.d(1248669580, new djxc(djyjVar), hmlVarC), icsVar2, null, hwvVarD, hxe.d(1495232912, new djxd(djyjVar), hmlVarC), hxe.d(-590609903, new djxe(djyjVar), hmlVarC), dtfp.a((!z || ijeVar == null) ? ije.g : ijeVar.i, hmlVarC, 510), hmlVarC, 221190, 388);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djwl
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    djyj djyjVar2 = djyjVar;
                    ics icsVar3 = icsVar;
                    ije ijeVar2 = ijeVar;
                    djyg.n(djyjVar2, icsVar3, ijeVar2, eveVar, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void o(final djyl djylVar, final ics icsVar, final ije ijeVar, final eve eveVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1503716548);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djylVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(ijeVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(eveVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            boolean z = djylVar.f.a;
            ics icsVarA = (!z || eveVar == null) ? icsVar : icsVar.a(iex.a(ics.e, eveVar));
            fdae fdaeVar = djylVar.e;
            String str = djylVar.c;
            ics icsVarE = dli.e(icsVarA, false, null, fdaeVar, 15);
            hmlVarC.v(-1962572381);
            hwv hwvVarD = str != null ? hxe.d(-223872476, new djxk(str, djylVar), hmlVarC) : null;
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            hmlVarC.v(-1962568761);
            hmwVar.ab();
            dtfr.a(hxe.d(-178323302, new djxl(djylVar), hmlVarC), icsVarE, null, hwvVarD, hxe.d(-1810417762, new djxm(djylVar), hmlVarC), null, dtfp.a((!z || ijeVar == null) ? ije.g : ijeVar.i, hmlVarC, 510), hmlVarC, 24582, 388);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djwm
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djyl djylVar2 = djylVar;
                    ics icsVar2 = icsVar;
                    ije ijeVar2 = ijeVar;
                    djyg.o(djylVar2, icsVar2, ijeVar2, eveVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void p(final djyp djypVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-854056214);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djypVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            dthx.b(djypVar.a, efy.j(icsVar, 30.0f, 14.0f, 0.0f, 6.0f, 4), glz.a(hmlVar2).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVar2).m, hmlVar2, 0, 0, 65528);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djwg
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djyp djypVar2 = djypVar;
                    int i4 = i;
                    djyg.p(djypVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void q(final djyt djytVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2010349802);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djytVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hpx hpxVarL = hmlVarC.L();
            if (hpxVarL != null) {
                hpxVarL.d = new fdat() { // from class: djwh
                    @Override // defpackage.fdat
                    public final Object a(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        djyt djytVar2 = djytVar;
                        int i4 = i;
                        djyg.q(djytVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                        return fctx.a;
                    }
                };
                return;
            }
            return;
        }
        ics icsVarA = dkl.a(egq.d(icsVar, 1.0f), glz.a(hmlVarC).F, ikj.a);
        ixm ixmVarA = ecz.a(ibw.a, false);
        long jB = hmg.b(hmlVarC);
        long j = jB ^ (jB >>> 32);
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
        int i4 = (int) j;
        hsk.b(hmlVarC, ixmVarA, jbb.e);
        hsk.b(hmlVarC, hxiVarAk, jbb.d);
        fdat fdatVar = jbb.f;
        if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i4))) {
            Integer numValueOf = Integer.valueOf(i4);
            hmwVar.af(numValueOf);
            hmlVarC.h(numValueOf, fdatVar);
        }
        hsk.b(hmlVarC, icsVarB, jbb.c);
        efy.j(icsVar, 30.0f, 4.0f, 0.0f, 4.0f, 4);
        throw null;
    }

    public static final void r(final djyr djyrVar, final ics icsVar, final ije ijeVar, final eve eveVar, hml hmlVar, final int i) {
        int i2;
        gku gkuVarA;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-2129208404);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djyrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(ijeVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(eveVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            boolean z = djyrVar.f.a;
            ics icsVarE = dli.e((!z || eveVar == null) ? icsVar : icsVar.a(iex.a(ics.e, eveVar)), false, null, djyrVar.e, 15);
            if (z) {
                hmlVarC.v(1125628375);
                gkuVarA = dtfp.a(ijeVar != null ? ijeVar.i : ije.g, hmlVarC, 510);
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(1125726955);
                gkuVarA = dtfp.a(0L, hmlVarC, 511);
                ((hmw) hmlVarC).ab();
            }
            dtfr.a(hxe.d(310617098, new djxx(djyrVar), hmlVarC), icsVarE, null, hxe.d(-220004147, new djxy(djyrVar), hmlVarC), hxe.d(1034777870, new djxz(djyrVar), hmlVarC), hxe.d(-2005407409, new djya(djyrVar), hmlVarC), gkuVarA, hmlVarC, 224262, 388);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djwy
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djyr djyrVar2 = djyrVar;
                    ics icsVar2 = icsVar;
                    ije ijeVar2 = ijeVar;
                    djyg.r(djyrVar2, icsVar2, ijeVar2, eveVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void s(final djys djysVar, final ics icsVar, final ije ijeVar, final eve eveVar, hml hmlVar, final int i) {
        int i2;
        long jF;
        ics icsVarA;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1895396846);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djysVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(ijeVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(eveVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (((dkrk) djysVar.a).a == 4) {
                throw new IllegalStateException("Monograms with the selected icon override should not be used in selectable list items. The checkbox is already included as part of the list item.");
            }
            hmlVarC.v(410252314);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new ebk();
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ics icsVarC = dli.c(icsVar, (ebk) objS, null, false, null, null, djysVar.f, 28);
            boolean z = djysVar.d;
            if (z) {
                hmlVarC.v(410253420);
                if (djysVar.g.a) {
                    icsVarA = iex.a(ics.e, evn.b(100.0f));
                } else {
                    ico icoVar = ics.e;
                    hmlVarC.v(43084099);
                    final long j = glz.a(hmlVarC).F;
                    hmlVarC.v(5004770);
                    boolean zC = hmlVarC.C(j);
                    Object objS2 = hmwVar.S();
                    if (zC || objS2 == obj) {
                        objS2 = new fdap() { // from class: djwn
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj2) {
                                imz imzVar = (imz) obj2;
                                imzVar.getClass();
                                float fEn = imzVar.en(8.0f);
                                float fEn2 = imzVar.en(2.0f);
                                long jFloatToRawIntBits = Float.floatToRawIntBits(fEn);
                                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fEn2);
                                imzVar.b();
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (imzVar.b() >> 32));
                                float fEn3 = imzVar.en(8.0f);
                                float f = fIntBitsToFloat - (fEn3 + fEn3);
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (imzVar.b() & 4294967295L));
                                float fEn4 = imzVar.en(2.0f);
                                float f2 = fIntBitsToFloat2 - (fEn4 + fEn4);
                                imy.o(imzVar, j, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), (Float.floatToRawIntBits(r1) & 4294967295L) | (Float.floatToRawIntBits(imzVar.en(24.0f)) << 32), null, 0.0f, 240);
                                return fctx.a;
                            }
                        };
                        hmwVar.af(objS2);
                    }
                    hmwVar.ab();
                    icsVarA = ifb.a(icoVar, (fdap) objS2);
                    hmwVar.ab();
                }
                hmwVar.ab();
                icsVarC = icsVarC.a(icsVarA);
            }
            hmwVar.ab();
            boolean z2 = djysVar.g.a;
            if (z2 && !z && eveVar != null) {
                icsVarC = icsVarC.a(iex.a(ics.e, eveVar));
            }
            hmlVarC.v(410286706);
            if (!z2) {
                jF = ije.g;
            } else if (z) {
                long j2 = glz.a(hmlVarC).t;
                jF = ijg.f(ije.d(j2), ije.c(j2), ije.b(j2), 0.16f, ije.f(j2));
            } else {
                jF = ijeVar != null ? ijeVar.i : ije.g;
            }
            hmwVar.ab();
            dtfr.a(hxe.d(-1927758388, new djyb(djysVar), hmlVarC), icsVarC, null, hxe.d(404647759, new djyc(djysVar), hmlVarC), hxe.d(-1681195056, new djyd(djysVar), hmlVarC), hxe.d(527929425, new djyf(djysVar), hmlVarC), dtfp.a(jF, hmlVarC, 510), hmlVarC, 224262, 388);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djxa
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    djys djysVar2 = djysVar;
                    ics icsVar2 = icsVar;
                    ije ijeVar2 = ijeVar;
                    djyg.s(djysVar2, icsVar2, ijeVar2, eveVar, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final /* synthetic */ void t(hox hoxVar) {
        d(hoxVar, false);
    }

    private static final juo x(String str, List list, hml hmlVar) {
        juo juoVarB;
        hmlVar.v(118183403);
        if (list.isEmpty()) {
            juoVarB = new juo(str);
        } else {
            jxx jxxVar = new jxx(0L, 0L, kcc.h, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531);
            jxx jxxVar2 = new jxx(glz.a(hmlVar).a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534);
            jul julVar = new jul((byte[]) null);
            julVar.f(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                djwf djwfVar = (djwf) it.next();
                int i = djwfVar.c - 1;
                if (i == 0) {
                    julVar.d(jxxVar, djwfVar.a, djwfVar.b);
                } else if (i != 1) {
                    int i2 = djwfVar.a;
                    int i3 = djwfVar.b;
                    String strSubstring = str.substring(i2, i3);
                    strSubstring.getClass();
                    julVar.a.add(new juk(new jyu(strSubstring), i2, i3, null, 8));
                } else {
                    julVar.d(jxxVar2, djwfVar.a, djwfVar.b);
                }
            }
            juoVarB = julVar.b();
        }
        ((hmw) hmlVar).ab();
        return juoVarB;
    }
}
