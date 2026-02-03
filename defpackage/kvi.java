package defpackage;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kvi extends kwk {
    private IconCompat a;
    private IconCompat b;
    private boolean c;
    private boolean d;

    private static IconCompat g(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof Icon) {
            return kzt.e((Icon) parcelable);
        }
        if (parcelable instanceof Bitmap) {
            return IconCompat.g((Bitmap) parcelable);
        }
        return null;
    }

    @Override // defpackage.kwk
    protected final String a() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // defpackage.kwk
    public final void b(kux kuxVar) {
        Bitmap bitmap;
        kwr kwrVar = (kwr) kuxVar;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(kwrVar.b).setBigContentTitle(this.h);
        if (this.a != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                kvh.a(bigContentTitle, kzt.c(this.a, kwrVar.a));
            } else if (this.a.b() == 1) {
                IconCompat iconCompat = this.a;
                int i = iconCompat.b;
                if (i == -1) {
                    Object obj = iconCompat.c;
                    bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    bitmap = (Bitmap) iconCompat.c;
                } else {
                    if (i != 5) {
                        Objects.toString(iconCompat);
                        throw new IllegalStateException("called getBitmap() on ".concat(iconCompat.toString()));
                    }
                    Bitmap bitmap2 = (Bitmap) iconCompat.c;
                    int iMin = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint(3);
                    paint.setColor(0);
                    float f = iMin;
                    float f2 = 0.010416667f * f;
                    paint.setShadowLayer(f2, 0.0f, 0.020833334f * f, 1023410176);
                    float f3 = f * 0.5f;
                    float f4 = 0.9166667f * f3;
                    canvas.drawCircle(f3, f3, f4, paint);
                    paint.setShadowLayer(f2, 0.0f, 0.0f, 503316480);
                    canvas.drawCircle(f3, f3, f4, paint);
                    paint.clearShadowLayer();
                    paint.setColor(-16777216);
                    BitmapShader bitmapShader = new BitmapShader(bitmap2, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
                    Matrix matrix = new Matrix();
                    matrix.setTranslate((-(bitmap2.getWidth() - iMin)) / 2.0f, (-(bitmap2.getHeight() - iMin)) / 2.0f);
                    bitmapShader.setLocalMatrix(matrix);
                    paint.setShader(bitmapShader);
                    canvas.drawCircle(f3, f3, f4, paint);
                    canvas.setBitmap(null);
                    bitmap = bitmapCreateBitmap;
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmap);
            }
        }
        if (this.c) {
            IconCompat iconCompat2 = this.b;
            if (iconCompat2 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                kvg.a(bigContentTitle, kzt.c(iconCompat2, kwrVar.a));
            }
        }
        if (this.j) {
            bigContentTitle.setSummaryText(this.i);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            kvh.c(bigContentTitle, this.d);
            kvh.b(bigContentTitle, null);
        }
    }

    @Override // defpackage.kwk
    protected final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.largeIcon.big");
        bundle.remove("android.picture");
        bundle.remove("android.pictureIcon");
        bundle.remove("android.showBigPictureWhenCollapsed");
    }

    @Override // defpackage.kwk
    protected final void d(Bundle bundle) {
        super.d(bundle);
        if (bundle.containsKey("android.largeIcon.big")) {
            this.b = g(bundle.getParcelable("android.largeIcon.big"));
            this.c = true;
        }
        Parcelable parcelable = bundle.getParcelable("android.picture");
        this.a = parcelable != null ? g(parcelable) : g(bundle.getParcelable("android.pictureIcon"));
        this.d = bundle.getBoolean("android.showBigPictureWhenCollapsed");
    }

    public final void e(Bitmap bitmap) {
        this.b = bitmap == null ? null : IconCompat.g(bitmap);
        this.c = true;
    }

    public final void f(Bitmap bitmap) {
        this.a = bitmap == null ? null : IconCompat.g(bitmap);
    }
}
