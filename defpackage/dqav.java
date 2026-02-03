package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.ui.views.recycler.reactive.ReactiveGridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqav {
    private final fcsu a;
    private final fcsu b;

    public dqav(fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    public final ReactiveGridLayoutManager a(dqay dqayVar) {
        Context context = (Context) this.a.b();
        context.getClass();
        return new ReactiveGridLayoutManager((dqao) this.b.b(), context.getResources().getDimensionPixelSize(R.dimen.standard_view_padding), dqayVar);
    }
}
