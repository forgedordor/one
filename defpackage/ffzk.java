package defpackage;

import android.accounts.AccountManagerCallback;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import org.chromium.net.HttpNegotiateAuthenticator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffzk extends BroadcastReceiver {
    final /* synthetic */ Context a;
    final /* synthetic */ ffzl b;

    public ffzk(ffzl ffzlVar, Context context) {
        this.a = context;
        this.b = ffzlVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.unregisterReceiver(this);
        ffzl ffzlVar = this.b;
        HttpNegotiateAuthenticator httpNegotiateAuthenticator = ffzlVar.b;
        ffzm ffzmVar = ffzlVar.a;
        ffzmVar.b.getAuthToken(ffzmVar.e, ffzmVar.d, ffzmVar.c, true, (AccountManagerCallback<Bundle>) new ffzl(httpNegotiateAuthenticator, ffzmVar), (Handler) null);
    }
}
