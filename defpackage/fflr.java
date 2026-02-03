package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fflr extends fflp {
    public fflr(ffli ffliVar, ffln fflnVar, ffln fflnVar2) {
        super(ffliVar, fflnVar, fflnVar2);
    }

    protected static final ffln h(ffln fflnVar) {
        ffln fflnVarE = fflnVar.e(fflnVar);
        return fflnVarE.e(fflnVarE);
    }

    protected static final ffln i(ffln fflnVar) {
        return fflnVar.e(fflnVar).e(fflnVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0133  */
    @Override // defpackage.ffls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ffls d(defpackage.ffls r19) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fflr.d(ffls):ffls");
    }

    @Override // defpackage.ffls
    public final ffls e() {
        if (q()) {
            return this;
        }
        ffli ffliVar = this.b;
        return ffliVar.i != 0 ? new fflr(ffliVar, this.c, this.d.l(), this.e) : new fflr(ffliVar, this.c, this.d.l());
    }

    @Override // defpackage.ffls
    public final ffls f() {
        boolean z;
        ffln fflnVarQ;
        ffln fflnVarH;
        ffln fflnVarN;
        if (q()) {
            return this;
        }
        ffli ffliVar = this.b;
        ffln fflnVar = this.d;
        if (fflnVar.s()) {
            return ffliVar.f();
        }
        int i = ffliVar.i;
        ffln fflnVar2 = this.c;
        if (i == 0) {
            ffln fflnVarG = i(fflnVar2.n()).e(this.b.e).g(fflnVar.e(fflnVar));
            ffln fflnVarQ2 = fflnVarG.n().q(fflnVar2.e(fflnVar2));
            return new fflr(ffliVar, fflnVarQ2, fflnVarG.i(fflnVar2.q(fflnVarQ2)).q(fflnVar));
        }
        if (i == 1) {
            ffln fflnVar3 = this.e[0];
            boolean zR = fflnVar3.r();
            ffln fflnVarI = ffliVar.e;
            if (!fflnVarI.s() && !zR) {
                fflnVarI = fflnVarI.i(fflnVar3.n());
            }
            ffln fflnVarE = fflnVarI.e(i(fflnVar2.n()));
            ffln fflnVarI2 = zR ? fflnVar : fflnVar.i(fflnVar3);
            ffln fflnVarN2 = zR ? fflnVar.n() : fflnVarI2.i(fflnVar);
            ffln fflnVarH2 = h(fflnVar2.i(fflnVarN2));
            ffln fflnVarQ3 = fflnVarE.n().q(fflnVarH2.e(fflnVarH2));
            ffln fflnVarE2 = fflnVarI2.e(fflnVarI2);
            ffln fflnVarI3 = fflnVarQ3.i(fflnVarE2);
            ffln fflnVarE3 = fflnVarN2.e(fflnVarN2);
            ffln fflnVarI4 = fflnVarH2.q(fflnVarQ3).i(fflnVarE);
            ffln fflnVarN3 = fflnVarE3.n();
            ffln fflnVarQ4 = fflnVarI4.q(fflnVarN3.e(fflnVarN3));
            ffln fflnVarE4 = zR ? fflnVarE3.e(fflnVarE3) : fflnVarE2.n();
            return new fflr(ffliVar, fflnVarI3, fflnVarQ4, new ffln[]{fflnVarE4.e(fflnVarE4).i(fflnVarI2)});
        }
        if (i != 2) {
            if (i != 4) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            ffln fflnVar4 = this.d;
            ffln[] fflnVarArr = this.e;
            ffln fflnVar5 = fflnVarArr[0];
            ffln fflnVarG2 = fflnVarArr[1];
            if (fflnVarG2 == null) {
                fflnVarG2 = g(fflnVar5, null);
                fflnVarArr[1] = fflnVarG2;
            }
            ffln fflnVarE5 = i(fflnVar2.n()).e(fflnVarG2);
            ffln fflnVarE6 = fflnVar4.e(fflnVar4);
            ffln fflnVarI5 = fflnVarE6.i(fflnVar4);
            ffln fflnVarI6 = fflnVar2.i(fflnVarI5);
            ffln fflnVarE7 = fflnVarI6.e(fflnVarI6);
            ffln fflnVarQ5 = fflnVarE5.n().q(fflnVarE7.e(fflnVarE7));
            ffln fflnVarN4 = fflnVarI5.n();
            ffln fflnVarE8 = fflnVarN4.e(fflnVarN4);
            ffln fflnVarQ6 = fflnVarE5.i(fflnVarE7.q(fflnVarQ5)).q(fflnVarE8);
            ffln fflnVarI7 = fflnVarE8.i(fflnVarG2);
            ffln fflnVarE9 = fflnVarI7.e(fflnVarI7);
            if (!fflnVar5.r()) {
                fflnVarE6 = fflnVarE6.i(fflnVar5);
            }
            return new fflr(this.b, fflnVarQ5, fflnVarQ6, new ffln[]{fflnVarE6, fflnVarE9});
        }
        ffln fflnVar6 = this.e[0];
        boolean zR2 = fflnVar6.r();
        ffln fflnVarN5 = fflnVar.n();
        ffln fflnVarN6 = fflnVarN5.n();
        ffln fflnVar7 = ffliVar.e;
        ffln fflnVarL = fflnVar7.l();
        if (fflnVarL.d().equals(BigInteger.valueOf(3L))) {
            if (zR2) {
                fflnVarN = fflnVar6;
                z = true;
            } else {
                fflnVarN = fflnVar6.n();
                z = false;
            }
            fflnVarQ = i(fflnVar2.e(fflnVarN).i(fflnVar2.q(fflnVarN)));
            fflnVarH = h(fflnVarN5.i(fflnVar2));
        } else {
            ffln fflnVarI8 = i(fflnVar2.n());
            if (zR2) {
                fflnVarQ = fflnVarI8.e(fflnVar7);
                z = true;
            } else if (fflnVar7.s()) {
                z = false;
                fflnVarQ = fflnVarI8;
            } else {
                ffln fflnVarN7 = fflnVar6.n().n();
                fflnVarQ = fflnVarL.b() < fflnVar7.b() ? fflnVarI8.q(fflnVarN7.i(fflnVarL)) : fflnVarI8.e(fflnVarN7.i(fflnVar7));
                z = false;
            }
            fflnVarH = h(fflnVar2.i(fflnVarN5));
        }
        ffln fflnVarQ7 = fflnVarQ.n().q(fflnVarH.e(fflnVarH));
        ffln fflnVarQ8 = fflnVarH.q(fflnVarQ7).i(fflnVarQ).q(h(fflnVarN6.e(fflnVarN6)));
        ffln fflnVarE10 = fflnVar.e(fflnVar);
        if (!z) {
            fflnVarE10 = fflnVarE10.i(fflnVar6);
        }
        return new fflr(ffliVar, fflnVarQ7, fflnVarQ8, new ffln[]{fflnVarE10});
    }

    protected final ffln g(ffln fflnVar, ffln fflnVar2) {
        ffln fflnVar3 = this.b.e;
        if (fflnVar3.s() || fflnVar.r()) {
            return fflnVar3;
        }
        if (fflnVar2 == null) {
            fflnVar2 = fflnVar.n();
        }
        ffln fflnVarN = fflnVar2.n();
        ffln fflnVarL = fflnVar3.l();
        return fflnVarL.b() < fflnVar3.b() ? fflnVarN.i(fflnVarL).l() : fflnVarN.i(fflnVar3);
    }

    public fflr(ffli ffliVar, ffln fflnVar, ffln fflnVar2, ffln[] fflnVarArr) {
        super(ffliVar, fflnVar, fflnVar2, fflnVarArr);
    }
}
