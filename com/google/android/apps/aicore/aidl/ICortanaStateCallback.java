package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ICortanaStateCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICortanaStateCallback {
        static final int TRANSACTION_onNewCortanaState = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICortanaStateCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ICortanaStateCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ICortanaStateCallback
            public void onNewCortanaState(ParcelFileDescriptor parcelFileDescriptor) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, parcelFileDescriptor);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ICortanaStateCallback");
        }

        public static ICortanaStateCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ICortanaStateCallback");
            return iInterfaceQueryLocalInterface instanceof ICortanaStateCallback ? (ICortanaStateCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) sgh.a(parcel, ParcelFileDescriptor.CREATOR);
            enforceNoDataAvail(parcel);
            onNewCortanaState(parcelFileDescriptor);
            return true;
        }
    }

    void onNewCortanaState(ParcelFileDescriptor parcelFileDescriptor);
}
