package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class docr extends vo {
    public final wb a;
    public final vo d;
    public final int e;
    private final fctc f;

    public docr(wb wbVar, vo voVar, int i) {
        voVar.getClass();
        this.a = wbVar;
        this.d = voVar;
        this.e = i;
        this.f = fctd.a(new fdae() { // from class: docp
            @Override // defpackage.fdae
            public final Object invoke() {
                return new dqag(this.a.e, 0);
            }
        });
    }

    @Override // defpackage.vo
    public final int a() {
        return 1;
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gifsticker_nested_recycler_view, viewGroup, false);
        viewInflate.getClass();
        return new docq(this, (RecyclerView) viewInflate);
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        docq docqVar = (docq) wvVar;
        docqVar.getClass();
        docr docrVar = docqVar.t;
        RecyclerView recyclerView = docqVar.s;
        recyclerView.ao(docrVar.a);
        recyclerView.al(docrVar.d);
        recyclerView.v(docrVar.l());
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void k(wv wvVar) {
        docq docqVar = (docq) wvVar;
        docqVar.getClass();
        RecyclerView recyclerView = docqVar.s;
        recyclerView.ao(null);
        recyclerView.al(null);
        recyclerView.ad(docqVar.t.l());
    }

    public final dqag l() {
        return (dqag) this.f.a();
    }
}
