package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rnx extends rns {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(a);

    @Override // defpackage.res
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.rns
    protected final Bitmap c(rii riiVar, Bitmap bitmap, int i, int i2) {
        Paint paint = rpm.a;
        int iMin = Math.min(i, i2);
        float f = iMin;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f / width, f / height);
        float f2 = width * fMax;
        float f3 = fMax * height;
        float f4 = (f - f2) / 2.0f;
        float f5 = (f - f3) / 2.0f;
        RectF rectF = new RectF(f4, f5, f2 + f4, f3 + f5);
        Bitmap bitmapD = rpm.d(riiVar, bitmap);
        Bitmap bitmapA = riiVar.a(iMin, iMin, rpm.a(bitmap));
        bitmapA.setHasAlpha(true);
        rpm.c.lock();
        float f6 = f / 2.0f;
        try {
            Canvas canvas = new Canvas(bitmapA);
            canvas.drawCircle(f6, f6, f6, rpm.a);
            canvas.drawBitmap(bitmapD, (Rect) null, rectF, rpm.b);
            rpm.f(canvas);
            rpm.c.unlock();
            if (!bitmapD.equals(bitmap)) {
                riiVar.d(bitmapD);
            }
            return bitmapA;
        } catch (Throwable th) {
            rpm.c.unlock();
            throw th;
        }
    }

    @Override // defpackage.res
    public final boolean equals(Object obj) {
        return obj instanceof rnx;
    }

    @Override // defpackage.res
    public final int hashCode() {
        return 1101716364;
    }
}
