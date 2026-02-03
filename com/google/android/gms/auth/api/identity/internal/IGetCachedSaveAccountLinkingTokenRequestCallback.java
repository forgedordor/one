package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGetCachedSaveAccountLinkingTokenRequestCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGetCachedSaveAccountLinkingTokenRequestCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGetCachedSaveAccountLinkingTokenRequestCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.IGetCachedSaveAccountLinkingTokenRequestCallback");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IGetCachedSaveAccountLinkingTokenRequestCallback
            public void onResult(Status status, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, saveAccountLinkingTokenRequest);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.IGetCachedSaveAccountLinkingTokenRequestCallback");
        }

        public static IGetCachedSaveAccountLinkingTokenRequestCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IGetCachedSaveAccountLinkingTokenRequestCallback");
            return iInterfaceQueryLocalInterface instanceof IGetCachedSaveAccountLinkingTokenRequestCallback ? (IGetCachedSaveAccountLinkingTokenRequestCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) sgh.a(parcel, SaveAccountLinkingTokenRequest.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, saveAccountLinkingTokenRequest);
            return true;
        }
    }

    void onResult(Status status, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest);
}
