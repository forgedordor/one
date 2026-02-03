package com.google.android.gms.common.moduleinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IModuleInstallCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IModuleInstallCallbacks {
        static final int TRANSACTION_onDeferredInstall = 4;
        static final int TRANSACTION_onModuleInstallIntentResponse = 3;
        static final int TRANSACTION_onModuleInstallResponse = 2;
        static final int TRANSACTION_onModulesAvailabilityResponse = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IModuleInstallCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
            }

            @Override // com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks
            public void onDeferredInstall(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks
            public void onModuleInstallIntentResponse(Status status, ModuleInstallIntentResponse moduleInstallIntentResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, moduleInstallIntentResponse);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks
            public void onModuleInstallResponse(Status status, ModuleInstallResponse moduleInstallResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, moduleInstallResponse);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks
            public void onModulesAvailabilityResponse(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, moduleAvailabilityResponse);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
        }

        public static IModuleInstallCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
            return iInterfaceQueryLocalInterface instanceof IModuleInstallCallbacks ? (IModuleInstallCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) sgh.a(parcel, Status.CREATOR);
                ModuleAvailabilityResponse moduleAvailabilityResponse = (ModuleAvailabilityResponse) sgh.a(parcel, ModuleAvailabilityResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onModulesAvailabilityResponse(status, moduleAvailabilityResponse);
            } else if (i == 2) {
                Status status2 = (Status) sgh.a(parcel, Status.CREATOR);
                ModuleInstallResponse moduleInstallResponse = (ModuleInstallResponse) sgh.a(parcel, ModuleInstallResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onModuleInstallResponse(status2, moduleInstallResponse);
            } else if (i == 3) {
                Status status3 = (Status) sgh.a(parcel, Status.CREATOR);
                ModuleInstallIntentResponse moduleInstallIntentResponse = (ModuleInstallIntentResponse) sgh.a(parcel, ModuleInstallIntentResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onModuleInstallIntentResponse(status3, moduleInstallIntentResponse);
            } else {
                if (i != 4) {
                    return false;
                }
                Status status4 = (Status) sgh.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                onDeferredInstall(status4);
            }
            return true;
        }
    }

    void onDeferredInstall(Status status);

    void onModuleInstallIntentResponse(Status status, ModuleInstallIntentResponse moduleInstallIntentResponse);

    void onModuleInstallResponse(Status status, ModuleInstallResponse moduleInstallResponse);

    void onModulesAvailabilityResponse(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse);
}
