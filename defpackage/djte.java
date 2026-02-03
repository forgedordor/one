package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djte {
    public static final void a(final dhk dhkVar, final ics icsVar, final dew dewVar, fdap fdapVar, final fdau fdauVar, hml hmlVar, final int i) {
        fdau fdauVar2;
        final fdap fdapVar2;
        final dhk dhkVar2 = dhkVar;
        int i2 = i & 6;
        hml hmlVarC = hmlVar.c(1912596737);
        int i3 = i2 == 0 ? (true != hmlVarC.D(dhkVar2) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.F(dewVar) ? 128 : 256;
        }
        int i4 = i3 | 3072;
        if ((i & 24576) == 0) {
            fdauVar2 = fdauVar;
            i4 |= true != hmlVarC.F(fdauVar2) ? 8192 : 16384;
        } else {
            fdauVar2 = fdauVar;
        }
        if ((i4 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
            fdapVar2 = fdapVar;
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new fdap() { // from class: djsx
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        return obj2;
                    }
                };
                hmwVar.af(objS);
            }
            fdap fdapVar3 = (fdap) objS;
            hmwVar.ab();
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar.S();
            Object obj2 = objS2;
            if (objS2 == obj) {
                iac iacVar = new iac();
                iacVar.add(dhkVar2.e());
                hmwVar.af(iacVar);
                obj2 = iacVar;
            }
            iac iacVar2 = (iac) obj2;
            hmwVar.ab();
            hmlVarC.v(1849434622);
            Object objS3 = hmwVar.S();
            if (objS3 == obj) {
                long[] jArr = cvp.a;
                objS3 = new cuz((byte[]) null);
                hmwVar.af(objS3);
            }
            cuz cuzVar = (cuz) objS3;
            hmwVar.ab();
            hmlVarC.v(-240524678);
            if (fdbq.f(dhkVar2.e(), dhkVar2.f()) && (iacVar2.a() != 1 || !fdbq.f(iacVar2.get(0), dhkVar2.f()))) {
                hmlVarC.v(5004770);
                int i5 = i4 & 14;
                Object objS4 = hmwVar.S();
                if (i5 == 4 || objS4 == obj) {
                    objS4 = new fdap() { // from class: djsy
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj3) {
                            return Boolean.valueOf(!fdbq.f(obj3, dhkVar2.f()));
                        }
                    };
                    hmwVar.af(objS4);
                }
                hmwVar.ab();
                fcva.x(iacVar2, (fdap) objS4);
                cuzVar.d();
            }
            hmwVar.ab();
            hmlVarC.v(-240513196);
            if (!cuzVar.g(dhkVar2.f())) {
                iaq iaqVar = new iaq(iacVar2, 0);
                int i6 = 0;
                while (true) {
                    if (!iaqVar.hasNext()) {
                        i6 = -1;
                        break;
                    } else if (fdbq.f(fdapVar3.invoke(iaqVar.next()), fdapVar3.invoke(dhkVar2.f()))) {
                        break;
                    } else {
                        i6++;
                    }
                }
                if (i6 == -1) {
                    iacVar2.add(dhkVar2.f());
                } else {
                    iacVar2.set(i6, dhkVar2.f());
                }
                cuzVar.d();
                int iA = iacVar2.a();
                int i7 = 0;
                while (i7 < iA) {
                    Object obj3 = iacVar2.get(i7);
                    cuzVar.e(obj3, hxe.d(1605336364, new djtd(dhkVar2, dewVar, i7, obj3, fdauVar2), hmlVarC));
                    i7++;
                    dhkVar2 = dhkVar;
                    fdauVar2 = fdauVar;
                }
            }
            hmwVar.ab();
            ixm ixmVarA = ecz.a(ibw.a, false);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
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
            hmlVarC.v(-305332505);
            int iA2 = iacVar2.a();
            for (int i9 = 0; i9 < iA2; i9++) {
                Object obj4 = iacVar2.get(i9);
                hmlVarC.u(-1398374120, fdapVar3.invoke(obj4));
                fdat fdatVar2 = (fdat) cuzVar.f(obj4);
                if (fdatVar2 != null) {
                    fdatVar2.a(hmlVarC, 0);
                }
                hmwVar.ab();
            }
            hmwVar.ab();
            hmlVarC.n();
            fdapVar2 = fdapVar3;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djsz
                @Override // defpackage.fdat
                public final Object a(Object obj5, Object obj6) {
                    ((Integer) obj6).intValue();
                    dhk dhkVar3 = dhkVar;
                    ics icsVar2 = icsVar;
                    dew dewVar2 = dewVar;
                    fdap fdapVar4 = fdapVar2;
                    djte.a(dhkVar3, icsVar2, dewVar2, fdapVar4, fdauVar, (hml) obj5, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final Object obj, ics icsVar, dew dewVar, fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        final dew dewVar2;
        final fdau fdauVar2;
        final ics icsVar2;
        fdauVar.getClass();
        hml hmlVarC = hmlVar.c(-2005669070);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(obj) : hmlVarC.F(obj)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.F(dewVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.D("ImageBubbleCrossFade") ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != hmlVarC.F(fdauVar) ? 8192 : 16384;
        }
        if ((i3 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
            fdauVar2 = fdauVar;
            dewVar2 = dewVar;
            icsVar2 = icsVar;
        } else {
            ico icoVar = ics.e;
            a(dhy.d(obj, "ImageBubbleCrossFade", hmlVarC, ((i3 >> 6) & 112) | (i3 & 14), 0), icoVar, dewVar, null, fdauVar, hmlVarC, i3 & 58352);
            dewVar2 = dewVar;
            fdauVar2 = fdauVar;
            icsVar2 = icoVar;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djsw
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    Object obj4 = obj;
                    ics icsVar3 = icsVar2;
                    dew dewVar3 = dewVar2;
                    djte.b(obj4, icsVar3, dewVar3, fdauVar2, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
