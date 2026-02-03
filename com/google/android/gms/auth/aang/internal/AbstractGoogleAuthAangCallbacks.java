package com.google.android.gms.auth.aang.internal;

import android.app.PendingIntent;
import com.google.android.gms.auth.aang.AppRestriction;
import com.google.android.gms.auth.aang.GetAccountsResponse;
import com.google.android.gms.auth.aang.GetTokenResponse;
import com.google.android.gms.auth.aang.internal.IGoogleAuthAangCallbacks;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AbstractGoogleAuthAangCallbacks extends IGoogleAuthAangCallbacks.Stub {
    @Override // com.google.android.gms.auth.aang.internal.IGoogleAuthAangCallbacks
    public void onFetchAppRestriction(Status status, AppRestriction appRestriction) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.auth.aang.internal.IGoogleAuthAangCallbacks
    public void onGetAccounts(Status status, GetAccountsResponse getAccountsResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.auth.aang.internal.IGoogleAuthAangCallbacks
    public void onGetToken(Status status, GetTokenResponse getTokenResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.auth.aang.internal.IGoogleAuthAangCallbacks
    public void onHasCapabilities(Status status, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.auth.aang.internal.IGoogleAuthAangCallbacks
    public void onReauthenticateAccount(Status status, PendingIntent pendingIntent) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.auth.aang.internal.IGoogleAuthAangCallbacks
    public void onSyncAccountState(Status status) {
        throw new UnsupportedOperationException();
    }
}
