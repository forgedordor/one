package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class asve extends asvg {
    private final String a;
    private final String b;

    public asve(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.asvg
    public final String a() {
        return this.a;
    }

    @Override // defpackage.asvg
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof asvg) {
            asvg asvgVar = (asvg) obj;
            if (this.a.equals(asvgVar.a()) && this.b.equals(asvgVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "PresenceCapability{serviceId=" + this.a + ", version=" + this.b + "}";
    }
}
