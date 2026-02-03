package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpbw extends Drawable {
    private final String a;
    private final Paint b;
    private final Rect c;

    public cpbw(Context context, String str, int i) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Rect();
        this.a = str.toUpperCase(craf.c(context));
        paint.setTypeface(cpdu.a(context));
        paint.setColor(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        Rect bounds = getBounds();
        float fWidth = bounds.width();
        float fHeight = bounds.height();
        Paint paint = this.b;
        paint.setTextSize(Math.min(fWidth, fHeight));
        Rect rect = this.c;
        String str = this.a;
        paint.getTextBounds(str, 0, 1, rect);
        canvas.drawText(str, (canvas.getWidth() / 2.0f) - rect.centerX(), (canvas.getHeight() / 2.0f) - rect.centerY(), paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
