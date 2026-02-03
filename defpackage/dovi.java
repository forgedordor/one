package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dovi implements ViewGroup.OnHierarchyChangeListener {
    final /* synthetic */ dovr a;

    public dovi(dovr dovrVar) {
        this.a = dovrVar;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        view.getClass();
        view2.getClass();
        dovr dovrVar = this.a;
        if (fdbq.f(view, dovrVar.h.m)) {
            dovrVar.j(dovrVar.c());
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        view.getClass();
        view2.getClass();
    }
}
