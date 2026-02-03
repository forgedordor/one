package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dztv extends dztz {
    public final int a;
    public final float b;
    private final ejwi c;
    private final int d;

    public dztv(int i, int i2, float f, ejwi ejwiVar) {
        this.d = i;
        this.a = i2;
        this.b = f;
        this.c = ejwiVar;
    }

    @Override // defpackage.dztz, defpackage.dzjv
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dztz
    public final float d() {
        return this.b;
    }

    @Override // defpackage.dztz
    public final ejwi e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dztz) {
            dztz dztzVar = (dztz) obj;
            if (this.d == dztzVar.f() && this.a == dztzVar.a() && Float.floatToIntBits(this.b) == Float.floatToIntBits(dztzVar.d()) && this.c.equals(dztzVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dztz
    public final int f() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((this.d ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "TimerConfigurations{enablement=" + dzjw.a(this.d) + ", rateLimitPerSecond=" + this.a + ", samplingProbability=" + this.b + ", perEventConfigurationFlags=" + String.valueOf(this.c) + "}";
    }
}
