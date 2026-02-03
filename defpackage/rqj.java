package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rqj extends rqh {
    private rqj(Drawable drawable) {
        super(drawable);
    }

    static rhy g(Drawable drawable) {
        if (drawable != null) {
            return new rqj(drawable);
        }
        return null;
    }

    @Override // defpackage.rhy
    public final int a() {
        Drawable drawable = this.a;
        return Math.max(1, drawable.getIntrinsicWidth() * drawable.getIntrinsicHeight() * 4);
    }

    @Override // defpackage.rhy
    public final Class b() {
        return this.a.getClass();
    }

    @Override // defpackage.rhy
    public final void e() {
    }
}
