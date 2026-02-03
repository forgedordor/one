package defpackage;

import android.accounts.Account;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abid extends fcyz implements fdat {
    int a;
    final /* synthetic */ abie b;
    final /* synthetic */ efwo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abid(abie abieVar, efwo efwoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = abieVar;
        this.c = efwoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abid) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        dbnc dbncVar;
        dbvj dbvjVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        boolean z = true;
        int i2 = 1;
        fctl.b(obj);
        if (i == 0) {
            ListenableFuture listenableFutureA = this.b.c.a(this.c);
            this.a = 1;
            obj = fdxs.c(listenableFutureA, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        abie abieVar = this.b;
        Account account = (Account) obj;
        account.getClass();
        String string = abmt.a().build().toString();
        try {
            cqbd cqbdVarC = abie.a.c();
            cqbdVarC.I("Setting GAIA cookies");
            cqbdVarC.A("url", string);
            cqbdVarC.r();
            dbncVar = abieVar.e;
            dclh.b(true, "Must have at least one URL.");
            String strD = dbmq.d(dbncVar.a, account, dbnc.a(string));
            try {
                dbvjVar = (dbvj) evsn.parseFrom(dbvj.a, Base64.decode(strD, 9), evrr.a());
            } catch (evtj e) {
                throw new dbmi("Couldn't read data from server.", e);
            } catch (IllegalArgumentException e2) {
                Log.w("WebLoginHelper", "Incorrect base64 encoding: ".concat(String.valueOf(strD != null ? strD.substring(0, Math.min(6, strD.length())) : "null")));
                throw new dbmi("Couldn't read data from server.", e2);
            }
        } catch (UserRecoverableAuthException e3) {
            cqbd cqbdVarE = abie.a.e();
            cqbdVarE.I("UserRecoverableAuthException: Unable to set GAIA Cookies for WebView");
            cqbdVarE.s(e3);
            ((ains) abieVar.b.b()).e("Bugle.Satellite.Gaia.Cookies.Refresh.Result", 2);
            auvh.h(((cden) abieVar.d.b()).b(e3));
            z = false;
            return Boolean.valueOf(z);
        } catch (Exception e4) {
            cqbd cqbdVarE2 = abie.a.e();
            cqbdVarE2.I("Error setting cookies in WebView");
            cqbdVarE2.s(e4);
            ((ains) abieVar.b.b()).e("Bugle.Satellite.Gaia.Cookies.Refresh.Result", 3);
            auvh.h(((cden) abieVar.d.b()).b(e4));
            z = false;
            return Boolean.valueOf(z);
        }
        if (dbvjVar == null || (dbvjVar.b & 1) == 0) {
            throw new dbmi("Invalid response.");
        }
        dbvr dbvrVar = dbvjVar.c;
        if (dbvrVar == null) {
            dbvrVar = dbvr.a;
        }
        int iA = dbvq.a(dbvrVar.b);
        if (iA == 0) {
            iA = 1;
        }
        int i3 = iA - 1;
        if (i3 == 1) {
            dbncVar.b(dbvrVar.c);
            ((ains) abieVar.b.b()).e("Bugle.Satellite.Gaia.Cookies.Refresh.Result", 1);
            return Boolean.valueOf(z);
        }
        if (i3 == 2) {
            throw new IOException("Request failed, but server said RETRY.");
        }
        if (i3 != 5) {
            Log.w("WebLoginHelper", "Unexpected response: ".concat(String.valueOf(String.valueOf(dbvrVar))));
            int iA2 = dbvq.a(dbvrVar.b);
            if (iA2 != 0) {
                i2 = iA2;
            }
            throw new dbmi(a.g(i2 - 1, "Unknown response status: "));
        }
        dbncVar.b(dbvrVar.c);
        for (dbvo dbvoVar : dbvrVar.d) {
            int i4 = dbvoVar.b;
            int iA3 = dbvn.a(i4);
            if (iA3 == 0) {
                iA3 = 1;
            }
            int i5 = iA3 - 1;
            if (i5 != 1) {
                if (i5 == 2) {
                    String str = dbvoVar.c;
                    throw new dbna();
                }
                if (i5 != 3) {
                    int iA4 = dbvn.a(i4);
                    if (iA4 == 0) {
                        iA4 = 1;
                    }
                    Log.w("WebLoginHelper", a.g(iA4 - 1, "Unrecognized failed account status: "));
                }
            }
        }
        throw new dbmi("Authorization failed, but no recoverable accounts.");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new abid(this.b, this.c, fcxyVar);
    }
}
