package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IIndoorBuildingDelegate extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IIndoorBuildingDelegate {
        static final int TRANSACTION_equalsRemote = 5;
        static final int TRANSACTION_getActiveLevelIndex = 1;
        static final int TRANSACTION_getDefaultLevelIndex = 2;
        static final int TRANSACTION_getLevels = 3;
        static final int TRANSACTION_hashCodeRemote = 6;
        static final int TRANSACTION_isUnderground = 4;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IIndoorBuildingDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate
            public boolean equalsRemote(IIndoorBuildingDelegate iIndoorBuildingDelegate) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iIndoorBuildingDelegate);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate
            public int getActiveLevelIndex() {
                Parcel parcelTransactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate
            public int getDefaultLevelIndex() {
                Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate
            public List<IBinder> getLevels() {
                Parcel parcelTransactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                ArrayList<IBinder> arrayListCreateBinderArrayList = parcelTransactAndReadException.createBinderArrayList();
                parcelTransactAndReadException.recycle();
                return arrayListCreateBinderArrayList;
            }

            @Override // com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate
            public int hashCodeRemote() {
                Parcel parcelTransactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate
            public boolean isUnderground() {
                Parcel parcelTransactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
        }

        public static IIndoorBuildingDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
            return iInterfaceQueryLocalInterface instanceof IIndoorBuildingDelegate ? (IIndoorBuildingDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    int activeLevelIndex = getActiveLevelIndex();
                    parcel2.writeNoException();
                    parcel2.writeInt(activeLevelIndex);
                    return true;
                case 2:
                    int defaultLevelIndex = getDefaultLevelIndex();
                    parcel2.writeNoException();
                    parcel2.writeInt(defaultLevelIndex);
                    return true;
                case 3:
                    List<IBinder> levels = getLevels();
                    parcel2.writeNoException();
                    parcel2.writeBinderList(levels);
                    return true;
                case 4:
                    boolean zIsUnderground = isUnderground();
                    parcel2.writeNoException();
                    int i3 = sgh.a;
                    parcel2.writeInt(zIsUnderground ? 1 : 0);
                    return true;
                case 5:
                    IIndoorBuildingDelegate iIndoorBuildingDelegateAsInterface = asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean zEqualsRemote = equalsRemote(iIndoorBuildingDelegateAsInterface);
                    parcel2.writeNoException();
                    int i4 = sgh.a;
                    parcel2.writeInt(zEqualsRemote ? 1 : 0);
                    return true;
                case 6:
                    int iHashCodeRemote = hashCodeRemote();
                    parcel2.writeNoException();
                    parcel2.writeInt(iHashCodeRemote);
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean equalsRemote(IIndoorBuildingDelegate iIndoorBuildingDelegate);

    int getActiveLevelIndex();

    int getDefaultLevelIndex();

    List<IBinder> getLevels();

    int hashCodeRemote();

    boolean isUnderground();
}
