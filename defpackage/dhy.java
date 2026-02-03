package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhy {
    public static final /* synthetic */ int a = 0;

    static {
        fctd.b(3, new fdae() { // from class: dho
            @Override // defpackage.fdae
            public final Object invoke() {
                int i = dhy.a;
                iao iaoVar = new iao(new fdap() { // from class: dhq
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        int i2 = dhy.a;
                        ((fdae) obj).invoke();
                        return fctx.a;
                    }
                });
                iaoVar.d();
                return iaoVar;
            }
        });
    }

    public static final dhk a(final dhk dhkVar, Object obj, Object obj2, String str, hml hmlVar, int i) {
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i2 > 4 && hmlVar.D(dhkVar)) || (i & 6) == 4;
        Object objF = hmlVar.f();
        if (z2 || objF == hmk.a) {
            objF = new dhk(new dfw(obj), dhkVar, dhkVar.b + " > " + str);
            hmlVar.y(objF);
        }
        final dhk dhkVar2 = (dhk) objF;
        if ((i2 <= 4 || !hmlVar.D(dhkVar)) && (i & 6) != 4) {
            z = false;
        }
        boolean zD = hmlVar.D(dhkVar2) | z;
        Object objF2 = hmlVar.f();
        if (zD || objF2 == hmk.a) {
            objF2 = new fdap() { // from class: dhm
                @Override // defpackage.fdap
                public final Object invoke(Object obj3) {
                    int i3 = dhy.a;
                    dhk dhkVar3 = dhkVar;
                    iac iacVar = dhkVar3.e;
                    dhk dhkVar4 = dhkVar2;
                    iacVar.add(dhkVar4);
                    return new dht(dhkVar3, dhkVar4);
                }
            };
            hmlVar.y(objF2);
        }
        hob.c(dhkVar2, (fdap) objF2, hmlVar);
        if (dhkVar.t()) {
            long j = dhkVar.f;
            dhkVar2.v(obj, obj2);
            return dhkVar2;
        }
        dhkVar2.q(obj2);
        dhkVar2.m(false);
        return dhkVar2;
    }

    public static final dhk b(dhz dhzVar, String str, hml hmlVar, int i, int i2) {
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !hmlVar.D(dhzVar)) && (i & 6) != 4) {
            z = false;
        }
        Object objF = hmlVar.f();
        if (z || objF == hmk.a) {
            hzg hzgVarA = hzf.a();
            fdap fdapVarK = hzgVarA != null ? hzgVarA.k() : null;
            hzg hzgVarB = hzf.b(hzgVarA);
            try {
                if ((i2 & 2) != 0) {
                    str = null;
                }
                Object dhkVar = new dhk(dhzVar, null, str);
                hzf.e(hzgVarA, hzgVarB, fdapVarK);
                hmlVar.y(dhkVar);
                objF = dhkVar;
            } catch (Throwable th) {
                hzf.e(hzgVarA, hzgVarB, fdapVarK);
                throw th;
            }
        }
        final dhk dhkVar2 = (dhk) objF;
        hmlVar.v(-1357128064);
        dhkVar2.g(dhzVar.b(), hmlVar, 0);
        hmlVar.o();
        boolean zD = hmlVar.D(dhkVar2);
        Object objF2 = hmlVar.f();
        if (zD || objF2 == hmk.a) {
            objF2 = new fdap() { // from class: dhl
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    int i3 = dhy.a;
                    return new dhw(dhkVar2);
                }
            };
            hmlVar.y(objF2);
        }
        hob.c(dhkVar2, (fdap) objF2, hmlVar);
        return dhkVar2;
    }

    @fcsv
    public static final dhk c(dfw dfwVar, String str, hml hmlVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        return b(dfwVar, str, hmlVar, i & 126, 0);
    }

    public static final dhk d(Object obj, String str, hml hmlVar, int i, int i2) {
        hmw hmwVar = (hmw) hmlVar;
        Object objS = hmwVar.S();
        Object obj2 = hmk.a;
        if (objS == obj2) {
            if ((i2 & 2) != 0) {
                str = null;
            }
            dhk dhkVar = new dhk(new dfw(obj), null, str);
            hmwVar.af(dhkVar);
            objS = dhkVar;
        }
        final dhk dhkVar2 = (dhk) objS;
        dhkVar2.g(obj, hmlVar, (i & 8) | 48 | (i & 14));
        Object objS2 = hmwVar.S();
        if (objS2 == obj2) {
            objS2 = new fdap() { // from class: dhr
                @Override // defpackage.fdap
                public final Object invoke(Object obj3) {
                    int i3 = dhy.a;
                    return new dhx(dhkVar2);
                }
            };
            hmwVar.af(objS2);
        }
        hob.c(dhkVar2, (fdap) objS2, hmlVar);
        return dhkVar2;
    }

    public static final void e(final dhk dhkVar, final dhg dhgVar, final Object obj, final Object obj2, final dew dewVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(867041821);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dhkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dhgVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? hmlVarC.D(obj) : hmlVarC.F(obj)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? hmlVarC.D(obj2) : hmlVarC.F(obj2)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((32768 & i) == 0 ? hmlVarC.D(dewVar) : hmlVarC.F(dewVar)) ? 8192 : 16384;
        }
        if (!hmlVarC.J((i2 & 9363) != 9362, i2 & 1)) {
            hmlVarC.s();
        } else if (dhkVar.t()) {
            dhgVar.j(obj, obj2, dewVar);
        } else {
            dhgVar.k(obj2, dewVar);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dhs
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    hml hmlVar2 = (hml) obj3;
                    ((Integer) obj4).intValue();
                    dhk dhkVar2 = dhkVar;
                    dhg dhgVar2 = dhgVar;
                    Object obj5 = obj;
                    int i4 = i;
                    dhy.e(dhkVar2, dhgVar2, obj5, obj2, dewVar, hmlVar2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final hsf f(final dhk dhkVar, Object obj, Object obj2, dew dewVar, dib dibVar, hml hmlVar, int i) {
        Object obj3;
        int i2 = i & 14;
        int i3 = i2 ^ 6;
        boolean z = (i3 > 4 && hmlVar.D(dhkVar)) || (i & 6) == 4;
        Object objF = hmlVar.f();
        if (z || objF == hmk.a) {
            hzg hzgVarA = hzf.a();
            fdap fdapVarK = hzgVarA != null ? hzgVarA.k() : null;
            hzg hzgVarB = hzf.b(hzgVarA);
            try {
                obj3 = obj2;
                Object dhgVar = new dhg(dhkVar, obj, dec.a(dibVar, obj2), dibVar);
                hzf.e(hzgVarA, hzgVarB, fdapVarK);
                hmlVar.y(dhgVar);
                objF = dhgVar;
            } catch (Throwable th) {
                hzf.e(hzgVarA, hzgVarB, fdapVarK);
                throw th;
            }
        } else {
            obj3 = obj2;
        }
        int i4 = (i >> 3) & 8;
        int i5 = i << 3;
        int i6 = (i4 << 9) | i2 | (i4 << 6) | (i5 & 896) | (i5 & 7168) | (57344 & i5);
        final dhg dhgVar2 = (dhg) objF;
        e(dhkVar, dhgVar2, obj, obj3, dewVar, hmlVar, i6);
        boolean zD = hmlVar.D(dhgVar2) | ((i3 > 4 && hmlVar.D(dhkVar)) || (i & 6) == 4);
        Object objF2 = hmlVar.f();
        if (zD || objF2 == hmk.a) {
            objF2 = new fdap() { // from class: dhp
                @Override // defpackage.fdap
                public final Object invoke(Object obj4) {
                    int i7 = dhy.a;
                    dhk dhkVar2 = dhkVar;
                    dhg dhgVar3 = dhgVar2;
                    dhkVar2.u(dhgVar3);
                    return new dhv(dhkVar2, dhgVar3);
                }
            };
            hmlVar.y(objF2);
        }
        hob.c(dhgVar2, (fdap) objF2, hmlVar);
        return dhgVar2;
    }

    public static final dhc g(final dhk dhkVar, dib dibVar, hml hmlVar, int i) {
        dhb dhbVarA;
        int i2 = (i & 14) ^ 6;
        boolean z = (i2 > 4 && hmlVar.D(dhkVar)) || (i & 6) == 4;
        Object objF = hmlVar.f();
        if (z || objF == hmk.a) {
            objF = new dhc(dhkVar, dibVar);
            hmlVar.y(objF);
        }
        final dhc dhcVar = (dhc) objF;
        boolean zF = hmlVar.F(dhcVar) | ((i2 > 4 && hmlVar.D(dhkVar)) || (i & 6) == 4);
        Object objF2 = hmlVar.f();
        if (zF || objF2 == hmk.a) {
            objF2 = new fdap() { // from class: dhn
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    int i3 = dhy.a;
                    return new dhu(dhkVar, dhcVar);
                }
            };
            hmlVar.y(objF2);
        }
        hob.c(dhcVar, (fdap) objF2, hmlVar);
        if (dhkVar.t() && (dhbVarA = dhcVar.a()) != null) {
            dhk dhkVar2 = dhcVar.a;
            dhbVarA.a.j(dhbVarA.c.invoke(dhkVar2.d().a()), dhbVarA.c.invoke(dhkVar2.d().b()), (dew) dhbVarA.b.invoke(dhkVar2.d()));
        }
        return dhcVar;
    }
}
