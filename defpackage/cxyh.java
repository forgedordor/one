package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxyh implements cxwl {
    private static final cqce c = cqce.g("BugleCms", "OverviewPage");
    public final cxze a;
    public final cyak b;
    private final String d = "Overview";

    public cxyh(cxze cxzeVar, cyak cyakVar) {
        this.a = cxzeVar;
        this.b = cyakVar;
    }

    private static final hsf e(fdap fdapVar, hml hmlVar) {
        hmlVar.v(-1067481995);
        hmlVar.v(5004770);
        boolean zF = hmlVar.F(fdapVar);
        hmw hmwVar = (hmw) hmlVar;
        Object objS = hmwVar.S();
        if (zF || objS == hmk.a) {
            objS = new cxyf(fdapVar, null);
            hmwVar.af(objS);
        }
        hmwVar.ab();
        hsf hsfVarB = daki.b((fdap) objS, hmlVar);
        hmwVar.ab();
        return hsfVarB;
    }

    @Override // defpackage.cxwl
    public final String a() {
        return this.d;
    }

    @Override // defpackage.cxwl
    public final void b(hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1988283477);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            cxxp[] cxxpVarArr = new cxxp[7];
            hmlVarC.v(5004770);
            boolean zF = hmlVarC.F(this);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new cxxq(this, null);
                hmwVar.af(objS);
            }
            fdap fdapVar = (fdap) objS;
            hmwVar.ab();
            hmlVarC.v(1353766746);
            hmlVarC.v(5004770);
            boolean zF2 = hmlVarC.F(fdapVar);
            Object objS2 = hmwVar.S();
            if (zF2 || objS2 == hmk.a) {
                objS2 = new cxyg(fdapVar, null);
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            hsf hsfVarB = daki.b((fdap) objS2, hmlVarC);
            hmwVar.ab();
            cxxpVarArr[0] = new cxxp("Created at", hsfVarB);
            hmlVarC.v(5004770);
            boolean zF3 = hmlVarC.F(this);
            Object objS3 = hmwVar.S();
            if (zF3 || objS3 == hmk.a) {
                objS3 = new cxxr(this, null);
                hmwVar.af(objS3);
            }
            hmwVar.ab();
            cxxpVarArr[1] = new cxxp("Messages", e((fdap) objS3, hmlVarC));
            hmlVarC.v(5004770);
            boolean zF4 = hmlVarC.F(this);
            Object objS4 = hmwVar.S();
            if (zF4 || objS4 == hmk.a) {
                objS4 = new cxxs(this, null);
                hmwVar.af(objS4);
            }
            hmwVar.ab();
            cxxpVarArr[2] = new cxxp("Participants", e((fdap) objS4, hmlVarC));
            hmlVarC.v(5004770);
            boolean zF5 = hmlVarC.F(this);
            Object objS5 = hmwVar.S();
            if (zF5 || objS5 == hmk.a) {
                objS5 = new cxxt(this, null);
                hmwVar.af(objS5);
            }
            hmwVar.ab();
            cxxpVarArr[3] = new cxxp("Conversations", e((fdap) objS5, hmlVarC));
            hmlVarC.v(5004770);
            boolean zF6 = hmlVarC.F(this);
            Object objS6 = hmwVar.S();
            if (zF6 || objS6 == hmk.a) {
                objS6 = new cxxu(this, null);
                hmwVar.af(objS6);
            }
            hmwVar.ab();
            cxxpVarArr[4] = new cxxp("Files", e((fdap) objS6, hmlVarC));
            hmlVarC.v(5004770);
            boolean zF7 = hmlVarC.F(this);
            Object objS7 = hmwVar.S();
            if (zF7 || objS7 == hmk.a) {
                objS7 = new cxxv(this, null);
                hmwVar.af(objS7);
            }
            hmwVar.ab();
            cxxpVarArr[5] = new cxxp("Backup keys", e((fdap) objS7, hmlVarC));
            hmlVarC.v(5004770);
            boolean zF8 = hmlVarC.F(this);
            Object objS8 = hmwVar.S();
            if (zF8 || objS8 == hmk.a) {
                objS8 = new cxxw(this, null);
                hmwVar.af(objS8);
            }
            hmwVar.ab();
            cxxpVarArr[6] = new cxxp("Encryption keys", e((fdap) objS8, hmlVarC));
            int i4 = ((i2 << 6) & 896) | 6;
            c("CMS Box Stats", fcva.g(cxxpVarArr), hmlVarC, i4);
            cxxp[] cxxpVarArr2 = new cxxp[2];
            hmlVarC.v(5004770);
            boolean zF9 = hmlVarC.F(this);
            Object objS9 = hmwVar.S();
            if (zF9 || objS9 == hmk.a) {
                objS9 = new cxya(this, null);
                hmwVar.af(objS9);
            }
            hmwVar.ab();
            cxxpVarArr2[0] = new cxxp("Is Paused", daki.c((fdap) objS9, hmlVarC));
            hmlVarC.v(5004770);
            boolean zF10 = hmlVarC.F(this);
            Object objS10 = hmwVar.S();
            if (zF10 || objS10 == hmk.a) {
                objS10 = new cxye(this, null);
                hmwVar.af(objS10);
            }
            hmwVar.ab();
            cxxpVarArr2[1] = new cxxp("Has Queued Sync Requests", daki.c((fdap) objS10, hmlVarC));
            c("Telephony Forward Sync", fcva.g(cxxpVarArr2), hmlVarC, i4);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cxxm
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    this.a.b((hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void c(final String str, final List list, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(630928648);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(list) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(this) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            foc.a(efy.d(ics.e, 10.0f), glz.a(hmlVarC).r, 0.0f, hxe.d(-165722747, new cxxo(str, list, this), hmlVarC), hmlVarC, 1572870, 58);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cxxn
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cxyh cxyhVar = this.a;
                    String str2 = str;
                    int i4 = i;
                    cxyhVar.c(str2, list, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void d(final String str, final daka dakaVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1847407983);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? hmlVarC.D(dakaVar) : hmlVarC.F(dakaVar)) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            icc iccVar = ibw.n;
            ico icoVar = ics.e;
            ics icsVarE = egq.e(icoVar, 40.0f);
            ixm ixmVarA = egk.a(ecr.a, iccVar, hmlVarC, 48);
            long jB = hmg.b(hmlVarC);
            long j = (jB >>> 32) ^ jB;
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
            if (dakaVar instanceof dajy) {
                hmlVarC.v(-1058722689);
                fsa.e(joj.a(efy.j(icoVar, 0.0f, 4.0f, 0.0f, 0.0f, 13), a.a(str, "Loader for '", "'")), 0L, 0L, hmlVarC, 0);
                hmwVar.ab();
            } else if (dakaVar instanceof dajz) {
                hmlVarC.v(1539467908);
                dthx.b(str + ": " + ((dajz) dakaVar).a, joj.a(icoVar, a.a(str, "Value for '", "'")), glz.a(hmlVarC).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).j, hmlVarC, 0, 0, 65528);
                hmlVarC = hmlVarC;
                hmwVar.ab();
            } else {
                if (!(dakaVar instanceof dajx)) {
                    hmlVarC.v(-1058724131);
                    hmwVar.ab();
                    throw new fctg();
                }
                hmlVarC.v(1539746536);
                c.s(a.a(str, "Failed to load data for '", "'"), (Throwable) ((dajx) dakaVar).a);
                dthx.b("Error", joj.a(icoVar, a.a(str, "Error for '", "'")), glz.a(hmlVarC).w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).j, hmlVarC, 6, 0, 65528);
                hmlVarC = hmlVarC;
                hmwVar.ab();
            }
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cxxl
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cxyh cxyhVar = this.a;
                    String str2 = str;
                    int i5 = i;
                    cxyhVar.d(str2, dakaVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
