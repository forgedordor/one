package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euyt extends euyy {
    private final int a;
    private final boolean b;

    public euyt(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.euyy
    public final int a() {
        return this.a;
    }

    @Override // defpackage.euyy
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof euyy) {
            euyy euyyVar = (euyy) obj;
            if (this.a == euyyVar.a() && this.b == euyyVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CpuOptions{numThreads=" + this.a + ", useXnnpack=" + this.b + "}";
    }
}
