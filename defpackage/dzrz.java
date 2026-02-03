package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzrz extends dzsb {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final ekgb e;
    private final int f;

    public dzrz(int i, int i2, int i3, int i4, ekgb ekgbVar, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = ekgbVar;
        this.f = i5;
    }

    @Override // defpackage.dzsb
    public final int d() {
        return this.b;
    }

    @Override // defpackage.dzsb
    public final int e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzsb) {
            dzsb dzsbVar = (dzsb) obj;
            if (this.a == dzsbVar.e() && this.b == dzsbVar.d() && this.c == dzsbVar.f() && this.d == dzsbVar.g() && ekjz.h(this.e, dzsbVar.h()) && this.f == dzsbVar.i()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dzsb
    public final int f() {
        return this.c;
    }

    @Override // defpackage.dzsb
    public final int g() {
        return this.d;
    }

    @Override // defpackage.dzsb
    public final ekgb h() {
        return this.e;
    }

    public final int hashCode() {
        return ((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f;
    }

    @Override // defpackage.dzsb
    public final int i() {
        return this.f;
    }

    public final String toString() {
        return "StallConfigurations{initialMonitoringDelayMs=" + this.a + ", checkForResponseIntervalMs=" + this.b + ", midStallCheckForResponseIntervalMs=" + this.c + ", postToMainIntervalMs=" + this.d + ", stallThresholdsMs=" + this.e.toString() + ", enablement=" + dzjw.a(this.f) + "}";
    }
}
