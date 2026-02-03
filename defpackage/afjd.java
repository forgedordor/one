package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afjd implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ afjl a;
    final /* synthetic */ View b;

    public afjd(afjl afjlVar, View view) {
        this.a = afjlVar;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (!this.a.b.isDestroyed()) {
            return false;
        }
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
