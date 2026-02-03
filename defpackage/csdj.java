package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csdj extends csdq {
    private final csdo a;
    private final String b;
    private final String c;

    public csdj(csdo csdoVar, String str, String str2) {
        this.a = csdoVar;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.csdq
    public final csdo a() {
        return this.a;
    }

    @Override // defpackage.csdq
    public final String b() {
        return this.b;
    }

    @Override // defpackage.csdq
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof csdq) {
            csdq csdqVar = (csdq) obj;
            if (this.a.equals(csdqVar.a()) && this.b.equals(csdqVar.b()) && this.c.equals(csdqVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "LinkPreviewSpamCheckParams{messageSuspiciousnessScore=" + this.a.toString() + ", countryCode=" + this.b + ", locale=" + this.c + "}";
    }
}
