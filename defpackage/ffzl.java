package defpackage;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import internal.J.N;
import java.io.IOException;
import org.chromium.net.HttpNegotiateAuthenticator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffzl implements AccountManagerCallback {
    public final ffzm a;
    final /* synthetic */ HttpNegotiateAuthenticator b;

    public ffzl(HttpNegotiateAuthenticator httpNegotiateAuthenticator, ffzm ffzmVar) {
        this.b = httpNegotiateAuthenticator;
        this.a = ffzmVar;
    }

    @Override // android.accounts.AccountManagerCallback
    public final void run(AccountManagerFuture accountManagerFuture) {
        try {
            Bundle bundle = (Bundle) accountManagerFuture.getResult();
            if (!bundle.containsKey("intent")) {
                this.b.processResult(bundle, this.a);
            } else {
                Context context = ffxu.a;
                ffxu.a(context, new ffzk(this, context), new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
            }
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            ffyc.j("net_auth", "ERR_UNEXPECTED: Error while attempting to obtain a token.", e);
            ffzm ffzmVar = this.a;
            N.M0s8NeYn(ffzmVar.a, this.b, -9, null);
        }
    }
}
