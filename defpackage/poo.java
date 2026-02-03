package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class poo extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public poo(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        pop popVar = new pop();
        popVar.e = (VectorDrawable) this.a.newDrawable();
        return popVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        pop popVar = new pop();
        popVar.e = (VectorDrawable) this.a.newDrawable(resources);
        return popVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        pop popVar = new pop();
        popVar.e = (VectorDrawable) this.a.newDrawable(resources, theme);
        return popVar;
    }
}
