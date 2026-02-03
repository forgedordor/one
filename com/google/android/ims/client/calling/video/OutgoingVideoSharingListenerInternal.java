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
public interface OutgoingVideoSharingListenerInternal extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements OutgoingVideoSharingListenerInternal {
        static final int TRANSACTION_onOutgoingVideoSharingStartFailed = 2;
        static final int TRANSACTION_onOutgoingVideoSharingStarted = 1;
        static final int TRANSACTION_onOutgoingVideoSharingStatusUpdated = 4;
        static final int TRANSACTION_onOutgoingVideoSharingStopped = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements OutgoingVideoSharingListenerInternal {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.client.calling.video.OutgoingVideoSharingListenerInternal");
            }

            @Override // com.google.android.ims.client.calling.video.OutgoingVideoSharingListenerInternal
            public void onOutgoingVideoSharingStartFailed(String str, int i, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.video.OutgoingVideoSharingListenerInternal
            public void onOutgoingVideoSharingStarted(String str, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.video.OutgoingVideoSharingListenerInternal
            public void onOutgoingVideoSharingStatusUpdated(String str, int i, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.video.OutgoingVideoSharingListenerInternal
            public void onOutgoingVideoSharingStopped(String str, int i, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.ims.client.calling.video.OutgoingVideoSharingListenerInternal");
        }

        public static OutgoingVideoSharingListenerInternal asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.client.calling.video.OutgoingVideoSharingListenerInternal");
            return iInterfaceQueryLocalInterface instanceof OutgoingVideoSharingListenerInternal ? (OutgoingVideoSharingListenerInternal) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                String string = parcel.readString();
                Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onOutgoingVideoSharingStarted(string, bundle);
            } else if (i == 2) {
                String string2 = parcel.readString();
                int i3 = parcel.readInt();
                Bundle bundle2 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onOutgoingVideoSharingStartFailed(string2, i3, bundle2);
            } else if (i == 3) {
                String string3 = parcel.readString();
                int i4 = parcel.readInt();
                Bundle bundle3 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onOutgoingVideoSharingStopped(string3, i4, bundle3);
            } else {
                if (i != 4) {
                    return false;
                }
                String string4 = parcel.readString();
                int i5 = parcel.readInt();
                Bundle bundle4 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onOutgoingVideoSharingStatusUpdated(string4, i5, bundle4);
            }
            return true;
        }
    }

    void onOutgoingVideoSharingStartFailed(String str, int i, Bundle bundle);

    void onOutgoingVideoSharingStarted(String str, Bundle bundle);

    void onOutgoingVideoSharingStatusUpdated(String str, int i, Bundle bundle);

    void onOutgoingVideoSharingStopped(String str, int i, Bundle bundle);
}
