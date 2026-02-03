package defpackage;

import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
final class om implements PopupWindow.OnDismissListener {
    final /* synthetic */ on a;

    public om(on onVar) {
        this.a = onVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}
