package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebgu extends ebhy {
    public final String a;
    public final ewmm b;
    public final String c;
    public final long d;
    public final boolean e;

    public ebgu(String str, ewmm ewmmVar, String str2, long j, boolean z) {
        this.a = str;
        if (ewmmVar == null) {
            throw new NullPointerException("Null type");
        }
        this.b = ewmmVar;
        this.c = str2;
        this.d = j;
        this.e = z;
    }

    @Override // defpackage.ebhy
    public final long a() {
        return this.d;
    }

    @Override // defpackage.ebhy
    public final ewmm b() {
        return this.b;
    }

    @Override // defpackage.ebhy
    public final String c() {
        return this.c;
    }

    @Override // defpackage.ebhy
    public final String d() {
        return this.a;
    }

    @Override // defpackage.ebhy
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebhy) {
            ebhy ebhyVar = (ebhy) obj;
            if (this.a.equals(ebhyVar.d()) && this.b.equals(ebhyVar.b()) && ((str = this.c) != null ? str.equals(ebhyVar.c()) : ebhyVar.c() == null) && this.d == ebhyVar.a() && this.e == ebhyVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        String str = this.c;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j = this.d;
        return ((iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        return "LoggableQuery{target=" + this.a + ", type=" + this.b.toString() + ", dnsServer=" + this.c + ", queryTimeMillis=" + this.d + ", isFallbackAttempt=" + this.e + "}";
    }
}
