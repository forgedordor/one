package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rqc implements rhy {
    private final AnimatedImageDrawable a;

    public rqc(AnimatedImageDrawable animatedImageDrawable) {
        this.a = animatedImageDrawable;
    }

    @Override // defpackage.rhy
    public final int a() {
        AnimatedImageDrawable animatedImageDrawable = this.a;
        int intrinsicWidth = animatedImageDrawable.getIntrinsicWidth() * animatedImageDrawable.getIntrinsicHeight() * rvk.c(Bitmap.Config.ARGB_8888);
        return intrinsicWidth + intrinsicWidth;
    }

    @Override // defpackage.rhy
    public final Class b() {
        return Drawable.class;
    }

    @Override // defpackage.rhy
    public final /* synthetic */ Object c() {
        return this.a;
    }

    @Override // defpackage.rhy
    public final void e() {
        AnimatedImageDrawable animatedImageDrawable = this.a;
        animatedImageDrawable.stop();
        animatedImageDrawable.clearAnimationCallbacks();
    }
}
