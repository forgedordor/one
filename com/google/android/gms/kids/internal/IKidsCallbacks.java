package com.google.android.gms.kids.internal;

import android.app.PendingIntent;
import android.database.CursorWindow;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.kids.AreConversationsAllowedResponse;
import com.google.android.gms.kids.EnsureSupervisionSetupResponse;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IKidsCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IKidsCallbacks {
        static final int TRANSACTION_onAreConversationsAllowedResponse = 7;
        static final int TRANSACTION_onBoolean = 3;
        static final int TRANSACTION_onBooleanList = 5;
        static final int TRANSACTION_onCursorWindow = 2;
        static final int TRANSACTION_onEnsureSupervisionSetupResponse = 6;
        static final int TRANSACTION_onPendingIntent = 4;
        static final int TRANSACTION_onStatus = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IKidsCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.kids.internal.IKidsCallbacks");
            }

            @Override // com.google.android.gms.kids.internal.IKidsCallbacks
            public void onAreConversationsAllowedResponse(Status status, AreConversationsAllowedResponse areConversationsAllowedResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, areConversationsAllowedResponse);
                transactOneway(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IKidsCallbacks
            public void onBoolean(Status status, boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IKidsCallbacks
            public void onBooleanList(Status status, List<Boolean> list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeList(list);
                transactOneway(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IKidsCallbacks
            public void onCursorWindow(Status status, CursorWindow cursorWindow) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, cursorWindow);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IKidsCallbacks
            public void onEnsureSupervisionSetupResponse(Status status, EnsureSupervisionSetupResponse ensureSupervisionSetupResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, ensureSupervisionSetupResponse);
                transactOneway(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IKidsCallbacks
            public void onPendingIntent(Status status, PendingIntent pendingIntent) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IKidsCallbacks
            public void onStatus(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.kids.internal.IKidsCallbacks");
        }

        public static IKidsCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.kids.internal.IKidsCallbacks");
            return iInterfaceQueryLocalInterface instanceof IKidsCallbacks ? (IKidsCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    Status status = (Status) sgh.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onStatus(status);
                    return true;
                case 2:
                    Status status2 = (Status) sgh.a(parcel, Status.CREATOR);
                    CursorWindow cursorWindow = (CursorWindow) sgh.a(parcel, CursorWindow.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCursorWindow(status2, cursorWindow);
                    return true;
                case 3:
                    Status status3 = (Status) sgh.a(parcel, Status.CREATOR);
                    boolean zG = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    onBoolean(status3, zG);
                    return true;
                case 4:
                    Status status4 = (Status) sgh.a(parcel, Status.CREATOR);
                    PendingIntent pendingIntent = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
                    enforceNoDataAvail(parcel);
                    onPendingIntent(status4, pendingIntent);
                    return true;
                case 5:
                    Status status5 = (Status) sgh.a(parcel, Status.CREATOR);
                    ArrayList arrayListB = sgh.b(parcel);
                    enforceNoDataAvail(parcel);
                    onBooleanList(status5, arrayListB);
                    return true;
                case 6:
                    Status status6 = (Status) sgh.a(parcel, Status.CREATOR);
                    EnsureSupervisionSetupResponse ensureSupervisionSetupResponse = (EnsureSupervisionSetupResponse) sgh.a(parcel, EnsureSupervisionSetupResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onEnsureSupervisionSetupResponse(status6, ensureSupervisionSetupResponse);
                    return true;
                case 7:
                    Status status7 = (Status) sgh.a(parcel, Status.CREATOR);
                    AreConversationsAllowedResponse areConversationsAllowedResponse = (AreConversationsAllowedResponse) sgh.a(parcel, AreConversationsAllowedResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onAreConversationsAllowedResponse(status7, areConversationsAllowedResponse);
                    return true;
                default:
                    return false;
            }
        }
    }

    void onAreConversationsAllowedResponse(Status status, AreConversationsAllowedResponse areConversationsAllowedResponse);

    void onBoolean(Status status, boolean z);

    void onBooleanList(Status status, List<Boolean> list);

    void onCursorWindow(Status status, CursorWindow cursorWindow);

    void onEnsureSupervisionSetupResponse(Status status, EnsureSupervisionSetupResponse ensureSupervisionSetupResponse);

    void onPendingIntent(Status status, PendingIntent pendingIntent);

    void onStatus(Status status);
}
