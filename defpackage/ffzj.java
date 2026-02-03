package defpackage;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import internal.J.N;
import java.io.IOException;
import java.util.Locale;
import org.chromium.base.ThreadUtils;
import org.chromium.net.HttpNegotiateAuthenticator;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffzj implements AccountManagerCallback {
    final /* synthetic */ HttpNegotiateAuthenticator a;
    private final ffzm b;

    public ffzj(HttpNegotiateAuthenticator httpNegotiateAuthenticator, ffzm ffzmVar) {
        this.a = httpNegotiateAuthenticator;
        this.b = ffzmVar;
    }

    @Override // android.accounts.AccountManagerCallback
    public final void run(AccountManagerFuture accountManagerFuture) {
        try {
            Account[] accountArr = (Account[]) accountManagerFuture.getResult();
            int length = accountArr.length;
            if (length == 0) {
                ffyc.i("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: No account provided for the kerberos authentication. Please verify the configuration policies and that the CONTACTS runtime permission is granted. ");
                N.M0s8NeYn(this.b.a, this.a, NetError.ERR_MISSING_AUTH_CREDENTIALS, null);
            } else {
                if (length > 1) {
                    Log.w(ffyc.a("net_auth"), String.format(Locale.US, "ERR_MISSING_AUTH_CREDENTIALS: Found %d accounts eligible for the kerberos authentication. Please fix the configuration by providing a single account.", Integer.valueOf(length)));
                    N.M0s8NeYn(this.b.a, this.a, NetError.ERR_MISSING_AUTH_CREDENTIALS, null);
                    return;
                }
                HttpNegotiateAuthenticator httpNegotiateAuthenticator = this.a;
                if (httpNegotiateAuthenticator.lacksPermission(ffxu.a, "android.permission.USE_CREDENTIALS", true)) {
                    ffyc.c("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: USE_CREDENTIALS permission not granted. Aborting authentication.");
                    N.M0s8NeYn(this.b.a, httpNegotiateAuthenticator, NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, null);
                } else {
                    ffzm ffzmVar = this.b;
                    ffzmVar.e = accountArr[0];
                    ffzmVar.b.getAuthToken(ffzmVar.e, ffzmVar.d, ffzmVar.c, true, (AccountManagerCallback<Bundle>) new ffzl(httpNegotiateAuthenticator, ffzmVar), new Handler(ThreadUtils.b()));
                }
            }
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            ffyc.j("net_auth", "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e);
            N.M0s8NeYn(this.b.a, this.a, -9, null);
        }
    }
}
