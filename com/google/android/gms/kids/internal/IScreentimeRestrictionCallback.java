package com.google.android.gms.kids.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IScreentimeRestrictionCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IScreentimeRestrictionCallback {
        static final int TRANSACTION_onRestrictedModeChanged = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IScreentimeRestrictionCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.kids.internal.IScreentimeRestrictionCallback");
            }

            @Override // com.google.android.gms.kids.internal.IScreentimeRestrictionCallback
            public void onRestrictedModeChanged(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.kids.internal.IScreentimeRestrictionCallback");
        }

        public static IScreentimeRestrictionCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.kids.internal.IScreentimeRestrictionCallback");
            return iInterfaceQueryLocalInterface instanceof IScreentimeRestrictionCallback ? (IScreentimeRestrictionCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onRestrictedModeChanged(i3);
            return true;
        }
    }

    void onRestrictedModeChanged(int i);
}
