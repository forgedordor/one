package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqio extends cqjb {
    private final long c;
    private final String d;

    public cqio(long j, String str) {
        this.c = j;
        this.d = str;
    }

    @Override // defpackage.cqjb
    public final long a() {
        return this.c;
    }

    @Override // defpackage.cqjb
    public final String b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqjb) {
            cqjb cqjbVar = (cqjb) obj;
            if (this.c == cqjbVar.a() && ((str = this.d) != null ? str.equals(cqjbVar.b()) : cqjbVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.d;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.c;
        return iHashCode ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ContactsDirectory{id=" + this.c + ", displayName=" + this.d + "}";
    }
}
