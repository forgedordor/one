package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class rqh implements rhy, rht {
    protected final Drawable a;

    public rqh(Drawable drawable) {
        rvi.f(drawable);
        this.a = drawable;
    }

    @Override // defpackage.rht
    public void d() {
        Drawable drawable = this.a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof rqs) {
            ((rqs) drawable).a().prepareToDraw();
        }
    }

    @Override // defpackage.rhy
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Drawable c() {
        Drawable drawable = this.a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }
}
