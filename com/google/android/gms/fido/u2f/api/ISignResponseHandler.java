package com.google.android.gms.fido.u2f.api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.fido.common.nfc.INfcReaderCallback;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISignResponseHandler extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISignResponseHandler {
        static final int TRANSACTION_onDisableNfcReaderMode = 5;
        static final int TRANSACTION_onEnableNfcReaderMode = 4;
        static final int TRANSACTION_onFailure = 2;
        static final int TRANSACTION_onSuccess = 3;
        static final int TRANSACTION_onViewSelected = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISignResponseHandler {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.u2f.api.ISignResponseHandler");
            }

            @Override // com.google.android.gms.fido.u2f.api.ISignResponseHandler
            public void onDisableNfcReaderMode() {
                transactOneway(5, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.fido.u2f.api.ISignResponseHandler
            public void onEnableNfcReaderMode(INfcReaderCallback iNfcReaderCallback, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iNfcReaderCallback);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.u2f.api.ISignResponseHandler
            public void onFailure(ErrorResponseData errorResponseData) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, errorResponseData);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.u2f.api.ISignResponseHandler
            public void onSuccess(SignResponseData signResponseData) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, signResponseData);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.u2f.api.ISignResponseHandler
            public void onViewSelected(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.u2f.api.ISignResponseHandler");
        }

        public static ISignResponseHandler asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.api.ISignResponseHandler");
            return iInterfaceQueryLocalInterface instanceof ISignResponseHandler ? (ISignResponseHandler) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                String string = parcel.readString();
                enforceNoDataAvail(parcel);
                onViewSelected(string);
            } else if (i == 2) {
                ErrorResponseData errorResponseData = (ErrorResponseData) sgh.a(parcel, ErrorResponseData.CREATOR);
                enforceNoDataAvail(parcel);
                onFailure(errorResponseData);
            } else if (i == 3) {
                SignResponseData signResponseData = (SignResponseData) sgh.a(parcel, SignResponseData.CREATOR);
                enforceNoDataAvail(parcel);
                onSuccess(signResponseData);
            } else if (i == 4) {
                INfcReaderCallback iNfcReaderCallbackAsInterface = INfcReaderCallback.Stub.asInterface(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                enforceNoDataAvail(parcel);
                onEnableNfcReaderMode(iNfcReaderCallbackAsInterface, i3);
            } else {
                if (i != 5) {
                    return false;
                }
                onDisableNfcReaderMode();
            }
            return true;
        }
    }

    void onDisableNfcReaderMode();

    void onEnableNfcReaderMode(INfcReaderCallback iNfcReaderCallback, int i);

    void onFailure(ErrorResponseData errorResponseData);

    void onSuccess(SignResponseData signResponseData);

    void onViewSelected(String str);
}
