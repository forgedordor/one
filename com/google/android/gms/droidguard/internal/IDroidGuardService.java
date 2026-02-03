package com.google.android.gms.droidguard.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import com.google.android.gms.droidguard.internal.IDroidGuardCallbacks;
import com.google.android.gms.droidguard.internal.IDroidGuardHandle;
import defpackage.sgh;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IDroidGuardService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IDroidGuardService {
        static final int TRANSACTION_createDroidGuardHandle = 2;
        static final int TRANSACTION_getClientBlockingOperationTimeoutMillis = 3;
        static final int TRANSACTION_getResults = 1;
        static final int TRANSACTION_getResultsWithExtras = 4;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IDroidGuardService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.droidguard.internal.IDroidGuardService");
            }

            @Override // com.google.android.gms.droidguard.internal.IDroidGuardService
            public IDroidGuardHandle createDroidGuardHandle() {
                Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                IDroidGuardHandle iDroidGuardHandleAsInterface = IDroidGuardHandle.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iDroidGuardHandleAsInterface;
            }

            @Override // com.google.android.gms.droidguard.internal.IDroidGuardService
            public int getClientBlockingOperationTimeoutMillis() {
                Parcel parcelTransactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.droidguard.internal.IDroidGuardService
            public void getResults(IDroidGuardCallbacks iDroidGuardCallbacks, String str, Map map) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iDroidGuardCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeMap(map);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.droidguard.internal.IDroidGuardService
            public void getResultsWithExtras(IDroidGuardCallbacks iDroidGuardCallbacks, String str, Map map, DroidGuardResultsRequest droidGuardResultsRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iDroidGuardCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeMap(map);
                sgh.d(parcelObtainAndWriteInterfaceToken, droidGuardResultsRequest);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.droidguard.internal.IDroidGuardService");
        }

        public static IDroidGuardService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardService");
            return iInterfaceQueryLocalInterface instanceof IDroidGuardService ? (IDroidGuardService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IDroidGuardCallbacks iDroidGuardCallbacksAsInterface = IDroidGuardCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String string = parcel.readString();
                HashMap mapC = sgh.c(parcel);
                enforceNoDataAvail(parcel);
                getResults(iDroidGuardCallbacksAsInterface, string, mapC);
            } else if (i == 2) {
                IDroidGuardHandle iDroidGuardHandleCreateDroidGuardHandle = createDroidGuardHandle();
                parcel2.writeNoException();
                sgh.f(parcel2, iDroidGuardHandleCreateDroidGuardHandle);
            } else if (i == 3) {
                int clientBlockingOperationTimeoutMillis = getClientBlockingOperationTimeoutMillis();
                parcel2.writeNoException();
                parcel2.writeInt(clientBlockingOperationTimeoutMillis);
            } else {
                if (i != 4) {
                    return false;
                }
                IDroidGuardCallbacks iDroidGuardCallbacksAsInterface2 = IDroidGuardCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String string2 = parcel.readString();
                HashMap mapC2 = sgh.c(parcel);
                DroidGuardResultsRequest droidGuardResultsRequest = (DroidGuardResultsRequest) sgh.a(parcel, DroidGuardResultsRequest.CREATOR);
                enforceNoDataAvail(parcel);
                getResultsWithExtras(iDroidGuardCallbacksAsInterface2, string2, mapC2, droidGuardResultsRequest);
            }
            return true;
        }
    }

    IDroidGuardHandle createDroidGuardHandle();

    int getClientBlockingOperationTimeoutMillis();

    void getResults(IDroidGuardCallbacks iDroidGuardCallbacks, String str, Map map);

    void getResultsWithExtras(IDroidGuardCallbacks iDroidGuardCallbacks, String str, Map map, DroidGuardResultsRequest droidGuardResultsRequest);
}
