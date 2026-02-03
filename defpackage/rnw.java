package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rnw extends rns {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(a);

    @Override // defpackage.res
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.rns
    protected final Bitmap c(rii riiVar, Bitmap bitmap, int i, int i2) {
        Paint paint = rpm.a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return rpm.c(riiVar, bitmap, i, i2);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    @Override // defpackage.res
    public final boolean equals(Object obj) {
        return obj instanceof rnw;
    }

    @Override // defpackage.res
    public final int hashCode() {
        return -670243078;
    }
}
