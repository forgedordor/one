package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.ISignInCallbacks;
import com.google.android.gms.signin.internal.ISignInService;
import com.google.android.gms.signin.internal.SignInRequest;
import com.google.android.gms.signin.internal.SignInResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dedu extends dcko implements dedn {
    private final boolean a;
    private final dcke v;
    private final Bundle w;
    private final Integer x;

    public dedu(Context context, Looper looper, dcke dckeVar, Bundle bundle, dcfo dcfoVar, dcfp dcfpVar) {
        super(context, looper, 44, dckeVar, dcfoVar, dcfpVar);
        this.a = true;
        this.v = dckeVar;
        this.w = bundle;
        this.x = dckeVar.h;
    }

    @Override // defpackage.dcko, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dcfc
    public final int a() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return ISignInService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // defpackage.dedn
    public final void e() {
        l(new dcjy(this));
    }

    @Override // defpackage.dedn
    public final void f(ISignInCallbacks iSignInCallbacks) {
        try {
            Account account = this.v.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            GoogleSignInAccount googleSignInAccountA = "<<default account>>".equals(account.name) ? dbrw.c(this.c).a() : null;
            Integer num = this.x;
            dclh.m(num);
            ((ISignInService) w()).signIn(new SignInRequest(1, new ResolveAccountRequest(2, account, num.intValue(), googleSignInAccountA)), iSignInCallbacks);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                iSignInCallbacks.onSignInComplete(new SignInResponse(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Bundle g() {
        dcke dckeVar = this.v;
        String packageName = this.c.getPackageName();
        String str = dckeVar.e;
        if (!packageName.equals(str)) {
            this.w.putString("com.google.android.gms.signin.internal.realClientPackageName", str);
        }
        return this.w;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.dcfc
    public final boolean h() {
        return this.a;
    }
}
