package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzds implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ dzdt a;

    public dzds(dzdt dzdtVar) {
        this.a = dzdtVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        dzdt dzdtVar = this.a;
        if (((SelectedAccountDisc) dzdtVar.a).c.getVisibility() != 0) {
            dzdtVar.a();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
