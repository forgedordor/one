package com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.dhza;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface ISafetyCoreCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISafetyCoreCallbacks {
        static final int TRANSACTION_onClassificationResult = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISafetyCoreCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreCallbacks");
            }

            @Override // com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreCallbacks
            public void onClassificationResult(Status status, dhza dhzaVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, dhzaVar);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreCallbacks");
        }

        public static ISafetyCoreCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreCallbacks");
            return iInterfaceQueryLocalInterface instanceof ISafetyCoreCallbacks ? (ISafetyCoreCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            dhza dhzaVar = (dhza) sgh.a(parcel, dhza.CREATOR);
            enforceNoDataAvail(parcel);
            onClassificationResult(status, dhzaVar);
            return true;
        }
    }

    void onClassificationResult(Status status, dhza dhzaVar);
}
