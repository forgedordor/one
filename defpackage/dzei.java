package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzei extends dzfs {
    public final int a;
    private final eosd b;
    private final int c;
    private final boolean d;

    public dzei(eosd eosdVar, int i, int i2, boolean z) {
        this.b = eosdVar;
        this.c = i;
        this.a = i2;
        this.d = z;
    }

    @Override // defpackage.dzfs
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dzfs
    public final int b() {
        return this.c;
    }

    @Override // defpackage.dzfs
    public final eosd c() {
        return this.b;
    }

    @Override // defpackage.dzfs
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzfs) {
            dzfs dzfsVar = (dzfs) obj;
            eosd eosdVar = this.b;
            if (eosdVar != null ? eosdVar.equals(dzfsVar.c()) : dzfsVar.c() == null) {
                if (this.c == dzfsVar.b() && this.a == dzfsVar.a() && this.d == dzfsVar.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        eosd eosdVar = this.b;
        int iHashCode = eosdVar == null ? 0 : eosdVar.hashCode();
        int i = this.c;
        return ((((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ this.a) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        return "PrimesThreadsConfigurations{primesExecutorService=" + String.valueOf(this.b) + ", primesMetricExecutorPriority=" + this.c + ", primesMetricExecutorPoolSize=" + this.a + ", enableDeferredTasks=" + this.d + "}";
    }
}
