package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqek extends cqgg {
    private final int a;
    private final cqex b;

    public cqek(int i, cqex cqexVar) {
        this.a = i;
        if (cqexVar == null) {
            throw new NullPointerException("Null networkTransport");
        }
        this.b = cqexVar;
    }

    @Override // defpackage.cqgg
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cqgg
    public final cqex b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqgg) {
            cqgg cqggVar = (cqgg) obj;
            if (this.a == cqggVar.a() && this.b.equals(cqggVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "NetworkTypePair{networkCapabilities=" + this.a + ", networkTransport=" + this.b.toString() + "}";
    }
}
