package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class quh implements qpa, qpq, qsu {
    final Matrix a;
    final qof b;
    final qul c;
    public qpz d;
    public quh e;
    public quh f;
    final qqm g;
    float h;
    BlurMaskFilter i;
    private final Path j = new Path();
    private final Matrix k = new Matrix();
    private final Matrix l = new Matrix();
    private final Paint m = new qou(1);
    private final Paint n = new qou(PorterDuff.Mode.DST_IN, null);
    private final Paint o = new qou(PorterDuff.Mode.DST_OUT, null);
    private final Paint p;
    private final Paint q;
    private final RectF r;
    private final RectF s;
    private final RectF t;
    private final RectF u;
    private final RectF v;
    private qqd w;
    private List x;
    private final List y;
    private boolean z;

    public quh(qof qofVar, qul qulVar) {
        qou qouVar = new qou(1);
        this.p = qouVar;
        this.q = new qou(PorterDuff.Mode.CLEAR);
        this.r = new RectF();
        this.s = new RectF();
        this.t = new RectF();
        this.u = new RectF();
        this.v = new RectF();
        this.a = new Matrix();
        this.y = new ArrayList();
        this.z = true;
        this.h = 0.0f;
        this.b = qofVar;
        this.c = qulVar;
        String str = qulVar.c;
        if (qulVar.x == 3) {
            qouVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            qouVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        qqm qqmVar = new qqm(qulVar.h);
        this.g = qqmVar;
        qqmVar.d(this);
        List list = qulVar.g;
        if (list != null && !list.isEmpty()) {
            qqd qqdVar = new qqd(qulVar.g);
            this.w = qqdVar;
            Iterator it = qqdVar.a.iterator();
            while (it.hasNext()) {
                ((qpv) it.next()).h(this);
            }
            for (qpv qpvVar : this.w.b) {
                k(qpvVar);
                qpvVar.h(this);
            }
        }
        if (this.c.s.isEmpty()) {
            p(true);
            return;
        }
        qpz qpzVar = new qpz(this.c.s);
        this.d = qpzVar;
        qpzVar.b = true;
        qpzVar.h(new qpq() { // from class: qug
            @Override // defpackage.qpq
            public final void d() {
                quh quhVar = this.a;
                quhVar.p(quhVar.d.k() == 1.0f);
            }
        });
        p(((Float) this.d.e()).floatValue() == 1.0f);
        k(this.d);
    }

    private final void s() {
        if (this.x != null) {
            return;
        }
        if (this.f == null) {
            this.x = Collections.EMPTY_LIST;
            return;
        }
        this.x = new ArrayList();
        for (quh quhVar = this.f; quhVar != null; quhVar = quhVar.f) {
            this.x.add(quhVar);
        }
    }

    private final void t(Canvas canvas) {
        RectF rectF = this.r;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.q);
        qnc.a();
    }

    private final void u() {
        this.b.invalidateSelf();
    }

    private final void v() {
        qoq qoqVar = this.b.a.a;
        String str = this.c.c;
    }

    @Override // defpackage.qsu
    public void a(Object obj, qxc qxcVar) {
        this.g.e(obj, qxcVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    @Override // defpackage.qpa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quh.b(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // defpackage.qpa
    public void c(RectF rectF, Matrix matrix, boolean z) {
        this.r.set(0.0f, 0.0f, 0.0f, 0.0f);
        s();
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        if (z) {
            List list = this.x;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        matrix2.preConcat(((quh) this.x.get(size)).g.a());
                    }
                }
            } else {
                quh quhVar = this.f;
                if (quhVar != null) {
                    matrix2.preConcat(quhVar.g.a());
                }
            }
        }
        matrix2.preConcat(this.g.a());
    }

    @Override // defpackage.qpq
    public final void d() {
        u();
    }

    @Override // defpackage.qsu
    public final void e(qst qstVar, int i, List list, qst qstVar2) {
        quh quhVar = this.e;
        if (quhVar != null) {
            qst qstVarB = qstVar2.b(quhVar.g());
            if (qstVar.d(this.e.g(), i)) {
                list.add(qstVarB.c(this.e));
            }
            if (qstVar.f(g(), i)) {
                this.e.n(qstVar, qstVar.a(this.e.g(), i) + i, list, qstVarB);
            }
        }
        if (qstVar.e(g(), i)) {
            if (!"__container".equals(g())) {
                qstVar2 = qstVar2.b(g());
                if (qstVar.d(g(), i)) {
                    list.add(qstVar2.c(this));
                }
            }
            if (qstVar.f(g(), i)) {
                n(qstVar, i + qstVar.a(g(), i), list, qstVar2);
            }
        }
    }

    @Override // defpackage.qoy
    public final String g() {
        return this.c.c;
    }

    public final BlurMaskFilter h(float f) {
        if (this.h == f) {
            return this.i;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.i = blurMaskFilter;
        this.h = f;
        return blurMaskFilter;
    }

    public qtm i() {
        return this.c.u;
    }

    public qvg j() {
        return this.c.v;
    }

    public final void k(qpv qpvVar) {
        if (qpvVar == null) {
            return;
        }
        this.y.add(qpvVar);
    }

    public abstract void l(Canvas canvas, Matrix matrix, int i);

    public final void m(qpv qpvVar) {
        this.y.remove(qpvVar);
    }

    public void o(float f) {
        qqm qqmVar = this.g;
        qpv qpvVar = qqmVar.e;
        if (qpvVar != null) {
            qpvVar.j(f);
        }
        qpv qpvVar2 = qqmVar.h;
        if (qpvVar2 != null) {
            qpvVar2.j(f);
        }
        qpv qpvVar3 = qqmVar.i;
        if (qpvVar3 != null) {
            qpvVar3.j(f);
        }
        qpv qpvVar4 = qqmVar.a;
        if (qpvVar4 != null) {
            qpvVar4.j(f);
        }
        qpv qpvVar5 = qqmVar.b;
        if (qpvVar5 != null) {
            qpvVar5.j(f);
        }
        qpv qpvVar6 = qqmVar.c;
        if (qpvVar6 != null) {
            qpvVar6.j(f);
        }
        qpv qpvVar7 = qqmVar.d;
        if (qpvVar7 != null) {
            qpvVar7.j(f);
        }
        qpz qpzVar = qqmVar.f;
        if (qpzVar != null) {
            qpzVar.j(f);
        }
        qpz qpzVar2 = qqmVar.g;
        if (qpzVar2 != null) {
            qpzVar2.j(f);
        }
        int i = 0;
        if (this.w != null) {
            for (int i2 = 0; i2 < this.w.a.size(); i2++) {
                ((qpv) this.w.a.get(i2)).j(f);
            }
        }
        qpz qpzVar3 = this.d;
        if (qpzVar3 != null) {
            qpzVar3.j(f);
        }
        quh quhVar = this.e;
        if (quhVar != null) {
            quhVar.o(f);
        }
        while (true) {
            List list = this.y;
            if (i >= list.size()) {
                return;
            }
            ((qpv) list.get(i)).j(f);
            i++;
        }
    }

    public final void p(boolean z) {
        if (z != this.z) {
            this.z = z;
            u();
        }
    }

    final boolean q() {
        qqd qqdVar = this.w;
        return (qqdVar == null || qqdVar.a.isEmpty()) ? false : true;
    }

    final boolean r() {
        return this.e != null;
    }

    @Override // defpackage.qoy
    public final void f(List list, List list2) {
    }

    public void n(qst qstVar, int i, List list, qst qstVar2) {
    }
}
