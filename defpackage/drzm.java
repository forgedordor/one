package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drzm implements drzl {
    private static final eksp a = eksp.c("GnpSdk");
    private final Context b;
    private final dxlw c;

    public drzm(Context context, dxlw dxlwVar) {
        this.b = context;
        this.c = dxlwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.drzl
    public final /* bridge */ /* synthetic */ List a() {
        ekgb ekgbVarP;
        if (!fbdp.b()) {
            int i = ekgb.d;
            return ekoe.a;
        }
        ArrayList arrayList = new ArrayList();
        dxft dxftVarD = this.c.d();
        if (dxftVarD.i()) {
            ekgbVarP = ekgb.n((Collection) dxftVarD.c());
        } else {
            ((eksl) ((eksl) ((eksl) a.j()).g(dxftVarD.f())).h("com/google/android/libraries/internal/growth/growthkit/internal/accounts/impl/AccountManagerImpl", "getAccountsNames", '6', "AccountManagerImpl.java")).q("Failed to get accounts using GoogleAuthUtil");
            ekgbVarP = null;
        }
        if (ekgbVarP == null) {
            Context context = this.b;
            if (kxj.c(context, "android.permission.GET_ACCOUNTS") == 0) {
                ekgbVarP = ekgb.p(AccountManager.get(context).getAccountsByType("com.google"));
            } else {
                ((eksl) ((eksl) a.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/accounts/impl/AccountManagerImpl", "getAccountsNames", 66, "AccountManagerImpl.java")).q("Failed to get accounts using AccountManager, missing permission GET_ACCOUNTS");
            }
        }
        if (ekgbVarP != null) {
            int size = ekgbVarP.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((Account) ekgbVarP.get(i2)).name);
            }
        }
        return ekgb.n(arrayList);
    }
}
