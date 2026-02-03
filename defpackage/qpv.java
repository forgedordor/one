package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qpv {
    public qxc d;
    private final qps e;
    final List a = new ArrayList(1);
    public boolean b = false;
    public float c = 0.0f;
    private Object f = null;
    private float g = -1.0f;
    private float h = -1.0f;

    public qpv(List list) {
        qps qpuVar;
        if (list.isEmpty()) {
            qpuVar = new qpr();
        } else {
            qpuVar = list.size() == 1 ? new qpu(list) : new qpt(list);
        }
        this.e = qpuVar;
    }

    private final float k() {
        float f = this.g;
        if (f != -1.0f) {
            return f;
        }
        float fB = this.e.b();
        this.g = fB;
        return fB;
    }

    public float a() {
        float f = this.h;
        if (f != -1.0f) {
            return f;
        }
        float fA = this.e.a();
        this.h = fA;
        return fA;
    }

    public final float b() {
        qxa qxaVarD = d();
        if (qxaVarD == null || qxaVarD.e()) {
            return 0.0f;
        }
        return qxaVarD.d.getInterpolation(c());
    }

    final float c() {
        if (this.b) {
            return 0.0f;
        }
        qxa qxaVarD = d();
        if (qxaVarD.e()) {
            return 0.0f;
        }
        return (this.c - qxaVarD.c()) / (qxaVarD.b() - qxaVarD.c());
    }

    public final qxa d() {
        qxa qxaVarC = this.e.c();
        qnc.a();
        return qxaVarC;
    }

    public Object e() {
        Interpolator interpolator;
        float fC = c();
        if (this.d == null && this.e.d(fC)) {
            return this.f;
        }
        qxa qxaVarD = d();
        Interpolator interpolator2 = qxaVarD.e;
        Object objF = (interpolator2 == null || (interpolator = qxaVarD.f) == null) ? f(qxaVarD, b()) : g(qxaVarD, fC, interpolator2.getInterpolation(fC), interpolator.getInterpolation(fC));
        this.f = objF;
        return objF;
    }

    public abstract Object f(qxa qxaVar, float f);

    protected Object g(qxa qxaVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public final void h(qpq qpqVar) {
        this.a.add(qpqVar);
    }

    public void i() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ((qpq) list.get(i)).d();
            i++;
        }
    }

    public void j(float f) {
        qps qpsVar = this.e;
        if (qpsVar.e()) {
            return;
        }
        if (f < k()) {
            f = k();
        } else if (f > a()) {
            f = a();
        }
        if (f != this.c) {
            this.c = f;
            if (qpsVar.f(f)) {
                i();
            }
        }
    }
}
