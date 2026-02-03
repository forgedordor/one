package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxtz extends bxwg {
    private final long a;
    private final String b;

    public bxtz(long j, String str) {
        this.a = j;
        if (str == null) {
            throw new NullPointerException("Null displayName");
        }
        this.b = str;
    }

    @Override // defpackage.bxwg
    public final long a() {
        return this.a;
    }

    @Override // defpackage.bxwg
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxwg) {
            bxwg bxwgVar = (bxwg) obj;
            if (this.a == bxwgVar.a() && this.b.equals(bxwgVar.b())) {
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
        return "OnDeviceParticipantSearchResult{participantId=" + this.a + ", displayName=" + this.b + "}";
    }
}
