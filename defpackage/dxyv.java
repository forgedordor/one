package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxyv {
    public final WeakReference a;
    public final Object b;
    public final dyvg c;
    public final dxxk d;
    public boolean e;
    private final Executor f;

    public dxyv(Object obj, dyvg dyvgVar, ImageView imageView, Executor executor, dxxk dxxkVar) {
        imageView.getClass();
        this.a = new WeakReference(imageView);
        this.c = dyvgVar;
        this.b = obj;
        this.f = executor;
        this.d = dxxkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bitmap a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        ekgb ekgbVar = ((dyva) this.c).c;
        if (ekgbVar != null && !ekgbVar.isEmpty()) {
            int i = ((ekoe) ekgbVar).c;
            for (int i2 = 0; i2 < i; i2++) {
                if (((dyvf) ekgbVar.get(i2)).ordinal() == 0) {
                    Map map = dxyw.a;
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    int iMin = Math.min(width, height);
                    int i3 = iMin - width;
                    int i4 = iMin - height;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    float f = iMin / 2;
                    canvas.drawCircle(f, f, f, paint);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmap, i3 / 2, i4 / 2, paint);
                    bitmap = bitmapCreateBitmap;
                }
            }
        }
        return bitmap;
    }

    public final void b(Context context) {
        e(dyvc.a(context), true);
    }

    public final void c() {
        ecem.c();
        ImageView imageView = (ImageView) this.a.get();
        if (this.e || imageView == null) {
            return;
        }
        dxyw.b(imageView, null);
    }

    public final void d(Runnable runnable) {
        if (ecem.g()) {
            this.f.execute(runnable);
        } else {
            runnable.run();
        }
    }

    public final void e(Drawable drawable, boolean z) {
        final ImageView imageView = (ImageView) this.a.get();
        if (this.e || imageView == null) {
            return;
        }
        final dxyu dxyuVar = new dxyu(this, drawable, z);
        imageView.addOnAttachStateChangeListener(dxyuVar);
        int[] iArr = ley.a;
        if (imageView.isAttachedToWindow()) {
            imageView.post(new Runnable() { // from class: dxyn
                @Override // java.lang.Runnable
                public final void run() {
                    dxyuVar.onViewAttachedToWindow(imageView);
                }
            });
        }
    }
}
