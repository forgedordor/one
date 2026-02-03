package com.google.android.gms.kids.internal;

import android.database.CursorWindow;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.kids.EnsureSupervisionSetupRequest;
import com.google.android.gms.kids.GetParentVerificationIntentRequest;
import com.google.android.gms.kids.internal.IEnsureSupervisionSetupCallback;
import com.google.android.gms.kids.internal.IGetParentVerificationIntentCallback;
import com.google.android.gms.kids.internal.IKidsCallbacks;
import com.google.android.gms.kids.internal.IScreentimeRestrictionCallback;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IKidsService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IKidsService {
        static final int TRANSACTION_ensureSupervisionSetup = 3010;
        static final int TRANSACTION_getAppliedTimeLimit = 3001;
        static final int TRANSACTION_getAppliedTimeLimitAsync = 3002;
        static final int TRANSACTION_getParentVerificationIntent = 3005;
        static final int TRANSACTION_registerScreentimeRestrictionCallback = 3008;
        static final int TRANSACTION_unregisterScreentimeRestrictionCallback = 3009;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IKidsService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.kids.internal.IKidsService");
            }

            @Override // com.google.android.gms.kids.internal.IKidsService
            public void ensureSupervisionSetup(EnsureSupervisionSetupRequest ensureSupervisionSetupRequest, IEnsureSupervisionSetupCallback iEnsureSupervisionSetupCallback, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, ensureSupervisionSetupRequest);
                sgh.f(parcelObtainAndWriteInterfaceToken, iEnsureSupervisionSetupCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_ensureSupervisionSetup, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IKidsService
            public CursorWindow getAppliedTimeLimit(ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_getAppliedTimeLimit, parcelObtainAndWriteInterfaceToken);
                CursorWindow cursorWindow = (CursorWindow) sgh.a(parcelTransactAndReadException, CursorWindow.CREATOR);
                parcelTransactAndReadException.recycle();
                return cursorWindow;
            }

            @Override // com.google.android.gms.kids.internal.IKidsService
            public void getAppliedTimeLimitAsync(IKidsCallbacks iKidsCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iKidsCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getAppliedTimeLimitAsync, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IKidsService
            public void getParentVerificationIntent(GetParentVerificationIntentRequest getParentVerificationIntentRequest, IGetParentVerificationIntentCallback iGetParentVerificationIntentCallback, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getParentVerificationIntentRequest);
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetParentVerificationIntentCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getParentVerificationIntent, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IKidsService
            public void registerScreentimeRestrictionCallback(IScreentimeRestrictionCallback iScreentimeRestrictionCallback, IKidsCallbacks iKidsCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iScreentimeRestrictionCallback);
                sgh.f(parcelObtainAndWriteInterfaceToken, iKidsCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_registerScreentimeRestrictionCallback, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IKidsService
            public void unregisterScreentimeRestrictionCallback(IScreentimeRestrictionCallback iScreentimeRestrictionCallback, IKidsCallbacks iKidsCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iScreentimeRestrictionCallback);
                sgh.f(parcelObtainAndWriteInterfaceToken, iKidsCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_unregisterScreentimeRestrictionCallback, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.kids.internal.IKidsService");
        }

        public static IKidsService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.kids.internal.IKidsService");
            return iInterfaceQueryLocalInterface instanceof IKidsService ? (IKidsService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == TRANSACTION_getAppliedTimeLimit) {
                ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                CursorWindow appliedTimeLimit = getAppliedTimeLimit(apiMetadata);
                parcel2.writeNoException();
                sgh.e(parcel2, appliedTimeLimit);
                return true;
            }
            if (i == TRANSACTION_getAppliedTimeLimitAsync) {
                IKidsCallbacks iKidsCallbacksAsInterface = IKidsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getAppliedTimeLimitAsync(iKidsCallbacksAsInterface, apiMetadata2);
                parcel2.writeNoException();
                return true;
            }
            if (i == TRANSACTION_getParentVerificationIntent) {
                GetParentVerificationIntentRequest getParentVerificationIntentRequest = (GetParentVerificationIntentRequest) sgh.a(parcel, GetParentVerificationIntentRequest.CREATOR);
                IGetParentVerificationIntentCallback iGetParentVerificationIntentCallbackAsInterface = IGetParentVerificationIntentCallback.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getParentVerificationIntent(getParentVerificationIntentRequest, iGetParentVerificationIntentCallbackAsInterface, apiMetadata3);
                parcel2.writeNoException();
                return true;
            }
            switch (i) {
                case TRANSACTION_registerScreentimeRestrictionCallback /* 3008 */:
                    IScreentimeRestrictionCallback iScreentimeRestrictionCallbackAsInterface = IScreentimeRestrictionCallback.Stub.asInterface(parcel.readStrongBinder());
                    IKidsCallbacks iKidsCallbacksAsInterface2 = IKidsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata4 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerScreentimeRestrictionCallback(iScreentimeRestrictionCallbackAsInterface, iKidsCallbacksAsInterface2, apiMetadata4);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_unregisterScreentimeRestrictionCallback /* 3009 */:
                    IScreentimeRestrictionCallback iScreentimeRestrictionCallbackAsInterface2 = IScreentimeRestrictionCallback.Stub.asInterface(parcel.readStrongBinder());
                    IKidsCallbacks iKidsCallbacksAsInterface3 = IKidsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata5 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    unregisterScreentimeRestrictionCallback(iScreentimeRestrictionCallbackAsInterface2, iKidsCallbacksAsInterface3, apiMetadata5);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_ensureSupervisionSetup /* 3010 */:
                    EnsureSupervisionSetupRequest ensureSupervisionSetupRequest = (EnsureSupervisionSetupRequest) sgh.a(parcel, EnsureSupervisionSetupRequest.CREATOR);
                    IEnsureSupervisionSetupCallback iEnsureSupervisionSetupCallbackAsInterface = IEnsureSupervisionSetupCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata6 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    ensureSupervisionSetup(ensureSupervisionSetupRequest, iEnsureSupervisionSetupCallbackAsInterface, apiMetadata6);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    void ensureSupervisionSetup(EnsureSupervisionSetupRequest ensureSupervisionSetupRequest, IEnsureSupervisionSetupCallback iEnsureSupervisionSetupCallback, ApiMetadata apiMetadata);

    @Deprecated
    CursorWindow getAppliedTimeLimit(ApiMetadata apiMetadata);

    void getAppliedTimeLimitAsync(IKidsCallbacks iKidsCallbacks, ApiMetadata apiMetadata);

    void getParentVerificationIntent(GetParentVerificationIntentRequest getParentVerificationIntentRequest, IGetParentVerificationIntentCallback iGetParentVerificationIntentCallback, ApiMetadata apiMetadata);

    void registerScreentimeRestrictionCallback(IScreentimeRestrictionCallback iScreentimeRestrictionCallback, IKidsCallbacks iKidsCallbacks, ApiMetadata apiMetadata);

    void unregisterScreentimeRestrictionCallback(IScreentimeRestrictionCallback iScreentimeRestrictionCallback, IKidsCallbacks iKidsCallbacks, ApiMetadata apiMetadata);
}
