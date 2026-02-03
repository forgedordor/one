package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgqh extends fgmz {
    private static final int e;
    private static final long serialVersionUID = 5472298452022250685L;
    private final fgmz f;
    private final transient fgqg[] g;

    static {
        Integer integer;
        int i;
        try {
            integer = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException unused) {
            integer = null;
        }
        if (integer == null) {
            i = 512;
        } else {
            int iIntValue = integer.intValue() - 1;
            int i2 = 0;
            while (iIntValue > 0) {
                iIntValue >>= 1;
                i2++;
            }
            i = 1 << i2;
        }
        e = i - 1;
    }

    public fgqh(fgmz fgmzVar) {
        super(fgmzVar.c);
        this.g = new fgqg[e + 1];
        this.f = fgmzVar;
    }

    private final fgqg n(long j) {
        int i = (int) (j >> 32);
        int i2 = e & i;
        fgqg[] fgqgVarArr = this.g;
        fgqg fgqgVar = fgqgVarArr[i2];
        if (fgqgVar != null && ((int) (fgqgVar.a >> 32)) == i) {
            return fgqgVar;
        }
        long j2 = j & (-4294967296L);
        fgmz fgmzVar = this.f;
        fgqg fgqgVar2 = new fgqg(fgmzVar, j2);
        long j3 = j2;
        fgqg fgqgVar3 = fgqgVar2;
        while (true) {
            long jE = fgmzVar.e(j3);
            if (jE == j3 || jE > (4294967295L | j2)) {
                break;
            }
            fgqg fgqgVar4 = new fgqg(fgmzVar, jE);
            fgqgVar3.c = fgqgVar4;
            fgqgVar3 = fgqgVar4;
            j3 = jE;
        }
        fgqgVarArr[i2] = fgqgVar2;
        return fgqgVar2;
    }

    @Override // defpackage.fgmz
    public final int a(long j) {
        return n(j).a(j);
    }

    @Override // defpackage.fgmz
    public final int c(long j) {
        return n(j).b(j);
    }

    @Override // defpackage.fgmz
    public final long e(long j) {
        return this.f.e(j);
    }

    @Override // defpackage.fgmz
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fgqh) {
            return this.f.equals(((fgqh) obj).f);
        }
        return false;
    }

    @Override // defpackage.fgmz
    public final long f(long j) {
        return this.f.f(j);
    }

    @Override // defpackage.fgmz
    public final String g(long j) {
        return n(j).c(j);
    }

    @Override // defpackage.fgmz
    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // defpackage.fgmz
    public final boolean k() {
        return false;
    }
}
