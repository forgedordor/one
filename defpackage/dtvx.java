package defpackage;

import android.accounts.AccountManager;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtvx {
    public final String a;
    public final AccountManager b;

    public dtvx(Context context) {
        this.a = context.getPackageName();
        this.b = AccountManager.get(context);
    }
}
