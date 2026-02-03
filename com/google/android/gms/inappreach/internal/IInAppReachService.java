package com.google.android.gms.inappreach.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.inappreach.internal.IOnAccountDataResponseListener;
import com.google.android.gms.inappreach.internal.IOnAccountHealthAlertsListener;
import com.google.android.gms.inappreach.internal.IOnAccountMessagesListener;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IInAppReachService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IInAppReachService {
        static final int TRANSACTION_fetchAccountDataResponse = 13;
        static final int TRANSACTION_fetchAccountMessages = 10;
        static final int TRANSACTION_fetchLatestThreads = 6;
        static final int TRANSACTION_markAlertAsSeen = 4;
        static final int TRANSACTION_refreshAccountHealthAlerts = 3;
        static final int TRANSACTION_registerAccountDataResponseListener = 11;
        static final int TRANSACTION_registerAccountHealthAlertsListener = 1;
        static final int TRANSACTION_registerAccountMessagesListener = 7;
        static final int TRANSACTION_unregisterAccountDataResponseListener = 12;
        static final int TRANSACTION_unregisterAccountHealthAlertsListener = 2;
        static final int TRANSACTION_unregisterAccountMessagesListener = 8;
        static final int TRANSACTION_updateAccountDataResponseData = 14;
        static final int TRANSACTION_updateAccountHealthAlerts = 5;
        static final int TRANSACTION_updateAccountMessages = 9;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IInAppReachService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.inappreach.internal.IInAppReachService");
            }

            @Override // com.google.android.gms.inappreach.internal.IInAppReachService
            public void fetchAccountDataResponse(IStatusCallback iStatusCallback, String str, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(13, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.inappreach.internal.IInAppReachService
            public void fetchAccountMessages(IStatusCallback iStatusCallback, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.inappreach.internal.IInAppReachService
            public void fetchLatestThreads(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.inappreach.internal.IInAppReachService
            public void markAlertAsSeen(IStatusCallback iStatusCallback, String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.inappreach.internal.IInAppReachService
            public void refreshAccountHealthAlerts(IStatusCallback iStatusCallback, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.inappreach.internal.IInAppReachService
            public void registerAccountDataResponseListener(IStatusCallback iStatusCallback, String str, IOnAccountDataResponseListener iOnAccountDataResponseListener, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnAccountDataResponseListener);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.inappreach.internal.IInAppReachService
            public void registerAccountHealthAlertsListener(IStatusCallback iStatusCallback, String str, IOnAccountHealthAlertsListener iOnAccountHealthAlertsListener, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnAccountHealthAlertsListener);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.inappreach.internal.IInAppReachService
            public void registerAccountMessagesListener(IStatusCallback iStatusCallback, String str, IOnAccountMessagesListener iOnAccountMessagesListener, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnAccountMessagesListener);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.inappreach.internal.IInAppReachService
            public void unregisterAccountDataResponseListener(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.inappreach.internal.IInAppReachService
            public void unregisterAccountHealthAlertsListener(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.inappreach.internal.IInAppReachService
            public void unregisterAccountMessagesListener(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.inappreach.internal.IInAppReachService
            public void updateAccountDataResponseData(IStatusCallback iStatusCallback, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(14, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.inappreach.internal.IInAppReachService
            public void updateAccountHealthAlerts(IStatusCallback iStatusCallback, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.inappreach.internal.IInAppReachService
            public void updateAccountMessages(IStatusCallback iStatusCallback, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.inappreach.internal.IInAppReachService");
        }

        public static IInAppReachService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.inappreach.internal.IInAppReachService");
            return iInterfaceQueryLocalInterface instanceof IInAppReachService ? (IInAppReachService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string = parcel.readString();
                    IOnAccountHealthAlertsListener iOnAccountHealthAlertsListenerAsInterface = IOnAccountHealthAlertsListener.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerAccountHealthAlertsListener(iStatusCallbackAsInterface, string, iOnAccountHealthAlertsListenerAsInterface, apiMetadata);
                    break;
                case 2:
                    IStatusCallback iStatusCallbackAsInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string2 = parcel.readString();
                    ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    unregisterAccountHealthAlertsListener(iStatusCallbackAsInterface2, string2, apiMetadata2);
                    break;
                case 3:
                    IStatusCallback iStatusCallbackAsInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    refreshAccountHealthAlerts(iStatusCallbackAsInterface3, apiMetadata3);
                    break;
                case 4:
                    IStatusCallback iStatusCallbackAsInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    ApiMetadata apiMetadata4 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    markAlertAsSeen(iStatusCallbackAsInterface4, string3, string4, apiMetadata4);
                    break;
                case 5:
                    IStatusCallback iStatusCallbackAsInterface5 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    byte[] bArrCreateByteArray = parcel.createByteArray();
                    ApiMetadata apiMetadata5 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    updateAccountHealthAlerts(iStatusCallbackAsInterface5, bArrCreateByteArray, apiMetadata5);
                    break;
                case 6:
                    IStatusCallback iStatusCallbackAsInterface6 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string5 = parcel.readString();
                    ApiMetadata apiMetadata6 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    fetchLatestThreads(iStatusCallbackAsInterface6, string5, apiMetadata6);
                    break;
                case 7:
                    IStatusCallback iStatusCallbackAsInterface7 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string6 = parcel.readString();
                    IOnAccountMessagesListener iOnAccountMessagesListenerAsInterface = IOnAccountMessagesListener.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata7 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerAccountMessagesListener(iStatusCallbackAsInterface7, string6, iOnAccountMessagesListenerAsInterface, apiMetadata7);
                    break;
                case 8:
                    IStatusCallback iStatusCallbackAsInterface8 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string7 = parcel.readString();
                    ApiMetadata apiMetadata8 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    unregisterAccountMessagesListener(iStatusCallbackAsInterface8, string7, apiMetadata8);
                    break;
                case 9:
                    IStatusCallback iStatusCallbackAsInterface9 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    byte[] bArrCreateByteArray2 = parcel.createByteArray();
                    ApiMetadata apiMetadata9 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    updateAccountMessages(iStatusCallbackAsInterface9, bArrCreateByteArray2, apiMetadata9);
                    break;
                case 10:
                    IStatusCallback iStatusCallbackAsInterface10 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    byte[] bArrCreateByteArray3 = parcel.createByteArray();
                    ApiMetadata apiMetadata10 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    fetchAccountMessages(iStatusCallbackAsInterface10, bArrCreateByteArray3, apiMetadata10);
                    break;
                case 11:
                    IStatusCallback iStatusCallbackAsInterface11 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string8 = parcel.readString();
                    IOnAccountDataResponseListener iOnAccountDataResponseListenerAsInterface = IOnAccountDataResponseListener.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata11 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerAccountDataResponseListener(iStatusCallbackAsInterface11, string8, iOnAccountDataResponseListenerAsInterface, apiMetadata11);
                    break;
                case 12:
                    IStatusCallback iStatusCallbackAsInterface12 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string9 = parcel.readString();
                    ApiMetadata apiMetadata12 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    unregisterAccountDataResponseListener(iStatusCallbackAsInterface12, string9, apiMetadata12);
                    break;
                case 13:
                    IStatusCallback iStatusCallbackAsInterface13 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string10 = parcel.readString();
                    byte[] bArrCreateByteArray4 = parcel.createByteArray();
                    ApiMetadata apiMetadata13 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    fetchAccountDataResponse(iStatusCallbackAsInterface13, string10, bArrCreateByteArray4, apiMetadata13);
                    break;
                case 14:
                    IStatusCallback iStatusCallbackAsInterface14 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    byte[] bArrCreateByteArray5 = parcel.createByteArray();
                    ApiMetadata apiMetadata14 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    updateAccountDataResponseData(iStatusCallbackAsInterface14, bArrCreateByteArray5, apiMetadata14);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void fetchAccountDataResponse(IStatusCallback iStatusCallback, String str, byte[] bArr, ApiMetadata apiMetadata);

    void fetchAccountMessages(IStatusCallback iStatusCallback, byte[] bArr, ApiMetadata apiMetadata);

    void fetchLatestThreads(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata);

    void markAlertAsSeen(IStatusCallback iStatusCallback, String str, String str2, ApiMetadata apiMetadata);

    void refreshAccountHealthAlerts(IStatusCallback iStatusCallback, ApiMetadata apiMetadata);

    void registerAccountDataResponseListener(IStatusCallback iStatusCallback, String str, IOnAccountDataResponseListener iOnAccountDataResponseListener, ApiMetadata apiMetadata);

    void registerAccountHealthAlertsListener(IStatusCallback iStatusCallback, String str, IOnAccountHealthAlertsListener iOnAccountHealthAlertsListener, ApiMetadata apiMetadata);

    void registerAccountMessagesListener(IStatusCallback iStatusCallback, String str, IOnAccountMessagesListener iOnAccountMessagesListener, ApiMetadata apiMetadata);

    void unregisterAccountDataResponseListener(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata);

    void unregisterAccountHealthAlertsListener(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata);

    void unregisterAccountMessagesListener(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata);

    void updateAccountDataResponseData(IStatusCallback iStatusCallback, byte[] bArr, ApiMetadata apiMetadata);

    void updateAccountHealthAlerts(IStatusCallback iStatusCallback, byte[] bArr, ApiMetadata apiMetadata);

    void updateAccountMessages(IStatusCallback iStatusCallback, byte[] bArr, ApiMetadata apiMetadata);
}
