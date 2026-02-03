package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFileDescriptorReceiver extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFileDescriptorReceiver {
        static final int TRANSACTION_setFileDescriptor = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFileDescriptorReceiver {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.wearable.internal.IFileDescriptorReceiver");
            }

            @Override // com.google.android.gms.wearable.internal.IFileDescriptorReceiver
            public void setFileDescriptor(ParcelFileDescriptor parcelFileDescriptor) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, parcelFileDescriptor);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.wearable.internal.IFileDescriptorReceiver");
        }

        public static IFileDescriptorReceiver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IFileDescriptorReceiver");
            return iInterfaceQueryLocalInterface instanceof IFileDescriptorReceiver ? (IFileDescriptorReceiver) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) sgh.a(parcel, ParcelFileDescriptor.CREATOR);
            enforceNoDataAvail(parcel);
            setFileDescriptor(parcelFileDescriptor);
            return true;
        }
    }

    void setFileDescriptor(ParcelFileDescriptor parcelFileDescriptor);
}
