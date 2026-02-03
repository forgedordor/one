package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqmp extends dqmu {
    public final String a;
    public final int b;
    public final boolean c;
    public final dqmw d;

    public dqmp(String str, int i, boolean z, dqmw dqmwVar) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = dqmwVar;
    }

    @Override // defpackage.dqmu
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dqmu
    public final dqmw b() {
        return this.d;
    }

    @Override // defpackage.dqmu
    public final String c() {
        return this.a;
    }

    @Override // defpackage.dqmu
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dqmu) {
            dqmu dqmuVar = (dqmu) obj;
            if (this.a.equals(dqmuVar.c()) && this.b == dqmuVar.a()) {
                dqmuVar.e();
                dqmuVar.f();
                dqmuVar.g();
                if (this.c == dqmuVar.d() && this.d.equals(dqmuVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ Alert.DURATION_SHOW_INDEFINITELY) * 1000003) ^ Alert.DURATION_SHOW_INDEFINITELY) * 1000003) ^ 1231) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "ThreadPoolConfig{name=" + this.a + ", numThreads=" + this.b + ", maxThreadSize=2147483647, maxQueueSize=2147483647, enableStats=true, enabledMetrics=" + this.c + ", listener=" + this.d.toString() + "}";
    }

    @Override // defpackage.dqmu
    public final void e() {
    }

    @Override // defpackage.dqmu
    public final void f() {
    }

    @Override // defpackage.dqmu
    public final void g() {
    }
}
