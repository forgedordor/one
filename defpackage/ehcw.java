package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.ViewGroup;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehcw extends vo {
    public final ejvp a;
    public List d;
    private final ejvr f;
    private final ehcr g = new ehcr();
    public final ehct e = new ehct(this);

    public ehcw(ejvr ejvrVar, ejvp ejvpVar) {
        this.f = ejvrVar;
        this.a = ejvpVar;
    }

    @Override // defpackage.vo
    public final int a() {
        List list = this.d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        Object objApply = this.f.apply(this.d.get(i));
        ehcr ehcrVar = this.g;
        Map map = ehcrVar.a;
        Integer num = (Integer) map.get(objApply);
        if (num == null) {
            int i2 = ehcrVar.c;
            ehcrVar.c = i2 + 1;
            Integer numValueOf = Integer.valueOf(i2);
            map.put(objApply, numValueOf);
            SparseArray sparseArray = ehcrVar.b;
            numValueOf.getClass();
            sparseArray.put(i2, objApply);
            num = numValueOf;
        }
        return num.intValue();
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        return new ehcv(this.g.a(i).a(viewGroup));
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        ehcv ehcvVar = (ehcv) wvVar;
        ehcx ehcxVarA = this.g.a(ehcvVar.f);
        try {
            ehcxVarA.b(ehcvVar.s, this.d.get(i));
        } catch (ClassCastException e) {
            throw new IllegalStateException(String.format("Attempting to bind data with an incompatible ViewBinder class (%s). Check that your ViewBinder function is correct.", ehcxVarA), e);
        }
    }

    @Override // defpackage.vo
    public final void gI(RecyclerView recyclerView) {
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        boolean z = true;
        if (recyclerView.s && (layoutParams.height == -2 || layoutParams.width == -2)) {
            z = false;
        }
        ejwl.m(z, "RecyclerViews that use WRAP_CONTENT with setHasFixedSize(true) won't resize on new data.");
        recyclerView.ak(new ehcu(this, recyclerView));
    }

    @Override // defpackage.vo
    public final void h(RecyclerView recyclerView) {
        wx wxVar = recyclerView.R;
        if (wxVar instanceof ehcu) {
            recyclerView.ak(((ehcu) wxVar).c);
        }
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void k(wv wvVar) {
        ehcv ehcvVar = (ehcv) wvVar;
        this.g.a(ehcvVar.f).c(ehcvVar.s);
    }
}
