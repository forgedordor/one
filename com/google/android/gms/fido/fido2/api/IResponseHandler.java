package com.google.android.gms.fido.fido2.api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.fido.common.nfc.INfcReaderCallback;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IResponseHandler extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IResponseHandler {
        static final int TRANSACTION_onDisableNfcReaderMode = 5;
        static final int TRANSACTION_onEnableNfcReaderMode = 4;
        static final int TRANSACTION_onFailure = 2;
        static final int TRANSACTION_onFingerprintDisallowed = 6;
        static final int TRANSACTION_onSuccess = 3;
        static final int TRANSACTION_onViewSelected = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IResponseHandler {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.fido2.api.IResponseHandler");
            }

            @Override // com.google.android.gms.fido.fido2.api.IResponseHandler
            public void onDisableNfcReaderMode() {
                transactOneway(5, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.fido.fido2.api.IResponseHandler
            public void onEnableNfcReaderMode(INfcReaderCallback iNfcReaderCallback, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iNfcReaderCallback);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.api.IResponseHandler
            public void onFailure(AuthenticatorErrorResponse authenticatorErrorResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, authenticatorErrorResponse);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.api.IResponseHandler
            public void onFingerprintDisallowed() {
                transactOneway(6, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.fido.fido2.api.IResponseHandler
            public void onSuccess(PublicKeyCredential publicKeyCredential) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, publicKeyCredential);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.api.IResponseHandler
            public void onViewSelected(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.fido2.api.IResponseHandler");
        }

        public static IResponseHandler asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.api.IResponseHandler");
            return iInterfaceQueryLocalInterface instanceof IResponseHandler ? (IResponseHandler) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    String string = parcel.readString();
                    enforceNoDataAvail(parcel);
                    onViewSelected(string);
                    return true;
                case 2:
                    AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) sgh.a(parcel, AuthenticatorErrorResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onFailure(authenticatorErrorResponse);
                    return true;
                case 3:
                    PublicKeyCredential publicKeyCredential = (PublicKeyCredential) sgh.a(parcel, PublicKeyCredential.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSuccess(publicKeyCredential);
                    return true;
                case 4:
                    INfcReaderCallback iNfcReaderCallbackAsInterface = INfcReaderCallback.Stub.asInterface(parcel.readStrongBinder());
                    int i3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    onEnableNfcReaderMode(iNfcReaderCallbackAsInterface, i3);
                    return true;
                case 5:
                    onDisableNfcReaderMode();
                    return true;
                case 6:
                    onFingerprintDisallowed();
                    return true;
                default:
                    return false;
            }
        }
    }

    void onDisableNfcReaderMode();

    void onEnableNfcReaderMode(INfcReaderCallback iNfcReaderCallback, int i);

    void onFailure(AuthenticatorErrorResponse authenticatorErrorResponse);

    void onFingerprintDisallowed();

    void onSuccess(PublicKeyCredential publicKeyCredential);

    void onViewSelected(String str);
}
