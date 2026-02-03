package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pj extends on {
    final /* synthetic */ ps d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj(ps psVar, Context context, ox oxVar, View view) {
        super(context, oxVar, view, false);
        this.d = psVar;
        if (!oxVar.m.o()) {
            View view2 = psVar.h;
            this.a = view2 == null ? (View) psVar.f : view2;
        }
        e(psVar.m);
    }

    @Override // defpackage.on
    protected final void c() {
        ps psVar = this.d;
        psVar.k = null;
        psVar.n = 0;
        super.c();
    }
}
