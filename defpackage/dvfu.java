package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvfu extends BroadcastReceiver {
    final /* synthetic */ ejxr a;
    final /* synthetic */ Account b;

    public dvfu(ejxr ejxrVar, Account account) {
        this.a = ejxrVar;
        this.b = account;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dvfp, java.lang.Object] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ?? r0 = this.a.get();
        if (r0 != 0) {
            Account[] accounts = fbfr.b(context) ? AccountManager.get(context).getAccounts() : ddle.a(context).b();
            int intExtra = intent.getIntExtra("account_index", -1);
            if (intExtra == -1 || intExtra >= accounts.length || !accounts[intExtra].equals(this.b)) {
                return;
            }
            r0.n();
        }
    }
}
