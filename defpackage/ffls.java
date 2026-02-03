package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ffls {
    protected static final ffln[] a = new ffln[0];
    public ffli b;
    protected ffln c;
    protected ffln d;
    protected ffln[] e;
    public Hashtable f;

    protected ffls(ffli ffliVar, ffln fflnVar, ffln fflnVar2, ffln[] fflnVarArr) {
        this.f = null;
        this.b = ffliVar;
        this.c = fflnVar;
        this.d = fflnVar2;
        this.e = fflnVarArr;
    }

    public abstract boolean a();

    public boolean b() {
        BigInteger bigInteger;
        if (!ffld.b.equals(this.b.h) && (bigInteger = this.b.g) != null) {
            BigInteger bigIntegerAbs = bigInteger.abs();
            ffls fflsVarF = this.b.f();
            int iBitLength = bigIntegerAbs.bitLength();
            if (iBitLength > 0) {
                if (true == bigIntegerAbs.testBit(0)) {
                    fflsVarF = this;
                }
                ffls fflsVarF2 = this;
                for (int i = 1; i < iBitLength; i++) {
                    fflsVarF2 = fflsVarF2.f();
                    if (bigIntegerAbs.testBit(i)) {
                        fflsVarF = fflsVarF.d(fflsVarF2);
                    }
                }
            }
            if (bigInteger.signum() < 0) {
                fflsVarF = fflsVarF.e();
            }
            if (!fflsVarF.q()) {
                return false;
            }
        }
        return true;
    }

    public ffln c() {
        return this.d;
    }

    public abstract ffls d(ffls fflsVar);

    public abstract ffls e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ffls) {
            return p((ffls) obj);
        }
        return false;
    }

    public abstract ffls f();

    public final int hashCode() {
        ffli ffliVar = this.b;
        int i = ffliVar == null ? 0 : ~ffliVar.hashCode();
        if (q()) {
            return i;
        }
        ffls fflsVarM = m();
        return (i ^ (fflsVarM.c.hashCode() * 17)) ^ (fflsVarM.c().hashCode() * 257);
    }

    protected final int j() {
        ffli ffliVar = this.b;
        if (ffliVar == null) {
            return 0;
        }
        return ffliVar.i;
    }

    public final ffln k() {
        o();
        return this.c;
    }

    protected final ffls l(ffln fflnVar, ffln fflnVar2) {
        return this.b.e(this.c.i(fflnVar), this.d.i(fflnVar2));
    }

    public final ffls m() {
        int iJ;
        if (!q() && (iJ = j()) != 0 && iJ != 5) {
            ffln fflnVarS = s();
            if (!fflnVarS.r()) {
                if (this.b == null) {
                    throw new IllegalStateException("Detached points must be in affine coordinates");
                }
                ffln fflnVarA = this.b.a(ffij.a());
                return n(fflnVarS.i(fflnVarA).h().i(fflnVarA));
            }
        }
        return this;
    }

    final ffls n(ffln fflnVar) {
        int iJ = j();
        if (iJ != 1) {
            if (iJ == 2 || iJ == 3 || iJ == 4) {
                ffln fflnVarN = fflnVar.n();
                return l(fflnVarN, fflnVarN.i(fflnVar));
            }
            if (iJ != 6) {
                throw new IllegalStateException("not a projective coordinate system");
            }
        }
        return l(fflnVar, fflnVar);
    }

    protected final void o() {
        if (!r()) {
            throw new IllegalStateException("point not in normal form");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(defpackage.ffls r12) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffls.p(ffls):boolean");
    }

    public final boolean q() {
        if (this.c == null || this.d == null) {
            return true;
        }
        ffln[] fflnVarArr = this.e;
        return fflnVarArr.length > 0 && fflnVarArr[0].s();
    }

    public final boolean r() {
        int iJ = j();
        return iJ == 0 || iJ == 5 || q() || this.e[0].r();
    }

    public final ffln s() {
        ffln[] fflnVarArr = this.e;
        if (fflnVarArr.length <= 0) {
            return null;
        }
        return fflnVarArr[0];
    }

    public final String toString() {
        if (q()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer("(");
        stringBuffer.append(this.c);
        stringBuffer.append(',');
        stringBuffer.append(this.d);
        for (int i = 0; i < this.e.length; i++) {
            stringBuffer.append(',');
            stringBuffer.append(this.e[i]);
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected ffls(ffli ffliVar, ffln fflnVar, ffln fflnVar2) {
        ffln[] fflnVarArr;
        int i = ffliVar == null ? 0 : ffliVar.i;
        if (i == 0 || i == 5) {
            fflnVarArr = a;
        } else {
            ffln fflnVarD = ffliVar.d(ffld.b);
            if (i == 1 || i == 2) {
                fflnVarArr = new ffln[]{fflnVarD};
            } else if (i == 3) {
                fflnVarArr = new ffln[]{fflnVarD, fflnVarD, fflnVarD};
            } else if (i != 4) {
                if (i != 6) {
                    throw new IllegalArgumentException("unknown coordinate system");
                }
                fflnVarArr = new ffln[]{fflnVarD};
            } else {
                fflnVarArr = new ffln[]{fflnVarD, ffliVar.e};
            }
        }
        this(ffliVar, fflnVar, fflnVar2, fflnVarArr);
    }
}
