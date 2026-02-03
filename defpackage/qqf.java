package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qqf extends qqc {
    private final PointF e;
    private final float[] f;
    private final PathMeasure g;
    private qqe h;

    public qqf(List list) {
        super(list);
        this.e = new PointF();
        this.f = new float[2];
        this.g = new PathMeasure();
    }

    @Override // defpackage.qpv
    public final /* bridge */ /* synthetic */ Object f(qxa qxaVar, float f) {
        float f2;
        qqe qqeVar = (qqe) qxaVar;
        Path path = qqeVar.a;
        if (path == null) {
            return (PointF) qxaVar.b;
        }
        qxc qxcVar = this.d;
        if (qxcVar != null) {
            f2 = f;
            PointF pointF = (PointF) qxcVar.b(qqeVar.g, qqeVar.h.floatValue(), (PointF) qqeVar.b, (PointF) qqeVar.c, c(), f2, this.c);
            if (pointF != null) {
                return pointF;
            }
        } else {
            f2 = f;
        }
        if (this.h != qqeVar) {
            this.g.setPath(path, false);
            this.h = qqeVar;
        }
        PathMeasure pathMeasure = this.g;
        float length = pathMeasure.getLength() * f2;
        float[] fArr = this.f;
        pathMeasure.getPosTan(length, fArr, null);
        PointF pointF2 = this.e;
        pointF2.set(fArr[0], fArr[1]);
        return pointF2;
    }
}
