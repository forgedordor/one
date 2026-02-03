package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.BaseSignInCallbacks;
import com.google.android.gms.signin.internal.SignInResponse;
import defpackage.dceu;
import defpackage.dcfo;
import defpackage.dcfp;
import defpackage.dcis;
import defpackage.dcit;
import defpackage.dciu;
import defpackage.dcke;
import defpackage.dclh;
import defpackage.dedm;
import defpackage.dedn;
import defpackage.dedo;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SignInCoordinator extends BaseSignInCallbacks implements dcfo, dcfp {
    private static dceu a = dedm.c;
    private final Context b;
    private final Handler c;
    private final dceu d;
    private Set e;
    private dcke f;
    private dedn g;
    private dciu h;

    /* renamed from: -$$Nest$msignInComplete, reason: not valid java name */
    public static /* bridge */ /* synthetic */ void m289$$Nest$msignInComplete(SignInCoordinator signInCoordinator, SignInResponse signInResponse) {
        ConnectionResult connectionResult = signInResponse.b;
        if (connectionResult.c()) {
            ResolveAccountResponse resolveAccountResponse = signInResponse.c;
            dclh.m(resolveAccountResponse);
            ConnectionResult connectionResult2 = resolveAccountResponse.c;
            if (!connectionResult2.c()) {
                String strValueOf = String.valueOf(String.valueOf(connectionResult2));
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                signInCoordinator.h.b(connectionResult2);
                signInCoordinator.g.m();
                return;
            }
            signInCoordinator.h.c(resolveAccountResponse.a(), signInCoordinator.e);
        } else {
            signInCoordinator.h.b(connectionResult);
        }
        signInCoordinator.g.m();
    }

    public SignInCoordinator(Context context, Handler handler, dcke dckeVar) {
        this(context, handler, dckeVar, a);
    }

    public static void setBuilderForTest(dceu<? extends dedn, dedo> dceuVar) {
        a = dceuVar;
    }

    public dedn getSignInClient() {
        return this.g;
    }

    @Override // defpackage.dcgy
    public void onConnected(Bundle bundle) {
        this.g.f(this);
    }

    @Override // defpackage.dcii
    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.h.b(connectionResult);
    }

    @Override // defpackage.dcgy
    public void onConnectionSuspended(int i) {
        this.h.d(i);
    }

    @Override // com.google.android.gms.signin.internal.BaseSignInCallbacks, com.google.android.gms.signin.internal.ISignInCallbacks
    public void onSignInComplete(SignInResponse signInResponse) {
        this.c.post(new dcit(this, signInResponse));
    }

    public void startSignIn(dciu dciuVar) {
        dedn dednVar = this.g;
        if (dednVar != null) {
            dednVar.m();
        }
        this.f.h = Integer.valueOf(System.identityHashCode(this));
        dceu dceuVar = this.d;
        Context context = this.b;
        Handler handler = this.c;
        Looper looper = handler.getLooper();
        dcke dckeVar = this.f;
        this.g = (dedn) dceuVar.b(context, looper, dckeVar, dckeVar.g, this, this);
        this.h = dciuVar;
        Set set = this.e;
        if (set == null || set.isEmpty()) {
            handler.post(new dcis(this));
        } else {
            this.g.e();
        }
    }

    public void stopSignIn() {
        dedn dednVar = this.g;
        if (dednVar != null) {
            dednVar.m();
        }
    }

    public SignInCoordinator(Context context, Handler handler, dcke dckeVar, dceu<? extends dedn, dedo> dceuVar) {
        this.b = context;
        this.c = handler;
        dclh.n(dckeVar, "ClientSettings must not be null");
        this.f = dckeVar;
        this.e = dckeVar.b;
        this.d = dceuVar;
    }
}
