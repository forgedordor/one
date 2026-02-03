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
public interface CallComposerListenerInternal extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements CallComposerListenerInternal {
        static final int TRANSACTION_onCallComposerPrepareFailed = 2;
        static final int TRANSACTION_onCallComposerPrepared = 1;
        static final int TRANSACTION_onCallComposerSessionTerminated = 5;
        static final int TRANSACTION_onComposerContentTransferFailure = 4;
        static final int TRANSACTION_onComposerContentTransferSuccess = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements CallComposerListenerInternal {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.client.calling.CallComposerListenerInternal");
            }

            @Override // com.google.android.ims.client.calling.CallComposerListenerInternal
            public void onCallComposerPrepareFailed(String str, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.CallComposerListenerInternal
            public void onCallComposerPrepared(String str, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.CallComposerListenerInternal
            public void onCallComposerSessionTerminated(String str, int i, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.CallComposerListenerInternal
            public void onComposerContentTransferFailure(String str, int i, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.CallComposerListenerInternal
            public void onComposerContentTransferSuccess(String str, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.ims.client.calling.CallComposerListenerInternal");
        }

        public static CallComposerListenerInternal asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.client.calling.CallComposerListenerInternal");
            return iInterfaceQueryLocalInterface instanceof CallComposerListenerInternal ? (CallComposerListenerInternal) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                String string = parcel.readString();
                Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onCallComposerPrepared(string, bundle);
            } else if (i == 2) {
                String string2 = parcel.readString();
                Bundle bundle2 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onCallComposerPrepareFailed(string2, bundle2);
            } else if (i == 3) {
                String string3 = parcel.readString();
                Bundle bundle3 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onComposerContentTransferSuccess(string3, bundle3);
            } else if (i == 4) {
                String string4 = parcel.readString();
                int i3 = parcel.readInt();
                Bundle bundle4 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onComposerContentTransferFailure(string4, i3, bundle4);
            } else {
                if (i != 5) {
                    return false;
                }
                String string5 = parcel.readString();
                int i4 = parcel.readInt();
                Bundle bundle5 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onCallComposerSessionTerminated(string5, i4, bundle5);
            }
            return true;
        }
    }

    void onCallComposerPrepareFailed(String str, Bundle bundle);

    void onCallComposerPrepared(String str, Bundle bundle);

    void onCallComposerSessionTerminated(String str, int i, Bundle bundle);

    void onComposerContentTransferFailure(String str, int i, Bundle bundle);

    void onComposerContentTransferSuccess(String str, Bundle bundle);
}
