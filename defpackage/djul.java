package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djul {
    public static final void a(final ego egoVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1561524606);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(egoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ecz.b(dkl.a(egoVar.a(egq.e(ics.e, 1.0f), 1.0f, true), glz.a(hmlVarC).a, ikj.a), hmlVarC, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djuk
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    djul.a(egoVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final ics icsVar, final fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-122619566);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarD = egq.d(icsVar, 1.0f);
            int i4 = ((i2 << 6) & 7168) | 384;
            ixm ixmVarA = egk.a(ecr.a, ibw.n, hmlVarC, 48);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarD);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i5 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i5))) {
                Integer numValueOf = Integer.valueOf(i5);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            fdauVar.a(egp.a, hmlVarC, Integer.valueOf(((i4 >> 6) & 112) | 6));
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djui
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    int i6 = i;
                    djul.b(icsVar2, fdauVar, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.hml r25, int r26) {
        /*
            r0 = 1794125091(0x6af02d23, float:1.4517767E26)
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
            goto L61
        L1b:
            r24 = r26
        L1d:
            r1 = 2132085117(0x7f15097d, float:1.9810424E38)
            java.lang.String r1 = defpackage.jqu.b(r1, r0)
            ico r2 = defpackage.ics.e
            r3 = 0
            r4 = 2
            r5 = 1073741824(0x40000000, float:2.0)
            ics r2 = defpackage.efy.i(r2, r5, r3, r4)
            hcr r3 = defpackage.glz.d(r0)
            jyq r3 = r3.l
            gda r4 = defpackage.glz.a(r0)
            long r4 = r4.a
            khk r11 = new khk
            r6 = 3
            r11.<init>(r6)
            r22 = 0
            r23 = 65016(0xfdf8, float:9.1107E-41)
            r19 = r3
            r3 = r4
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 48
            r20 = r0
            defpackage.dthx.b(r1, r2, r3, r5, r7, r8, r9, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r2 = r24
        L61:
            hpx r0 = r20.L()
            if (r0 == 0) goto L6e
            djuj r1 = new djuj
            r1.<init>()
            r0.d = r1
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djul.c(hml, int):void");
    }

    public static final void d(final ics icsVar, hml hmlVar, final int i) {
        int i2 = i | 6;
        int i3 = i2 & 3;
        hml hmlVarC = hmlVar.c(622730329);
        if (i3 == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i4 = i2 & 14;
            ico icoVar = ics.e;
            b(icoVar, djug.a, hmlVarC, i4 | 48);
            icsVar = icoVar;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djuh
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    djul.d(icsVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
