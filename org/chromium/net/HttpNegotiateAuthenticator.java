package org.chromium.net;

import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.util.Log;
import defpackage.ffxu;
import defpackage.ffyc;
import defpackage.ffzj;
import defpackage.ffzl;
import defpackage.ffzm;
import internal.J.N;
import java.util.Locale;
import java.util.Map;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ThreadUtils;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class HttpNegotiateAuthenticator {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "net_auth";
    private final String mAccountType;
    private Bundle mSpnegoContext;

    protected HttpNegotiateAuthenticator(String str) {
        this.mAccountType = str;
    }

    static HttpNegotiateAuthenticator create(String str) {
        return new HttpNegotiateAuthenticator(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processResult(Bundle bundle, ffzm ffzmVar) {
        this.mSpnegoContext = bundle.getBundle(HttpNegotiateConstants.KEY_SPNEGO_CONTEXT);
        int i = -9;
        switch (bundle.getInt(HttpNegotiateConstants.KEY_SPNEGO_RESULT, 1)) {
            case 0:
                i = 0;
                break;
            case 2:
                i = -3;
                break;
            case 3:
                i = NetError.ERR_UNEXPECTED_SECURITY_LIBRARY_STATUS;
                break;
            case 4:
                i = NetError.ERR_INVALID_RESPONSE;
                break;
            case 5:
                i = NetError.ERR_INVALID_AUTH_CREDENTIALS;
                break;
            case 6:
                i = NetError.ERR_UNSUPPORTED_AUTH_SCHEME;
                break;
            case 7:
                i = NetError.ERR_MISSING_AUTH_CREDENTIALS;
                break;
            case 8:
                i = NetError.ERR_UNDOCUMENTED_SECURITY_LIBRARY_STATUS;
                break;
            case 9:
                i = NetError.ERR_MALFORMED_IDENTITY;
                break;
        }
        N.M0s8NeYn(ffzmVar.a, this, i, bundle.getString("authtoken"));
    }

    private void requestTokenWithActivity(Context context, Activity activity, ffzm ffzmVar, String[] strArr) {
        if (!lacksPermission(context, "android.permission.GET_ACCOUNTS", $assertionsDisabled)) {
            ffzmVar.b.getAuthTokenByFeatures(this.mAccountType, ffzmVar.d, strArr, activity, null, ffzmVar.c, new ffzl(this, ffzmVar), new Handler(ThreadUtils.b()));
        } else {
            Log.e(ffyc.a(TAG), String.format(Locale.US, "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: %s permission not granted. Aborting authentication", "android.permission.GET_ACCOUNTS"));
            N.M0s8NeYn(ffzmVar.a, this, NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, null);
        }
    }

    private void requestTokenWithoutActivity(Context context, ffzm ffzmVar, String[] strArr) {
        if (!lacksPermission(context, "android.permission.GET_ACCOUNTS", true)) {
            ffzmVar.b.getAccountsByTypeAndFeatures(this.mAccountType, strArr, new ffzj(this, ffzmVar), new Handler(ThreadUtils.b()));
        } else {
            ffyc.c(TAG, "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: GET_ACCOUNTS permission not granted. Aborting authentication.");
            N.M0s8NeYn(ffzmVar.a, this, NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, null);
        }
    }

    void getNextAuthToken(long j, String str, String str2, boolean z) {
        Context context = ffxu.a;
        String[] strArr = {HttpNegotiateConstants.SPNEGO_FEATURE};
        Bundle bundle = new Bundle();
        if (str2 != null) {
            bundle.putString(HttpNegotiateConstants.KEY_INCOMING_AUTH_TOKEN, str2);
        }
        Bundle bundle2 = this.mSpnegoContext;
        if (bundle2 != null) {
            bundle.putBundle(HttpNegotiateConstants.KEY_SPNEGO_CONTEXT, bundle2);
        }
        bundle.putBoolean(HttpNegotiateConstants.KEY_CAN_DELEGATE, z);
        ffzm ffzmVar = new ffzm(j, AccountManager.get(context), bundle, HttpNegotiateConstants.SPNEGO_TOKEN_TYPE_BASE.concat(String.valueOf(str)));
        Map map = ApplicationStatus.a;
        requestTokenWithoutActivity(context, ffzmVar, strArr);
    }

    public boolean lacksPermission(Context context, String str, boolean z) {
        if (z || context.checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
            return $assertionsDisabled;
        }
        return true;
    }
}
