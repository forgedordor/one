package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeuc extends lcl {
    final /* synthetic */ BaseTransientBottomBar a;

    public eeuc(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
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
        this.a.e();
        return true;
    }
}
