package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avee {
    public final long a;
    public final int b;
    public final String c;

    public avee(long j, int i, String str) {
        this.a = j;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avee)) {
            return false;
        }
        avee aveeVar = (avee) obj;
        return this.a == aveeVar.a && this.b == aveeVar.b && fdbq.f(this.c, aveeVar.c);
    }

    public final int hashCode() {
        long j = this.a;
        return (((((int) (j ^ (j >>> 32))) * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ContactEventRow(contactId=" + this.a + ", type=" + this.b + ", startDate=" + this.c + ")";
    }
}
