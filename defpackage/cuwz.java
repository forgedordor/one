package defpackage;

import android.os.Bundle;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuwz extends lcl {
    final /* synthetic */ lhd a;
    final /* synthetic */ cuxa b;

    public cuwz(cuxa cuxaVar, lhd lhdVar) {
        this.a = lhdVar;
        this.b = cuxaVar;
    }

    @Override // defpackage.lcl
    public final void c(View view, lhg lhgVar) {
        super.c(view, lhgVar);
        lhgVar.i(this.a);
        lhgVar.x(true);
    }

    @Override // defpackage.lcl
    public final boolean i(View view, int i, Bundle bundle) {
        if (i != 1048576) {
            return super.i(view, i, bundle);
        }
        this.b.k.a();
        return true;
    }
}
