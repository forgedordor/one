package defpackage;

import java.math.BigInteger;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fflo extends ffls {
    protected fflo(ffli ffliVar, ffln fflnVar, ffln fflnVar2) {
        super(ffliVar, fflnVar, fflnVar2);
    }

    @Override // defpackage.ffls
    public final boolean a() {
        ffln fflnVarK;
        ffln fflnVarO;
        ffli ffliVar = this.b;
        ffln fflnVar = this.c;
        ffln fflnVarI = ffliVar.e;
        ffln fflnVarI2 = ffliVar.f;
        int i = ffliVar.i;
        if (i != 6) {
            ffln fflnVar2 = this.d;
            ffln fflnVarI3 = fflnVar2.e(fflnVar).i(fflnVar2);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("unsupported coordinate system");
                }
                ffln fflnVar3 = this.e[0];
                if (!fflnVar3.r()) {
                    ffln fflnVarI4 = fflnVar3.i(fflnVar3.n());
                    fflnVarI3 = fflnVarI3.i(fflnVar3);
                    fflnVarI = fflnVarI.i(fflnVar3);
                    fflnVarI2 = fflnVarI2.i(fflnVarI4);
                }
            }
            return fflnVarI3.equals(fflnVar.e(fflnVarI).i(fflnVar.n()).e(fflnVarI2));
        }
        ffln fflnVar4 = this.e[0];
        boolean zR = fflnVar4.r();
        if (fflnVar.s()) {
            ffln fflnVarN = this.d.n();
            if (!zR) {
                fflnVarI2 = fflnVarI2.i(fflnVar4.n());
            }
            return fflnVarN.equals(fflnVarI2);
        }
        ffln fflnVar5 = this.d;
        ffln fflnVarN2 = fflnVar.n();
        if (zR) {
            fflnVarK = fflnVar5.n().e(fflnVar5).e(fflnVarI);
            fflnVarO = fflnVarN2.n().e(fflnVarI2);
        } else {
            ffln fflnVarN3 = fflnVar4.n();
            ffln fflnVarN4 = fflnVarN3.n();
            fflnVarK = fflnVar5.e(fflnVar4).k(fflnVar5, fflnVarI, fflnVarN3);
            fflnVarO = fflnVarN2.o(fflnVarI2, fflnVarN4);
        }
        return fflnVarK.i(fflnVarN2).equals(fflnVarO);
    }

    @Override // defpackage.ffls
    public final boolean b() {
        ffln fflnVarE;
        BigInteger bigInteger = this.b.h;
        if (ffld.c.equals(bigInteger)) {
            return ((fflj) m().k()).a() != 0;
        }
        if (!ffld.d.equals(bigInteger)) {
            return super.b();
        }
        ffls fflsVarM = m();
        ffln fflnVarK = fflsVarM.k();
        ffli ffliVar = this.b;
        ffle ffleVar = (ffle) ffliVar;
        ffln fflnVarE2 = fflnVarK.e(ffliVar.e);
        fflj ffljVar = (fflj) fflnVarE2;
        int iC = ffleVar.c();
        if ((iC & 1) != 0) {
            int iC2 = ffljVar.c();
            if ((iC2 & 1) == 0) {
                throw new IllegalStateException("Half-trace only defined for odd m");
            }
            int i = (iC2 + 1) >>> 1;
            int iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i);
            int i2 = 1;
            ffln fflnVarE3 = ffljVar;
            while (iNumberOfLeadingZeros > 0) {
                fflnVarE3 = fflnVarE3.p(i2 + i2).e(fflnVarE3);
                iNumberOfLeadingZeros--;
                i2 = i >>> iNumberOfLeadingZeros;
                if ((i2 & 1) != 0) {
                    fflnVarE3 = fflnVarE3.p(2).e(ffljVar);
                }
            }
            if (!fflnVarE3.n().e(fflnVarE3).e(fflnVarE2).s()) {
                fflnVarE2 = null;
                break;
            }
            fflnVarE2 = fflnVarE3;
        } else if (!fflnVarE2.s()) {
            ffln fflnVarD = ffleVar.d(ffld.a);
            Random random = new Random();
            do {
                ffln fflnVarD2 = ffleVar.d(new BigInteger(iC, random));
                ffln fflnVarE4 = fflnVarE2;
                fflnVarE = fflnVarD;
                for (int i3 = 1; i3 < iC; i3++) {
                    ffln fflnVarN = fflnVarE4.n();
                    fflnVarE = fflnVarE.n().e(fflnVarN.i(fflnVarD2));
                    fflnVarE4 = fflnVarN.e(fflnVarE2);
                }
                if (!fflnVarE4.s()) {
                    fflnVarE2 = null;
                    break;
                }
            } while (fflnVarE.n().e(fflnVarE).s());
            fflnVarE2 = fflnVarE;
        }
        if (fflnVarE2 != null) {
            fflsVarM.o();
            if (((fflj) fflnVarK.i(fflnVarE2).e(fflsVarM.c())).a() == 0) {
                return true;
            }
        }
        return false;
    }

    protected fflo(ffli ffliVar, ffln fflnVar, ffln fflnVar2, ffln[] fflnVarArr) {
        super(ffliVar, fflnVar, fflnVar2, fflnVarArr);
    }
}
