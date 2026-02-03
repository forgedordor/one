package defpackage;

import android.widget.AbsListView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class up implements AbsListView.OnScrollListener {
    final /* synthetic */ us a;

    public up(us usVar) {
        this.a = usVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            us usVar = this.a;
            if (usVar.u() || usVar.r.getContentView() == null) {
                return;
            }
            ur urVar = usVar.o;
            usVar.p.removeCallbacks(urVar);
            urVar.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
