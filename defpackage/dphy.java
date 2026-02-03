package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dphy implements ViewGroup.OnHierarchyChangeListener {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ View c;

    public dphy(ViewGroup viewGroup, ViewGroup viewGroup2, View view) {
        this.a = viewGroup;
        this.b = viewGroup2;
        this.c = view;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        view.getClass();
        view2.getClass();
        if (fdbq.f(view, this.a)) {
            ViewGroup viewGroup = this.b;
            viewGroup.setOnHierarchyChangeListener(null);
            viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new dphx(viewGroup, this.c));
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        view.getClass();
        view2.getClass();
    }
}
