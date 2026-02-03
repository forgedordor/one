package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwwy extends Animation {
    final /* synthetic */ View a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;

    public cwwy(View view, int i, int i2) {
        this.a = view;
        this.b = i;
        this.c = i2;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        int i;
        View view = this.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (f == 1.0f) {
            i = -2;
        } else {
            i = (int) (this.b + (this.c * f));
        }
        layoutParams.width = i;
        view.requestLayout();
    }

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }
}
