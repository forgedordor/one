package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddle {
    private final AccountManager a;

    private ddle(AccountManager accountManager) {
        this.a = accountManager;
    }

    public static ddle a(Context context) {
        return new ddle(AccountManager.get(context));
    }

    public final Account[] b() {
        eieu eieuVarK = eiiy.k("AccountManager.getAccounts");
        try {
            Account[] accounts = this.a.getAccounts();
            eieuVarK.close();
            return accounts;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
