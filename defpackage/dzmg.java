package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzmg extends dzmh {
    private final int a;

    public dzmg(int i) {
        this.a = i;
    }

    @Override // defpackage.dzmh
    public final int d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof dzmh) && this.a == ((dzmh) obj).d();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return "PrimesProfilingV2Configurations{enablement=" + dzjw.a(this.a) + "}";
    }
}
