package com.google.android.gms.auth.proximity.firstparty;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback;
import com.google.android.gms.multidevice.sync.appcast.AppCastRequest;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IExoSignalingService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IExoSignalingService {
        static final int TRANSACTION_castApp = 9;
        static final int TRANSACTION_checkCdmAssociation = 7;
        static final int TRANSACTION_onReceivedSignalingMessage = 3;
        static final int TRANSACTION_setCallback = 2;
        static final int TRANSACTION_startCdmAssociation = 8;
        static final int TRANSACTION_terminateStream = 4;
        static final int TRANSACTION_warnTerminateStream = 6;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IExoSignalingService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.proximity.firstparty.IExoSignalingService");
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingService
            public void castApp(AppCastRequest appCastRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, appCastRequest);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingService
            public void checkCdmAssociation(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingService
            public void onReceivedSignalingMessage(String str, byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingService
            public void setCallback(IExoSignalingCallback iExoSignalingCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iExoSignalingCallback);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingService
            public void startCdmAssociation(String str, String str2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingService
            public void terminateStream(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingService
            public void warnTerminateStream(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.proximity.firstparty.IExoSignalingService");
        }

        public static IExoSignalingService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.proximity.firstparty.IExoSignalingService");
            return iInterfaceQueryLocalInterface instanceof IExoSignalingService ? (IExoSignalingService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    IExoSignalingCallback iExoSignalingCallbackAsInterface = IExoSignalingCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setCallback(iExoSignalingCallbackAsInterface);
                    break;
                case 3:
                    String string = parcel.readString();
                    byte[] bArrCreateByteArray = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    onReceivedSignalingMessage(string, bArrCreateByteArray);
                    break;
                case 4:
                    String string2 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    terminateStream(string2);
                    break;
                case 5:
                default:
                    return false;
                case 6:
                    String string3 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    warnTerminateStream(string3);
                    break;
                case 7:
                    String string4 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    checkCdmAssociation(string4);
                    break;
                case 8:
                    String string5 = parcel.readString();
                    String string6 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    startCdmAssociation(string5, string6);
                    break;
                case 9:
                    AppCastRequest appCastRequest = (AppCastRequest) sgh.a(parcel, AppCastRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    castApp(appCastRequest);
                    break;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void castApp(AppCastRequest appCastRequest);

    void checkCdmAssociation(String str);

    void onReceivedSignalingMessage(String str, byte[] bArr);

    void setCallback(IExoSignalingCallback iExoSignalingCallback);

    void startCdmAssociation(String str, String str2);

    void terminateStream(String str);

    void warnTerminateStream(String str);
}
