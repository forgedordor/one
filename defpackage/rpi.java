package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rpi extends rns {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(a);
    private final int c;

    public rpi(int i) {
        rvi.b(i > 0, "roundingRadius must be greater than 0.");
        this.c = i;
    }

    @Override // defpackage.res
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.c).array());
    }

    @Override // defpackage.rns
    protected final Bitmap c(rii riiVar, Bitmap bitmap, int i, int i2) {
        int i3 = this.c;
        boolean z = i3 > 0;
        Paint paint = rpm.a;
        rvi.b(z, "roundingRadius must be greater than 0.");
        Bitmap.Config configA = rpm.a(bitmap);
        Bitmap bitmapD = rpm.d(riiVar, bitmap);
        Bitmap bitmapA = riiVar.a(bitmapD.getWidth(), bitmapD.getHeight(), configA);
        bitmapA.setHasAlpha(true);
        BitmapShader bitmapShader = new BitmapShader(bitmapD, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapA.getWidth(), bitmapA.getHeight());
        rpm.c.lock();
        try {
            Canvas canvas = new Canvas(bitmapA);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f = i3;
            canvas.drawRoundRect(rectF, f, f, paint2);
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
        return (obj instanceof rpi) && this.c == ((rpi) obj).c;
    }

    @Override // defpackage.res
    public final int hashCode() {
        return rvk.e(-569625254, rvk.d(this.c));
    }
}
