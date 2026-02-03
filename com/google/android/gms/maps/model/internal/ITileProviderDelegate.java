package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.Tile;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ITileProviderDelegate extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITileProviderDelegate {
        static final int TRANSACTION_getTile = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITileProviderDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.ITileProviderDelegate
            public Tile getTile(int i, int i2, int i3) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                parcelObtainAndWriteInterfaceToken.writeInt(i3);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                Tile tile = (Tile) sgh.a(parcelTransactAndReadException, Tile.CREATOR);
                parcelTransactAndReadException.recycle();
                return tile;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        }

        public static ITileProviderDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            return iInterfaceQueryLocalInterface instanceof ITileProviderDelegate ? (ITileProviderDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            enforceNoDataAvail(parcel);
            Tile tile = getTile(i3, i4, i5);
            parcel2.writeNoException();
            sgh.e(parcel2, tile);
            return true;
        }
    }

    Tile getTile(int i, int i2, int i3);
}
