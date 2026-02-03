package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzou extends dzph {
    private final int a;
    private final int b;

    public dzou(int i, int i2) {
        this.b = i;
        this.a = i2;
    }

    @Override // defpackage.dzph, defpackage.dzjv
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dzph
    public final int d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzph) {
            dzph dzphVar = (dzph) obj;
            if (this.b == dzphVar.d() && this.a == dzphVar.a()) {
                dzphVar.e();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "JankConfigurations{enablement=" + dzjw.a(this.b) + ", rateLimitPerSecond=" + this.a + ", perfettoMustBeExplicitlyTriggered=false}";
    }

    @Override // defpackage.dzph
    public final void e() {
    }
}
