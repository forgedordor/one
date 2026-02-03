package com.google.android.gms.common.moduleinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks;
import com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IModuleInstallService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IModuleInstallService {
        static final int TRANSACTION_areModulesAvailable = 1;
        static final int TRANSACTION_getInstallModulesIntent = 3;
        static final int TRANSACTION_installModules = 2;
        static final int TRANSACTION_releaseModules = 4;
        static final int TRANSACTION_unregisterListener = 6;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IModuleInstallService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
            }

            @Override // com.google.android.gms.common.moduleinstall.internal.IModuleInstallService
            public void areModulesAvailable(IModuleInstallCallbacks iModuleInstallCallbacks, ApiFeatureRequest apiFeatureRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iModuleInstallCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiFeatureRequest);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.common.moduleinstall.internal.IModuleInstallService
            public void getInstallModulesIntent(IModuleInstallCallbacks iModuleInstallCallbacks, ApiFeatureRequest apiFeatureRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iModuleInstallCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiFeatureRequest);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.common.moduleinstall.internal.IModuleInstallService
            public void installModules(IModuleInstallCallbacks iModuleInstallCallbacks, ApiFeatureRequest apiFeatureRequest, IModuleInstallStatusListener iModuleInstallStatusListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iModuleInstallCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiFeatureRequest);
                sgh.f(parcelObtainAndWriteInterfaceToken, iModuleInstallStatusListener);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.common.moduleinstall.internal.IModuleInstallService
            public void releaseModules(IStatusCallback iStatusCallback, ApiFeatureRequest apiFeatureRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiFeatureRequest);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.common.moduleinstall.internal.IModuleInstallService
            public void unregisterListener(IStatusCallback iStatusCallback, IModuleInstallStatusListener iModuleInstallStatusListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.f(parcelObtainAndWriteInterfaceToken, iModuleInstallStatusListener);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        }

        public static IModuleInstallService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
            return iInterfaceQueryLocalInterface instanceof IModuleInstallService ? (IModuleInstallService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IModuleInstallCallbacks iModuleInstallCallbacksAsInterface = IModuleInstallCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) sgh.a(parcel, ApiFeatureRequest.CREATOR);
                enforceNoDataAvail(parcel);
                areModulesAvailable(iModuleInstallCallbacksAsInterface, apiFeatureRequest);
            } else if (i == 2) {
                IModuleInstallCallbacks iModuleInstallCallbacksAsInterface2 = IModuleInstallCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiFeatureRequest apiFeatureRequest2 = (ApiFeatureRequest) sgh.a(parcel, ApiFeatureRequest.CREATOR);
                IModuleInstallStatusListener iModuleInstallStatusListenerAsInterface = IModuleInstallStatusListener.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                installModules(iModuleInstallCallbacksAsInterface2, apiFeatureRequest2, iModuleInstallStatusListenerAsInterface);
            } else if (i == 3) {
                IModuleInstallCallbacks iModuleInstallCallbacksAsInterface3 = IModuleInstallCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiFeatureRequest apiFeatureRequest3 = (ApiFeatureRequest) sgh.a(parcel, ApiFeatureRequest.CREATOR);
                enforceNoDataAvail(parcel);
                getInstallModulesIntent(iModuleInstallCallbacksAsInterface3, apiFeatureRequest3);
            } else if (i == 4) {
                IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                ApiFeatureRequest apiFeatureRequest4 = (ApiFeatureRequest) sgh.a(parcel, ApiFeatureRequest.CREATOR);
                enforceNoDataAvail(parcel);
                releaseModules(iStatusCallbackAsInterface, apiFeatureRequest4);
            } else {
                if (i != 6) {
                    return false;
                }
                IStatusCallback iStatusCallbackAsInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                IModuleInstallStatusListener iModuleInstallStatusListenerAsInterface2 = IModuleInstallStatusListener.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                unregisterListener(iStatusCallbackAsInterface2, iModuleInstallStatusListenerAsInterface2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void areModulesAvailable(IModuleInstallCallbacks iModuleInstallCallbacks, ApiFeatureRequest apiFeatureRequest);

    void getInstallModulesIntent(IModuleInstallCallbacks iModuleInstallCallbacks, ApiFeatureRequest apiFeatureRequest);

    void installModules(IModuleInstallCallbacks iModuleInstallCallbacks, ApiFeatureRequest apiFeatureRequest, IModuleInstallStatusListener iModuleInstallStatusListener);

    void releaseModules(IStatusCallback iStatusCallback, ApiFeatureRequest apiFeatureRequest);

    void unregisterListener(IStatusCallback iStatusCallback, IModuleInstallStatusListener iModuleInstallStatusListener);
}
