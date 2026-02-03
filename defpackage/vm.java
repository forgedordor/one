package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vm {
    public final /* synthetic */ RecyclerView a;

    public vm(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final int a() {
        return this.a.getChildCount();
    }

    public final int b(View view) {
        return this.a.indexOfChild(view);
    }

    public final View c(int i) {
        return this.a.getChildAt(i);
    }

    public final void d(View view) {
        wv wvVarK = RecyclerView.k(view);
        if (wvVarK != null) {
            this.a.aJ(wvVarK, wvVarK.o);
            wvVarK.o = 0;
        }
    }

    public final void e(int i) {
        RecyclerView recyclerView = this.a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.G(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
