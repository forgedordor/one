package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eepk extends eeph {
    final Pair f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private int m;
    private boolean n;
    private float o;

    public eepk(eeps eepsVar) {
        super(eepsVar);
        this.g = 300.0f;
        this.f = new Pair(new eepg(), new eepg());
    }

    private final void j(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float fA;
        float fA2;
        eeps eepsVar;
        int i4;
        float f5;
        float f6;
        float f7;
        Canvas canvas2;
        float f8 = 1.0f - this.o;
        float fA3 = eemr.a(f8, 1.0f, kzz.a(f, 0.0f, 1.0f));
        float f9 = this.g;
        float f10 = fA3 * f9;
        float fA4 = eemr.a(f8, 1.0f, kzz.a(f2, 0.0f, 1.0f));
        float f11 = this.i;
        float f12 = this.j;
        float fA5 = (f9 * fA4) - ((int) ((i3 * (1.0f - kzz.a(fA4, 0.99f, 1.0f))) / 0.01f));
        int iA = (int) (f10 + ((int) ((i2 * kzz.a(fA3, 0.0f, 0.01f)) / 0.01f)));
        int i5 = (int) fA5;
        if (f11 != f12) {
            float fMax = Math.max(f11, f12);
            float f13 = this.g;
            float f14 = fMax / f13;
            float f15 = this.i;
            float f16 = this.j;
            fA = eemr.a(f15, f16, kzz.a(iA / f13, 0.0f, f14) / f14);
            fA2 = eemr.a(f15, f16, kzz.a((f13 - i5) / f13, 0.0f, f14) / f14);
        } else {
            fA = f11;
            fA2 = fA;
        }
        float f17 = -this.g;
        eeps eepsVar2 = (eeps) this.a;
        boolean z2 = eepsVar2.c(this.n) && z && f3 > 0.0f;
        if (iA <= i5) {
            float f18 = f17 / 2.0f;
            float f19 = iA + fA;
            float f20 = i5 - fA2;
            float f21 = fA + fA;
            float f22 = fA2 + fA2;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.h);
            Pair pair = this.f;
            ((eepg) pair.first).c();
            ((eepg) pair.second).c();
            ((eepg) pair.first).f(f19 + f18);
            ((eepg) pair.second).f(f18 + f20);
            if (iA == 0 && f20 + fA2 < f19 + fA) {
                l(canvas, paint, (eepg) pair.first, f21, this.h, fA, (eepg) pair.second, f22, this.h, fA2, true);
                return;
            }
            if (f19 - fA > f20 - fA2) {
                l(canvas, paint, (eepg) pair.second, f22, this.h, fA2, (eepg) pair.first, f21, this.h, fA, false);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(eepsVar2.f() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z2) {
                PathMeasure pathMeasure = this.d;
                Path path = this.c;
                float f23 = this.g;
                float f24 = f19 / f23;
                float f25 = f20 / f23;
                if (this.n) {
                    eepsVar = eepsVar2;
                    i4 = eepsVar.j;
                } else {
                    eepsVar = eepsVar2;
                    i4 = eepsVar.k;
                }
                if (i4 != this.m) {
                    this.m = i4;
                    g();
                }
                path.rewind();
                float f26 = (-this.g) / 2.0f;
                boolean zC = eepsVar.c(this.n);
                if (zC) {
                    f5 = f22;
                    float f27 = this.g;
                    float f28 = this.l;
                    float f29 = f27 / f28;
                    float f30 = f4 / f29;
                    f26 -= f28 * f4;
                    float f31 = f29 / (f29 + 1.0f);
                    f25 = (f25 + f30) * f31;
                    f24 = (f24 + f30) * f31;
                } else {
                    f5 = f22;
                }
                float length = f24 * pathMeasure.getLength();
                float length2 = f25 * pathMeasure.getLength();
                pathMeasure.getSegment(length, length2, path, true);
                eepg eepgVar = (eepg) pair.first;
                eepgVar.c();
                f6 = f20;
                f7 = fA;
                pathMeasure.getPosTan(length, eepgVar.a, eepgVar.b);
                eepg eepgVar2 = (eepg) pair.second;
                eepgVar2.c();
                pathMeasure.getPosTan(length2, eepgVar2.a, eepgVar2.b);
                Matrix matrix = this.e;
                matrix.reset();
                matrix.setTranslate(f26, 0.0f);
                eepgVar.f(f26);
                eepgVar2.f(f26);
                if (zC) {
                    float f32 = this.k * f3;
                    matrix.postScale(1.0f, f32);
                    eepgVar.e(f32);
                    eepgVar2.e(f32);
                }
                path.transform(matrix);
                canvas2 = canvas;
                canvas2.drawPath(path, paint);
            } else {
                canvas.drawLine(((eepg) pair.first).a[0], ((eepg) pair.first).a[1], ((eepg) pair.second).a[0], ((eepg) pair.second).a[1], paint);
                canvas2 = canvas;
                eepsVar = eepsVar2;
                f5 = f22;
                f6 = f20;
                f7 = fA;
            }
            if (eepsVar.f()) {
                return;
            }
            if (f19 > 0.0f && f7 > 0.0f) {
                k(canvas2, paint, (eepg) pair.first, f21, this.h, f7);
            }
            if (f6 >= this.g || fA2 <= 0.0f) {
                return;
            }
            k(canvas, paint, (eepg) pair.second, f5, this.h, fA2);
        }
    }

    private final void k(Canvas canvas, Paint paint, eepg eepgVar, float f, float f2, float f3) {
        l(canvas, paint, eepgVar, f, f2, f3, null, 0.0f, 0.0f, 0.0f, false);
    }

    private final void l(Canvas canvas, Paint paint, eepg eepgVar, float f, float f2, float f3, eepg eepgVar2, float f4, float f5, float f6, boolean z) {
        char c;
        float f7;
        float f8;
        float fMin = Math.min(f2, this.h);
        float f9 = -fMin;
        float f10 = fMin / 2.0f;
        float f11 = (-f) / 2.0f;
        float f12 = f9 / 2.0f;
        float f13 = f / 2.0f;
        RectF rectF = new RectF(f11, f12, f13, f10);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (eepgVar2 != null) {
            float fMin2 = Math.min(f5, this.h);
            float fMin3 = Math.min(f4 / 2.0f, (f6 * fMin2) / this.h);
            RectF rectF2 = new RectF();
            if (z) {
                c = 0;
                float f14 = (eepgVar2.a[0] - fMin3) - (eepgVar.a[0] - f3);
                if (f14 > 0.0f) {
                    eepgVar2.f((-f14) / 2.0f);
                    f8 = f4 + f14;
                } else {
                    f8 = f4;
                }
                rectF2.set(0.0f, f12, f13, f10);
            } else {
                c = 0;
                float f15 = (eepgVar2.a[0] + fMin3) - (eepgVar.a[0] + f3);
                if (f15 < 0.0f) {
                    eepgVar2.f((-f15) / 2.0f);
                    f7 = f4 - f15;
                } else {
                    f7 = f4;
                }
                rectF2.set(f11, f12, 0.0f, f10);
                f8 = f7;
            }
            RectF rectF3 = new RectF((-f8) / 2.0f, (-fMin2) / 2.0f, f8 / 2.0f, fMin2 / 2.0f);
            float[] fArr = eepgVar2.a;
            canvas.translate(fArr[c], fArr[1]);
            canvas.rotate(i(eepgVar2.b));
            Path path = new Path();
            path.addRoundRect(rectF3, fMin3, fMin3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-i(eepgVar2.b));
            float[] fArr2 = eepgVar2.a;
            canvas.translate(-fArr2[c], -fArr2[1]);
            float[] fArr3 = eepgVar.a;
            canvas.translate(fArr3[c], fArr3[1]);
            canvas.rotate(i(eepgVar.b));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f3, f3, paint);
        } else {
            float[] fArr4 = eepgVar.a;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(i(eepgVar.b));
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        canvas.restore();
    }

    @Override // defpackage.eeph
    public final int a() {
        eeps eepsVar = (eeps) this.a;
        int i = eepsVar.a;
        int i2 = eepsVar.l;
        return i + i2 + i2;
    }

    @Override // defpackage.eeph
    public final int b() {
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    @Override // defpackage.eeph
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.graphics.Canvas r9, android.graphics.Rect r10, float r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            float r0 = r8.g
            int r1 = r10.width()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L15
            int r0 = r10.width()
            float r0 = (float) r0
            r8.g = r0
            r8.g()
        L15:
            int r0 = r8.a()
            float r0 = (float) r0
            int r1 = r10.left
            float r1 = (float) r1
            int r2 = r10.width()
            float r2 = (float) r2
            int r3 = r10.top
            float r3 = (float) r3
            int r4 = r10.height()
            float r4 = (float) r4
            int r10 = r10.height()
            float r10 = (float) r10
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            float r3 = r3 + r4
            float r10 = r10 - r0
            float r10 = r10 / r5
            r4 = 0
            float r10 = java.lang.Math.max(r4, r10)
            float r3 = r3 + r10
            float r2 = r2 / r5
            float r1 = r1 + r2
            r9.translate(r1, r3)
            eeok r10 = r8.a
            eeps r10 = (defpackage.eeps) r10
            boolean r1 = r10.q
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L4f
            r9.scale(r2, r3)
        L4f:
            float r1 = r8.g
            float r1 = r1 / r5
            float r0 = r0 / r5
            float r6 = -r1
            float r7 = -r0
            r9.clipRect(r6, r7, r1, r0)
            int r0 = r10.a
            float r1 = (float) r0
            float r6 = r1 * r11
            r8.h = r6
            r6 = 2
            int r0 = r0 / r6
            int r7 = r10.a()
            int r0 = java.lang.Math.min(r0, r7)
            float r0 = (float) r0
            float r0 = r0 * r11
            r8.i = r0
            int r0 = r10.l
            float r0 = (float) r0
            float r0 = r0 * r11
            r8.k = r0
            float r0 = r1 / r5
            int r7 = r10.g()
            float r7 = (float) r7
            float r0 = java.lang.Math.min(r0, r7)
            float r0 = r0 * r11
            r8.j = r0
            r0 = 1
            if (r12 != 0) goto L8a
            if (r13 == 0) goto L88
            r13 = r0
            goto L8a
        L88:
            r11 = r3
            goto Lae
        L8a:
            if (r12 == 0) goto L90
            int r7 = r10.g
            if (r7 == r6) goto L96
        L90:
            if (r13 == 0) goto L99
            int r6 = r10.h
            if (r6 != r0) goto L99
        L96:
            r9.scale(r3, r2)
        L99:
            r0 = 3
            if (r12 != 0) goto La0
            int r12 = r10.h
            if (r12 == r0) goto La7
        La0:
            float r12 = r3 - r11
            float r1 = r1 * r12
            float r1 = r1 / r5
            r9.translate(r4, r1)
        La7:
            if (r13 == 0) goto L88
            int r9 = r10.h
            if (r9 == r0) goto Lae
            goto L88
        Lae:
            r8.o = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eepk.c(android.graphics.Canvas, android.graphics.Rect, float, boolean, boolean):void");
    }

    @Override // defpackage.eeph
    public final void d(Canvas canvas, Paint paint, int i, int i2) {
        int iA = eehg.a(i, i2);
        this.n = false;
        eeps eepsVar = (eeps) this.a;
        if (eepsVar.r <= 0 || iA == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iA);
        Integer num = eepsVar.s;
        eepg eepgVar = new eepg(new float[]{(this.g / 2.0f) - (num != null ? num.floatValue() + (eepsVar.r / 2.0f) : this.h / 2.0f), 0.0f}, new float[]{1.0f, 0.0f});
        float f = eepsVar.r;
        k(canvas, paint, eepgVar, f, f, (this.i * f) / this.h);
    }

    @Override // defpackage.eeph
    public final void e(Canvas canvas, Paint paint, eepf eepfVar, int i) {
        int iA = eehg.a(eepfVar.c, i);
        this.n = eepfVar.h;
        float f = eepfVar.a;
        float f2 = eepfVar.b;
        int i2 = eepfVar.d;
        j(canvas, paint, f, f2, iA, i2, i2, eepfVar.e, eepfVar.f, true);
    }

    @Override // defpackage.eeph
    public final void f(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int iA = eehg.a(i, i2);
        this.n = false;
        j(canvas, paint, f, f2, iA, i3, i3, 0.0f, 0.0f, false);
    }

    @Override // defpackage.eeph
    public final void g() {
        Path path = this.b;
        path.rewind();
        eeps eepsVar = (eeps) this.a;
        if (eepsVar.c(this.n)) {
            int i = this.n ? eepsVar.j : eepsVar.k;
            float f = this.g;
            int i2 = (int) (f / i);
            this.l = f / i2;
            for (int i3 = 0; i3 <= i2; i3++) {
                int i4 = i3 + i3;
                float f2 = i4 + 1;
                path.cubicTo(i4 + 0.48f, 0.0f, f2 - 0.48f, 1.0f, f2, 1.0f);
                float f3 = i4 + 2;
                path.cubicTo(f2 + 0.48f, 1.0f, f3 - 0.48f, 0.0f, f3, 0.0f);
            }
            Matrix matrix = this.e;
            matrix.reset();
            matrix.setScale(this.l / 2.0f, -2.0f);
            matrix.postTranslate(0.0f, 1.0f);
            path.transform(matrix);
        } else {
            path.lineTo(this.g, 0.0f);
        }
        this.d.setPath(path, false);
    }
}
