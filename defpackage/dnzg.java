package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnzg {
    private final int a;

    public dnzg(int i) {
        this.a = i;
    }

    public final Bitmap a(Bitmap bitmap) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i = this.a;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, config);
        bitmapCreateBitmap.getClass();
        bitmapCreateBitmap.eraseColor(0);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Path path = new Path();
        float f = i * 0.5f;
        path.addCircle(f, f, f, Path.Direction.CCW);
        canvas.clipPath(path);
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        int width = (bitmap.getWidth() - iMin) / 2;
        int height = (bitmap.getHeight() - iMin) / 2;
        canvas.drawBitmap(bitmap, new Rect(width, height, width + iMin, iMin + height), new Rect(0, 0, i, i), (Paint) null);
        return bitmapCreateBitmap;
    }
}
