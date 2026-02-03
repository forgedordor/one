package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fflq extends fflo {
    public fflq(ffli ffliVar, ffln fflnVar, ffln fflnVar2) {
        super(ffliVar, fflnVar, fflnVar2);
    }

    @Override // defpackage.ffls
    public final ffln c() {
        int iJ = j();
        if (iJ != 5 && iJ != 6) {
            return this.d;
        }
        ffln fflnVar = this.c;
        ffln fflnVar2 = this.d;
        if (q() || fflnVar.s()) {
            return fflnVar2;
        }
        ffln fflnVarI = fflnVar2.e(fflnVar).i(fflnVar);
        if (iJ == 6) {
            ffln fflnVar3 = this.e[0];
            if (!fflnVar3.r()) {
                return fflnVarI.g(fflnVar3);
            }
        }
        return fflnVarI;
    }

    @Override // defpackage.ffls
    public final ffls d(ffls fflsVar) {
        ffln fflnVarI;
        ffln fflnVarI2;
        ffln fflnVarI3;
        ffln fflnVarD;
        ffln fflnVarE;
        ffln fflnVarE2;
        if (q()) {
            return fflsVar;
        }
        if (fflsVar.q()) {
            return this;
        }
        ffli ffliVar = this.b;
        int i = ffliVar.i;
        ffln fflnVarI4 = this.c;
        ffln fflnVar = fflsVar.c;
        if (i == 0) {
            ffln fflnVar2 = this.d;
            ffln fflnVar3 = fflsVar.d;
            ffln fflnVarE3 = fflnVarI4.e(fflnVar);
            ffln fflnVarE4 = fflnVar2.e(fflnVar3);
            if (fflnVarE3.s()) {
                return fflnVarE4.s() ? f() : ffliVar.f();
            }
            ffln fflnVarG = fflnVarE4.g(fflnVarE3);
            ffln fflnVarE5 = fflnVarG.n().e(fflnVarG).e(fflnVarE3).e(ffliVar.e);
            return new fflq(ffliVar, fflnVarE5, fflnVarG.i(fflnVarI4.e(fflnVarE5)).e(fflnVarE5).e(fflnVar2));
        }
        if (i == 1) {
            ffln fflnVar4 = this.d;
            ffln fflnVarI5 = this.e[0];
            ffln fflnVar5 = fflsVar.d;
            ffln fflnVar6 = fflsVar.e[0];
            boolean zR = fflnVar6.r();
            ffln fflnVarE6 = fflnVarI5.i(fflnVar5).e(zR ? fflnVar4 : fflnVar4.i(fflnVar6));
            ffln fflnVarE7 = fflnVarI5.i(fflnVar).e(zR ? fflnVarI4 : fflnVarI4.i(fflnVar6));
            if (fflnVarE7.s()) {
                return fflnVarE6.s() ? f() : ffliVar.f();
            }
            ffln fflnVarN = fflnVarE7.n();
            ffln fflnVarI6 = fflnVarN.i(fflnVarE7);
            if (!zR) {
                fflnVarI5 = fflnVarI5.i(fflnVar6);
            }
            ffln fflnVarE8 = fflnVarE6.e(fflnVarE7);
            ffln fflnVarE9 = fflnVarE8.k(fflnVarE6, fflnVarN, ffliVar.e).i(fflnVarI5).e(fflnVarI6);
            ffln fflnVarI7 = fflnVarE7.i(fflnVarE9);
            if (!zR) {
                fflnVarN = fflnVarN.i(fflnVar6);
            }
            return new fflq(ffliVar, fflnVarI7, fflnVarE6.k(fflnVarI4, fflnVarE7, fflnVar4).k(fflnVarN, fflnVarE8, fflnVarE9), new ffln[]{fflnVarI6.i(fflnVarI5)});
        }
        if (i != 6) {
            throw new IllegalStateException("unsupported coordinate system");
        }
        if (fflnVarI4.s()) {
            return fflnVar.s() ? ffliVar.f() : fflsVar.d(this);
        }
        ffln fflnVar7 = this.d;
        ffln fflnVar8 = this.e[0];
        ffln fflnVar9 = fflsVar.d;
        ffln fflnVar10 = fflsVar.e[0];
        boolean zR2 = fflnVar8.r();
        if (zR2) {
            fflnVarI = fflnVar;
            fflnVarI2 = fflnVar9;
        } else {
            fflnVarI = fflnVar.i(fflnVar8);
            fflnVarI2 = fflnVar9.i(fflnVar8);
        }
        boolean zR3 = fflnVar10.r();
        if (zR3) {
            fflnVarI3 = fflnVar7;
        } else {
            fflnVarI4 = fflnVarI4.i(fflnVar10);
            fflnVarI3 = fflnVar7.i(fflnVar10);
        }
        ffln fflnVarE10 = fflnVarI3.e(fflnVarI2);
        ffln fflnVarE11 = fflnVarI4.e(fflnVarI);
        if (fflnVarE11.s()) {
            return fflnVarE10.s() ? f() : ffliVar.f();
        }
        if (fflnVar.s()) {
            ffls fflsVarM = m();
            ffln fflnVar11 = fflsVarM.c;
            ffln fflnVarC = fflsVarM.c();
            ffln fflnVarG2 = fflnVarC.e(fflnVar9).g(fflnVar11);
            fflnVarE2 = fflnVarG2.n().e(fflnVarG2).e(fflnVar11).e(ffliVar.e);
            if (fflnVarE2.s()) {
                return new fflq(ffliVar, fflnVarE2, ffliVar.f.m());
            }
            fflnVarE = fflnVarG2.i(fflnVar11.e(fflnVarE2)).e(fflnVarE2).e(fflnVarC).g(fflnVarE2).e(fflnVarE2);
            fflnVarD = ffliVar.d(ffld.b);
        } else {
            ffln fflnVarN2 = fflnVarE11.n();
            ffln fflnVarI8 = fflnVarE10.i(fflnVarI4);
            ffln fflnVarI9 = fflnVarE10.i(fflnVarI);
            ffln fflnVarI10 = fflnVarI8.i(fflnVarI9);
            if (fflnVarI10.s()) {
                return new fflq(ffliVar, fflnVarI10, ffliVar.f.m());
            }
            ffln fflnVarI11 = fflnVarE10.i(fflnVarN2);
            ffln fflnVarI12 = !zR3 ? fflnVarI11.i(fflnVar10) : fflnVarI11;
            ffln fflnVarO = fflnVarI9.e(fflnVarN2).o(fflnVarI12, fflnVar7.e(fflnVar8));
            if (!zR2) {
                fflnVarI12 = fflnVarI12.i(fflnVar8);
            }
            fflnVarD = fflnVarI12;
            fflnVarE = fflnVarO;
            fflnVarE2 = fflnVarI10;
        }
        return new fflq(ffliVar, fflnVarE2, fflnVarE, new ffln[]{fflnVarD});
    }

    @Override // defpackage.ffls
    public final ffls e() {
        if (!q()) {
            ffln fflnVar = this.c;
            if (!fflnVar.s()) {
                int iJ = j();
                if (iJ == 0) {
                    return new fflq(this.b, fflnVar, this.d.e(fflnVar));
                }
                if (iJ == 1) {
                    return new fflq(this.b, fflnVar, this.d.e(fflnVar), new ffln[]{this.e[0]});
                }
                if (iJ == 5) {
                    return new fflq(this.b, fflnVar, this.d.f());
                }
                if (iJ != 6) {
                    throw new IllegalStateException("unsupported coordinate system");
                }
                ffln fflnVar2 = this.d;
                ffln fflnVar3 = this.e[0];
                return new fflq(this.b, fflnVar, fflnVar2.e(fflnVar3), new ffln[]{fflnVar3});
            }
        }
        return this;
    }

    @Override // defpackage.ffls
    public final ffls f() {
        ffln fflnVarE;
        if (q()) {
            return this;
        }
        ffli ffliVar = this.b;
        ffln fflnVarI = this.c;
        if (fflnVarI.s()) {
            return ffliVar.f();
        }
        int i = ffliVar.i;
        if (i == 0) {
            ffln fflnVarE2 = this.d.g(fflnVarI).e(fflnVarI);
            ffln fflnVarE3 = fflnVarE2.n().e(fflnVarE2).e(ffliVar.e);
            return new fflq(ffliVar, fflnVarE3, fflnVarI.o(fflnVarE3, fflnVarE2.f()));
        }
        if (i == 1) {
            ffln fflnVarI2 = this.d;
            ffln fflnVar = this.e[0];
            boolean zR = fflnVar.r();
            ffln fflnVarI3 = zR ? fflnVarI : fflnVarI.i(fflnVar);
            if (!zR) {
                fflnVarI2 = fflnVarI2.i(fflnVar);
            }
            ffln fflnVarN = fflnVarI.n();
            ffln fflnVarE4 = fflnVarN.e(fflnVarI2);
            ffln fflnVarN2 = fflnVarI3.n();
            ffln fflnVarE5 = fflnVarE4.e(fflnVarI3);
            ffln fflnVarK = fflnVarE5.k(fflnVarE4, fflnVarN2, ffliVar.e);
            return new fflq(ffliVar, fflnVarI3.i(fflnVarK), fflnVarN.n().k(fflnVarI3, fflnVarK, fflnVarE5), new ffln[]{fflnVarI3.i(fflnVarN2)});
        }
        if (i != 6) {
            throw new IllegalStateException("unsupported coordinate system");
        }
        ffln fflnVar2 = this.d;
        ffln fflnVar3 = this.e[0];
        boolean zR2 = fflnVar3.r();
        ffln fflnVarI4 = zR2 ? fflnVar2 : fflnVar2.i(fflnVar3);
        ffln fflnVarN3 = zR2 ? fflnVar3 : fflnVar3.n();
        ffln fflnVar4 = ffliVar.e;
        ffln fflnVarI5 = zR2 ? fflnVar4 : fflnVar4.i(fflnVarN3);
        ffln fflnVarE6 = fflnVar2.n().e(fflnVarI4).e(fflnVarI5);
        if (fflnVarE6.s()) {
            return new fflq(ffliVar, fflnVarE6, ffliVar.f.m());
        }
        ffln fflnVarN4 = fflnVarE6.n();
        ffln fflnVarI6 = zR2 ? fflnVarE6 : fflnVarE6.i(fflnVarN3);
        ffln fflnVar5 = ffliVar.f;
        if (fflnVar5.b() < (ffliVar.c() >> 1)) {
            ffln fflnVarN5 = fflnVar2.e(fflnVarI).n();
            fflnVarE = fflnVarN5.e(fflnVarE6).e(fflnVarN3).i(fflnVarN5).e(fflnVar5.r() ? fflnVarI5.e(fflnVarN3).n() : fflnVarI5.o(fflnVar5, fflnVarN3.n())).e(fflnVarN4);
            if (fflnVar4.s()) {
                fflnVarE = fflnVarE.e(fflnVarI6);
            } else if (!fflnVar4.r()) {
                fflnVarE = fflnVarE.e(fflnVar4.f().i(fflnVarI6));
            }
        } else {
            if (!zR2) {
                fflnVarI = fflnVarI.i(fflnVar3);
            }
            fflnVarE = fflnVarI.o(fflnVarE6, fflnVarI4).e(fflnVarN4).e(fflnVarI6);
        }
        return new fflq(ffliVar, fflnVarN4, fflnVarE, new ffln[]{fflnVarI6});
    }

    public fflq(ffli ffliVar, ffln fflnVar, ffln fflnVar2, ffln[] fflnVarArr) {
        super(ffliVar, fflnVar, fflnVar2, fflnVarArr);
    }
}
