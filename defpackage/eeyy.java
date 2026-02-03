package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeyy extends BroadcastReceiver {
    final /* synthetic */ eeyz a;

    public eeyy(eeyz eeyzVar) {
        this.a = eeyzVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.a(context, intent);
    }
}
