package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IHintCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IHintCallback {
        static final int TRANSACTION_onHintFailure = 3;
        static final int TRANSACTION_onHintSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IHintCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IHintCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IHintCallback
            public void onHintFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IHintCallback
            public void onHintSuccess() {
                transactOneway(2, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IHintCallback");
        }

        public static IHintCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IHintCallback");
            return iInterfaceQueryLocalInterface instanceof IHintCallback ? (IHintCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                onHintSuccess();
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onHintFailure(i3);
            return true;
        }
    }

    void onHintFailure(int i);

    void onHintSuccess();
}
