package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpjn implements View.OnAttachStateChangeListener {
    final /* synthetic */ View a;
    final /* synthetic */ dpjo b;

    public dpjn(View view, dpjo dpjoVar) {
        this.a = view;
        this.b = dpjoVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2 = this.a;
        view2.removeOnAttachStateChangeListener(this);
        ((ekrd) dpjo.a.h().h("com/google/android/libraries/compose/ui/keyboard/detector/KeyboardDetectorPopupWindowStrategy$attachPopupWindow$$inlined$doOnAttach$1", "onViewAttachedToWindow", 64, "KeyboardDetectorPopupWindowStrategy.kt")).q("Starting keyboard detection");
        this.b.c().showAtLocation(((ViewGroup) view2).getRootView(), 0, 0, 0);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.removeOnAttachStateChangeListener(this);
    }
}
