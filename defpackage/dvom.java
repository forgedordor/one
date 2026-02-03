package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvom extends BroadcastReceiver {
    final /* synthetic */ dvop a;

    public dvom(dvop dvopVar) {
        this.a = dvopVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dvop dvopVar = this.a;
        boolean zA = dvjv.a(dvopVar.a);
        if (zA) {
            dvopVar.s();
        }
        dvpm dvpmVar = dvopVar.j;
        int i = true != zA ? 3 : 2;
        if (dvpmVar.d == i) {
            return;
        }
        dvpmVar.d = i;
        dvpmVar.a();
    }
}
