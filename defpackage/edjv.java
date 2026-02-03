package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edjv extends edhp {
    private final String a;
    private final String b;
    private final String c;
    private final long d;

    public edjv(String str, String str2, String str3, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    @Override // defpackage.edhp
    public final long a() {
        return this.d;
    }

    @Override // defpackage.edhp
    public final String b() {
        return this.b;
    }

    @Override // defpackage.edhp
    public final String c() {
        return this.a;
    }

    @Override // defpackage.edhp
    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edhp) {
            edhp edhpVar = (edhp) obj;
            if (this.a.equals(edhpVar.c()) && this.b.equals(edhpVar.b()) && this.c.equals(edhpVar.d()) && this.d == edhpVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return (iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "ArtBrowsePhoto{name=" + this.a + ", accessibilityLabel=" + this.b + ", url=" + this.c + ", id=" + this.d + "}";
    }
}
