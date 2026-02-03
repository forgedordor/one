package com.google.android.libraries.subscriptions.restore;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface IG1Restore extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IG1Restore {
        static final int TRANSACTION_requestRestore = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IG1Restore {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.subscriptions.restore.IG1Restore");
            }

            @Override // com.google.android.libraries.subscriptions.restore.IG1Restore
            public int requestRestore(Uri uri, Uri uri2, Uri uri3) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, uri);
                sgh.d(parcelObtainAndWriteInterfaceToken, uri2);
                sgh.d(parcelObtainAndWriteInterfaceToken, uri3);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }
        }

        public Stub() {
            super("com.google.android.libraries.subscriptions.restore.IG1Restore");
        }

        public static IG1Restore asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.subscriptions.restore.IG1Restore");
            return iInterfaceQueryLocalInterface instanceof IG1Restore ? (IG1Restore) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Uri uri = (Uri) sgh.a(parcel, Uri.CREATOR);
            Uri uri2 = (Uri) sgh.a(parcel, Uri.CREATOR);
            Uri uri3 = (Uri) sgh.a(parcel, Uri.CREATOR);
            enforceNoDataAvail(parcel);
            int iRequestRestore = requestRestore(uri, uri2, uri3);
            parcel2.writeNoException();
            parcel2.writeInt(iRequestRestore);
            return true;
        }
    }

    int requestRestore(Uri uri, Uri uri2, Uri uri3);
}
