package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvjd extends LayerDrawable {
    private final Path a;
    private final float b;
    private final float c;
    private float d;
    private float e;
    private float f;

    public cvjd(Drawable drawable, Drawable drawable2, float f, float f2) {
        super(new Drawable[]{drawable, drawable2});
        this.a = new Path();
        this.b = f;
        this.c = f2;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Path path = this.a;
        path.rewind();
        path.addCircle(this.d, this.e, this.f * (getLevel() / 10000.0f), Path.Direction.CCW);
        Drawable drawable = getDrawable(0);
        canvas.save();
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        drawable.draw(canvas);
        canvas.restore();
        Drawable drawable2 = getDrawable(1);
        canvas.save();
        canvas.clipPath(path);
        drawable2.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float fWidth = rect.width() * (this.b + 0.5f);
        int iHeight = rect.height();
        this.d = fWidth;
        float f = iHeight * (this.c + 0.5f);
        this.e = f;
        this.f = (float) Math.hypot(fWidth, f);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        invalidateSelf();
        return zOnLevelChange;
    }
}
