package com.google.android.gms.fido.u2f.internal.regular;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.fido.u2f.internal.regular.IU2fAppCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IU2fAppService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IU2fAppService {
        static final int TRANSACTION_getRegisterIntent = 1;
        static final int TRANSACTION_getSignIntent = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IU2fAppService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
            }

            @Override // com.google.android.gms.fido.u2f.internal.regular.IU2fAppService
            public void getRegisterIntent(IU2fAppCallbacks iU2fAppCallbacks, RegisterRequestParams registerRequestParams) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iU2fAppCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, registerRequestParams);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.u2f.internal.regular.IU2fAppService
            public void getSignIntent(IU2fAppCallbacks iU2fAppCallbacks, SignRequestParams signRequestParams) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iU2fAppCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, signRequestParams);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
        }

        public static IU2fAppService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
            return iInterfaceQueryLocalInterface instanceof IU2fAppService ? (IU2fAppService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IU2fAppCallbacks iU2fAppCallbacksAsInterface = IU2fAppCallbacks.Stub.asInterface(parcel.readStrongBinder());
                RegisterRequestParams registerRequestParams = (RegisterRequestParams) sgh.a(parcel, RegisterRequestParams.CREATOR);
                enforceNoDataAvail(parcel);
                getRegisterIntent(iU2fAppCallbacksAsInterface, registerRequestParams);
            } else {
                if (i != 2) {
                    return false;
                }
                IU2fAppCallbacks iU2fAppCallbacksAsInterface2 = IU2fAppCallbacks.Stub.asInterface(parcel.readStrongBinder());
                SignRequestParams signRequestParams = (SignRequestParams) sgh.a(parcel, SignRequestParams.CREATOR);
                enforceNoDataAvail(parcel);
                getSignIntent(iU2fAppCallbacksAsInterface2, signRequestParams);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getRegisterIntent(IU2fAppCallbacks iU2fAppCallbacks, RegisterRequestParams registerRequestParams);

    void getSignIntent(IU2fAppCallbacks iU2fAppCallbacks, SignRequestParams signRequestParams);
}
