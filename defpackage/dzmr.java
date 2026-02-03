package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzmr extends dzmt {
    public final float a;
    private final int b;
    private final fcsu c;
    private final ejwi d;
    private final int e;

    public dzmr(int i, float f, int i2, fcsu fcsuVar, ejwi ejwiVar) {
        this.e = i;
        this.a = f;
        this.b = i2;
        this.c = fcsuVar;
        this.d = ejwiVar;
    }

    @Override // defpackage.dzmt, defpackage.dzjv
    public final fcsu b() {
        return this.c;
    }

    @Override // defpackage.dzmt
    public final float d() {
        return this.a;
    }

    @Override // defpackage.dzmt
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        fcsu fcsuVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzmt) {
            dzmt dzmtVar = (dzmt) obj;
            if (this.e == dzmtVar.g() && Float.floatToIntBits(this.a) == Float.floatToIntBits(dzmtVar.d()) && this.b == dzmtVar.e() && ((fcsuVar = this.c) != null ? fcsuVar.equals(dzmtVar.b()) : dzmtVar.b() == null) && this.d.equals(dzmtVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dzmt
    public final ejwi f() {
        return this.d;
    }

    @Override // defpackage.dzmt
    public final int g() {
        return this.e;
    }

    public final int hashCode() {
        int iFloatToIntBits = ((this.e ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a);
        fcsu fcsuVar = this.c;
        return (((((iFloatToIntBits * 1000003) ^ this.b) * 1000003) ^ (fcsuVar == null ? 0 : fcsuVar.hashCode())) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "CrashConfigurations{enablement=" + dzjw.a(this.e) + ", startupSamplePercentage=" + this.a + ", debugLogsSize=" + this.b + ", generalConfigurationsMetricExtension=" + String.valueOf(this.c) + ", crashLoopListener=Optional.absent()}";
    }
}
