package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fflg extends ffle {
    private int a;
    private int b;
    private int c;
    private int j;
    private fflq k;

    public fflg(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        super(i, i2, i3, i4);
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.j = i4;
        this.g = bigInteger3;
        this.h = bigInteger4;
        this.k = new fflq(this, null, null);
        this.e = d(bigInteger);
        this.f = d(bigInteger2);
        this.i = 6;
    }

    @Override // defpackage.ffli
    public final int c() {
        return this.a;
    }

    @Override // defpackage.ffli
    public final ffln d(BigInteger bigInteger) {
        if (bigInteger != null && bigInteger.signum() >= 0) {
            int iBitLength = bigInteger.bitLength();
            int i = this.a;
            if (iBitLength <= i) {
                int i2 = this.c;
                int i3 = this.j;
                return new ffll(i, (i2 | i3) == 0 ? new int[]{this.b} : new int[]{this.b, i2, i3}, new fflt(bigInteger));
            }
        }
        throw new IllegalArgumentException("x value invalid in F2m field element");
    }

    @Override // defpackage.ffli
    protected final ffls e(ffln fflnVar, ffln fflnVar2) {
        return new fflq(this, fflnVar, fflnVar2);
    }

    @Override // defpackage.ffli
    public final ffls f() {
        return this.k;
    }

    public fflg(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this(i, i2, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
    }
}
