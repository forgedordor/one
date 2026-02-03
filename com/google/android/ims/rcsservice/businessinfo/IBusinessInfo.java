package com.google.android.ims.rcsservice.businessinfo;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IBusinessInfo extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IBusinessInfo {
        private static final String DESCRIPTOR = "com.google.android.ims.rcsservice.businessinfo.IBusinessInfo";
        static final int TRANSACTION_retrieveBusinessInfo = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IBusinessInfo {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.ims.rcsservice.businessinfo.IBusinessInfo
            public void retrieveBusinessInfo(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IBusinessInfo asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return iInterfaceQueryLocalInterface instanceof IBusinessInfo ? (IBusinessInfo) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            String string = parcel.readString();
            enforceNoDataAvail(parcel);
            retrieveBusinessInfo(string);
            parcel2.writeNoException();
            return true;
        }
    }

    void retrieveBusinessInfo(String str);
}
