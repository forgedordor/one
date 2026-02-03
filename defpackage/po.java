package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class po extends on {
    final /* synthetic */ ps d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po(ps psVar, Context context, oc ocVar, View view) {
        super(context, ocVar, view, true);
        this.d = psVar;
        this.b = 8388613;
        e(psVar.m);
    }

    @Override // defpackage.on
    protected final void c() {
        ps psVar = this.d;
        oc ocVar = psVar.c;
        if (ocVar != null) {
            ocVar.close();
        }
        psVar.j = null;
        super.c();
    }
}
