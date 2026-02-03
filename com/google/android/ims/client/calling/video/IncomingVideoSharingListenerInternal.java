package com.google.android.ims.client.calling.video;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IncomingVideoSharingListenerInternal extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IncomingVideoSharingListenerInternal {
        static final int TRANSACTION_onIncomingVideoSharingParametersChanged = 4;
        static final int TRANSACTION_onIncomingVideoSharingStartFailed = 2;
        static final int TRANSACTION_onIncomingVideoSharingStarted = 1;
        static final int TRANSACTION_onIncomingVideoSharingStopped = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IncomingVideoSharingListenerInternal {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.client.calling.video.IncomingVideoSharingListenerInternal");
            }

            @Override // com.google.android.ims.client.calling.video.IncomingVideoSharingListenerInternal
            public void onIncomingVideoSharingParametersChanged(String str, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.video.IncomingVideoSharingListenerInternal
            public void onIncomingVideoSharingStartFailed(String str, int i, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.video.IncomingVideoSharingListenerInternal
            public void onIncomingVideoSharingStarted(String str, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.video.IncomingVideoSharingListenerInternal
            public void onIncomingVideoSharingStopped(String str, int i, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.ims.client.calling.video.IncomingVideoSharingListenerInternal");
        }

        public static IncomingVideoSharingListenerInternal asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.client.calling.video.IncomingVideoSharingListenerInternal");
            return iInterfaceQueryLocalInterface instanceof IncomingVideoSharingListenerInternal ? (IncomingVideoSharingListenerInternal) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                String string = parcel.readString();
                Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onIncomingVideoSharingStarted(string, bundle);
            } else if (i == 2) {
                String string2 = parcel.readString();
                int i3 = parcel.readInt();
                Bundle bundle2 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onIncomingVideoSharingStartFailed(string2, i3, bundle2);
            } else if (i == 3) {
                String string3 = parcel.readString();
                int i4 = parcel.readInt();
                Bundle bundle3 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onIncomingVideoSharingStopped(string3, i4, bundle3);
            } else {
                if (i != 4) {
                    return false;
                }
                String string4 = parcel.readString();
                Bundle bundle4 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onIncomingVideoSharingParametersChanged(string4, bundle4);
            }
            return true;
        }
    }

    void onIncomingVideoSharingParametersChanged(String str, Bundle bundle);

    void onIncomingVideoSharingStartFailed(String str, int i, Bundle bundle);

    void onIncomingVideoSharingStarted(String str, Bundle bundle);

    void onIncomingVideoSharingStopped(String str, int i, Bundle bundle);
}
