package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qow implements qpq, qpg, qpa {
    protected final quh a;
    final Paint b;
    float c;
    private final qof h;
    private final float[] j;
    private final qpv k;
    private final qpv l;
    private final List m;
    private final qpv n;
    private qpv o;
    private qpv p;
    private qpy q;
    private final PathMeasure d = new PathMeasure();
    private final Path e = new Path();
    private final Path f = new Path();
    private final RectF g = new RectF();
    private final List i = new ArrayList();

    public qow(qof qofVar, quh quhVar, Paint.Cap cap, Paint.Join join, float f, qtb qtbVar, qsz qszVar, List list, qsz qszVar2) {
        qou qouVar = new qou(1);
        this.b = qouVar;
        this.c = 0.0f;
        this.h = qofVar;
        this.a = quhVar;
        qouVar.setStyle(Paint.Style.STROKE);
        qouVar.setStrokeCap(cap);
        qouVar.setStrokeJoin(join);
        qouVar.setStrokeMiter(f);
        this.l = qtbVar.a();
        this.k = qszVar.a();
        if (qszVar2 == null) {
            this.n = null;
        } else {
            this.n = qszVar2.a();
        }
        this.m = new ArrayList(list.size());
        this.j = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.m.add(((qsz) list.get(i)).a());
        }
        quhVar.k(this.l);
        quhVar.k(this.k);
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            quhVar.k((qpv) this.m.get(i2));
        }
        qpv qpvVar = this.n;
        if (qpvVar != null) {
            quhVar.k(qpvVar);
        }
        this.l.h(this);
        this.k.h(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((qpv) this.m.get(i3)).h(this);
        }
        qpv qpvVar2 = this.n;
        if (qpvVar2 != null) {
            qpvVar2.h(this);
        }
        if (quhVar.i() != null) {
            qpv qpvVarA = quhVar.i().a.a();
            this.p = qpvVarA;
            qpvVarA.h(this);
            quhVar.k(this.p);
        }
        if (quhVar.j() != null) {
            this.q = new qpy(this, quhVar, quhVar.j());
        }
    }

    @Override // defpackage.qsu
    public void a(Object obj, qxc qxcVar) {
        qpy qpyVar;
        qpy qpyVar2;
        qpy qpyVar3;
        qpy qpyVar4;
        qpy qpyVar5;
        if (obj == qok.d) {
            this.l.d = qxcVar;
            return;
        }
        if (obj == qok.s) {
            this.k.d = qxcVar;
            return;
        }
        if (obj == qok.K) {
            qpv qpvVar = this.o;
            if (qpvVar != null) {
                this.a.m(qpvVar);
            }
            if (qxcVar == null) {
                this.o = null;
                return;
            }
            qqn qqnVar = new qqn(qxcVar);
            this.o = qqnVar;
            qqnVar.h(this);
            this.a.k(this.o);
            return;
        }
        if (obj == qok.j) {
            qpv qpvVar2 = this.p;
            if (qpvVar2 != null) {
                qpvVar2.d = qxcVar;
                return;
            }
            qqn qqnVar2 = new qqn(qxcVar);
            this.p = qqnVar2;
            qqnVar2.h(this);
            this.a.k(this.p);
            return;
        }
        if (obj == qok.e && (qpyVar5 = this.q) != null) {
            qpyVar5.b(qxcVar);
            return;
        }
        if (obj == qok.G && (qpyVar4 = this.q) != null) {
            qpyVar4.f(qxcVar);
            return;
        }
        if (obj == qok.H && (qpyVar3 = this.q) != null) {
            qpyVar3.c(qxcVar);
            return;
        }
        if (obj == qok.I && (qpyVar2 = this.q) != null) {
            qpyVar2.e(qxcVar);
        } else {
            if (obj != qok.J || (qpyVar = this.q) == null) {
                return;
            }
            qpyVar.g(qxcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01f2  */
    @Override // defpackage.qpa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.graphics.Canvas r20, android.graphics.Matrix r21, int r22) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qow.b(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // defpackage.qpa
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.e;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.i;
            if (i >= list.size()) {
                RectF rectF2 = this.g;
                path.computeBounds(rectF2, false);
                float fK = ((qpz) this.k).k() / 2.0f;
                rectF2.set(rectF2.left - fK, rectF2.top - fK, rectF2.right + fK, rectF2.bottom + fK);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                qnc.a();
                return;
            }
            qov qovVar = (qov) list.get(i);
            int i2 = 0;
            while (true) {
                List list2 = qovVar.a;
                if (i2 < list2.size()) {
                    path.addPath(((qpi) list2.get(i2)).i(), matrix);
                    i2++;
                }
            }
            i++;
        }
    }

    @Override // defpackage.qpq
    public final void d() {
        this.h.invalidateSelf();
    }

    @Override // defpackage.qsu
    public final void e(qst qstVar, int i, List list, qst qstVar2) {
        qwu.d(qstVar, i, list, qstVar2, this);
    }

    @Override // defpackage.qoy
    public final void f(List list, List list2) {
        qov qovVar = null;
        qpp qppVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            qoy qoyVar = (qoy) list.get(size);
            if (qoyVar instanceof qpp) {
                qpp qppVar2 = (qpp) qoyVar;
                if (qppVar2.e == 2) {
                    qppVar = qppVar2;
                }
            }
        }
        if (qppVar != null) {
            qppVar.a(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            qoy qoyVar2 = (qoy) list2.get(size2);
            if (qoyVar2 instanceof qpp) {
                qpp qppVar3 = (qpp) qoyVar2;
                if (qppVar3.e == 2) {
                    if (qovVar != null) {
                        this.i.add(qovVar);
                    }
                    qov qovVar2 = new qov(qppVar3);
                    qppVar3.a(this);
                    qovVar = qovVar2;
                }
            }
            if (qoyVar2 instanceof qpi) {
                if (qovVar == null) {
                    qovVar = new qov(qppVar);
                }
                qovVar.a.add((qpi) qoyVar2);
            }
        }
        if (qovVar != null) {
            this.i.add(qovVar);
        }
    }
}
