package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djto {
    public static final Uri a(hox hoxVar) {
        return (Uri) hoxVar.a();
    }

    public static final Uri b(hox hoxVar) {
        return (Uri) hoxVar.a();
    }

    public static final boolean c(Uri uri) {
        return uri == null || fdbq.f(uri, Uri.EMPTY);
    }

    public static final void d(djtg djtgVar, final Object obj, eve eveVar, final iva ivaVar, hml hmlVar, final int i) {
        int i2;
        djtg djtgVar2;
        eve eveVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1761516952);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djtgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(eveVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(ivaVar) ? 1024 : 2048;
        }
        if ((i2 & 1155) == 1154 && hmlVarC.I()) {
            hmlVarC.s();
            djtgVar2 = djtgVar;
            eveVar2 = eveVar;
        } else {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj2 = hmk.a;
            if (objS == obj2) {
                hpl hplVar = new hpl(null, hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            hox hoxVar = (hox) objS;
            hmwVar.ab();
            if (a(hoxVar) == null && djtgVar.k() != null) {
                hoxVar.b(djtgVar.k());
            }
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar.S();
            if (objS2 == obj2) {
                hpl hplVar2 = new hpl(djtgVar.l(), hsi.a);
                hmwVar.af(hplVar2);
                objS2 = hplVar2;
            }
            hox hoxVar2 = (hox) objS2;
            hmwVar.ab();
            if (c(b(hoxVar2)) && !c(djtgVar.l())) {
                hoxVar2.b(djtgVar.l());
            }
            djtgVar2 = djtgVar;
            eveVar2 = eveVar;
            dkew.a(djtgVar2, null, eveVar2, a(hoxVar) != null, hxe.d(758448413, new djtn(hoxVar2, hoxVar, djtgVar, ivaVar), hmlVarC), hmlVarC, (i2 & 14) | 24576 | (i2 & 896), 2);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final djtg djtgVar3 = djtgVar2;
            final eve eveVar3 = eveVar2;
            hpxVarL.d = new fdat() { // from class: djth
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    djtg djtgVar4 = djtgVar3;
                    Object obj5 = obj;
                    eve eveVar4 = eveVar3;
                    djto.d(djtgVar4, obj5, eveVar4, ivaVar, (hml) obj3, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final djtg djtgVar, final Object obj, final eve eveVar, hml hmlVar, final int i) {
        int i2;
        obj.getClass();
        hml hmlVarC = hmlVar.c(61183376);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(djtgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(obj) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(eveVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.E(true) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            iva ivaVar = iuz.a;
            hmlVarC.v(5004770);
            int i3 = i2 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i3 == 4 || objS == hmk.a) {
                objS = new djtk(djtgVar, null);
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hob.g(djtgVar, (fdat) objS, hmlVarC);
            int iOrdinal = djtgVar.m().ordinal();
            if (iOrdinal == 0) {
                hmlVarC.v(1648258572);
                hmwVar.ab();
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: djti
                        @Override // defpackage.fdat
                        public final Object a(Object obj2, Object obj3) {
                            ((Integer) obj3).intValue();
                            djtg djtgVar2 = djtgVar;
                            Object obj4 = obj;
                            int i4 = i;
                            djto.e(djtgVar2, obj4, eveVar, (hml) obj2, hpy.a(i4 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                hmlVarC.v(-1332298897);
                String strP = djtgVar.p();
                String strO = djtgVar.o();
                String strA = djtgVar.a();
                if (strA == null) {
                    strA = "";
                }
                dioo.a(new diot(new dile(strP, strO, strA, 4), new dios(djtgVar.f().a, djtgVar.f().c), djtgVar.a(), djtgVar.d(), (fdae) null, 48), null, eveVar, hmlVarC, i2 & 896, 2);
                hmwVar.ab();
            } else {
                hmlVarC.v(1649130850);
                dknf.b(djtgVar.n(), null, hxe.d(-556514838, new djtl(djtgVar, obj, eveVar, ivaVar), hmlVarC), hmlVarC, 384);
                hmwVar.ab();
            }
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: djtj
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    djtg djtgVar2 = djtgVar;
                    Object obj4 = obj;
                    int i4 = i;
                    djto.e(djtgVar2, obj4, eveVar, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
