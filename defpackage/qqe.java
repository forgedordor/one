package defpackage;

import android.graphics.Path;
import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qqe extends qxa {
    public Path a;
    private final qxa o;

    public qqe(qnm qnmVar, qxa qxaVar) {
        super(qnmVar, (PointF) qxaVar.b, (PointF) qxaVar.c, qxaVar.d, qxaVar.e, qxaVar.f, qxaVar.g, qxaVar.h);
        this.o = qxaVar;
        a();
    }

    public final void a() {
        Object obj;
        Object obj2;
        Object obj3 = this.c;
        boolean z = false;
        if (obj3 != null && (obj2 = this.b) != null && ((PointF) obj2).equals(((PointF) obj3).x, ((PointF) this.c).y)) {
            z = true;
        }
        Object obj4 = this.b;
        if (obj4 == null || (obj = this.c) == null || z) {
            return;
        }
        qxa qxaVar = this.o;
        PointF pointF = (PointF) obj4;
        PointF pointF2 = (PointF) obj;
        PointF pointF3 = qxaVar.m;
        PointF pointF4 = qxaVar.n;
        ThreadLocal threadLocal = qwz.a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            path.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        }
        this.a = path;
    }
}
