package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwsr extends dwsu {
    private final String a;
    private final int b;

    public dwsr(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.dwsu
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dwsu
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwsu) {
            dwsu dwsuVar = (dwsu) obj;
            if (this.a.equals(dwsuVar.b()) && this.b == dwsuVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "LighterMediaId{resourceId=" + this.a + ", resourceRegion=" + this.b + "}";
    }
}
