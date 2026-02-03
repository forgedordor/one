package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etdr extends eteb {
    public final String a;
    public final Integer b;

    public etdr(String str, Integer num) {
        this.a = str;
        this.b = num;
    }

    @Override // defpackage.eteb
    public final Integer a() {
        return this.b;
    }

    @Override // defpackage.eteb
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eteb) {
            eteb etebVar = (eteb) obj;
            if (this.a.equals(etebVar.b()) && ((num = this.b) != null ? num.equals(etebVar.a()) : etebVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        Integer num = this.b;
        return (iHashCode * 1000003) ^ (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "PhoneContext{rawContext=" + this.a + ", countryCode=" + this.b + "}";
    }
}
