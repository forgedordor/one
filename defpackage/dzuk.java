package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzuk extends dzus {
    private final int a;
    private final boolean b;
    private final int c;
    private final dzur d;

    public dzuk(int i, int i2, dzur dzurVar, boolean z) {
        this.c = i;
        this.a = i2;
        this.d = dzurVar;
        this.b = z;
    }

    @Override // defpackage.dzus, defpackage.dzjv
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dzus
    public final boolean d() {
        return this.b;
    }

    @Override // defpackage.dzus
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzus) {
            dzus dzusVar = (dzus) obj;
            if (this.c == dzusVar.e() && this.a == dzusVar.a() && this.d.equals(dzusVar.f()) && this.b == dzusVar.d()) {
                dzusVar.g();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dzus
    public final dzur f() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((this.c ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "TikTokTraceConfigurations{enablement=" + dzjw.a(this.c) + ", rateLimitPerSecond=" + this.a + ", dynamicSampler=" + this.d.toString() + ", recordTimerDuration=" + this.b + ", sendEmptyTraces=false}";
    }

    @Override // defpackage.dzus
    public final void g() {
    }
}
