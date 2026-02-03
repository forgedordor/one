package defpackage;

import android.graphics.Matrix;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eepg {
    float[] a;
    float[] b;
    final Matrix c;

    public eepg() {
        this.a = new float[2];
        this.b = new float[]{1.0f, 0.0f};
        this.c = new Matrix();
    }

    final void a(float f) {
        float[] fArr = this.b;
        double dAtan2 = Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d;
        double d = (float) dAtan2;
        double d2 = f;
        this.a[0] = (float) (r0[0] + (Math.cos(d) * d2));
        this.a[1] = (float) (r12[1] + (d2 * Math.sin(d)));
    }

    final void b(float f) {
        float[] fArr = this.b;
        float fAtan2 = (float) Math.atan2(fArr[1], fArr[0]);
        double d = fAtan2;
        double d2 = f;
        this.a[0] = (float) (r2[0] + (Math.cos(d) * d2));
        this.a[1] = (float) (r14[1] + (d2 * Math.sin(d)));
    }

    public final void c() {
        Arrays.fill(this.a, 0.0f);
        Arrays.fill(this.b, 0.0f);
        this.b[0] = 1.0f;
        this.c.reset();
    }

    public final void d(float f) {
        Matrix matrix = this.c;
        matrix.reset();
        matrix.setRotate(f);
        matrix.mapPoints(this.a);
        matrix.mapPoints(this.b);
    }

    final void e(float f) {
        float[] fArr = this.a;
        float f2 = fArr[0];
        fArr[1] = fArr[1] * f;
        float[] fArr2 = this.b;
        float f3 = fArr2[0];
        fArr2[1] = fArr2[1] * f;
    }

    final void f(float f) {
        float[] fArr = this.a;
        fArr[0] = fArr[0] + f;
        fArr[1] = fArr[1] + 0.0f;
    }

    public eepg(eepg eepgVar) {
        this(eepgVar.a, eepgVar.b);
    }

    public eepg(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[2];
        this.a = fArr3;
        this.b = new float[2];
        System.arraycopy(fArr, 0, fArr3, 0, 2);
        System.arraycopy(fArr2, 0, this.b, 0, 2);
        this.c = new Matrix();
    }
}
