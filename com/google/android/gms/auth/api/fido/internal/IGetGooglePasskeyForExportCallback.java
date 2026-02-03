package com.google.android.gms.auth.api.fido.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.fido.GetGooglePasskeyForExportResponse;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGetGooglePasskeyForExportCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGetGooglePasskeyForExportCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGetGooglePasskeyForExportCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.fido.internal.IGetGooglePasskeyForExportCallback");
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IGetGooglePasskeyForExportCallback
            public void onResult(Status status, GetGooglePasskeyForExportResponse getGooglePasskeyForExportResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, getGooglePasskeyForExportResponse);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.fido.internal.IGetGooglePasskeyForExportCallback");
        }

        public static IGetGooglePasskeyForExportCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.fido.internal.IGetGooglePasskeyForExportCallback");
            return iInterfaceQueryLocalInterface instanceof IGetGooglePasskeyForExportCallback ? (IGetGooglePasskeyForExportCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            GetGooglePasskeyForExportResponse getGooglePasskeyForExportResponse = (GetGooglePasskeyForExportResponse) sgh.a(parcel, GetGooglePasskeyForExportResponse.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, getGooglePasskeyForExportResponse);
            return true;
        }
    }

    void onResult(Status status, GetGooglePasskeyForExportResponse getGooglePasskeyForExportResponse);
}
