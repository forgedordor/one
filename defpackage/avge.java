package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avge {
    public final long a;
    public final long b;

    public avge(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avge)) {
            return false;
        }
        avge avgeVar = (avge) obj;
        return this.a == avgeVar.a && this.b == avgeVar.b;
    }

    public final int hashCode() {
        return (avgd.a(this.a) * 31) + avgd.a(this.b);
    }

    public final String toString() {
        return "Cp2IdWithContactId(cp2Id=" + this.a + ", contactId=" + this.b + ")";
    }
}
