package defpackage;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qqj extends qpv {
    protected qxc e;
    protected qxc f;
    private final PointF g;
    private final PointF h;
    private final qpv i;
    private final qpv j;

    public qqj(qpv qpvVar, qpv qpvVar2) {
        super(Collections.EMPTY_LIST);
        this.g = new PointF();
        this.h = new PointF();
        this.i = qpvVar;
        this.j = qpvVar2;
        j(this.c);
    }

    @Override // defpackage.qpv
    public final /* bridge */ /* synthetic */ Object e() {
        return k(0.0f);
    }

    @Override // defpackage.qpv
    public final /* bridge */ /* synthetic */ Object f(qxa qxaVar, float f) {
        return k(f);
    }

    @Override // defpackage.qpv
    public final void j(float f) {
        qpv qpvVar = this.i;
        qpvVar.j(f);
        qpv qpvVar2 = this.j;
        qpvVar2.j(f);
        this.g.set(((Float) qpvVar.e()).floatValue(), ((Float) qpvVar2.e()).floatValue());
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

    final PointF k(float f) {
        float f2;
        Float f3;
        qpv qpvVar;
        qxa qxaVarD;
        qpv qpvVar2;
        qxa qxaVarD2;
        Float f4 = null;
        if (this.e == null || (qxaVarD2 = (qpvVar2 = this.i).d()) == null) {
            f2 = f;
            f3 = null;
        } else {
            float fB = qpvVar2.b();
            Float f5 = qxaVarD2.h;
            f2 = f;
            f3 = (Float) this.e.b(qxaVarD2.g, f5 == null ? qxaVarD2.g : f5.floatValue(), (Float) qxaVarD2.b, (Float) qxaVarD2.c, f, f, fB);
        }
        if (this.f != null && (qxaVarD = (qpvVar = this.j).d()) != null) {
            float fB2 = qpvVar.b();
            Float f6 = qxaVarD.h;
            f4 = (Float) this.f.b(qxaVarD.g, f6 == null ? qxaVarD.g : f6.floatValue(), (Float) qxaVarD.b, (Float) qxaVarD.c, f2, f2, fB2);
        }
        if (f3 == null) {
            this.h.set(this.g.x, 0.0f);
        } else {
            this.h.set(f3.floatValue(), 0.0f);
        }
        if (f4 == null) {
            PointF pointF = this.h;
            pointF.set(pointF.x, this.g.y);
        } else {
            PointF pointF2 = this.h;
            pointF2.set(pointF2.x, f4.floatValue());
        }
        return this.h;
    }
}
