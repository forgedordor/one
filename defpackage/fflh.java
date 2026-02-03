package defpackage;

import j$.util.DesugarCollections;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fflh extends fflf {
    private static final Set j = DesugarCollections.synchronizedSet(new HashSet());
    private static final ffwl k = new ffwl();
    BigInteger a;
    BigInteger b;
    fflr c;

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0222, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public fflh(java.math.BigInteger r18, java.math.BigInteger r19, java.math.BigInteger r20, java.math.BigInteger r21, java.math.BigInteger r22) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fflh.<init>(java.math.BigInteger, java.math.BigInteger, java.math.BigInteger, java.math.BigInteger, java.math.BigInteger):void");
    }

    @Override // defpackage.ffli
    public final int c() {
        return this.a.bitLength();
    }

    @Override // defpackage.ffli
    public final ffln d(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(this.a) >= 0) {
            throw new IllegalArgumentException("x value invalid for Fp field element");
        }
        return new fflm(this.a, this.b, bigInteger);
    }

    @Override // defpackage.ffli
    protected final ffls e(ffln fflnVar, ffln fflnVar2) {
        return new fflr(this, fflnVar, fflnVar2);
    }

    @Override // defpackage.ffli
    public final ffls f() {
        return this.c;
    }

    @Override // defpackage.ffli
    public final ffls g(ffls fflsVar) {
        int i;
        return (this == fflsVar.b || this.i != 2 || fflsVar.q() || !((i = fflsVar.b.i) == 2 || i == 3 || i == 4)) ? super.g(fflsVar) : new fflr(this, d(fflsVar.c.d()), d(fflsVar.d.d()), new ffln[]{d(fflsVar.e[0].d())});
    }
}
