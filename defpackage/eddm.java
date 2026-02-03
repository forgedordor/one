package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eddm {
    private static final ekrg b = ekrg.c("com/google/android/libraries/user/profile/photopicker/common/account/PhotoPickerAccount");
    public ejwi a = ejud.a;
    private final Account c;

    public eddm(Context context, Account account, eddk eddkVar) {
        this.c = account;
        a(eddkVar.a());
        AccountManager.get(context).addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: eddl
            @Override // android.accounts.OnAccountsUpdateListener
            public final void onAccountsUpdated(Account[] accountArr) {
                this.a.a(accountArr);
            }
        }, null, false);
    }

    public final void a(Account[] accountArr) {
        ejwi ejwiVarJ;
        ((ekrd) ((ekrd) b.e()).h("com/google/android/libraries/user/profile/photopicker/common/account/PhotoPickerAccount", "updateAccountId", 63, "PhotoPickerAccount.java")).q("Updating account id");
        int i = 0;
        while (true) {
            if (i >= accountArr.length) {
                ejwiVarJ = ejud.a;
                break;
            } else {
                if (accountArr[i].equals(this.c)) {
                    ejwiVarJ = ejwi.j(Integer.valueOf(i));
                    break;
                }
                i++;
            }
        }
        this.a = ejwiVarJ;
    }
}
