package com.google.android.gms.fido.fido2.api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.fido.fido2.api.IUserPresenceApprover;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAuthStatusCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAuthStatusCallback {
        static final int TRANSACTION_onStatusChanged = 1;
        static final int TRANSACTION_onUserPresenceApprovalRequired = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAuthStatusCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.fido2.api.IAuthStatusCallback");
            }

            @Override // com.google.android.gms.fido.fido2.api.IAuthStatusCallback
            public void onStatusChanged(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.api.IAuthStatusCallback
            public void onUserPresenceApprovalRequired(IUserPresenceApprover iUserPresenceApprover) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iUserPresenceApprover);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.fido2.api.IAuthStatusCallback");
        }

        public static IAuthStatusCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.api.IAuthStatusCallback");
            return iInterfaceQueryLocalInterface instanceof IAuthStatusCallback ? (IAuthStatusCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                int i3 = parcel.readInt();
                enforceNoDataAvail(parcel);
                onStatusChanged(i3);
            } else {
                if (i != 2) {
                    return false;
                }
                IUserPresenceApprover iUserPresenceApproverAsInterface = IUserPresenceApprover.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onUserPresenceApprovalRequired(iUserPresenceApproverAsInterface);
            }
            return true;
        }
    }

    void onStatusChanged(int i);

    void onUserPresenceApprovalRequired(IUserPresenceApprover iUserPresenceApprover);
}
