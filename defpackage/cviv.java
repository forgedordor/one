package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cviv {
    public final Paint a;
    public int b;
    public float[] c;

    public cviv() {
        new RectF();
        new Path();
        Paint paint = new Paint();
        this.a = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setAntiAlias(true);
        paint.setDither(true);
    }
}
