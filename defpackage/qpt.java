package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qpt implements qps {
    private final List a;
    private qxa c = null;
    private float d = -1.0f;
    private qxa b = g(0.0f);

    public qpt(List list) {
        this.a = list;
    }

    private final qxa g(float f) {
        List list = this.a;
        qxa qxaVar = (qxa) list.get(list.size() - 1);
        if (f >= qxaVar.c()) {
            return qxaVar;
        }
        for (int size = list.size() - 2; size > 0; size--) {
            qxa qxaVar2 = (qxa) list.get(size);
            if (this.b != qxaVar2 && qxaVar2.d(f)) {
                return qxaVar2;
            }
        }
        return (qxa) list.get(0);
    }

    @Override // defpackage.qps
    public final float a() {
        return ((qxa) this.a.get(r0.size() - 1)).b();
    }

    @Override // defpackage.qps
    public final float b() {
        return ((qxa) this.a.get(0)).c();
    }

    @Override // defpackage.qps
    public final qxa c() {
        return this.b;
    }

    @Override // defpackage.qps
    public final boolean d(float f) {
        qxa qxaVar = this.c;
        qxa qxaVar2 = this.b;
        if (qxaVar == qxaVar2 && this.d == f) {
            return true;
        }
        this.c = qxaVar2;
        this.d = f;
        return false;
    }

    @Override // defpackage.qps
    public final boolean e() {
        return false;
    }

    @Override // defpackage.qps
    public final boolean f(float f) {
        if (this.b.d(f)) {
            return !this.b.e();
        }
        this.b = g(f);
        return true;
    }
}
