package com.google.android.ims.client.calling;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.ims.client.calling.CallComposerListenerInternal;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface ICallComposerService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICallComposerService {
        static final int TRANSACTION_prepareCallComposer = 1;
        static final int TRANSACTION_releaseCallComposer = 3;
        static final int TRANSACTION_sendCallComposerContent = 2;
        static final int TRANSACTION_sendCallComposerImage = 4;
        static final int TRANSACTION_sendCallComposerNotification = 6;
        static final int TRANSACTION_terminateCallComposerImageSending = 5;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICallComposerService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.client.calling.ICallComposerService");
            }

            @Override // com.google.android.ims.client.calling.ICallComposerService
            public int prepareCallComposer(String str, CallComposerListenerInternal callComposerListenerInternal, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.f(parcelObtainAndWriteInterfaceToken, callComposerListenerInternal);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.ims.client.calling.ICallComposerService
            public int releaseCallComposer(String str, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.ims.client.calling.ICallComposerService
            public int sendCallComposerContent(String str, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.ims.client.calling.ICallComposerService
            public int sendCallComposerImage(String str, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.ims.client.calling.ICallComposerService
            public int sendCallComposerNotification(String str, int i, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                int i2 = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i2;
            }

            @Override // com.google.android.ims.client.calling.ICallComposerService
            public int terminateCallComposerImageSending(String str, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }
        }

        public Stub() {
            super("com.google.android.ims.client.calling.ICallComposerService");
        }

        public static ICallComposerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.client.calling.ICallComposerService");
            return iInterfaceQueryLocalInterface instanceof ICallComposerService ? (ICallComposerService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    String string = parcel.readString();
                    CallComposerListenerInternal callComposerListenerInternalAsInterface = CallComposerListenerInternal.Stub.asInterface(parcel.readStrongBinder());
                    Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    int iPrepareCallComposer = prepareCallComposer(string, callComposerListenerInternalAsInterface, bundle);
                    parcel2.writeNoException();
                    parcel2.writeInt(iPrepareCallComposer);
                    return true;
                case 2:
                    String string2 = parcel.readString();
                    Bundle bundle2 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    int iSendCallComposerContent = sendCallComposerContent(string2, bundle2);
                    parcel2.writeNoException();
                    parcel2.writeInt(iSendCallComposerContent);
                    return true;
                case 3:
                    String string3 = parcel.readString();
                    Bundle bundle3 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    int iReleaseCallComposer = releaseCallComposer(string3, bundle3);
                    parcel2.writeNoException();
                    parcel2.writeInt(iReleaseCallComposer);
                    return true;
                case 4:
                    String string4 = parcel.readString();
                    Bundle bundle4 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    int iSendCallComposerImage = sendCallComposerImage(string4, bundle4);
                    parcel2.writeNoException();
                    parcel2.writeInt(iSendCallComposerImage);
                    return true;
                case 5:
                    String string5 = parcel.readString();
                    Bundle bundle5 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    int iTerminateCallComposerImageSending = terminateCallComposerImageSending(string5, bundle5);
                    parcel2.writeNoException();
                    parcel2.writeInt(iTerminateCallComposerImageSending);
                    return true;
                case 6:
                    String string6 = parcel.readString();
                    int i3 = parcel.readInt();
                    Bundle bundle6 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    int iSendCallComposerNotification = sendCallComposerNotification(string6, i3, bundle6);
                    parcel2.writeNoException();
                    parcel2.writeInt(iSendCallComposerNotification);
                    return true;
                default:
                    return false;
            }
        }
    }

    int prepareCallComposer(String str, CallComposerListenerInternal callComposerListenerInternal, Bundle bundle);

    int releaseCallComposer(String str, Bundle bundle);

    int sendCallComposerContent(String str, Bundle bundle);

    int sendCallComposerImage(String str, Bundle bundle);

    int sendCallComposerNotification(String str, int i, Bundle bundle);

    int terminateCallComposerImageSending(String str, Bundle bundle);
}
