package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class batx extends baxp {
    private final bvds a;
    private final String b;

    public batx(bvds bvdsVar, String str) {
        if (bvdsVar == null) {
            throw new NullPointerException("Null recipientType");
        }
        this.a = bvdsVar;
        if (str == null) {
            throw new NullPointerException("Null recipientValue");
        }
        this.b = str;
    }

    @Override // defpackage.baxp
    public final bvds a() {
        return this.a;
    }

    @Override // defpackage.baxp
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof baxp) {
            baxp baxpVar = (baxp) obj;
            if (this.a.equals(baxpVar.a()) && this.b.equals(baxpVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "MessageDestinationRowInfo{recipientType=" + this.a.toString() + ", recipientValue=" + this.b + "}";
    }
}
