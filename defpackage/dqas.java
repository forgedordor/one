package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.compose.ui.views.recycler.reactive.ReactiveGridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqas extends ub {
    final /* synthetic */ dqat c;
    final /* synthetic */ ReactiveGridLayoutManager d;

    public dqas(dqat dqatVar, ReactiveGridLayoutManager reactiveGridLayoutManager) {
        this.c = dqatVar;
        this.d = reactiveGridLayoutManager;
    }

    @Override // defpackage.ub
    public final int b(int i) {
        vo voVar;
        ReactiveGridLayoutManager reactiveGridLayoutManager = this.d;
        RecyclerView recyclerView = reactiveGridLayoutManager.L;
        int iDF = -1;
        if (recyclerView != null && (voVar = recyclerView.n) != null) {
            iDF = voVar.dF(i);
        }
        return this.c.a(i, iDF, ((GridLayoutManager) reactiveGridLayoutManager).b);
    }
}
