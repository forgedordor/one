package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qqg extends qqc {
    private final PointF e;

    public qqg(List list) {
        super(list);
        this.e = new PointF();
    }

    @Override // defpackage.qpv
    public final /* synthetic */ Object f(qxa qxaVar, float f) {
        return g(qxaVar, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qpv
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final PointF g(qxa qxaVar, float f, float f2, float f3) {
        Object obj;
        PointF pointF;
        Object obj2 = qxaVar.b;
        if (obj2 == null || (obj = qxaVar.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        qxc qxcVar = this.d;
        if (qxcVar != null && (pointF = (PointF) qxcVar.b(qxaVar.g, qxaVar.h.floatValue(), pointF2, pointF3, f, c(), this.c)) != null) {
            return pointF;
        }
        PointF pointF4 = this.e;
        pointF4.set(pointF2.x + (f2 * (pointF3.x - pointF2.x)), pointF2.y + (f3 * (pointF3.y - pointF2.y)));
        return pointF4;
    }
}
