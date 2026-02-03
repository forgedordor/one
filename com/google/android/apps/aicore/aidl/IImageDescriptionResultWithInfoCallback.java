package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import defpackage.shl;
import defpackage.shr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IImageDescriptionResultWithInfoCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IImageDescriptionResultWithInfoCallback {
        static final int TRANSACTION_onImageDescriptionFailure = 3;
        static final int TRANSACTION_onImageDescriptionSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IImageDescriptionResultWithInfoCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IImageDescriptionResultWithInfoCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IImageDescriptionResultWithInfoCallback
            public void onImageDescriptionFailure(shl shlVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, shlVar);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IImageDescriptionResultWithInfoCallback
            public void onImageDescriptionSuccess(shr shrVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, shrVar);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IImageDescriptionResultWithInfoCallback");
        }

        public static IImageDescriptionResultWithInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IImageDescriptionResultWithInfoCallback");
            return iInterfaceQueryLocalInterface instanceof IImageDescriptionResultWithInfoCallback ? (IImageDescriptionResultWithInfoCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
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
            shl shlVar = (shl) sgh.a(parcel, shl.CREATOR);
            enforceNoDataAvail(parcel);
            onImageDescriptionFailure(shlVar);
            return true;
        }
    }

    void onImageDescriptionFailure(shl shlVar);

    void onImageDescriptionSuccess(shr shrVar);
}
