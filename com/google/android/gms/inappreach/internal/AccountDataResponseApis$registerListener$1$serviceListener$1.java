package com.google.android.gms.inappreach.internal;

import com.google.android.gms.inappreach.internal.IOnAccountDataResponseListener;
import defpackage.dcib;
import defpackage.ddfq;
import defpackage.ddfv;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AccountDataResponseApis$registerListener$1$serviceListener$1 extends IOnAccountDataResponseListener.Stub {
    final /* synthetic */ dcib<ddfq> $listenerHolder;

    AccountDataResponseApis$registerListener$1$serviceListener$1(dcib<ddfq> dcibVar) {
        this.$listenerHolder = dcibVar;
    }

    @Override // com.google.android.gms.inappreach.internal.IOnAccountDataResponseListener
    public void onAccountDataResponse(byte[] bArr) {
        bArr.getClass();
        this.$listenerHolder.b(new ddfv(bArr));
    }
}
