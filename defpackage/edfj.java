package defpackage;

import android.support.v7.widget.GridLayoutManager;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edfj extends ub {
    final /* synthetic */ GridLayoutManager c;
    final /* synthetic */ edfl d;

    public edfj(edfl edflVar, GridLayoutManager gridLayoutManager) {
        this.c = gridLayoutManager;
        this.d = edflVar;
    }

    @Override // defpackage.ub
    public final int b(int i) {
        if (this.d.a.G(i)) {
            return this.c.b;
        }
        return 1;
    }
}
