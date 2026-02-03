package com.google.android.gms.droidguard.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import defpackage.sgh;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IDroidGuardHandle extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IDroidGuardHandle {
        static final int TRANSACTION_close = 3;
        static final int TRANSACTION_init = 1;
        static final int TRANSACTION_initWithExtras = 5;
        static final int TRANSACTION_snapshot = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IDroidGuardHandle {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.droidguard.internal.IDroidGuardHandle");
            }

            @Override // com.google.android.gms.droidguard.internal.IDroidGuardHandle
            public void close() {
                transactOneway(3, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.droidguard.internal.IDroidGuardHandle
            public void init(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.droidguard.internal.IDroidGuardHandle
            public DroidGuardInitReply initWithExtras(String str, DroidGuardResultsRequest droidGuardResultsRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, droidGuardResultsRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                DroidGuardInitReply droidGuardInitReply = (DroidGuardInitReply) sgh.a(parcelTransactAndReadException, DroidGuardInitReply.CREATOR);
                parcelTransactAndReadException.recycle();
                return droidGuardInitReply;
            }

            @Override // com.google.android.gms.droidguard.internal.IDroidGuardHandle
            public byte[] snapshot(Map map) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeMap(map);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                byte[] bArrCreateByteArray = parcelTransactAndReadException.createByteArray();
                parcelTransactAndReadException.recycle();
                return bArrCreateByteArray;
            }
        }

        public Stub() {
            super("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
        }

        public static IDroidGuardHandle asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
            return iInterfaceQueryLocalInterface instanceof IDroidGuardHandle ? (IDroidGuardHandle) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                String string = parcel.readString();
                enforceNoDataAvail(parcel);
                init(string);
            } else if (i == 2) {
                HashMap mapC = sgh.c(parcel);
                enforceNoDataAvail(parcel);
                byte[] bArrSnapshot = snapshot(mapC);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrSnapshot);
            } else if (i == 3) {
                close();
            } else {
                if (i != 5) {
                    return false;
                }
                String string2 = parcel.readString();
                DroidGuardResultsRequest droidGuardResultsRequest = (DroidGuardResultsRequest) sgh.a(parcel, DroidGuardResultsRequest.CREATOR);
                enforceNoDataAvail(parcel);
                DroidGuardInitReply droidGuardInitReplyInitWithExtras = initWithExtras(string2, droidGuardResultsRequest);
                parcel2.writeNoException();
                sgh.e(parcel2, droidGuardInitReplyInitWithExtras);
            }
            return true;
        }
    }

    void close();

    void init(String str);

    DroidGuardInitReply initWithExtras(String str, DroidGuardResultsRequest droidGuardResultsRequest);

    byte[] snapshot(Map map);
}
