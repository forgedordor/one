package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mxc extends BroadcastReceiver {
    final /* synthetic */ mxd a;

    public mxc(mxd mxdVar) {
        this.a = mxdVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        mxd mxdVar = this.a;
        mxdVar.a(mwz.c(context, intent, mxdVar.h, mxdVar.g));
    }
}
