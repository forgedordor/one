package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxzp extends dyab {
    private static final int[][] a = {new int[]{-279548, 155, 50}, new int[]{-1490379, 205, 105}, new int[]{-12417548, 310, 100}, new int[]{-13326253, 50, 105}};
    private final Paint b;
    private final RectF c = new RectF();
    private final dxzv d;

    public dxzp(dxzv dxzvVar) {
        this.d = dxzvVar;
        Paint paint = new Paint();
        this.b = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int[][] iArr = a;
        for (int i = 0; i < 4; i++) {
            int[] iArr2 = iArr[i];
            Paint paint = this.b;
            paint.setColor(iArr2[0]);
            canvas.drawArc(this.c, iArr2[1], iArr2[2], false, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        ejwl.b(rect.width() == rect.height(), "Width and height for G1RingDrawable bounds must be equal.");
        int iD = this.d.a.d(rect.width());
        ejwl.b(rect.width() == rect.height(), "Width and height for ring bounds must be equal.");
        RectF rectF = new RectF(rect);
        float f = (iD + 1) / 2.0f;
        rectF.inset(f, f);
        this.c.set(rectF);
        this.b.setStrokeWidth(iD);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
