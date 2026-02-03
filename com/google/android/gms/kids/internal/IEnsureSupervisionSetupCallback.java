package com.google.android.gms.kids.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.kids.EnsureSupervisionSetupResponse;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IEnsureSupervisionSetupCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IEnsureSupervisionSetupCallback {
        static final int TRANSACTION_onResponse = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IEnsureSupervisionSetupCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.kids.internal.IEnsureSupervisionSetupCallback");
            }

            @Override // com.google.android.gms.kids.internal.IEnsureSupervisionSetupCallback
            public void onResponse(Status status, EnsureSupervisionSetupResponse ensureSupervisionSetupResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, ensureSupervisionSetupResponse);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.kids.internal.IEnsureSupervisionSetupCallback");
        }

        public static IEnsureSupervisionSetupCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.kids.internal.IEnsureSupervisionSetupCallback");
            return iInterfaceQueryLocalInterface instanceof IEnsureSupervisionSetupCallback ? (IEnsureSupervisionSetupCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            EnsureSupervisionSetupResponse ensureSupervisionSetupResponse = (EnsureSupervisionSetupResponse) sgh.a(parcel, EnsureSupervisionSetupResponse.CREATOR);
            enforceNoDataAvail(parcel);
            onResponse(status, ensureSupervisionSetupResponse);
            return true;
        }
    }

    void onResponse(Status status, EnsureSupervisionSetupResponse ensureSupervisionSetupResponse);
}
