package defpackage;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lpi implements TransformationMethod {
    private final TransformationMethod a;

    public lpi(TransformationMethod transformationMethod) {
        this.a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        CharSequence transformation = this.a.getTransformation(charSequence, view);
        return (transformation == null || lok.b().a() != 1) ? transformation : lok.b().c(transformation);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        this.a.onFocusChanged(view, charSequence, z, i, rect);
    }
}
