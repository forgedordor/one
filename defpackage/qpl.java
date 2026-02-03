package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qpl implements qpa, qpi, qpf, qpq, qpg {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final qof c;
    private final quh d;
    private final String e;
    private final boolean f;
    private final qpv g;
    private final qpv h;
    private final qqm i;
    private qoz j;

    public qpl(qof qofVar, quh quhVar, qtw qtwVar) {
        this.c = qofVar;
        this.d = quhVar;
        this.e = qtwVar.a;
        this.f = qtwVar.e;
        qpv qpvVarA = qtwVar.b.a();
        this.g = qpvVarA;
        quhVar.k(qpvVarA);
        qpvVarA.h(this);
        qpv qpvVarA2 = qtwVar.c.a();
        this.h = qpvVarA2;
        quhVar.k(qpvVarA2);
        qpvVarA2.h(this);
        qqm qqmVar = new qqm(qtwVar.d);
        this.i = qqmVar;
        qqmVar.c(quhVar);
        qqmVar.d(this);
    }

    @Override // defpackage.qsu
    public final void a(Object obj, qxc qxcVar) {
        qpv qpvVar;
        if (this.i.e(obj, qxcVar)) {
            return;
        }
        if (obj == qok.u) {
            qpvVar = this.g;
        } else if (obj != qok.v) {
            return;
        } else {
            qpvVar = this.h;
        }
        qpvVar.d = qxcVar;
    }

    @Override // defpackage.qpa
    public final void b(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.h.e()).floatValue();
        qqm qqmVar = this.i;
        float fFloatValue3 = ((Float) qqmVar.h.e()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) qqmVar.i.e()).floatValue() / 100.0f;
        int i2 = (int) fFloatValue;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            Matrix matrix2 = this.a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(qqmVar.b(f + fFloatValue2));
            PointF pointF = qwu.a;
            this.j.b(canvas, matrix2, (int) (i * (((f / fFloatValue) * (fFloatValue4 - fFloatValue3)) + fFloatValue3)));
        }
    }

    @Override // defpackage.qpa
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.j.c(rectF, matrix, z);
    }

    @Override // defpackage.qpq
    public final void d() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.qsu
    public final void e(qst qstVar, int i, List list, qst qstVar2) {
        qwu.d(qstVar, i, list, qstVar2, this);
        for (int i2 = 0; i2 < this.j.a.size(); i2++) {
            qoy qoyVar = (qoy) this.j.a.get(i2);
            if (qoyVar instanceof qpg) {
                qwu.d(qstVar, i, list, qstVar2, (qpg) qoyVar);
            }
        }
    }

    @Override // defpackage.qoy
    public final void f(List list, List list2) {
        this.j.f(list, list2);
    }

    @Override // defpackage.qoy
    public final String g() {
        return this.e;
    }

    @Override // defpackage.qpf
    public final void h(ListIterator listIterator) {
        if (this.j == null) {
            while (listIterator.hasPrevious() && listIterator.previous() != this) {
            }
            ArrayList arrayList = new ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add((qoy) listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(arrayList);
            this.j = new qoz(this.c, this.d, "Repeater", this.f, arrayList, null);
        }
    }

    @Override // defpackage.qpi
    public final Path i() {
        Path pathI = this.j.i();
        Path path = this.b;
        path.reset();
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.h.e()).floatValue();
        int i = (int) fFloatValue;
        while (true) {
            i--;
            if (i < 0) {
                return path;
            }
            Matrix matrix = this.a;
            matrix.set(this.i.b(i + fFloatValue2));
            path.addPath(pathI, matrix);
        }
    }
}
