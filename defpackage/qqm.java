package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qqm {
    public qpv a;
    public qpv b;
    public qpv c;
    public qpv d;
    public qpv e;
    public qpz f;
    public qpz g;
    public qpv h;
    public qpv i;
    private final Matrix j = new Matrix();
    private final Matrix k;
    private final Matrix l;
    private final Matrix m;
    private final float[] n;

    public qqm(qtj qtjVar) {
        qtc qtcVar = qtjVar.a;
        this.a = qtcVar == null ? null : qtcVar.a();
        qtk qtkVar = qtjVar.b;
        this.b = qtkVar == null ? null : qtkVar.a();
        qte qteVar = qtjVar.c;
        this.c = qteVar == null ? null : qteVar.a();
        qsz qszVar = qtjVar.d;
        this.d = qszVar == null ? null : qszVar.a();
        qsz qszVar2 = qtjVar.f;
        qpz qpzVar = (qpz) (qszVar2 == null ? null : qszVar2.a());
        this.f = qpzVar;
        if (qpzVar != null) {
            this.k = new Matrix();
            this.l = new Matrix();
            this.m = new Matrix();
            this.n = new float[9];
        } else {
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
        }
        qsz qszVar3 = qtjVar.g;
        this.g = (qpz) (qszVar3 == null ? null : qszVar3.a());
        qtb qtbVar = qtjVar.e;
        if (qtbVar != null) {
            this.e = qtbVar.a();
        }
        qsz qszVar4 = qtjVar.h;
        if (qszVar4 != null) {
            this.h = qszVar4.a();
        } else {
            this.h = null;
        }
        qsz qszVar5 = qtjVar.i;
        if (qszVar5 != null) {
            this.i = qszVar5.a();
        } else {
            this.i = null;
        }
    }

    private final void f() {
        for (int i = 0; i < 9; i++) {
            this.n[i] = 0.0f;
        }
    }

    public final Matrix a() {
        PointF pointF;
        PointF pointF2;
        Matrix matrix = this.j;
        matrix.reset();
        qpv qpvVar = this.b;
        if (qpvVar != null && (pointF2 = (PointF) qpvVar.e()) != null && (pointF2.x != 0.0f || pointF2.y != 0.0f)) {
            matrix.preTranslate(pointF2.x, pointF2.y);
        }
        qpv qpvVar2 = this.d;
        if (qpvVar2 != null) {
            float fFloatValue = qpvVar2 instanceof qqn ? ((Float) qpvVar2.e()).floatValue() : ((qpz) qpvVar2).k();
            if (fFloatValue != 0.0f) {
                matrix.preRotate(fFloatValue);
            }
        }
        if (this.f != null) {
            float fCos = this.g == null ? 0.0f : (float) Math.cos(Math.toRadians((-r4.k()) + 90.0f));
            float fSin = this.g == null ? 1.0f : (float) Math.sin(Math.toRadians((-r6.k()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r1.k()));
            f();
            float[] fArr = this.n;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f = -fSin;
            fArr[3] = f;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.k;
            matrix2.setValues(fArr);
            f();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.l;
            matrix3.setValues(fArr);
            f();
            fArr[0] = fCos;
            fArr[1] = f;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.m;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        qpv qpvVar3 = this.c;
        if (qpvVar3 != null) {
            qxd qxdVar = (qxd) qpvVar3.e();
            float f2 = qxdVar.a;
            if (f2 != 1.0f || qxdVar.b != 1.0f) {
                matrix.preScale(f2, qxdVar.b);
            }
        }
        qpv qpvVar4 = this.a;
        if (qpvVar4 != null && (((pointF = (PointF) qpvVar4.e()) != null && pointF.x != 0.0f) || pointF.y != 0.0f)) {
            matrix.preTranslate(-pointF.x, -pointF.y);
        }
        return matrix;
    }

    public final Matrix b(float f) {
        qpv qpvVar = this.b;
        PointF pointF = qpvVar == null ? null : (PointF) qpvVar.e();
        qpv qpvVar2 = this.c;
        qxd qxdVar = qpvVar2 == null ? null : (qxd) qpvVar2.e();
        Matrix matrix = this.j;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (qxdVar != null) {
            double d = f;
            matrix.preScale((float) Math.pow(qxdVar.a, d), (float) Math.pow(qxdVar.b, d));
        }
        qpv qpvVar3 = this.d;
        if (qpvVar3 != null) {
            float fFloatValue = ((Float) qpvVar3.e()).floatValue();
            qpv qpvVar4 = this.a;
            PointF pointF2 = qpvVar4 != null ? (PointF) qpvVar4.e() : null;
            matrix.preRotate(fFloatValue * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return matrix;
    }

    public final void c(quh quhVar) {
        quhVar.k(this.e);
        quhVar.k(this.h);
        quhVar.k(this.i);
        quhVar.k(this.a);
        quhVar.k(this.b);
        quhVar.k(this.c);
        quhVar.k(this.d);
        quhVar.k(this.f);
        quhVar.k(this.g);
    }

    public final void d(qpq qpqVar) {
        qpv qpvVar = this.e;
        if (qpvVar != null) {
            qpvVar.h(qpqVar);
        }
        qpv qpvVar2 = this.h;
        if (qpvVar2 != null) {
            qpvVar2.h(qpqVar);
        }
        qpv qpvVar3 = this.i;
        if (qpvVar3 != null) {
            qpvVar3.h(qpqVar);
        }
        qpv qpvVar4 = this.a;
        if (qpvVar4 != null) {
            qpvVar4.h(qpqVar);
        }
        qpv qpvVar5 = this.b;
        if (qpvVar5 != null) {
            qpvVar5.h(qpqVar);
        }
        qpv qpvVar6 = this.c;
        if (qpvVar6 != null) {
            qpvVar6.h(qpqVar);
        }
        qpv qpvVar7 = this.d;
        if (qpvVar7 != null) {
            qpvVar7.h(qpqVar);
        }
        qpz qpzVar = this.f;
        if (qpzVar != null) {
            qpzVar.h(qpqVar);
        }
        qpz qpzVar2 = this.g;
        if (qpzVar2 != null) {
            qpzVar2.h(qpqVar);
        }
    }

    public final boolean e(Object obj, qxc qxcVar) {
        if (obj == qok.f) {
            qpv qpvVar = this.a;
            if (qpvVar == null) {
                this.a = new qqn(qxcVar, new PointF());
                return true;
            }
            qpvVar.d = qxcVar;
            return true;
        }
        if (obj == qok.g) {
            qpv qpvVar2 = this.b;
            if (qpvVar2 == null) {
                this.b = new qqn(qxcVar, new PointF());
                return true;
            }
            qpvVar2.d = qxcVar;
            return true;
        }
        if (obj == qok.h) {
            qpv qpvVar3 = this.b;
            if (qpvVar3 instanceof qqj) {
                qqj qqjVar = (qqj) qpvVar3;
                qxc qxcVar2 = qqjVar.e;
                qqjVar.e = qxcVar;
                return true;
            }
        }
        if (obj == qok.i) {
            qpv qpvVar4 = this.b;
            if (qpvVar4 instanceof qqj) {
                qqj qqjVar2 = (qqj) qpvVar4;
                qxc qxcVar3 = qqjVar2.f;
                qqjVar2.f = qxcVar;
                return true;
            }
        }
        if (obj == qok.o) {
            qpv qpvVar5 = this.c;
            if (qpvVar5 == null) {
                this.c = new qqn(qxcVar, new qxd());
                return true;
            }
            qpvVar5.d = qxcVar;
            return true;
        }
        if (obj == qok.p) {
            qpv qpvVar6 = this.d;
            if (qpvVar6 == null) {
                this.d = new qqn(qxcVar, Float.valueOf(0.0f));
                return true;
            }
            qpvVar6.d = qxcVar;
            return true;
        }
        if (obj == qok.c) {
            qpv qpvVar7 = this.e;
            if (qpvVar7 == null) {
                this.e = new qqn(qxcVar, 100);
                return true;
            }
            qpvVar7.d = qxcVar;
            return true;
        }
        if (obj == qok.C) {
            qpv qpvVar8 = this.h;
            if (qpvVar8 == null) {
                this.h = new qqn(qxcVar, Float.valueOf(100.0f));
                return true;
            }
            qpvVar8.d = qxcVar;
            return true;
        }
        if (obj == qok.D) {
            qpv qpvVar9 = this.i;
            if (qpvVar9 == null) {
                this.i = new qqn(qxcVar, Float.valueOf(100.0f));
                return true;
            }
            qpvVar9.d = qxcVar;
            return true;
        }
        if (obj == qok.q) {
            if (this.f == null) {
                this.f = new qpz(Collections.singletonList(new qxa(Float.valueOf(0.0f))));
            }
            this.f.d = qxcVar;
            return true;
        }
        if (obj != qok.r) {
            return false;
        }
        if (this.g == null) {
            this.g = new qpz(Collections.singletonList(new qxa(Float.valueOf(0.0f))));
        }
        this.g.d = qxcVar;
        return true;
    }
}
