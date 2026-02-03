package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import defpackage.sme;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ITokenizationCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITokenizationCallback {
        static final int TRANSACTION_onTokenizationFailure = 3;
        static final int TRANSACTION_onTokenizationInfoSuccess = 4;
        static final int TRANSACTION_onTokenizationSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITokenizationCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ITokenizationCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ITokenizationCallback
            public void onTokenizationFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ITokenizationCallback
            public void onTokenizationInfoSuccess(sme smeVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, smeVar);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ITokenizationCallback
            public void onTokenizationSuccess(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ITokenizationCallback");
        }

        public static ITokenizationCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ITokenizationCallback");
            return iInterfaceQueryLocalInterface instanceof ITokenizationCallback ? (ITokenizationCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                int i3 = parcel.readInt();
                enforceNoDataAvail(parcel);
                onTokenizationSuccess(i3);
                return true;
            }
            if (i == 3) {
                int i4 = parcel.readInt();
                enforceNoDataAvail(parcel);
                onTokenizationFailure(i4);
                return true;
            }
            if (i != 4) {
                return false;
            }
            sme smeVar = (sme) sgh.a(parcel, sme.CREATOR);
            enforceNoDataAvail(parcel);
            onTokenizationInfoSuccess(smeVar);
            return true;
        }
    }

    void onTokenizationFailure(int i);

    void onTokenizationInfoSuccess(sme smeVar);

    @Deprecated
    void onTokenizationSuccess(int i);
}
