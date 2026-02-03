package defpackage;

import android.view.TouchDelegate;
import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eebv implements View.OnAttachStateChangeListener {
    final /* synthetic */ eebu a;
    final /* synthetic */ TouchDelegate b;

    public eebv(eebu eebuVar, TouchDelegate touchDelegate) {
        this.a = eebuVar;
        this.b = touchDelegate;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        eebu eebuVar = this.a;
        List list = eebuVar.a;
        TouchDelegate touchDelegate = this.b;
        list.remove(touchDelegate);
        if (touchDelegate == eebuVar.b) {
            eebuVar.b = null;
        }
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
