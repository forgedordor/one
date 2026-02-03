package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import defpackage.shr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IImageDescriptionResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IImageDescriptionResultCallback {
        static final int TRANSACTION_onImageDescriptionFailure = 3;
        static final int TRANSACTION_onImageDescriptionSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IImageDescriptionResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IImageDescriptionResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IImageDescriptionResultCallback
            public void onImageDescriptionFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IImageDescriptionResultCallback
            public void onImageDescriptionSuccess(shr shrVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, shrVar);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IImageDescriptionResultCallback");
        }

        public static IImageDescriptionResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IImageDescriptionResultCallback");
            return iInterfaceQueryLocalInterface instanceof IImageDescriptionResultCallback ? (IImageDescriptionResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                shr shrVar = (shr) sgh.a(parcel, shr.CREATOR);
                enforceNoDataAvail(parcel);
                onImageDescriptionSuccess(shrVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onImageDescriptionFailure(i3);
            return true;
        }
    }

    void onImageDescriptionFailure(int i);

    void onImageDescriptionSuccess(shr shrVar);
}
