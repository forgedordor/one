package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxyz implements cxwl {
    private final String a;
    private final cxzd b;

    public cxyz(String str, cxzb cxzbVar) {
        this.a = str;
        this.b = new cxzd(cxzbVar);
    }

    @Override // defpackage.cxwl
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cxwl
    public final void b(hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1779468213);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = hob.a(fcyi.a, hmlVarC);
                hmwVar.af(objS);
            }
            cxzd cxzdVar = this.b;
            fdjx fdjxVar = (fdjx) objS;
            hmlVarC.v(5004770);
            boolean zF = hmlVarC.F(fdjxVar);
            Object objS2 = hmwVar.S();
            if (zF || objS2 == obj) {
                objS2 = new cxyy(fdjxVar, null);
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            c((daka) daki.a(cxzdVar, (fdat) objS2, hmlVarC, 0).a(), hmlVarC, (i2 << 3) & 112);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cxyw
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int i4 = i;
                    this.a.b((hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void c(final daka dakaVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-874764996);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(dakaVar) : hmlVarC.F(dakaVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(this) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            foc.a(efy.d(ics.e, 10.0f), glz.a(hmlVarC).r, 0.0f, hxe.d(-1618084615, new cxyx(dakaVar, this), hmlVarC), hmlVarC, 1572870, 58);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cxyu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cxyz cxyzVar = this.a;
                    int i4 = i;
                    cxyzVar.c(dakaVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void d(final cpyi cpyiVar, final int i, hml hmlVar, final int i2) {
        int i3;
        hml hmlVar2;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(778872385);
        if (i4 == 0) {
            i3 = (true != hmlVarC.B(cpyiVar.ordinal()) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.B(i) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            icc iccVar = ibw.n;
            ico icoVar = ics.e;
            ics icsVarE = egq.e(icoVar, 25.0f);
            ixm ixmVarA = egk.a(ecr.a, iccVar, hmlVarC, 48);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
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
            egp egpVar = egp.a;
            String strName = cpyiVar.name();
            jyq jyqVar = glz.d(hmlVarC).k;
            hmlVar2 = hmlVarC;
            dthx.b(strName, egpVar.a(joj.a(icoVar, "Label for '" + cpyiVar.name() + "'"), 0.8f, true), glz.a(hmlVarC).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jyqVar, hmlVar2, 0, 0, 65528);
            String strValueOf = String.valueOf(i);
            jyq jyqVarY = jyq.y(glz.d(hmlVar2).k, 0L, 0L, kcc.h, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777211);
            dthx.b(strValueOf, egpVar.a(joj.a(icoVar, "Count for '" + cpyiVar.name() + "'"), 0.19999999f, true), glz.a(hmlVar2).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jyqVarY, hmlVar2, 0, 0, 65528);
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cxyv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cxyz cxyzVar = this.a;
                    cpyi cpyiVar2 = cpyiVar;
                    int i6 = i2;
                    cxyzVar.d(cpyiVar2, i, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
