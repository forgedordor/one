package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxub implements dxtz {
    private static final eksp a = eksp.c("GnpSdk");
    private final Context b;

    public dxub(Context context) {
        context.getClass();
        this.b = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.LinkedHashMap, java.util.Map] */
    @Override // defpackage.dxtz
    public final dxft a() {
        Object objA;
        AccountManager accountManager;
        ContentProviderClient contentProviderClientAcquireContentProviderClient;
        try {
            Context context = this.b;
            accountManager = AccountManager.get(context);
            dxuh.a(context, "android.permission.GET_ACCOUNTS");
            a.o().q("Try to retrieve accounts list from Accounts ContentProvider.");
            ContentResolver contentResolver = context.getContentResolver();
            contentResolver.getClass();
            contentProviderClientAcquireContentProviderClient = contentResolver.acquireContentProviderClient("com.google.android.gms.auth.accounts");
            try {
            } catch (Throwable th) {
                contentProviderClientAcquireContentProviderClient.close();
                throw th;
            }
        } catch (Throwable th2) {
            objA = fctl.a(th2);
        }
        if (contentProviderClientAcquireContentProviderClient == null) {
            throw new dxty();
        }
        try {
            Set<Account> setAv = null;
            Bundle bundleCall = contentProviderClientAcquireContentProviderClient.call("get_accounts", "com.google", null);
            if (bundleCall == null) {
                throw new IllegalStateException("Received null bundle when fetching device accounts via GMS Core.");
            }
            if (laa.b()) {
                Account[] accountArr = (Account[]) bundleCall.getParcelableArray("accounts", Account.class);
                if (accountArr != null) {
                    setAv = fcur.O(accountArr);
                }
            } else {
                Parcelable[] parcelableArray = bundleCall.getParcelableArray("accounts");
                if (parcelableArray != null) {
                    ArrayList arrayList = new ArrayList(parcelableArray.length);
                    for (Parcelable parcelable : parcelableArray) {
                        parcelable.getClass();
                        arrayList.add((Account) parcelable);
                    }
                    setAv = fcva.av(arrayList);
                }
            }
            if (setAv == null) {
                setAv = fcvq.a;
            }
            contentProviderClientAcquireContentProviderClient.close();
            objA = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(setAv, 10)), 16));
            for (Account account : setAv) {
                fcti fctiVar = new fcti(account.name, accountManager.getPreviousName(account));
                objA.put(fctiVar.a, fctiVar.b);
            }
            return dxfv.b(objA);
        } catch (Exception e) {
            throw new dxty(e);
        }
    }
}
