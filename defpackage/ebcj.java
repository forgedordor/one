package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebcj extends ebcl {
    private final evqs a;
    private final int b;

    public ebcj(evqs evqsVar, int i) {
        if (evqsVar == null) {
            throw new NullPointerException("Null content");
        }
        this.a = evqsVar;
        this.b = i;
    }

    @Override // defpackage.ebcl
    public final int a() {
        return this.b;
    }

    @Override // defpackage.ebcl
    public final evqs b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebcl) {
            ebcl ebclVar = (ebcl) obj;
            if (this.a.equals(ebclVar.b()) && this.b == ebclVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "ByteStringContent{content=" + this.a.toString() + ", contentLength=" + this.b + "}";
    }
}
