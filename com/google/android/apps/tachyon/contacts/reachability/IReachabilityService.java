package com.google.android.apps.tachyon.contacts.reachability;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.tachyon.contacts.reachability.IReachabilityInviteLinkCallback;
import com.google.android.apps.tachyon.contacts.reachability.IReachabilityQueryCallback;
import com.google.android.apps.tachyon.contacts.reachability.IReachabilityQueryNoCacheCallback;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IReachabilityService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IReachabilityService {
        static final int TRANSACTION_generateInviteLink = 3;
        static final int TRANSACTION_generateMeetingInviteLink = 4;
        static final int TRANSACTION_queryReachability = 1;
        static final int TRANSACTION_queryReachabilityNoCache = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IReachabilityService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.tachyon.contacts.reachability.IReachabilityService");
            }

            @Override // com.google.android.apps.tachyon.contacts.reachability.IReachabilityService
            public void generateInviteLink(List<String> list, IReachabilityInviteLinkCallback iReachabilityInviteLinkCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeStringList(list);
                sgh.f(parcelObtainAndWriteInterfaceToken, iReachabilityInviteLinkCallback);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.tachyon.contacts.reachability.IReachabilityService
            public void generateMeetingInviteLink(List<String> list, IReachabilityInviteLinkCallback iReachabilityInviteLinkCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeStringList(list);
                sgh.f(parcelObtainAndWriteInterfaceToken, iReachabilityInviteLinkCallback);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.tachyon.contacts.reachability.IReachabilityService
            public void queryReachability(List<String> list, IReachabilityQueryCallback iReachabilityQueryCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeStringList(list);
                sgh.f(parcelObtainAndWriteInterfaceToken, iReachabilityQueryCallback);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.tachyon.contacts.reachability.IReachabilityService
            public void queryReachabilityNoCache(List<String> list, IReachabilityQueryNoCacheCallback iReachabilityQueryNoCacheCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeStringList(list);
                sgh.f(parcelObtainAndWriteInterfaceToken, iReachabilityQueryNoCacheCallback);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.tachyon.contacts.reachability.IReachabilityService");
        }

        public static IReachabilityService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.tachyon.contacts.reachability.IReachabilityService");
            return iInterfaceQueryLocalInterface instanceof IReachabilityService ? (IReachabilityService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                IReachabilityQueryCallback iReachabilityQueryCallbackAsInterface = IReachabilityQueryCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                queryReachability(arrayListCreateStringArrayList, iReachabilityQueryCallbackAsInterface);
            } else if (i == 2) {
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                IReachabilityQueryNoCacheCallback iReachabilityQueryNoCacheCallbackAsInterface = IReachabilityQueryNoCacheCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                queryReachabilityNoCache(arrayListCreateStringArrayList2, iReachabilityQueryNoCacheCallbackAsInterface);
            } else if (i == 3) {
                ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
                IReachabilityInviteLinkCallback iReachabilityInviteLinkCallbackAsInterface = IReachabilityInviteLinkCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                generateInviteLink(arrayListCreateStringArrayList3, iReachabilityInviteLinkCallbackAsInterface);
            } else {
                if (i != 4) {
                    return false;
                }
                ArrayList<String> arrayListCreateStringArrayList4 = parcel.createStringArrayList();
                IReachabilityInviteLinkCallback iReachabilityInviteLinkCallbackAsInterface2 = IReachabilityInviteLinkCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                generateMeetingInviteLink(arrayListCreateStringArrayList4, iReachabilityInviteLinkCallbackAsInterface2);
            }
            return true;
        }
    }

    void generateInviteLink(List<String> list, IReachabilityInviteLinkCallback iReachabilityInviteLinkCallback);

    void generateMeetingInviteLink(List<String> list, IReachabilityInviteLinkCallback iReachabilityInviteLinkCallback);

    void queryReachability(List<String> list, IReachabilityQueryCallback iReachabilityQueryCallback);

    void queryReachabilityNoCache(List<String> list, IReachabilityQueryNoCacheCallback iReachabilityQueryNoCacheCallback);
}
