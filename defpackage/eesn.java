package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eesn extends eess {
    private final eesp a;

    public eesn(eesp eespVar) {
        this.a = eespVar;
    }

    @Override // defpackage.eess
    public final void a(Matrix matrix, eerq eerqVar, int i, Canvas canvas) {
        eesp eespVar = this.a;
        float f = eespVar.e;
        float f2 = eespVar.f;
        RectF rectF = new RectF(eespVar.a, eespVar.b, eespVar.c, eespVar.d);
        boolean z = f2 < 0.0f;
        Path path = eerqVar.k;
        if (z) {
            int[] iArr = eerq.c;
            iArr[0] = 0;
            iArr[1] = eerqVar.j;
            iArr[2] = eerqVar.i;
            iArr[3] = eerqVar.h;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = eerq.c;
            iArr2[0] = 0;
            iArr2[1] = eerqVar.h;
            iArr2[2] = eerqVar.i;
            iArr2[3] = eerqVar.j;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = eerq.d;
        fArr[1] = f4;
        fArr[2] = f4 + ((1.0f - f4) / 2.0f);
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, eerq.c, fArr, Shader.TileMode.CLAMP);
        boolean z2 = z;
        Paint paint = eerqVar.f;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z2) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, eerqVar.l);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
