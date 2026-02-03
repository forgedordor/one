package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxjk extends bxjl {
    private final alqm a;
    private final String b;
    private final long c;
    private final String d;
    private final String e;

    public bxjk(alqm alqmVar, String str, long j, String str2, String str3) {
        this.a = alqmVar;
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = str3;
    }

    @Override // defpackage.bxjl
    public final long a() {
        return this.c;
    }

    @Override // defpackage.bxjl
    public final alqm b() {
        return this.a;
    }

    @Override // defpackage.bxjl
    public final String c() {
        return this.b;
    }

    @Override // defpackage.bxjl
    public final String d() {
        return this.e;
    }

    @Override // defpackage.bxjl
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxjl) {
            bxjl bxjlVar = (bxjl) obj;
            if (this.a.equals(bxjlVar.b()) && ((str = this.b) != null ? str.equals(bxjlVar.c()) : bxjlVar.c() == null) && this.c == bxjlVar.a() && ((str2 = this.d) != null ? str2.equals(bxjlVar.e()) : bxjlVar.e() == null) && this.e.equals(bxjlVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.c;
        int i = ((((iHashCode * 1000003) ^ iHashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        String str2 = this.d;
        return ((i ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "MatchingContactData{messagingIdentity=" + ((alqk) this.a).o() + ", displayName=" + this.b + ", contactId=" + this.c + ", photoUri=" + this.d + ", lookupKey=" + this.e + "}";
    }
}
