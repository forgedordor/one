package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.android.vcard.VCardBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qus extends quh {
    private qpv A;
    private qpv B;
    private qpv C;
    private qpv D;
    private final StringBuilder j;
    private final RectF k;
    private final Matrix l;
    private final Paint m;
    private final Paint n;
    private final Map o;
    private final ctz p;
    private final List q;
    private final qql r;
    private final qof s;
    private final qnm t;
    private qpv u;
    private qpv v;
    private qpv w;
    private qpv x;
    private qpv y;
    private qpv z;

    public qus(qof qofVar, qul qulVar) {
        qsz qszVar;
        qsz qszVar2;
        qsy qsyVar;
        qsy qsyVar2;
        super(qofVar, qulVar);
        this.j = new StringBuilder(2);
        this.k = new RectF();
        this.l = new Matrix();
        this.m = new qup();
        this.n = new quq();
        this.o = new HashMap();
        this.p = new ctz();
        this.q = new ArrayList();
        this.s = qofVar;
        this.t = qulVar.b;
        qql qqlVarA = qulVar.p.a();
        this.r = qqlVarA;
        qqlVarA.h(this);
        k(qqlVarA);
        qti qtiVar = qulVar.q;
        if (qtiVar != null && (qsyVar2 = qtiVar.a) != null) {
            qpv qpvVarA = qsyVar2.a();
            this.u = qpvVarA;
            qpvVarA.h(this);
            k(this.u);
        }
        if (qtiVar != null && (qsyVar = qtiVar.b) != null) {
            qpv qpvVarA2 = qsyVar.a();
            this.w = qpvVarA2;
            qpvVarA2.h(this);
            k(this.w);
        }
        if (qtiVar != null && (qszVar2 = qtiVar.c) != null) {
            qpv qpvVarA3 = qszVar2.a();
            this.y = qpvVarA3;
            qpvVarA3.h(this);
            k(this.y);
        }
        if (qtiVar == null || (qszVar = qtiVar.d) == null) {
            return;
        }
        qpv qpvVarA4 = qszVar.a();
        this.A = qpvVarA4;
        qpvVarA4.h(this);
        k(this.A);
    }

    private final qur s(int i) {
        List list = this.q;
        for (int size = list.size(); size < i; size++) {
            list.add(new qur());
        }
        return (qur) list.get(i - 1);
    }

    private final List t(String str, float f, qsr qsrVar, float f2, float f3, boolean z) {
        float f4;
        float fMeasureText;
        int i = 0;
        float f5 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        float f6 = 0.0f;
        int i4 = 0;
        float f7 = 0.0f;
        while (i < str.length()) {
            int i5 = i + 1;
            char cCharAt = str.charAt(i);
            if (z) {
                f4 = 0.0f;
                qss qssVar = (qss) cvy.a(this.t.f, qss.a(cCharAt, qsrVar.a, qsrVar.c));
                if (qssVar != null) {
                    fMeasureText = ((float) qssVar.b) * f2 * qwz.a();
                } else {
                    i = i5;
                }
            } else {
                f4 = 0.0f;
                fMeasureText = this.m.measureText(str.substring(i, i5));
            }
            float f8 = fMeasureText + f3;
            if (cCharAt == ' ') {
                z2 = true;
                f7 = f8;
            } else {
                if (z2) {
                    f6 = f8;
                    i4 = i;
                } else {
                    f6 += f8;
                }
                z2 = false;
            }
            f5 += f8;
            if (f > f4 && f5 >= f && cCharAt != ' ') {
                i2++;
                qur qurVarS = s(i2);
                if (i4 == i3) {
                    qurVarS.a(str.substring(i3, i).trim(), (f5 - f8) - ((r10.length() - r8.length()) * f7));
                    f5 = f8;
                    f6 = f5;
                    i3 = i;
                    i4 = i3;
                } else {
                    qurVarS.a(str.substring(i3, i4 - 1).trim(), ((f5 - f6) - ((r3.length() - r5.length()) * f7)) - f7);
                    f5 = f6;
                    i3 = i4;
                }
            }
            i = i5;
        }
        if (f5 > 0.0f) {
            i2++;
            s(i2).a(str.substring(i3), f5);
        }
        return this.q.subList(0, i2);
    }

    private static final void u(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private static final void v(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private static final List w(String str) {
        return Arrays.asList(str.replaceAll(VCardBuilder.VCARD_END_OF_LINE, "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private static final void x(Canvas canvas, qsq qsqVar, int i, float f) {
        PointF pointF = qsqVar.k;
        PointF pointF2 = qsqVar.l;
        float fA = qwz.a();
        float f2 = pointF == null ? 0.0f : (qsqVar.e * fA) + pointF.y;
        float f3 = i * qsqVar.e * fA;
        float f4 = pointF == null ? 0.0f : pointF.x;
        float f5 = pointF2 != null ? pointF2.x : 0.0f;
        int i2 = qsqVar.m;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        float f6 = f3 + f2;
        if (i3 == 0) {
            canvas.translate(f4, f6);
        } else if (i3 == 1) {
            canvas.translate((f4 + f5) - f, f6);
        } else {
            if (i3 != 2) {
                return;
            }
            canvas.translate((f4 + (f5 / 2.0f)) - (f / 2.0f), f6);
        }
    }

    @Override // defpackage.quh, defpackage.qsu
    public final void a(Object obj, qxc qxcVar) {
        super.a(obj, qxcVar);
        if (obj == qok.a) {
            qpv qpvVar = this.v;
            if (qpvVar != null) {
                m(qpvVar);
            }
            if (qxcVar == null) {
                this.v = null;
                return;
            }
            qqn qqnVar = new qqn(qxcVar);
            this.v = qqnVar;
            qqnVar.h(this);
            k(this.v);
            return;
        }
        if (obj == qok.b) {
            qpv qpvVar2 = this.x;
            if (qpvVar2 != null) {
                m(qpvVar2);
            }
            if (qxcVar == null) {
                this.x = null;
                return;
            }
            qqn qqnVar2 = new qqn(qxcVar);
            this.x = qqnVar2;
            qqnVar2.h(this);
            k(this.x);
            return;
        }
        if (obj == qok.s) {
            qpv qpvVar3 = this.z;
            if (qpvVar3 != null) {
                m(qpvVar3);
            }
            if (qxcVar == null) {
                this.z = null;
                return;
            }
            qqn qqnVar3 = new qqn(qxcVar);
            this.z = qqnVar3;
            qqnVar3.h(this);
            k(this.z);
            return;
        }
        if (obj == qok.t) {
            qpv qpvVar4 = this.B;
            if (qpvVar4 != null) {
                m(qpvVar4);
            }
            if (qxcVar == null) {
                this.B = null;
                return;
            }
            qqn qqnVar4 = new qqn(qxcVar);
            this.B = qqnVar4;
            qqnVar4.h(this);
            k(this.B);
            return;
        }
        if (obj == qok.F) {
            qpv qpvVar5 = this.C;
            if (qpvVar5 != null) {
                m(qpvVar5);
            }
            if (qxcVar == null) {
                this.C = null;
                return;
            }
            qqn qqnVar5 = new qqn(qxcVar);
            this.C = qqnVar5;
            qqnVar5.h(this);
            k(this.C);
            return;
        }
        if (obj != qok.M) {
            if (obj == qok.O) {
                this.r.d = new qqk(new qxb(), qxcVar, new qsq());
                return;
            }
            return;
        }
        qpv qpvVar6 = this.D;
        if (qpvVar6 != null) {
            m(qpvVar6);
        }
        if (qxcVar == null) {
            this.D = null;
            return;
        }
        qqn qqnVar6 = new qqn(qxcVar);
        this.D = qqnVar6;
        qqnVar6.h(this);
        k(this.D);
    }

    @Override // defpackage.quh, defpackage.qpa
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        qnm qnmVar = this.t;
        rectF.set(0.0f, 0.0f, qnmVar.i.width(), qnmVar.i.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0127  */
    @Override // defpackage.quh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.graphics.Canvas r27, android.graphics.Matrix r28, int r29) {
        /*
            Method dump skipped, instructions count: 1122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qus.l(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
