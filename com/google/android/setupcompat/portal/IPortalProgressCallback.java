package com.google.android.setupcompat.portal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface IPortalProgressCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IPortalProgressCallback {
        static final int TRANSACTION_setComplete = 5;
        static final int TRANSACTION_setFailure = 6;
        static final int TRANSACTION_setPendingReason = 4;
        static final int TRANSACTION_setProgressCount = 1;
        static final int TRANSACTION_setProgressPercentage = 2;
        static final int TRANSACTION_setSummary = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IPortalProgressCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.setupcompat.portal.IPortalProgressCallback");
            }

            @Override // com.google.android.setupcompat.portal.IPortalProgressCallback
            public Bundle setComplete(int i, int i2, int[] iArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                parcelObtainAndWriteInterfaceToken.writeIntArray(iArr);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.setupcompat.portal.IPortalProgressCallback
            public Bundle setFailure(int i, int i2, int[] iArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                parcelObtainAndWriteInterfaceToken.writeIntArray(iArr);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.setupcompat.portal.IPortalProgressCallback
            public Bundle setPendingReason(int i, int i2, int[] iArr, int i3) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                parcelObtainAndWriteInterfaceToken.writeIntArray(iArr);
                parcelObtainAndWriteInterfaceToken.writeInt(i3);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.setupcompat.portal.IPortalProgressCallback
            public Bundle setProgressCount(int i, int i2, int i3) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                parcelObtainAndWriteInterfaceToken.writeInt(i3);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.setupcompat.portal.IPortalProgressCallback
            public Bundle setProgressPercentage(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.setupcompat.portal.IPortalProgressCallback
            public Bundle setSummary(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle;
            }
        }

        public Stub() {
            super("com.google.android.setupcompat.portal.IPortalProgressCallback");
        }

        public static IPortalProgressCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.setupcompat.portal.IPortalProgressCallback");
            return iInterfaceQueryLocalInterface instanceof IPortalProgressCallback ? (IPortalProgressCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    int i3 = parcel.readInt();
                    int i4 = parcel.readInt();
                    int i5 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    Bundle progressCount = setProgressCount(i3, i4, i5);
                    parcel2.writeNoException();
                    sgh.e(parcel2, progressCount);
                    return true;
                case 2:
                    int i6 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    Bundle progressPercentage = setProgressPercentage(i6);
                    parcel2.writeNoException();
                    sgh.e(parcel2, progressPercentage);
                    return true;
                case 3:
                    String string = parcel.readString();
                    enforceNoDataAvail(parcel);
                    Bundle summary = setSummary(string);
                    parcel2.writeNoException();
                    sgh.e(parcel2, summary);
                    return true;
                case 4:
                    int i7 = parcel.readInt();
                    int i8 = parcel.readInt();
                    int[] iArrCreateIntArray = parcel.createIntArray();
                    int i9 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    Bundle pendingReason = setPendingReason(i7, i8, iArrCreateIntArray, i9);
                    parcel2.writeNoException();
                    sgh.e(parcel2, pendingReason);
                    return true;
                case 5:
                    int i10 = parcel.readInt();
                    int i11 = parcel.readInt();
                    int[] iArrCreateIntArray2 = parcel.createIntArray();
                    enforceNoDataAvail(parcel);
                    Bundle complete = setComplete(i10, i11, iArrCreateIntArray2);
                    parcel2.writeNoException();
                    sgh.e(parcel2, complete);
                    return true;
                case 6:
                    int i12 = parcel.readInt();
                    int i13 = parcel.readInt();
                    int[] iArrCreateIntArray3 = parcel.createIntArray();
                    enforceNoDataAvail(parcel);
                    Bundle failure = setFailure(i12, i13, iArrCreateIntArray3);
                    parcel2.writeNoException();
                    sgh.e(parcel2, failure);
                    return true;
                default:
                    return false;
            }
        }
    }

    Bundle setComplete(int i, int i2, int[] iArr);

    Bundle setFailure(int i, int i2, int[] iArr);

    Bundle setPendingReason(int i, int i2, int[] iArr, int i3);

    Bundle setProgressCount(int i, int i2, int i3);

    Bundle setProgressPercentage(int i);

    Bundle setSummary(String str);
}
