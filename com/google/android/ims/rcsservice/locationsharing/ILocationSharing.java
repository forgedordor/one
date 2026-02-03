package com.google.android.ims.rcsservice.locationsharing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface ILocationSharing extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ILocationSharing {
        static final int TRANSACTION_pushLocation = 1;
        static final int TRANSACTION_pushLocationToGroup = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ILocationSharing {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcsservice.locationsharing.ILocationSharing");
            }

            @Override // com.google.android.ims.rcsservice.locationsharing.ILocationSharing
            public LocationSharingResult pushLocation(String str, LocationInformation locationInformation, String str2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, locationInformation);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                LocationSharingResult locationSharingResult = (LocationSharingResult) sgh.a(parcelTransactAndReadException, LocationSharingResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return locationSharingResult;
            }

            @Override // com.google.android.ims.rcsservice.locationsharing.ILocationSharing
            public LocationSharingResult[] pushLocationToGroup(long j, LocationInformation locationInformation, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                sgh.d(parcelObtainAndWriteInterfaceToken, locationInformation);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                LocationSharingResult[] locationSharingResultArr = (LocationSharingResult[]) parcelTransactAndReadException.createTypedArray(LocationSharingResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return locationSharingResultArr;
            }
        }

        public Stub() {
            super("com.google.android.ims.rcsservice.locationsharing.ILocationSharing");
        }

        public static ILocationSharing asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcsservice.locationsharing.ILocationSharing");
            return iInterfaceQueryLocalInterface instanceof ILocationSharing ? (ILocationSharing) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                String string = parcel.readString();
                LocationInformation locationInformation = (LocationInformation) sgh.a(parcel, LocationInformation.CREATOR);
                String string2 = parcel.readString();
                enforceNoDataAvail(parcel);
                LocationSharingResult locationSharingResultPushLocation = pushLocation(string, locationInformation, string2);
                parcel2.writeNoException();
                sgh.e(parcel2, locationSharingResultPushLocation);
            } else {
                if (i != 2) {
                    return false;
                }
                long j = parcel.readLong();
                LocationInformation locationInformation2 = (LocationInformation) sgh.a(parcel, LocationInformation.CREATOR);
                String string3 = parcel.readString();
                enforceNoDataAvail(parcel);
                LocationSharingResult[] locationSharingResultArrPushLocationToGroup = pushLocationToGroup(j, locationInformation2, string3);
                parcel2.writeNoException();
                parcel2.writeTypedArray(locationSharingResultArrPushLocationToGroup, 1);
            }
            return true;
        }
    }

    LocationSharingResult pushLocation(String str, LocationInformation locationInformation, String str2);

    LocationSharingResult[] pushLocationToGroup(long j, LocationInformation locationInformation, String str);
}
