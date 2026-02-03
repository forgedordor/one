package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyvg extends cywf {
    private final long a;
    private final String b;

    public cyvg(long j, String str) {
        this.a = j;
        if (str == null) {
            throw new NullPointerException("Null displayName");
        }
        this.b = str;
    }

    @Override // defpackage.cywf
    public final long a() {
        return this.a;
    }

    @Override // defpackage.cywf
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cywf) {
            cywf cywfVar = (cywf) obj;
            if (this.a == cywfVar.a() && this.b.equals(cywfVar.b())) {
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
        return "ContactTableRow{contactId=" + this.a + ", displayName=" + this.b + "}";
    }
}
