package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ins extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (view instanceof inu) {
            int i = inu.h;
            Outline outline2 = ((inu) view).b;
            if (outline2 != null) {
                outline.set(outline2);
            }
        }
    }
}
