package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rnv extends rns {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(a);

    @Override // defpackage.res
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.rns
    protected final Bitmap c(rii riiVar, Bitmap bitmap, int i, int i2) {
        float height;
        float f;
        Paint paint = rpm.a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f2 = i2;
        float f3 = i;
        float width = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            height = f2 / bitmap.getHeight();
            f = 0.0f;
            width = (f3 - (bitmap.getWidth() * height)) * 0.5f;
        } else {
            float width2 = f3 / bitmap.getWidth();
            float height2 = (f2 - (bitmap.getHeight() * width2)) * 0.5f;
            height = width2;
            f = height2;
        }
        matrix.setScale(height, height);
        matrix.postTranslate((int) (width + 0.5f), (int) (f + 0.5f));
        Bitmap bitmapA = riiVar.a(i, i2, rpm.b(bitmap));
        rpm.g(bitmap, bitmapA);
        rpm.e(bitmap, bitmapA, matrix);
        return bitmapA;
    }

    @Override // defpackage.res
    public final boolean equals(Object obj) {
        return obj instanceof rnv;
    }

    @Override // defpackage.res
    public final int hashCode() {
        return -599754482;
    }
}
