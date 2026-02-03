package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qpz extends qqc {
    public qpz(List list) {
        super(list);
    }

    @Override // defpackage.qpv
    public final /* bridge */ /* synthetic */ Object f(qxa qxaVar, float f) {
        return Float.valueOf(l(qxaVar, f));
    }

    public final float k() {
        return l(d(), b());
    }

    final float l(qxa qxaVar, float f) {
        float f2;
        Object obj = qxaVar.b;
        if (obj == null || qxaVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        qxc qxcVar = this.d;
        if (qxcVar != null) {
            f2 = f;
            Float f3 = (Float) qxcVar.b(qxaVar.g, qxaVar.h.floatValue(), (Float) obj, (Float) qxaVar.c, f2, c(), this.c);
            if (f3 != null) {
                return f3.floatValue();
            }
        } else {
            f2 = f;
        }
        float fFloatValue = qxaVar.i;
        if (fFloatValue == -3987645.8f) {
            fFloatValue = ((Float) obj).floatValue();
            qxaVar.i = fFloatValue;
        }
        float fFloatValue2 = qxaVar.j;
        if (fFloatValue2 == -3987645.8f) {
            fFloatValue2 = ((Float) qxaVar.c).floatValue();
            qxaVar.j = fFloatValue2;
        }
        PointF pointF = qwu.a;
        return fFloatValue + (f2 * (fFloatValue2 - fFloatValue));
    }
}
