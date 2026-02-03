package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qpu implements qps {
    private final qxa a;
    private float b = -1.0f;

    public qpu(List list) {
        this.a = (qxa) list.get(0);
    }

    @Override // defpackage.qps
    public final float a() {
        return this.a.b();
    }

    @Override // defpackage.qps
    public final float b() {
        return this.a.c();
    }

    @Override // defpackage.qps
    public final qxa c() {
        return this.a;
    }

    @Override // defpackage.qps
    public final boolean d(float f) {
        if (this.b == f) {
            return true;
        }
        this.b = f;
        return false;
    }

    @Override // defpackage.qps
    public final boolean e() {
        return false;
    }

    @Override // defpackage.qps
    public final boolean f(float f) {
        return !this.a.e();
    }
}
