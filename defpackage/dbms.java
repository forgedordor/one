package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.auth.IAuthManagerService;
import com.google.android.gms.auth.HasCapabilitiesRequest;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbms implements dbmr {
    private final Context a;

    public dbms(Context context) {
        this.a = context;
    }

    @Override // defpackage.dbmr
    public final defn a(String str) {
        try {
            Context context = this.a;
            int i = dbmj.a;
            dbmq.f(context, str);
            return degc.c(null);
        } catch (dbmi | IOException e) {
            return degc.b(e);
        }
    }

    @Override // defpackage.dbmr
    public final defn b(String str) {
        try {
            Context context = this.a;
            int i = dbmj.a;
            return degc.c(dbmq.c(context, str));
        } catch (dbmi | IOException e) {
            return degc.b(e);
        }
    }

    @Override // defpackage.dbmr
    public final defn c(Account account, String str, Bundle bundle) {
        try {
            Context context = this.a;
            int i = dbmj.a;
            return degc.c(dbmq.b(context, account, str, bundle));
        } catch (dbmi | IOException e) {
            return degc.b(e);
        }
    }

    @Override // defpackage.dbmr
    public final defn d(final HasCapabilitiesRequest hasCapabilitiesRequest) {
        try {
            final Context context = this.a;
            int i = dbmj.a;
            dclh.m(context);
            Account account = hasCapabilitiesRequest.a;
            dclh.m(account);
            dclh.k(account.name);
            dclh.g("This call can involve network request. It is unsafe to call from main thread.");
            dzzh.f(context);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            Integer num = (Integer) dbmq.i(context, dbmq.d, new dbmp() { // from class: dbml
                @Override // defpackage.dbmp
                public final Object a(IBinder iBinder) {
                    String[] strArr = dbmq.b;
                    int iHasCapabilities = IAuthManagerService.Stub.asInterface(iBinder).hasCapabilities(hasCapabilitiesRequest);
                    if (fazt.a.get().b()) {
                        long j = jElapsedRealtime;
                        long j2 = jCurrentTimeMillis;
                        dbme dbmeVarA = dbme.a(context);
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        if (iHasCapabilities == -1) {
                            dbmeVarA.b(1729, 49757, j2, jCurrentTimeMillis2, j);
                        } else if (iHasCapabilities == 1) {
                            dbmeVarA.b(1729, 49754, j2, jCurrentTimeMillis2, j);
                        } else if (iHasCapabilities == 2) {
                            dbmeVarA.b(1729, 49755, j2, jCurrentTimeMillis2, j);
                        } else if (iHasCapabilities == 4) {
                            dbmeVarA.b(1729, 49756, j2, jCurrentTimeMillis2, j);
                        } else if (iHasCapabilities == 5) {
                            dbmeVarA.b(1729, 49758, j2, jCurrentTimeMillis2, j);
                        } else if (iHasCapabilities != 6) {
                            dbmeVarA.b(1729, 13, j2, jCurrentTimeMillis2, j);
                        } else {
                            dbmeVarA.b(1729, 49759, j2, jCurrentTimeMillis2, j);
                        }
                    }
                    return Integer.valueOf(iHasCapabilities);
                }
            });
            num.intValue();
            return degc.c(num);
        } catch (dbmi | IOException e) {
            return degc.b(e);
        }
    }

    @Override // defpackage.dbmr
    public final defn e() {
        try {
            Context context = this.a;
            int i = dbmj.a;
            return degc.c(dbmq.j(context));
        } catch (RemoteException | dcen | dceo e) {
            return degc.b(e);
        }
    }

    @Override // defpackage.dbmr
    public final defn f(String[] strArr) {
        try {
            return degc.c(dbmj.a(this.a, strArr));
        } catch (dbmi | IOException e) {
            return degc.b(e);
        }
    }

    @Override // defpackage.dbmr
    public final defn g(Account account) {
        try {
            Context context = this.a;
            int i = dbmj.a;
            return degc.c(dbmq.d(context, account, "oauth2:https://www.googleapis.com/auth/userinfo.email"));
        } catch (dbmi | IOException e) {
            return degc.b(e);
        }
    }
}
