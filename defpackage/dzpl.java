package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzpl {
    public abstract ListenableFuture<Void> c(dzpj dzpjVar);

    public abstract void f(dzfh dzfhVar);

    public final ListenableFuture<Void> g(dzfh dzfhVar, feeg feegVar) {
        dzpi dzpiVarG = dzpj.g();
        dzpiVarG.d(dzfhVar);
        ((dzov) dzpiVarG).a = null;
        return c(dzpiVarG.a());
    }

    public final void h(RecyclerView recyclerView, dzfh dzfhVar, feeg feegVar) {
        recyclerView.y(new dzpk(this, dzfhVar));
    }

    public final void k(dzfh dzfhVar, feeg feegVar) {
        dzpi dzpiVarG = dzpj.g();
        dzpiVarG.d(dzfhVar);
        ((dzov) dzpiVarG).a = feegVar;
        c(dzpiVarG.a());
    }
}
