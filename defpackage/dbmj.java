package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.auth.IAuthManagerService;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbmj extends dbmq {
    public static final /* synthetic */ int a = 0;

    @Deprecated
    public static Account[] a(Context context, final String[] strArr) throws Exception {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        final dbme dbmeVarA = dbme.a(context);
        try {
            dclh.m(context);
            dclh.k("com.google");
            dbmq.g(context, 8400000);
        } catch (Exception e) {
            e = e;
        }
        try {
            dbmp dbmpVar = new dbmp() { // from class: dbmk
                public final /* synthetic */ String a = "com.google";

                @Override // defpackage.dbmp
                public final Object a(IBinder iBinder) throws IOException {
                    Parcelable[] parcelableArray;
                    String[] strArr2 = dbmq.b;
                    IAuthManagerService iAuthManagerServiceAsInterface = IAuthManagerService.Stub.asInterface(iBinder);
                    Bundle bundle = new Bundle();
                    bundle.putString("accountType", this.a);
                    bundle.putStringArray("account_features", strArr);
                    Bundle accounts = iAuthManagerServiceAsInterface.getAccounts(bundle);
                    if (accounts == null || (parcelableArray = accounts.getParcelableArray("accounts")) == null) {
                        throw new IOException("Receive null result from service call.");
                    }
                    Account[] accountArr = new Account[parcelableArray.length];
                    for (int i = 0; i < parcelableArray.length; i++) {
                        accountArr[i] = (Account) parcelableArray[i];
                    }
                    dbmeVarA.b(1708, 0, jCurrentTimeMillis, System.currentTimeMillis(), jElapsedRealtime);
                    return accountArr;
                }
            };
            dbmeVarA = dbmeVarA;
            return (Account[]) dbmq.i(context, dbmq.d, dbmpVar);
        } catch (Exception e2) {
            e = e2;
            dbmeVarA = dbmeVarA;
            Exception exc = e;
            dbmeVarA.b(1708, 13, jCurrentTimeMillis, System.currentTimeMillis(), jElapsedRealtime);
            throw exc;
        }
    }
}
