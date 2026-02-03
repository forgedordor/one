package com.google.android.libraries.onegoogle.common;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import defpackage.dypz;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class CirclePulseDrawable extends Drawable implements Drawable.Callback {
    public final Drawable a;
    public int b;
    private final RectF c;
    private final dypz d;
    private final dypz e;
    private final int f;
    private final int g;

    public CirclePulseDrawable(Drawable drawable, int i, int i2) {
        this.a = drawable;
        RectF rectF = new RectF(drawable.getBounds());
        this.c = rectF;
        this.b = (int) rectF.width();
        drawable.setCallback(this);
        this.d = new dypz(i);
        this.f = Color.alpha(i);
        this.e = new dypz(i2);
        this.g = Color.alpha(i2);
    }

    private final void b(dypz dypzVar, int i) {
        dypzVar.c = i;
        c(dypzVar, this.c);
        this.a.invalidateSelf();
    }

    private static void c(dypz dypzVar, RectF rectF) {
        float f = dypzVar.c;
        RectF rectF2 = new RectF(rectF.left - f, rectF.top - f, rectF.right + f, rectF.bottom + f);
        Path path = dypzVar.b;
        path.reset();
        path.addOval(rectF2, Path.Direction.CW);
        path.addOval(rectF, Path.Direction.CCW);
    }

    public final void a() {
        Rect bounds = getBounds();
        int iWidth = getBounds().width() - this.b;
        int iHeight = getBounds().height() - this.b;
        int i = iWidth / 2;
        int i2 = bounds.left + i;
        int i3 = iHeight / 2;
        int i4 = bounds.top + i3;
        int i5 = bounds.right - i;
        int i6 = bounds.bottom - i3;
        Drawable drawable = this.a;
        drawable.setBounds(i2, i4, i5, i6);
        RectF rectF = this.c;
        rectF.set(drawable.getBounds());
        c(this.d, rectF);
        c(this.e, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.a.draw(canvas);
        dypz dypzVar = this.d;
        canvas.drawPath(dypzVar.b, dypzVar.a);
        dypz dypzVar2 = this.e;
        canvas.drawPath(dypzVar2.b, dypzVar2.a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a.getAlpha();
    }

    public int getFirstPulseSize() {
        return this.d.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.a.getOpacity();
    }

    public int getSecondPulseSize() {
        return this.e.c;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.d.a.setAlpha((this.f * i) / 255);
        this.e.a.setAlpha((this.g * i) / 255);
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public void setFirstPulseSize(int i) {
        b(this.d, i);
    }

    public void setSecondPulseSize(int i) {
        b(this.e, i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
