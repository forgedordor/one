package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qpe extends qow {
    private final String d;
    private final boolean e;
    private final ctz f;
    private final ctz g;
    private final RectF h;
    private final int i;
    private final qpv j;
    private final qpv k;
    private final qpv l;
    private qqn m;
    private final int n;

    public qpe(qof qofVar, quh quhVar, qtr qtrVar) {
        super(qofVar, quhVar, quc.a(qtrVar.l), qud.a(qtrVar.m), qtrVar.g, qtrVar.c, qtrVar.f, qtrVar.h, qtrVar.i);
        this.f = new ctz();
        this.g = new ctz();
        this.h = new RectF();
        this.d = qtrVar.a;
        this.n = qtrVar.k;
        this.e = qtrVar.j;
        this.i = (int) (qofVar.a.a() / 32.0f);
        qpv qpvVarA = qtrVar.b.a();
        this.j = qpvVarA;
        qpvVarA.h(this);
        quhVar.k(qpvVarA);
        qpv qpvVarA2 = qtrVar.d.a();
        this.k = qpvVarA2;
        qpvVarA2.h(this);
        quhVar.k(qpvVarA2);
        qpv qpvVarA3 = qtrVar.e.a();
        this.l = qpvVarA3;
        qpvVarA3.h(this);
        quhVar.k(qpvVarA3);
    }

    private final int h() {
        float f = this.k.c;
        float f2 = this.i;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.l.c * f2);
        int iRound3 = Math.round(this.j.c * f2);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private final int[] i(int[] iArr) {
        qqn qqnVar = this.m;
        if (qqnVar != null) {
            Integer[] numArr = (Integer[]) qqnVar.e();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length == length2) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[length2];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.qow, defpackage.qsu
    public final void a(Object obj, qxc qxcVar) {
        super.a(obj, qxcVar);
        if (obj == qok.L) {
            qqn qqnVar = this.m;
            if (qqnVar != null) {
                this.a.m(qqnVar);
            }
            if (qxcVar == null) {
                this.m = null;
                return;
            }
            qqn qqnVar2 = new qqn(qxcVar);
            this.m = qqnVar2;
            qqnVar2.h(this);
            this.a.k(this.m);
        }
    }

    @Override // defpackage.qow, defpackage.qpa
    public final void b(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        Shader radialGradient;
        if (this.e) {
            return;
        }
        c(this.h, matrix, false);
        if (this.n == 1) {
            int iH = h();
            ctz ctzVar = this.f;
            long j = iH;
            shader = (LinearGradient) ctzVar.d(j);
            if (shader == null) {
                PointF pointF = (PointF) this.k.e();
                PointF pointF2 = (PointF) this.l.e();
                qtp qtpVar = (qtp) this.j.e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, i(qtpVar.b), qtpVar.a, Shader.TileMode.CLAMP);
                ctzVar.h(j, radialGradient);
                shader = radialGradient;
            }
        } else {
            int iH2 = h();
            ctz ctzVar2 = this.g;
            long j2 = iH2;
            shader = (RadialGradient) ctzVar2.d(j2);
            if (shader == null) {
                PointF pointF3 = (PointF) this.k.e();
                PointF pointF4 = (PointF) this.l.e();
                qtp qtpVar2 = (qtp) this.j.e();
                int[] iArrI = i(qtpVar2.b);
                float[] fArr = qtpVar2.a;
                radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), iArrI, fArr, Shader.TileMode.CLAMP);
                ctzVar2.h(j2, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        this.b.setShader(shader);
        super.b(canvas, matrix, i);
    }

    @Override // defpackage.qoy
    public final String g() {
        return this.d;
    }
}
