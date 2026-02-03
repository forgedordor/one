package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qqb extends qqc {
    public qqb(List list) {
        super(list);
    }

    @Override // defpackage.qpv
    public final /* bridge */ /* synthetic */ Object f(qxa qxaVar, float f) {
        return Integer.valueOf(k(qxaVar, f));
    }

    public final int k(qxa qxaVar, float f) {
        float f2;
        Object obj = qxaVar.b;
        if (obj == null || qxaVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        qxc qxcVar = this.d;
        if (qxcVar != null) {
            f2 = f;
            Integer num = (Integer) qxcVar.b(qxaVar.g, qxaVar.h.floatValue(), (Integer) obj, (Integer) qxaVar.c, f2, c(), this.c);
            if (num != null) {
                return num.intValue();
            }
        } else {
            f2 = f;
        }
        int iIntValue = qxaVar.k;
        if (iIntValue == 784923401) {
            iIntValue = ((Integer) obj).intValue();
            qxaVar.k = iIntValue;
        }
        int iIntValue2 = qxaVar.l;
        if (iIntValue2 == 784923401) {
            iIntValue2 = ((Integer) qxaVar.c).intValue();
            qxaVar.l = iIntValue2;
        }
        PointF pointF = qwu.a;
        return (int) (iIntValue + ((iIntValue2 - iIntValue) * f2));
    }
}
