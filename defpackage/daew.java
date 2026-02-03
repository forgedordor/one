package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchResult;
import com.google.android.apps.messaging.ui.search.resultsview.MediaGridLayoutManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class daew extends vo {
    protected final rbv a;
    protected boolean d;
    public final MediaGridLayoutManager e;
    protected final rtj f;
    protected final List g;
    protected final ruf h;
    private final dafa i;

    public daew(Context context, int i) {
        rue rueVar = new rue();
        rueVar.b();
        this.h = rueVar.a();
        super.B(true);
        this.g = new ArrayList();
        this.d = daey.b(context.getResources().getConfiguration());
        this.e = new MediaGridLayoutManager(context, l());
        rbv rbvVarC = raw.c(context);
        this.a = rbvVarC;
        this.i = new dafa(rbvVarC);
        this.f = (rtj) ((rtj) new rtj().Y(new ret(new rnv(), new rpi(i)))).S(new ColorDrawable(eehg.d(context, R.attr.colorSurfaceVariant, "MediaAdapter")));
    }

    public abstract int F(boolean z);

    public void G(List list) {
        eieu eieuVarK = eiiy.k("MediaAdapter#updateResults");
        try {
            List list2 = this.g;
            list2.clear();
            list2.addAll(list);
            p();
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vo
    public final int a() {
        return this.g.size();
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        return this.d ? 0 : 1;
    }

    @Override // defpackage.vo
    public final long gH(int i) {
        return Long.parseLong(((MediaSearchResult) this.g.get(i)).m());
    }

    @Override // defpackage.vo
    public final void gI(RecyclerView recyclerView) {
        recyclerView.y(this.i);
    }

    @Override // defpackage.vo
    public final void h(RecyclerView recyclerView) {
        recyclerView.ah(this.i);
    }

    public final int l() {
        return F(this.d);
    }
}
