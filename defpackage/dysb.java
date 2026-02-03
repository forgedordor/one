package defpackage;

import android.os.Bundle;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dysb extends lcl {
    final /* synthetic */ dysc a;

    public dysb(dysc dyscVar) {
        this.a = dyscVar;
    }

    @Override // defpackage.lcl
    public final void c(View view, lhg lhgVar) {
        super.c(view, lhgVar);
        lhgVar.h(1048576);
        lhgVar.x(true);
    }

    @Override // defpackage.lcl
    public final boolean i(View view, int i, Bundle bundle) {
        if (i != 1048576) {
            return super.i(view, i, bundle);
        }
        this.a.aV();
        return true;
    }
}
