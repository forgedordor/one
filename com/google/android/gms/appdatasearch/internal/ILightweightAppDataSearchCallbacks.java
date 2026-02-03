package com.google.android.gms.appdatasearch.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ILightweightAppDataSearchCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ILightweightAppDataSearchCallbacks {
        static final int TRANSACTION_onFileDescriptor = 2;
        static final int TRANSACTION_onGetRecentContextResponse = 4;
        static final int TRANSACTION_onStatus = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ILightweightAppDataSearchCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
            }

            @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks
            public void onFileDescriptor(Status status, ParcelFileDescriptor parcelFileDescriptor) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, parcelFileDescriptor);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks
            public void onGetRecentContextResponse(GetRecentContextCall$Response getRecentContextCall$Response) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getRecentContextCall$Response);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks
            public void onStatus(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        }

        public static ILightweightAppDataSearchCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
            return iInterfaceQueryLocalInterface instanceof ILightweightAppDataSearchCallbacks ? (ILightweightAppDataSearchCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) sgh.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                onStatus(status);
            } else if (i == 2) {
                Status status2 = (Status) sgh.a(parcel, Status.CREATOR);
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) sgh.a(parcel, ParcelFileDescriptor.CREATOR);
                enforceNoDataAvail(parcel);
                onFileDescriptor(status2, parcelFileDescriptor);
            } else {
                if (i != 4) {
                    return false;
                }
                GetRecentContextCall$Response getRecentContextCall$Response = (GetRecentContextCall$Response) sgh.a(parcel, GetRecentContextCall$Response.CREATOR);
                enforceNoDataAvail(parcel);
                onGetRecentContextResponse(getRecentContextCall$Response);
            }
            return true;
        }
    }

    void onFileDescriptor(Status status, ParcelFileDescriptor parcelFileDescriptor);

    void onGetRecentContextResponse(GetRecentContextCall$Response getRecentContextCall$Response);

    void onStatus(Status status);
}
