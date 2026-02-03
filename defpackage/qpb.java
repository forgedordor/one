package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qpb implements qpi, qpq, qpg {
    private final String b;
    private final qof c;
    private final qpv d;
    private final qpv e;
    private final qtn f;
    private boolean h;
    private final Path a = new Path();
    private final qox g = new qox();

    public qpb(qof qofVar, quh quhVar, qtn qtnVar) {
        this.b = qtnVar.a;
        this.c = qofVar;
        qpv qpvVarA = qtnVar.c.a();
        this.d = qpvVarA;
        qpv qpvVarA2 = qtnVar.b.a();
        this.e = qpvVarA2;
        this.f = qtnVar;
        quhVar.k(qpvVarA);
        quhVar.k(qpvVarA2);
        qpvVarA.h(this);
        qpvVarA2.h(this);
    }

    @Override // defpackage.qsu
    public final void a(Object obj, qxc qxcVar) {
        qpv qpvVar;
        if (obj == qok.k) {
            qpvVar = this.d;
        } else if (obj != qok.n) {
            return;
        } else {
            qpvVar = this.e;
        }
        qpvVar.d = qxcVar;
    }

    @Override // defpackage.qpq
    public final void d() {
        this.h = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.qsu
    public final void e(qst qstVar, int i, List list, qst qstVar2) {
        qwu.d(qstVar, i, list, qstVar2, this);
    }

    @Override // defpackage.qoy
    public final void f(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            qoy qoyVar = (qoy) list.get(i);
            if (qoyVar instanceof qpp) {
                qpp qppVar = (qpp) qoyVar;
                if (qppVar.e == 1) {
                    this.g.a(qppVar);
                    qppVar.a(this);
                }
            }
        }
    }

    @Override // defpackage.qoy
    public final String g() {
        return this.b;
    }

    @Override // defpackage.qpi
    public final Path i() {
        if (this.h) {
            return this.a;
        }
        Path path = this.a;
        path.reset();
        qtn qtnVar = this.f;
        if (qtnVar.e) {
            this.h = true;
            return path;
        }
        PointF pointF = (PointF) this.d.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        path.reset();
        float f3 = f2 * 0.55228f;
        float f4 = -f;
        float f5 = -f3;
        float f6 = f3 + 0.0f;
        float f7 = 0.55228f * f;
        float f8 = -f7;
        float f9 = f7 + 0.0f;
        float f10 = -f2;
        if (qtnVar.d) {
            path.moveTo(0.0f, f10);
            path.cubicTo(f8, f10, f4, f5, f4, 0.0f);
            path.cubicTo(f4, f6, f8, f2, 0.0f, f2);
            path.cubicTo(f9, f2, f, f6, f, 0.0f);
            path.cubicTo(f, f5, f9, f10, 0.0f, f10);
        } else {
            path.moveTo(0.0f, f10);
            path.cubicTo(f9, f10, f, f5, f, 0.0f);
            path.cubicTo(f, f6, f9, f2, 0.0f, f2);
            path.cubicTo(f8, f2, f4, f6, f4, 0.0f);
            path.cubicTo(f4, f5, f8, f10, 0.0f, f10);
        }
        PointF pointF2 = (PointF) this.e.e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.g.b(path);
        this.h = true;
        return path;
    }
}
