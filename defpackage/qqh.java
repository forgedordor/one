package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qqh extends qqc {
    private final qxd e;

    public qqh(List list) {
        super(list);
        this.e = new qxd();
    }

    @Override // defpackage.qpv
    public final /* bridge */ /* synthetic */ Object f(qxa qxaVar, float f) {
        Object obj;
        float f2;
        Object obj2 = qxaVar.b;
        if (obj2 == null || (obj = qxaVar.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        qxd qxdVar = (qxd) obj2;
        qxd qxdVar2 = (qxd) obj;
        qxc qxcVar = this.d;
        if (qxcVar != null) {
            f2 = f;
            qxd qxdVar3 = (qxd) qxcVar.b(qxaVar.g, qxaVar.h.floatValue(), qxdVar, qxdVar2, f2, c(), this.c);
            if (qxdVar3 != null) {
                return qxdVar3;
            }
        } else {
            f2 = f;
        }
        qxd qxdVar4 = this.e;
        float f3 = qxdVar.a;
        float f4 = qxdVar2.a;
        PointF pointF = qwu.a;
        float f5 = f3 + ((f4 - f3) * f2);
        float f6 = qxdVar.b;
        float f7 = f6 + ((qxdVar2.b - f6) * f2);
        qxdVar4.a = f5;
        qxdVar4.b = f7;
        return qxdVar4;
    }
}
