package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acqt implements View.OnAttachStateChangeListener {
    final /* synthetic */ acrt a;

    public acqt(acrt acrtVar) {
        this.a = acrtVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        acrt acrtVar = this.a;
        acrt.e(acrtVar.b).getViewTreeObserver().removeOnGlobalLayoutListener(acrtVar.ba);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
