package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chhm extends chho {
    public static final chhm a = new chhm();

    private chhm() {
    }

    @Override // defpackage.chho
    public final long a(long j, int i) {
        double dA;
        if (i <= 0) {
            throw new IllegalArgumentException("Attempt count must be a positive integer.");
        }
        double dPow = Math.pow(2.0d, i);
        long j2 = fdhi.a;
        int iA = fdcu.a(dPow);
        if (iA == dPow) {
            return fdhi.k(j, iA);
        }
        fdhl fdhlVarO = fdhi.o(j);
        fdhlVarO.getClass();
        if (j == fdhi.a) {
            dA = Double.POSITIVE_INFINITY;
        } else if (j == fdhi.b) {
            dA = Double.NEGATIVE_INFINITY;
        } else {
            dA = fdhm.a(fdhi.i(j), fdhi.o(j), fdhlVarO);
        }
        double d = dA * dPow;
        fdhlVarO.getClass();
        double dA2 = fdhm.a(d, fdhlVarO, fdhl.a);
        if (Double.isNaN(dA2)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jC = fdcu.c(dA2);
        if (jC < -4611686018426999999L || jC >= 4611686018427000000L) {
            return fdhk.b(fdcu.c(fdhm.a(d, fdhlVarO, fdhl.c)));
        }
        int i2 = fdhj.a;
        return jC + jC;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chhm)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1053479397;
    }

    public final String toString() {
        return "ExponentialRetryBackoffStrategy";
    }
}
