package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyqz implements View.OnAttachStateChangeListener {
    final /* synthetic */ RecyclerView a;
    final /* synthetic */ vo b;

    public dyqz(RecyclerView recyclerView, vo voVar) {
        this.a = recyclerView;
        this.b = voVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.al(this.b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.al(null);
    }
}
