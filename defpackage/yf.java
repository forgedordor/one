package defpackage;

import android.support.v7.widget.StaggeredGridLayoutManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yf implements Runnable {
    final /* synthetic */ StaggeredGridLayoutManager a;

    public yf(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.a = staggeredGridLayoutManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.L();
    }
}
