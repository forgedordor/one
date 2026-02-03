package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eosu extends eosn {
    public double b;
    public double c;
    public double d;
    private long e;

    public eosu(eosm eosmVar) {
        super(eosmVar);
        this.e = 0L;
    }

    @Override // defpackage.eosn
    public final double a() {
        return TimeUnit.SECONDS.toMicros(1L) / this.d;
    }

    @Override // defpackage.eosn
    public final long c() {
        return this.e;
    }

    @Override // defpackage.eosn
    public final long d(long j) {
        f(j);
        long j2 = this.e;
        double dMin = Math.min(1.0d, this.b);
        this.e = eolp.g(this.e, (long) ((1.0d - dMin) * this.d));
        this.b -= dMin;
        return j2;
    }

    public abstract double e();

    public final void f(long j) {
        if (j > this.e) {
            this.b = Math.min(this.c, this.b + ((j - r0) / e()));
            this.e = j;
        }
    }
}
