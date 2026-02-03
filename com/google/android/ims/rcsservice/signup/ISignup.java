package com.google.android.ims.rcsservice.signup;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.ims.rcsservice.signup.IAuthListener;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface ISignup extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISignup {
        static final int TRANSACTION_getConsentSkipped = 9;
        static final int TRANSACTION_getRcsAvailability = 8;
        static final int TRANSACTION_getRcsEligibility = 10;
        static final int TRANSACTION_isSeamlessAuthorizedProvisioningAllowed = 6;
        static final int TRANSACTION_isSignedUp = 5;
        static final int TRANSACTION_requestResignup = 2;
        static final int TRANSACTION_requestSignup = 1;
        static final int TRANSACTION_requestSignupWithMsisdn = 3;
        static final int TRANSACTION_requestSignupWithOtp = 4;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISignup {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcsservice.signup.ISignup");
            }

            @Override // com.google.android.ims.rcsservice.signup.ISignup
            public boolean getConsentSkipped(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(9, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.ims.rcsservice.signup.ISignup
            public int getRcsAvailability(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.ims.rcsservice.signup.ISignup
            public int getRcsEligibility(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(10, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.ims.rcsservice.signup.ISignup
            public boolean isSeamlessAuthorizedProvisioningAllowed() {
                Parcel parcelTransactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.ims.rcsservice.signup.ISignup
            public boolean isSignedUp() {
                Parcel parcelTransactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.ims.rcsservice.signup.ISignup
            public void requestResignup(int i, IAuthListener iAuthListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.f(parcelObtainAndWriteInterfaceToken, iAuthListener);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.rcsservice.signup.ISignup
            public void requestSignup(int i, IAuthListener iAuthListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.f(parcelObtainAndWriteInterfaceToken, iAuthListener);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.rcsservice.signup.ISignup
            public int requestSignupWithMsisdn(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.ims.rcsservice.signup.ISignup
            public int requestSignupWithOtp(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }
        }

        public Stub() {
            super("com.google.android.ims.rcsservice.signup.ISignup");
        }

        public static ISignup asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcsservice.signup.ISignup");
            return iInterfaceQueryLocalInterface instanceof ISignup ? (ISignup) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    int i3 = parcel.readInt();
                    IAuthListener iAuthListenerAsInterface = IAuthListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    requestSignup(i3, iAuthListenerAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    int i4 = parcel.readInt();
                    IAuthListener iAuthListenerAsInterface2 = IAuthListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    requestResignup(i4, iAuthListenerAsInterface2);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    String string = parcel.readString();
                    enforceNoDataAvail(parcel);
                    int iRequestSignupWithMsisdn = requestSignupWithMsisdn(string);
                    parcel2.writeNoException();
                    parcel2.writeInt(iRequestSignupWithMsisdn);
                    return true;
                case 4:
                    String string2 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    int iRequestSignupWithOtp = requestSignupWithOtp(string2);
                    parcel2.writeNoException();
                    parcel2.writeInt(iRequestSignupWithOtp);
                    return true;
                case 5:
                    boolean zIsSignedUp = isSignedUp();
                    parcel2.writeNoException();
                    int i5 = sgh.a;
                    parcel2.writeInt(zIsSignedUp ? 1 : 0);
                    return true;
                case 6:
                    boolean zIsSeamlessAuthorizedProvisioningAllowed = isSeamlessAuthorizedProvisioningAllowed();
                    parcel2.writeNoException();
                    int i6 = sgh.a;
                    parcel2.writeInt(zIsSeamlessAuthorizedProvisioningAllowed ? 1 : 0);
                    return true;
                case 7:
                default:
                    return false;
                case 8:
                    String string3 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    int rcsAvailability = getRcsAvailability(string3);
                    parcel2.writeNoException();
                    parcel2.writeInt(rcsAvailability);
                    return true;
                case 9:
                    String string4 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    boolean consentSkipped = getConsentSkipped(string4);
                    parcel2.writeNoException();
                    int i7 = sgh.a;
                    parcel2.writeInt(consentSkipped ? 1 : 0);
                    return true;
                case 10:
                    String string5 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    int rcsEligibility = getRcsEligibility(string5);
                    parcel2.writeNoException();
                    parcel2.writeInt(rcsEligibility);
                    return true;
            }
        }
    }

    boolean getConsentSkipped(String str);

    int getRcsAvailability(String str);

    int getRcsEligibility(String str);

    boolean isSeamlessAuthorizedProvisioningAllowed();

    boolean isSignedUp();

    void requestResignup(int i, IAuthListener iAuthListener);

    void requestSignup(int i, IAuthListener iAuthListener);

    int requestSignupWithMsisdn(String str);

    int requestSignupWithOtp(String str);
}
