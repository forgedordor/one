package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efgr extends efhb {
    private final String a;
    private final String b;
    private final String c;

    public efgr(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.efhb
    public final String a() {
        return this.b;
    }

    @Override // defpackage.efhb
    public final String b() {
        return this.a;
    }

    @Override // defpackage.efhb
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efhb) {
            efhb efhbVar = (efhb) obj;
            if (this.a.equals(efhbVar.b()) && this.b.equals(efhbVar.a()) && this.c.equals(efhbVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "CpimMessageHeader{namespace=" + this.a + ", name=" + this.b + ", value=" + this.c + "}";
    }
}
