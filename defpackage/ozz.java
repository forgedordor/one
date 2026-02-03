package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ozz extends lcl {
    final /* synthetic */ paa a;

    public ozz(paa paaVar) {
        this.a = paaVar;
    }

    @Override // defpackage.lcl
    public final void c(View view, lhg lhgVar) {
        paa paaVar = this.a;
        paaVar.d.c(view, lhgVar);
        RecyclerView recyclerView = paaVar.c;
        int iC = recyclerView.c(view);
        vo voVar = recyclerView.n;
        if (voVar instanceof ozt) {
            ((ozt) voVar).l(iC);
        }
    }

    @Override // defpackage.lcl
    public final boolean i(View view, int i, Bundle bundle) {
        return this.a.d.i(view, i, bundle);
    }
}
