package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efci extends efev {
    private final String a;
    private final String b;
    private final String c;

    public efci(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.efev
    public final String a() {
        return this.b;
    }

    @Override // defpackage.efev
    public final String b() {
        return this.a;
    }

    @Override // defpackage.efev
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efev) {
            efev efevVar = (efev) obj;
            if (this.a.equals(efevVar.b()) && this.b.equals(efevVar.a()) && this.c.equals(efevVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
