package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adcr extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int height = view.getHeight();
        float fMin = Math.min(1.0f, Math.abs(view.getTranslationX()) / (view.getWidth() / 3.0f)) * 10.0f * view.getContext().getResources().getDisplayMetrics().density;
        if (fMin < 1.0f) {
            fMin = 0.0f;
        }
        outline.setRoundRect(0, 0, width, height, fMin);
    }
}
