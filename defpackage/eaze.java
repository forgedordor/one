package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eaze extends eazf {
    private final int a;
    private final long b;

    public eaze(int i, long j) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.eazf
    public final int a() {
        return this.a;
    }

    @Override // defpackage.eazf
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eazf) {
            eazf eazfVar = (eazf) obj;
            if (this.a == eazfVar.a() && this.b == eazfVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ProjectId{customerId=" + this.a + ", projectId=" + this.b + "}";
    }
}
