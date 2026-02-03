package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IIndoorLevelDelegate extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IIndoorLevelDelegate {
        static final int TRANSACTION_activate = 3;
        static final int TRANSACTION_equalsRemote = 4;
        static final int TRANSACTION_getName = 1;
        static final int TRANSACTION_getShortName = 2;
        static final int TRANSACTION_hashCodeRemote = 5;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IIndoorLevelDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.IIndoorLevelDelegate
            public void activate() {
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.model.internal.IIndoorLevelDelegate
            public boolean equalsRemote(IIndoorLevelDelegate iIndoorLevelDelegate) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iIndoorLevelDelegate);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.model.internal.IIndoorLevelDelegate
            public String getName() {
                Parcel parcelTransactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.maps.model.internal.IIndoorLevelDelegate
            public String getShortName() {
                Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.maps.model.internal.IIndoorLevelDelegate
            public int hashCodeRemote() {
                Parcel parcelTransactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
        }

        public static IIndoorLevelDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
            return iInterfaceQueryLocalInterface instanceof IIndoorLevelDelegate ? (IIndoorLevelDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                String name = getName();
                parcel2.writeNoException();
                parcel2.writeString(name);
            } else if (i == 2) {
                String shortName = getShortName();
                parcel2.writeNoException();
                parcel2.writeString(shortName);
            } else if (i == 3) {
                activate();
                parcel2.writeNoException();
            } else if (i == 4) {
                IIndoorLevelDelegate iIndoorLevelDelegateAsInterface = asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                boolean zEqualsRemote = equalsRemote(iIndoorLevelDelegateAsInterface);
                parcel2.writeNoException();
                int i3 = sgh.a;
                parcel2.writeInt(zEqualsRemote ? 1 : 0);
            } else {
                if (i != 5) {
                    return false;
                }
                int iHashCodeRemote = hashCodeRemote();
                parcel2.writeNoException();
                parcel2.writeInt(iHashCodeRemote);
            }
            return true;
        }
    }

    void activate();

    boolean equalsRemote(IIndoorLevelDelegate iIndoorLevelDelegate);

    String getName();

    String getShortName();

    int hashCodeRemote();
}
