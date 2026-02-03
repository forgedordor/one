package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnua extends dnst {
    public final GridLayoutManager h;
    private final dnso i;

    public dnua(Context context, int i, fdap fdapVar, GridLayoutManager gridLayoutManager, fdat fdatVar, fdap fdapVar2) {
        super(context, i, fdapVar);
        this.h = gridLayoutManager;
        dntz dntzVar = new dntz(this, fdatVar, fdapVar2);
        this.i = dntzVar;
        RecyclerView recyclerView = (RecyclerView) FrameLayout.inflate(context, R.layout.rv_only_emoji_set_view, this).findViewById(R.id.rv_only_recycler_view);
        recyclerView.al(dntzVar);
        recyclerView.ao(gridLayoutManager);
    }

    @Override // defpackage.dnst
    public final dnso d() {
        return this.i;
    }
}
