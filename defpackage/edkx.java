package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edkx extends edkz {
    private final long a;
    private final ejwi b;

    public edkx(long j, ejwi ejwiVar) {
        this.a = j;
        this.b = ejwiVar;
    }

    @Override // defpackage.edkz
    public final long a() {
        return this.a;
    }

    @Override // defpackage.edkz
    public final ejwi b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edkz) {
            edkz edkzVar = (edkz) obj;
            if (this.a == edkzVar.a() && this.b.equals(edkzVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "DevicePhoto{id=" + this.a + ", timestamp=" + this.b.toString() + "}";
    }
}
