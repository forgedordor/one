package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pdd extends pde {
    public final RecyclerView a;

    public pdd(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.pde
    public final int a() {
        Rect rect = new Rect();
        this.a.getGlobalVisibleRect(rect);
        return rect.height();
    }

    @Override // defpackage.pde
    public final void b(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    @Override // defpackage.pde
    public final void c(Runnable runnable) {
        int[] iArr = ley.a;
        this.a.postOnAnimation(runnable);
    }
}
