package com.google.android.ims.client.calling.video;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.ims.client.calling.video.OutgoingVideoSharingListenerInternal;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IOutgoingVideoSharingService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOutgoingVideoSharingService {
        static final int TRANSACTION_pauseVideo = 4;
        static final int TRANSACTION_registerOutgoingVideoSharingListener = 1;
        static final int TRANSACTION_resumeVideo = 5;
        static final int TRANSACTION_startVideo = 2;
        static final int TRANSACTION_stopVideo = 3;
        static final int TRANSACTION_updateParameters = 6;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOutgoingVideoSharingService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.client.calling.video.IOutgoingVideoSharingService");
            }

            @Override // com.google.android.ims.client.calling.video.IOutgoingVideoSharingService
            public int pauseVideo(String str, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.ims.client.calling.video.IOutgoingVideoSharingService
            public void registerOutgoingVideoSharingListener(OutgoingVideoSharingListenerInternal outgoingVideoSharingListenerInternal, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, outgoingVideoSharingListenerInternal);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.video.IOutgoingVideoSharingService
            public int resumeVideo(String str, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.ims.client.calling.video.IOutgoingVideoSharingService
            public int startVideo(String str, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.ims.client.calling.video.IOutgoingVideoSharingService
            public int stopVideo(String str, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.ims.client.calling.video.IOutgoingVideoSharingService
            public int updateParameters(String str, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }
        }

        public Stub() {
            super("com.google.android.ims.client.calling.video.IOutgoingVideoSharingService");
        }

        public static IOutgoingVideoSharingService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.client.calling.video.IOutgoingVideoSharingService");
            return iInterfaceQueryLocalInterface instanceof IOutgoingVideoSharingService ? (IOutgoingVideoSharingService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    OutgoingVideoSharingListenerInternal outgoingVideoSharingListenerInternalAsInterface = OutgoingVideoSharingListenerInternal.Stub.asInterface(parcel.readStrongBinder());
                    Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerOutgoingVideoSharingListener(outgoingVideoSharingListenerInternalAsInterface, bundle);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    String string = parcel.readString();
                    Bundle bundle2 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    int iStartVideo = startVideo(string, bundle2);
                    parcel2.writeNoException();
                    parcel2.writeInt(iStartVideo);
                    return true;
                case 3:
                    String string2 = parcel.readString();
                    Bundle bundle3 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    int iStopVideo = stopVideo(string2, bundle3);
                    parcel2.writeNoException();
                    parcel2.writeInt(iStopVideo);
                    return true;
                case 4:
                    String string3 = parcel.readString();
                    Bundle bundle4 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    int iPauseVideo = pauseVideo(string3, bundle4);
                    parcel2.writeNoException();
                    parcel2.writeInt(iPauseVideo);
                    return true;
                case 5:
                    String string4 = parcel.readString();
                    Bundle bundle5 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    int iResumeVideo = resumeVideo(string4, bundle5);
                    parcel2.writeNoException();
                    parcel2.writeInt(iResumeVideo);
                    return true;
                case 6:
                    String string5 = parcel.readString();
                    Bundle bundle6 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    int iUpdateParameters = updateParameters(string5, bundle6);
                    parcel2.writeNoException();
                    parcel2.writeInt(iUpdateParameters);
                    return true;
                default:
                    return false;
            }
        }
    }

    int pauseVideo(String str, Bundle bundle);

    void registerOutgoingVideoSharingListener(OutgoingVideoSharingListenerInternal outgoingVideoSharingListenerInternal, Bundle bundle);

    int resumeVideo(String str, Bundle bundle);

    int startVideo(String str, Bundle bundle);

    int stopVideo(String str, Bundle bundle);

    int updateParameters(String str, Bundle bundle);
}
