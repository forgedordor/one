package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwno extends dwqj {
    private final int a;
    private final int b;

    public dwno(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.dwqj
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dwqj
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwqj) {
            dwqj dwqjVar = (dwqj) obj;
            if (this.a == dwqjVar.a() && this.b == dwqjVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "LighterUiConfigurations{badge=" + this.a + ", profileLabelStyle=" + this.b + "}";
    }
}
