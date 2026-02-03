package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czd {
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.Object r16, defpackage.ics r17, defpackage.dew r18, java.lang.String r19, defpackage.fdau r20, defpackage.hml r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czd.a(java.lang.Object, ics, dew, java.lang.String, fdau, hml, int, int):void");
    }

    public static final void b(dhk dhkVar, ics icsVar, dew dewVar, fdap fdapVar, fdau fdauVar, hml hmlVar, int i) {
        fdap fdapVar2;
        char c;
        int i2 = i & 6;
        hml hmlVarC = hmlVar.c(-1877370462);
        int i3 = i2 == 0 ? (true != hmlVarC.D(dhkVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.F(dewVar) ? 128 : 256;
        }
        int i4 = i3 | 3072;
        if ((i & 24576) == 0) {
            i4 |= true != hmlVarC.F(fdauVar) ? 8192 : 16384;
        }
        if (hmlVarC.J((i4 & 9363) != 9362, i4 & 1)) {
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = cyv.a;
                hmwVar.af(objS);
            }
            fdapVar2 = (fdap) objS;
            Object objS2 = hmwVar.S();
            Object obj2 = objS2;
            if (objS2 == obj) {
                iac iacVar = new iac();
                iacVar.add(dhkVar.e());
                hmwVar.af(iacVar);
                obj2 = iacVar;
            }
            iac iacVar2 = (iac) obj2;
            Object objS3 = hmwVar.S();
            if (objS3 == obj) {
                long[] jArr = cvp.a;
                c = ' ';
                objS3 = new cuz((byte[]) null);
                hmwVar.af(objS3);
            } else {
                c = ' ';
            }
            cuz cuzVar = (cuz) objS3;
            if (fdbq.f(dhkVar.e(), dhkVar.f())) {
                hmlVarC.v(321188840);
                if (iacVar2.a() == 1 && fdbq.f(iacVar2.get(0), dhkVar.f())) {
                    hmlVarC.v(321513472);
                    hmwVar.ab();
                } else {
                    hmlVarC.v(321323194);
                    int i5 = i4 & 14;
                    Object objS4 = hmwVar.S();
                    if (i5 == 4 || objS4 == obj) {
                        objS4 = new cyw(dhkVar);
                        hmwVar.af(objS4);
                    }
                    fcva.x(iacVar2, (fdap) objS4);
                    cuzVar.d();
                    hmwVar.ab();
                }
                hmwVar.ab();
            } else {
                hmlVarC.v(321519424);
                hmwVar.ab();
            }
            if (cuzVar.g(dhkVar.f())) {
                hmlVarC.v(322322944);
                hmwVar.ab();
            } else {
                hmlVarC.v(321580091);
                iaq iaqVar = new iaq(iacVar2, 0);
                int i6 = 0;
                while (true) {
                    if (!iaqVar.hasNext()) {
                        i6 = -1;
                        break;
                    } else if (fdbq.f(fdapVar2.invoke(iaqVar.next()), fdapVar2.invoke(dhkVar.f()))) {
                        break;
                    } else {
                        i6++;
                    }
                }
                if (i6 == -1) {
                    iacVar2.add(dhkVar.f());
                } else {
                    iacVar2.set(i6, dhkVar.f());
                }
                cuzVar.d();
                int iA = iacVar2.a();
                for (int i7 = 0; i7 < iA; i7++) {
                    Object obj3 = iacVar2.get(i7);
                    cuzVar.e(obj3, hxe.d(-934471669, new czb(dhkVar, dewVar, obj3, fdauVar), hmlVarC));
                }
                hmwVar.ab();
            }
            ixm ixmVarA = ecz.a(ibw.a, false);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> c);
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVar);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i8 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i8))) {
                Integer numValueOf = Integer.valueOf(i8);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            hmlVarC.v(-1312707512);
            int iA2 = iacVar2.a();
            for (int i9 = 0; i9 < iA2; i9++) {
                Object obj4 = iacVar2.get(i9);
                hmlVarC.u(1171574969, fdapVar2.invoke(obj4));
                fdat fdatVar2 = (fdat) cuzVar.f(obj4);
                if (fdatVar2 == null) {
                    hmlVarC.v(1959122128);
                } else {
                    hmlVarC.v(1171576145);
                    fdatVar2.a(hmlVarC, 0);
                }
                hmwVar.ab();
                hmwVar.ab();
            }
            hmwVar.ab();
            hmlVarC.n();
        } else {
            hmlVarC.s();
            fdapVar2 = fdapVar;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new czc(dhkVar, icsVar, dewVar, fdapVar2, fdauVar, i);
        }
    }
}
