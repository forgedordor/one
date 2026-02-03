package com.google.android.gms.common.moduleinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IModuleInstallStatusListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IModuleInstallStatusListener {
        static final int TRANSACTION_onInstallStatusUpdated = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IModuleInstallStatusListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
            }

            @Override // com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener
            public void onInstallStatusUpdated(ModuleInstallStatusUpdate moduleInstallStatusUpdate) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, moduleInstallStatusUpdate);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
        }

        public static IModuleInstallStatusListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
            return iInterfaceQueryLocalInterface instanceof IModuleInstallStatusListener ? (IModuleInstallStatusListener) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            ModuleInstallStatusUpdate moduleInstallStatusUpdate = (ModuleInstallStatusUpdate) sgh.a(parcel, ModuleInstallStatusUpdate.CREATOR);
            enforceNoDataAvail(parcel);
            onInstallStatusUpdated(moduleInstallStatusUpdate);
            return true;
        }
    }

    void onInstallStatusUpdated(ModuleInstallStatusUpdate moduleInstallStatusUpdate);
}
