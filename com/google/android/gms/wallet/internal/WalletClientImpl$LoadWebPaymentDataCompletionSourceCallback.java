package com.google.android.gms.wallet.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.WebPaymentData;
import defpackage.defr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class WalletClientImpl$LoadWebPaymentDataCompletionSourceCallback extends WalletClientImpl$BaseWalletServiceCallbacks {
    private final defr a;

    public WalletClientImpl$LoadWebPaymentDataCompletionSourceCallback(defr<WebPaymentData> defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.gms.wallet.internal.WalletClientImpl$BaseWalletServiceCallbacks, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public void onWebPaymentDataLoaded(Status status, WebPaymentData webPaymentData, Bundle bundle) {
        this.a.b(webPaymentData);
    }
}
