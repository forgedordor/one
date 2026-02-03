package com.google.android.ims.rcsservice.signup;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IAuthListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAuthListener {
        static final int TRANSACTION_onAuthFailed = 2;
        static final int TRANSACTION_onAuthSuccess = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAuthListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcsservice.signup.IAuthListener");
            }

            @Override // com.google.android.ims.rcsservice.signup.IAuthListener
            public void onAuthFailed(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.rcsservice.signup.IAuthListener
            public void onAuthSuccess() {
                transactOneway(1, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.ims.rcsservice.signup.IAuthListener");
        }

        public static IAuthListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcsservice.signup.IAuthListener");
            return iInterfaceQueryLocalInterface instanceof IAuthListener ? (IAuthListener) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                onAuthSuccess();
            } else {
                if (i != 2) {
                    return false;
                }
                int i3 = parcel.readInt();
                enforceNoDataAvail(parcel);
                onAuthFailed(i3);
            }
            return true;
        }
    }

    void onAuthFailed(int i);

    void onAuthSuccess();
}
