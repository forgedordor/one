package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class unb implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if ((view instanceof cukz) && view.getVisibility() == 0) {
            ((cukz) view).e();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
