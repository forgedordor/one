package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpbt extends Drawable {
    final /* synthetic */ int a;
    final /* synthetic */ Drawable b;
    final /* synthetic */ int c;

    public cpbt(int i, Drawable drawable, int i2) {
        this.a = i;
        this.b = drawable;
        this.c = i2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.drawColor(this.a);
        float fWidth = getBounds().width();
        float fHeight = getBounds().height();
        float f = fHeight * 0.2f;
        float f2 = 0.2f * fWidth;
        Drawable drawable = this.b;
        drawable.setBounds(Math.round(f2), Math.round(f), Math.round(fWidth - f2), Math.round(fHeight - f));
        drawable.setTint(this.c);
        drawable.draw(canvas);
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
