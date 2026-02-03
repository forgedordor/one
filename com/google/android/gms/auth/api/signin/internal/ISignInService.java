package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.ISignInCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISignInService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISignInService {
        static final int TRANSACTION_revokeAccessFromGoogle = 103;
        static final int TRANSACTION_signOutFromGoogle = 102;
        static final int TRANSACTION_silentSignInToGoogle = 101;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISignInService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
            }

            @Override // com.google.android.gms.auth.api.signin.internal.ISignInService
            public void revokeAccessFromGoogle(ISignInCallbacks iSignInCallbacks, GoogleSignInOptions googleSignInOptions) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iSignInCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, googleSignInOptions);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_revokeAccessFromGoogle, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.signin.internal.ISignInService
            public void signOutFromGoogle(ISignInCallbacks iSignInCallbacks, GoogleSignInOptions googleSignInOptions) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iSignInCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, googleSignInOptions);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_signOutFromGoogle, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.signin.internal.ISignInService
            public void silentSignInToGoogle(ISignInCallbacks iSignInCallbacks, GoogleSignInOptions googleSignInOptions) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iSignInCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, googleSignInOptions);
                transactAndReadExceptionReturnVoid(101, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.signin.internal.ISignInService");
        }

        public static ISignInService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
            return iInterfaceQueryLocalInterface instanceof ISignInService ? (ISignInService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 101:
                    ISignInCallbacks iSignInCallbacksAsInterface = ISignInCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) sgh.a(parcel, GoogleSignInOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    silentSignInToGoogle(iSignInCallbacksAsInterface, googleSignInOptions);
                    break;
                case TRANSACTION_signOutFromGoogle /* 102 */:
                    ISignInCallbacks iSignInCallbacksAsInterface2 = ISignInCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    GoogleSignInOptions googleSignInOptions2 = (GoogleSignInOptions) sgh.a(parcel, GoogleSignInOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    signOutFromGoogle(iSignInCallbacksAsInterface2, googleSignInOptions2);
                    break;
                case TRANSACTION_revokeAccessFromGoogle /* 103 */:
                    ISignInCallbacks iSignInCallbacksAsInterface3 = ISignInCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    GoogleSignInOptions googleSignInOptions3 = (GoogleSignInOptions) sgh.a(parcel, GoogleSignInOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    revokeAccessFromGoogle(iSignInCallbacksAsInterface3, googleSignInOptions3);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void revokeAccessFromGoogle(ISignInCallbacks iSignInCallbacks, GoogleSignInOptions googleSignInOptions);

    void signOutFromGoogle(ISignInCallbacks iSignInCallbacks, GoogleSignInOptions googleSignInOptions);

    void silentSignInToGoogle(ISignInCallbacks iSignInCallbacks, GoogleSignInOptions googleSignInOptions);
}
