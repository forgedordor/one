package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dezg extends dezs {
    public final int a;
    private final String b;

    public dezg(int i, String str) {
        this.a = i;
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.b = str;
    }

    @Override // defpackage.dezs
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dezs
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dezs) {
            dezs dezsVar = (dezs) obj;
            if (this.a == dezsVar.a() && this.b.equals(dezsVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "DisconnectionReason{cause=" + this.a + ", text=" + this.b + "}";
    }
}
