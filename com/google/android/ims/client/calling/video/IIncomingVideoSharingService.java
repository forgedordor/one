package com.google.android.ims.client.calling.video;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.ims.client.calling.video.IncomingVideoSharingListenerInternal;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IIncomingVideoSharingService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IIncomingVideoSharingService {
        static final int TRANSACTION_acceptVideo = 3;
        static final int TRANSACTION_registerIncomingVideoSharingListener = 1;
        static final int TRANSACTION_rejectVideo = 2;
        static final int TRANSACTION_stopVideo = 4;
        static final int TRANSACTION_updateParameters = 5;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IIncomingVideoSharingService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.client.calling.video.IIncomingVideoSharingService");
            }

            @Override // com.google.android.ims.client.calling.video.IIncomingVideoSharingService
            public int acceptVideo(String str, IncomingVideoSharingListenerInternal incomingVideoSharingListenerInternal, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.f(parcelObtainAndWriteInterfaceToken, incomingVideoSharingListenerInternal);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.ims.client.calling.video.IIncomingVideoSharingService
            public void registerIncomingVideoSharingListener(IncomingVideoSharingListenerInternal incomingVideoSharingListenerInternal, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, incomingVideoSharingListenerInternal);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.video.IIncomingVideoSharingService
            public int rejectVideo(String str, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.ims.client.calling.video.IIncomingVideoSharingService
            public int stopVideo(String str, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.ims.client.calling.video.IIncomingVideoSharingService
            public int updateParameters(String str, Bundle bundle) {
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
            super("com.google.android.ims.client.calling.video.IIncomingVideoSharingService");
        }

        public static IIncomingVideoSharingService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.client.calling.video.IIncomingVideoSharingService");
            return iInterfaceQueryLocalInterface instanceof IIncomingVideoSharingService ? (IIncomingVideoSharingService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IncomingVideoSharingListenerInternal incomingVideoSharingListenerInternalAsInterface = IncomingVideoSharingListenerInternal.Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                registerIncomingVideoSharingListener(incomingVideoSharingListenerInternalAsInterface, bundle);
                parcel2.writeNoException();
            } else if (i == 2) {
                String string = parcel.readString();
                Bundle bundle2 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                int iRejectVideo = rejectVideo(string, bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(iRejectVideo);
            } else if (i == 3) {
                String string2 = parcel.readString();
                IncomingVideoSharingListenerInternal incomingVideoSharingListenerInternalAsInterface2 = IncomingVideoSharingListenerInternal.Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle3 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                int iAcceptVideo = acceptVideo(string2, incomingVideoSharingListenerInternalAsInterface2, bundle3);
                parcel2.writeNoException();
                parcel2.writeInt(iAcceptVideo);
            } else if (i == 4) {
                String string3 = parcel.readString();
                Bundle bundle4 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                int iStopVideo = stopVideo(string3, bundle4);
                parcel2.writeNoException();
                parcel2.writeInt(iStopVideo);
            } else {
                if (i != 5) {
                    return false;
                }
                String string4 = parcel.readString();
                Bundle bundle5 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                int iUpdateParameters = updateParameters(string4, bundle5);
                parcel2.writeNoException();
                parcel2.writeInt(iUpdateParameters);
            }
            return true;
        }
    }

    int acceptVideo(String str, IncomingVideoSharingListenerInternal incomingVideoSharingListenerInternal, Bundle bundle);

    void registerIncomingVideoSharingListener(IncomingVideoSharingListenerInternal incomingVideoSharingListenerInternal, Bundle bundle);

    int rejectVideo(String str, Bundle bundle);

    int stopVideo(String str, Bundle bundle);

    int updateParameters(String str, Bundle bundle);
}
