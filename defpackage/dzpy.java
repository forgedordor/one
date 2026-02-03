package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzpy extends dzqb {
    private final long a;
    private final ekhx b;
    private final int c = 2;

    public dzpy(int i, long j, ekhx ekhxVar) {
        this.a = j;
        this.b = ekhxVar;
    }

    @Override // defpackage.dzqb
    public final long d() {
        return this.a;
    }

    @Override // defpackage.dzqb
    public final ekhx e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzqb) {
            dzqb dzqbVar = (dzqb) obj;
            dzqbVar.f();
            if (this.a == dzqbVar.d() && this.b.equals(dzqbVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dzqb
    public final int f() {
        return 2;
    }

    public final int hashCode() {
        int i = ((ekon) this.b).c;
        long j = this.a;
        return i ^ ((((int) (j ^ (j >>> 32))) ^ (-723379965)) * 1000003);
    }

    public final String toString() {
        return "DebugMemoryConfigurations{enablement=" + dzjw.a(2) + ", debugMemoryServiceThrottleMs=" + this.a + ", debugMemoryEventsToSample=" + String.valueOf(this.b) + "}";
    }
}
