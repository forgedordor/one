package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwxt extends dwxw {
    public final int a;
    private final dwpk b;

    public dwxt(dwpk dwpkVar, int i) {
        this.b = dwpkVar;
        this.a = i;
    }

    @Override // defpackage.dwxw
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dwxw
    public final dwpk b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwxw) {
            dwxw dwxwVar = (dwxw) obj;
            if (this.b.equals(dwxwVar.b()) && this.a == dwxwVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a;
    }

    public final String toString() {
        return "CacheKey{contactId=" + this.b.toString() + ", sizeInPx=" + this.a + "}";
    }
}
