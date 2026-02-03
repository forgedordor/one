package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class quo extends quh {
    private final RectF j;
    private final Paint k;
    private final float[] l;
    private final Path m;
    private final qul n;
    private qpv o;

    public quo(qof qofVar, qul qulVar) {
        super(qofVar, qulVar);
        this.j = new RectF();
        qou qouVar = new qou();
        this.k = qouVar;
        this.l = new float[8];
        this.m = new Path();
        this.n = qulVar;
        qouVar.setAlpha(0);
        qouVar.setStyle(Paint.Style.FILL);
        qouVar.setColor(qulVar.k);
    }

    @Override // defpackage.quh, defpackage.qsu
    public final void a(Object obj, qxc qxcVar) {
        super.a(obj, qxcVar);
        if (obj == qok.K) {
            if (qxcVar == null) {
                this.o = null;
            } else {
                this.o = new qqn(qxcVar);
            }
        }
    }

    @Override // defpackage.quh, defpackage.qpa
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        qul qulVar = this.n;
        float f = qulVar.i;
        float f2 = qulVar.j;
        RectF rectF2 = this.j;
        rectF2.set(0.0f, 0.0f, f, f2);
        this.a.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // defpackage.quh
    public final void l(Canvas canvas, Matrix matrix, int i) {
        qul qulVar = this.n;
        int iAlpha = Color.alpha(qulVar.k);
        if (iAlpha == 0) {
            return;
        }
        qpv qpvVar = this.g.e;
        int iIntValue = qpvVar == null ? 100 : ((Integer) qpvVar.e()).intValue();
        Paint paint = this.k;
        int i2 = (int) ((i / 255.0f) * (((iAlpha / 255.0f) * iIntValue) / 100.0f) * 255.0f);
        paint.setAlpha(i2);
        qpv qpvVar2 = this.o;
        if (qpvVar2 != null) {
            paint.setColorFilter((ColorFilter) qpvVar2.e());
        }
        if (i2 > 0) {
            float[] fArr = this.l;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = qulVar.i;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = qulVar.j;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            Path path = this.m;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, paint);
        }
    }
}
