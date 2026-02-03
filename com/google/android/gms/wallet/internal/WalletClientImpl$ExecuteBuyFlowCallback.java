package com.google.android.gms.wallet.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import defpackage.dcgq;
import defpackage.delv;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class WalletClientImpl$ExecuteBuyFlowCallback extends WalletClientImpl$BaseWalletServiceCallbacks {
    private final dcgq a;

    public WalletClientImpl$ExecuteBuyFlowCallback(dcgq dcgqVar) {
        this.a = dcgqVar;
    }

    @Override // com.google.android.gms.wallet.internal.WalletClientImpl$BaseWalletServiceCallbacks, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public void onExecuteBuyFlowStatusReceived(Status status, Bundle bundle) {
        bundle.getString("com.google.android.gms.wallet.firstparty.EXTRA_ORDER_ID");
        bundle.getString("com.google.android.gms.wallet.firstparty.EXTRA_DISPLAY_MESSAGE");
        bundle.getByteArray("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN");
        this.a.c(new delv(status));
    }
}
