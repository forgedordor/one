package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ffln implements ffld {
    public int b() {
        return d().bitLength();
    }

    public abstract int c();

    public abstract BigInteger d();

    public abstract ffln e(ffln fflnVar);

    public abstract ffln f();

    public abstract ffln g(ffln fflnVar);

    public abstract ffln h();

    public abstract ffln i(ffln fflnVar);

    public ffln j(ffln fflnVar, ffln fflnVar2, ffln fflnVar3) {
        throw null;
    }

    public ffln k(ffln fflnVar, ffln fflnVar2, ffln fflnVar3) {
        throw null;
    }

    public abstract ffln l();

    public abstract ffln m();

    public abstract ffln n();

    public ffln o(ffln fflnVar, ffln fflnVar2) {
        throw null;
    }

    public ffln p(int i) {
        ffln fflnVarN = this;
        for (int i2 = 0; i2 < i; i2++) {
            fflnVarN = fflnVarN.n();
        }
        return fflnVarN;
    }

    public abstract ffln q(ffln fflnVar);

    public boolean r() {
        return b() == 1;
    }

    public boolean s() {
        return d().signum() == 0;
    }

    public final String toString() {
        return d().toString(16);
    }
}
