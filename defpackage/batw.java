package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class batw extends baxk {
    private final bvds a;
    private final String b;

    public batw(bvds bvdsVar, String str) {
        if (bvdsVar == null) {
            throw new NullPointerException("Null recipientType");
        }
        this.a = bvdsVar;
        if (str == null) {
            throw new NullPointerException("Null recipientValue");
        }
        this.b = str;
    }

    @Override // defpackage.baxk
    public final bvds a() {
        return this.a;
    }

    @Override // defpackage.baxk
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof baxk) {
            baxk baxkVar = (baxk) obj;
            if (this.a.equals(baxkVar.a()) && this.b.equals(baxkVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "RecipientInfo{recipientType=" + this.a.toString() + ", recipientValue=" + this.b + "}";
    }
}
