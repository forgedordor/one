package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfz implements Drawable.Callback {
    final /* synthetic */ sga a;

    public sfz(sga sgaVar) {
        this.a = sgaVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        drawable.getClass();
        sga sgaVar = this.a;
        sgaVar.b.b(Integer.valueOf(sgaVar.j() + 1));
        sgaVar.c.b(new ihz(sgc.a(sgaVar.a)));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        drawable.getClass();
        runnable.getClass();
        sgc.b().postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        drawable.getClass();
        runnable.getClass();
        sgc.b().removeCallbacks(runnable);
    }
}
