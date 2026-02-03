package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.setupdesign.items.ExpandableSwitchItem;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eftt extends lcl {
    final /* synthetic */ ExpandableSwitchItem a;

    public eftt(ExpandableSwitchItem expandableSwitchItem) {
        this.a = expandableSwitchItem;
    }

    @Override // defpackage.lcl
    public final void c(View view, lhg lhgVar) {
        super.c(view, lhgVar);
        lhgVar.i(this.a.b ? lhd.g : lhd.f);
    }

    @Override // defpackage.lcl
    public final boolean i(View view, int i, Bundle bundle) {
        if (i != 262144 && i != 524288) {
            return super.i(view, i, bundle);
        }
        this.a.g(!r2.b);
        return true;
    }
}
