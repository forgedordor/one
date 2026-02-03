package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caxt {
    public final evuh a;
    public final String b;
    private final String c;

    public caxt(evuh evuhVar, String str, String str2) {
        this.a = evuhVar;
        this.c = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof caxt)) {
            return false;
        }
        caxt caxtVar = (caxt) obj;
        return fdbq.f(this.a, caxtVar.a) && fdbq.f(this.c, caxtVar.c) && fdbq.f(this.b, caxtVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "CanceledWorkQueueRequest(rawData=" + this.a + ", cancellationTag=" + this.c + ", deduplicationTag=" + this.b + ")";
    }
}
