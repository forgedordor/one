package defpackage;

import android.os.Bundle;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeew extends lcl {
    final /* synthetic */ eefa a;

    public eeew(eefa eefaVar) {
        this.a = eefaVar;
    }

    @Override // defpackage.lcl
    public final void c(View view, lhg lhgVar) {
        super.c(view, lhgVar);
        if (!this.a.e) {
            lhgVar.x(false);
        } else {
            lhgVar.h(1048576);
            lhgVar.x(true);
        }
    }

    @Override // defpackage.lcl
    public final boolean i(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            eefa eefaVar = this.a;
            if (eefaVar.e) {
                eefaVar.cancel();
                return true;
            }
            i = 1048576;
        }
        return super.i(view, i, bundle);
    }
}
