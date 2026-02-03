package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avek {
    public final String a;
    public final String b;
    private final long c;

    public avek(long j, String str, String str2) {
        this.c = j;
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avek)) {
            return false;
        }
        avek avekVar = (avek) obj;
        return this.c == avekVar.c && fdbq.f(this.a, avekVar.a) && fdbq.f(this.b, avekVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.c;
        String str2 = this.b;
        return (((((int) (j ^ (j >>> 32))) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "RawContactEvents(contactId=" + this.c + ", birthday=" + this.a + ", anniversary=" + this.b + ")";
    }
}
