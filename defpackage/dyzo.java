package defpackage;

import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyzo {
    public boolean a = false;
    public final OnAccountsUpdateListener b;
    public final AccountManager c;

    public dyzo(Context context, dyyl dyylVar, OnAccountsUpdateListener onAccountsUpdateListener) {
        this.b = onAccountsUpdateListener;
        this.c = AccountManager.get(context.getApplicationContext());
        if (kxj.c(context, "android.permission.GET_ACCOUNTS") != 0) {
            final dyyp dyypVar = (dyyp) dyylVar;
            eika.l(eika.h(new Callable() { // from class: dyym
                @Override // java.util.concurrent.Callable
                public final Object call() throws dbmi {
                    int i = dbmj.a;
                    Context context2 = dyypVar.b;
                    dclh.m(context2);
                    dbmq.g(context2, 11400000);
                    return (Boolean) dbmq.i(context2, dbmq.d, new dbmo(context2.getApplicationInfo().packageName, context2));
                }
            }, dyypVar.c), new dyzn(), eoqg.a);
        }
    }
}
