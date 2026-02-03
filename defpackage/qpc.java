package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qpc implements qpa, qpq, qpg {
    float a;
    private final Path b;
    private final Paint c;
    private final quh d;
    private final String e;
    private final boolean f;
    private final List g;
    private final qpv h;
    private final qpv i;
    private qpv j;
    private final qof k;
    private qpv l;
    private qpy m;

    public qpc(qof qofVar, quh quhVar, qtz qtzVar) {
        Path path = new Path();
        this.b = path;
        this.c = new qou(1);
        this.g = new ArrayList();
        this.d = quhVar;
        this.e = qtzVar.b;
        this.f = qtzVar.e;
        this.k = qofVar;
        if (quhVar.i() != null) {
            qpv qpvVarA = quhVar.i().a.a();
            this.l = qpvVarA;
            qpvVarA.h(this);
            quhVar.k(this.l);
        }
        if (quhVar.j() != null) {
            this.m = new qpy(this, quhVar, quhVar.j());
        }
        if (qtzVar.c == null) {
            this.h = null;
            this.i = null;
            return;
        }
        path.setFillType(qtzVar.a);
        qpv qpvVarA2 = qtzVar.c.a();
        this.h = qpvVarA2;
        qpvVarA2.h(this);
        quhVar.k(qpvVarA2);
        qpv qpvVarA3 = qtzVar.d.a();
        this.i = qpvVarA3;
        qpvVarA3.h(this);
        quhVar.k(qpvVarA3);
    }

    @Override // defpackage.qsu
    public final void a(Object obj, qxc qxcVar) {
        qpy qpyVar;
        qpy qpyVar2;
        qpy qpyVar3;
        qpy qpyVar4;
        qpy qpyVar5;
        if (obj == qok.a) {
            this.h.d = qxcVar;
            return;
        }
        if (obj == qok.d) {
            this.i.d = qxcVar;
            return;
        }
        if (obj == qok.K) {
            qpv qpvVar = this.j;
            if (qpvVar != null) {
                this.d.m(qpvVar);
            }
            if (qxcVar == null) {
                this.j = null;
                return;
            }
            qqn qqnVar = new qqn(qxcVar);
            this.j = qqnVar;
            qqnVar.h(this);
            this.d.k(this.j);
            return;
        }
        if (obj == qok.j) {
            qpv qpvVar2 = this.l;
            if (qpvVar2 != null) {
                qpvVar2.d = qxcVar;
                return;
            }
            qqn qqnVar2 = new qqn(qxcVar);
            this.l = qqnVar2;
            qqnVar2.h(this);
            this.d.k(this.l);
            return;
        }
        if (obj == qok.e && (qpyVar5 = this.m) != null) {
            qpyVar5.b(qxcVar);
            return;
        }
        if (obj == qok.G && (qpyVar4 = this.m) != null) {
            qpyVar4.f(qxcVar);
            return;
        }
        if (obj == qok.H && (qpyVar3 = this.m) != null) {
            qpyVar3.c(qxcVar);
            return;
        }
        if (obj == qok.I && (qpyVar2 = this.m) != null) {
            qpyVar2.e(qxcVar);
        } else {
            if (obj != qok.J || (qpyVar = this.m) == null) {
                return;
            }
            qpyVar.g(qxcVar);
        }
    }

    @Override // defpackage.qpa
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.f) {
            return;
        }
        qpv qpvVar = this.h;
        qpv qpvVar2 = this.i;
        int iK = ((qpw) qpvVar).k();
        float fIntValue = ((Integer) qpvVar2.e()).intValue();
        Paint paint = this.c;
        paint.setColor((qwu.e((int) ((((i / 255.0f) * fIntValue) / 100.0f) * 255.0f)) << 24) | (iK & 16777215));
        qpv qpvVar3 = this.j;
        if (qpvVar3 != null) {
            paint.setColorFilter((ColorFilter) qpvVar3.e());
        }
        qpv qpvVar4 = this.l;
        if (qpvVar4 != null) {
            float fFloatValue = ((Float) qpvVar4.e()).floatValue();
            if (fFloatValue == 0.0f) {
                paint.setMaskFilter(null);
            } else if (fFloatValue != this.a) {
                paint.setMaskFilter(this.d.h(fFloatValue));
            }
            this.a = fFloatValue;
        }
        qpy qpyVar = this.m;
        if (qpyVar != null) {
            qpyVar.a(paint);
        }
        Path path = this.b;
        path.reset();
        int i2 = 0;
        while (true) {
            List list = this.g;
            if (i2 >= list.size()) {
                canvas.drawPath(path, paint);
                qnc.a();
                return;
            } else {
                path.addPath(((qpi) list.get(i2)).i(), matrix);
                i2++;
            }
        }
    }

    @Override // defpackage.qpa
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.b;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.g;
            if (i >= list.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((qpi) list.get(i)).i(), matrix);
                i++;
            }
        }
    }

    @Override // defpackage.qpq
    public final void d() {
        this.k.invalidateSelf();
    }

    @Override // defpackage.qsu
    public final void e(qst qstVar, int i, List list, qst qstVar2) {
        qwu.d(qstVar, i, list, qstVar2, this);
    }

    @Override // defpackage.qoy
    public final void f(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            qoy qoyVar = (qoy) list2.get(i);
            if (qoyVar instanceof qpi) {
                this.g.add((qpi) qoyVar);
            }
        }
    }

    @Override // defpackage.qoy
    public final String g() {
        return this.e;
    }
}
