package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmbj extends mr {
    private final RecyclerView a;

    public dmbj(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.mr
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        ((dojv) obj).getClass();
        ((dojv) obj2).getClass();
        RecyclerView recyclerView = this.a;
        return !((recyclerView != null ? recyclerView.o : null) instanceof SpannedGridLayoutManager);
    }

    @Override // defpackage.mr
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        dojv dojvVar = (dojv) obj;
        dojv dojvVar2 = (dojv) obj2;
        dojvVar.getClass();
        dojvVar2.getClass();
        return fdbq.f(dojvVar.f(), dojvVar2.f());
    }
}
