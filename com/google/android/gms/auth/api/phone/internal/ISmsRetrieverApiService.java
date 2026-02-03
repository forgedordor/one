package com.google.android.gms.auth.api.phone.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.phone.internal.IAutofillPermissionStateCallback;
import com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback;
import com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISmsRetrieverApiService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISmsRetrieverApiService {
        static final int TRANSACTION_checkAutofillPermissionState = 4;
        static final int TRANSACTION_checkOngoingSmsRequest = 5;
        static final int TRANSACTION_startSmsCodeAutofill = 3;
        static final int TRANSACTION_startSmsCodeBrowser = 6;
        static final int TRANSACTION_startSmsRetriever = 1;
        static final int TRANSACTION_startWithConsentPrompt = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISmsRetrieverApiService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
            }

            @Override // com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService
            public void checkAutofillPermissionState(IAutofillPermissionStateCallback iAutofillPermissionStateCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iAutofillPermissionStateCallback);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService
            public void checkOngoingSmsRequest(String str, IOngoingSmsRequestCallback iOngoingSmsRequestCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.f(parcelObtainAndWriteInterfaceToken, iOngoingSmsRequestCallback);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService
            public void startSmsCodeAutofill(IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService
            public void startSmsCodeBrowser(IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService
            public void startSmsRetriever(ISmsRetrieverResultCallback iSmsRetrieverResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iSmsRetrieverResultCallback);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService
            public void startWithConsentPrompt(String str, ISmsRetrieverResultCallback iSmsRetrieverResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSmsRetrieverResultCallback);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        }

        public static ISmsRetrieverApiService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
            return iInterfaceQueryLocalInterface instanceof ISmsRetrieverApiService ? (ISmsRetrieverApiService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    ISmsRetrieverResultCallback iSmsRetrieverResultCallbackAsInterface = ISmsRetrieverResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    startSmsRetriever(iSmsRetrieverResultCallbackAsInterface);
                    break;
                case 2:
                    String string = parcel.readString();
                    ISmsRetrieverResultCallback iSmsRetrieverResultCallbackAsInterface2 = ISmsRetrieverResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    startWithConsentPrompt(string, iSmsRetrieverResultCallbackAsInterface2);
                    break;
                case 3:
                    IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    startSmsCodeAutofill(iStatusCallbackAsInterface);
                    break;
                case 4:
                    IAutofillPermissionStateCallback iAutofillPermissionStateCallbackAsInterface = IAutofillPermissionStateCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    checkAutofillPermissionState(iAutofillPermissionStateCallbackAsInterface);
                    break;
                case 5:
                    String string2 = parcel.readString();
                    IOngoingSmsRequestCallback iOngoingSmsRequestCallbackAsInterface = IOngoingSmsRequestCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    checkOngoingSmsRequest(string2, iOngoingSmsRequestCallbackAsInterface);
                    break;
                case 6:
                    IStatusCallback iStatusCallbackAsInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    startSmsCodeBrowser(iStatusCallbackAsInterface2);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void checkAutofillPermissionState(IAutofillPermissionStateCallback iAutofillPermissionStateCallback);

    void checkOngoingSmsRequest(String str, IOngoingSmsRequestCallback iOngoingSmsRequestCallback);

    void startSmsCodeAutofill(IStatusCallback iStatusCallback);

    void startSmsCodeBrowser(IStatusCallback iStatusCallback);

    void startSmsRetriever(ISmsRetrieverResultCallback iSmsRetrieverResultCallback);

    void startWithConsentPrompt(String str, ISmsRetrieverResultCallback iSmsRetrieverResultCallback);
}
