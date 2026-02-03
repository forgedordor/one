package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efuy extends LayerDrawable {
    public ColorStateList a;

    public efuy(Drawable drawable) {
        super(new Drawable[]{drawable});
        this.a = null;
    }

    public static efuy a(Drawable drawable) {
        return drawable instanceof efuy ? (efuy) drawable : new efuy(drawable.mutate());
    }

    public final boolean b() {
        ColorStateList colorStateList = this.a;
        if (colorStateList == null) {
            return false;
        }
        setColorFilter(colorStateList.getColorForState(getState(), 0), PorterDuff.Mode.SRC_IN);
        return true;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        return super.setState(iArr) || b();
    }
}
