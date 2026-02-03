package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeso extends eess {
    private final eesq a;
    private final float b;
    private final float e;

    public eeso(eesq eesqVar, float f, float f2) {
        this.a = eesqVar;
        this.b = f;
        this.e = f2;
    }

    @Override // defpackage.eess
    public final void a(Matrix matrix, eerq eerqVar, int i, Canvas canvas) {
        eesq eesqVar = this.a;
        float f = eesqVar.b;
        float f2 = this.e;
        float f3 = eesqVar.a;
        float f4 = this.b;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = eerq.a;
        iArr[0] = eerqVar.j;
        iArr[1] = eerqVar.i;
        iArr[2] = eerqVar.h;
        LinearGradient linearGradient = new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, iArr, eerq.b, Shader.TileMode.CLAMP);
        Paint paint = eerqVar.g;
        paint.setShader(linearGradient);
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    final float b() {
        eesq eesqVar = this.a;
        return (float) Math.toDegrees(Math.atan((eesqVar.b - this.e) / (eesqVar.a - this.b)));
    }
}
