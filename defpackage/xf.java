package defpackage;

import android.support.v7.widget.SearchView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xf implements Runnable {
    final /* synthetic */ SearchView a;

    public xf(SearchView searchView) {
        this.a = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.updateFocusedState();
    }
}
