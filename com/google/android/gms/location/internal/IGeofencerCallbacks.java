package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGeofencerCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGeofencerCallbacks {
        static final int TRANSACTION_onAddGeofencesResult = 1;
        static final int TRANSACTION_onRemoveGeofencesByPendingIntentResult = 3;
        static final int TRANSACTION_onRemoveGeofencesByRequestIdsResult = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGeofencerCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.location.internal.IGeofencerCallbacks");
            }

            @Override // com.google.android.gms.location.internal.IGeofencerCallbacks
            public void onAddGeofencesResult(int i, String[] strArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeStringArray(strArr);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGeofencerCallbacks
            public void onRemoveGeofencesByPendingIntentResult(int i, PendingIntent pendingIntent) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGeofencerCallbacks
            public void onRemoveGeofencesByRequestIdsResult(int i, String[] strArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeStringArray(strArr);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.location.internal.IGeofencerCallbacks");
        }

        public static IGeofencerCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
            return iInterfaceQueryLocalInterface instanceof IGeofencerCallbacks ? (IGeofencerCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                int i3 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                enforceNoDataAvail(parcel);
                onAddGeofencesResult(i3, strArrCreateStringArray);
            } else if (i == 2) {
                int i4 = parcel.readInt();
                String[] strArrCreateStringArray2 = parcel.createStringArray();
                enforceNoDataAvail(parcel);
                onRemoveGeofencesByRequestIdsResult(i4, strArrCreateStringArray2);
            } else {
                if (i != 3) {
                    return false;
                }
                int i5 = parcel.readInt();
                PendingIntent pendingIntent = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
                enforceNoDataAvail(parcel);
                onRemoveGeofencesByPendingIntentResult(i5, pendingIntent);
            }
            return true;
        }
    }

    void onAddGeofencesResult(int i, String[] strArr);

    void onRemoveGeofencesByPendingIntentResult(int i, PendingIntent pendingIntent);

    void onRemoveGeofencesByRequestIdsResult(int i, String[] strArr);
}
