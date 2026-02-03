package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpvy implements ViewGroup.OnHierarchyChangeListener {
    final /* synthetic */ dpvz a;

    public dpvy(dpvz dpvzVar) {
        this.a = dpvzVar;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        view.getClass();
        view2.getClass();
        dpvz dpvzVar = this.a;
        Object objInvoke = dpvzVar.d.invoke(view2);
        if (objInvoke != null) {
            dpvzVar.b.invoke(objInvoke);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        view.getClass();
        view2.getClass();
        dpvz dpvzVar = this.a;
        if (dpvzVar.a.h) {
            dpvzVar.a();
        }
        Object objInvoke = dpvzVar.d.invoke(view2);
        if (objInvoke != null) {
            dpvzVar.c.invoke(objInvoke);
        }
    }
}
