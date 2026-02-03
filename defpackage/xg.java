package defpackage;

import android.support.v7.widget.SearchView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xg implements Runnable {
    final /* synthetic */ SearchView a;

    public xg(SearchView searchView) {
        this.a = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lix lixVar = this.a.mSuggestionsAdapter;
        if (lixVar instanceof yp) {
            lixVar.e(null);
        }
    }
}
