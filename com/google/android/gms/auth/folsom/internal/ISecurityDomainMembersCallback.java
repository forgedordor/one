package com.google.android.gms.auth.folsom.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.folsom.SecurityDomainMember;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISecurityDomainMembersCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISecurityDomainMembersCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISecurityDomainMembersCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.folsom.internal.ISecurityDomainMembersCallback");
            }

            @Override // com.google.android.gms.auth.folsom.internal.ISecurityDomainMembersCallback
            public void onResult(Status status, List<SecurityDomainMember> list, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.folsom.internal.ISecurityDomainMembersCallback");
        }

        public static ISecurityDomainMembersCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.folsom.internal.ISecurityDomainMembersCallback");
            return iInterfaceQueryLocalInterface instanceof ISecurityDomainMembersCallback ? (ISecurityDomainMembersCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(SecurityDomainMember.CREATOR);
            ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, arrayListCreateTypedArrayList, apiMetadata);
            return true;
        }
    }

    void onResult(Status status, List<SecurityDomainMember> list, ApiMetadata apiMetadata);
}
