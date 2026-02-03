package defpackage;

import android.graphics.Color;
import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qpy implements qpq {
    private final qpq a;
    private final qpv b;
    private final qpv c;
    private final qpv d;
    private final qpv e;
    private final qpv f;
    private boolean g = true;

    public qpy(qpq qpqVar, quh quhVar, qvg qvgVar) {
        this.a = qpqVar;
        qpv qpvVarA = qvgVar.a.a();
        this.b = qpvVarA;
        qpvVarA.h(this);
        quhVar.k(qpvVarA);
        qpv qpvVarA2 = qvgVar.b.a();
        this.c = qpvVarA2;
        qpvVarA2.h(this);
        quhVar.k(qpvVarA2);
        qpv qpvVarA3 = qvgVar.c.a();
        this.d = qpvVarA3;
        qpvVarA3.h(this);
        quhVar.k(qpvVarA3);
        qpv qpvVarA4 = qvgVar.d.a();
        this.e = qpvVarA4;
        qpvVarA4.h(this);
        quhVar.k(qpvVarA4);
        qpv qpvVarA5 = qvgVar.e.a();
        this.f = qpvVarA5;
        qpvVarA5.h(this);
        quhVar.k(qpvVarA5);
    }

    public final void a(Paint paint) {
        if (this.g) {
            this.g = false;
            double dFloatValue = ((Float) this.d.e()).floatValue();
            float fFloatValue = ((Float) this.e.e()).floatValue();
            double d = dFloatValue * 0.017453292519943295d;
            float fSin = ((float) Math.sin(d)) * fFloatValue;
            float fCos = ((float) Math.cos(d + 3.141592653589793d)) * fFloatValue;
            int iIntValue = ((Integer) this.b.e()).intValue();
            paint.setShadowLayer(((Float) this.f.e()).floatValue(), fSin, fCos, Color.argb(Math.round(((Float) this.c.e()).floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    public final void b(qxc qxcVar) {
        this.b.d = qxcVar;
    }

    public final void c(qxc qxcVar) {
        this.d.d = qxcVar;
    }

    @Override // defpackage.qpq
    public final void d() {
        this.g = true;
        this.a.d();
    }

    public final void e(qxc qxcVar) {
        this.e.d = qxcVar;
    }

    public final void f(qxc qxcVar) {
        if (qxcVar == null) {
            this.c.d = null;
        } else {
            this.c.d = new qpx(qxcVar);
        }
    }

    public final void g(qxc qxcVar) {
        this.f.d = qxcVar;
    }
}
