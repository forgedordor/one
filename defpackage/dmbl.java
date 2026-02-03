package defpackage;

import android.database.ContentObserver;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmbl extends ContentObserver {
    public final dnbk a;
    public final dpvw b;
    private final dmbn c;
    private final RecyclerView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmbl(Handler handler, dmbn dmbnVar, dnbk dnbkVar, RecyclerView recyclerView) {
        super(handler);
        recyclerView.getClass();
        this.c = dmbnVar;
        this.a = dnbkVar;
        this.d = recyclerView;
        this.b = dpvu.a(recyclerView);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        this.c.e();
        RecyclerView recyclerView = this.d;
        if (!(recyclerView.o instanceof SpannedGridLayoutManager) || this.b.h()) {
            this.a.G();
            return;
        }
        wb wbVar = recyclerView.o;
        if (!(wbVar instanceof SpannedGridLayoutManager)) {
            throw new IllegalStateException("Check failed.");
        }
        recyclerView.y(new dmbk(this, wbVar));
    }
}
