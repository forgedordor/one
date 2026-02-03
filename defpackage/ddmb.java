package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddmb extends ddmi {
    private final String a;
    private final String b;
    private final int c;

    public ddmb(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    @Override // defpackage.ddmi
    public final int a() {
        return this.c;
    }

    @Override // defpackage.ddmi
    public final String b() {
        return this.b;
    }

    @Override // defpackage.ddmi
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ddmi) {
            ddmi ddmiVar = (ddmi) obj;
            if (this.a.equals(ddmiVar.c()) && this.b.equals(ddmiVar.b()) && this.c == ddmiVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "SystemPropertiesInfo{vendorBuildFingerprint=" + this.a + ", bootVerifiedBootState=" + this.b + ", bootFlashLocked=" + this.c + "}";
    }
}
