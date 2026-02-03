package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.view.Gravity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cssv extends BitmapDrawable {
    private final int a;
    private final Rect b;
    private int c;
    private int d;
    private boolean e;

    public cssv(int i, Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
        this.a = i;
        this.e = true;
        this.b = new Rect();
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int i2 = this.a;
        int i3 = i2 != 3 ? (i2 == 5 || i2 == 6) ? 90 : (i2 == 7 || i2 == 8) ? 270 : 0 : 180;
        if (i2 == 2 || i2 == 5) {
            i = -1;
        } else if (i2 == 7) {
            i2 = 7;
            i = -1;
        } else {
            i = 1;
        }
        float f = i3;
        int i4 = i2 == 4 ? -1 : 1;
        if (this.e) {
            int gravity = getGravity();
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            Rect rect = this.b;
            Gravity.apply(gravity, intrinsicWidth, intrinsicHeight, bounds, rect);
            this.c = rect.centerX();
            this.d = rect.centerY();
            if (cqmd.a(i2)) {
                Matrix matrix = new Matrix();
                matrix.setRotate(f, this.c, this.d);
                RectF rectF = new RectF(rect);
                matrix.mapRect(rectF);
                rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            }
            this.e = false;
        }
        canvas.save();
        canvas.scale(i, i4, this.c, this.d);
        canvas.rotate(f, this.c, this.d);
        canvas.drawBitmap(getBitmap(), (Rect) null, this.b, getPaint());
        canvas.restore();
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return cqmd.a(this.a) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return cqmd.a(this.a) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.e = true;
    }
}
