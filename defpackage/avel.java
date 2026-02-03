package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avel {
    public final long a;
    public final String b;
    public final String c;
    public final String d;

    public avel(long j, String str, String str2, String str3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avel)) {
            return false;
        }
        avel avelVar = (avel) obj;
        return this.a == avelVar.a && fdbq.f(this.b, avelVar.b) && fdbq.f(this.c, avelVar.c) && fdbq.f(this.d, avelVar.d);
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = (((int) (j ^ (j >>> 32))) * 31) + this.b.hashCode();
        String str = this.c;
        int iHashCode2 = ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "RawContactName(contactId=" + this.a + ", displayName=" + this.b + ", givenName=" + this.c + ", familyName=" + this.d + ")";
    }
}
