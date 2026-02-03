package com.google.android.ims.client.calling;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IPostCallService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IPostCallService {
        static final int TRANSACTION_sendAudioMessage = 2;
        static final int TRANSACTION_sendNote = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IPostCallService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.client.calling.IPostCallService");
            }

            @Override // com.google.android.ims.client.calling.IPostCallService
            public int sendAudioMessage(String str, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.ims.client.calling.IPostCallService
            public int sendNote(String str, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }
        }

        public Stub() {
            super("com.google.android.ims.client.calling.IPostCallService");
        }

        public static IPostCallService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.client.calling.IPostCallService");
            return iInterfaceQueryLocalInterface instanceof IPostCallService ? (IPostCallService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                String string = parcel.readString();
                Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                int iSendNote = sendNote(string, bundle);
                parcel2.writeNoException();
                parcel2.writeInt(iSendNote);
            } else {
                if (i != 2) {
                    return false;
                }
                String string2 = parcel.readString();
                Bundle bundle2 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                int iSendAudioMessage = sendAudioMessage(string2, bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(iSendAudioMessage);
            }
            return true;
        }
    }

    int sendAudioMessage(String str, Bundle bundle);

    int sendNote(String str, Bundle bundle);
}
