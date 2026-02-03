package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pod extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public pod(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        poe poeVar = new poe();
        poeVar.e = this.a.newDrawable();
        poeVar.e.setCallback(poeVar.d);
        return poeVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        poe poeVar = new poe();
        poeVar.e = this.a.newDrawable(resources);
        poeVar.e.setCallback(poeVar.d);
        return poeVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        poe poeVar = new poe();
        poeVar.e = this.a.newDrawable(resources, theme);
        poeVar.e.setCallback(poeVar.d);
        return poeVar;
    }
}
