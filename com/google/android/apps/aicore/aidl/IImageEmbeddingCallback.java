package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IImageEmbeddingCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IImageEmbeddingCallback {
        static final int TRANSACTION_onNewEmbeddings = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IImageEmbeddingCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IImageEmbeddingCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IImageEmbeddingCallback
            public void onNewEmbeddings(List<ParcelFileDescriptor> list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IImageEmbeddingCallback");
        }

        public static IImageEmbeddingCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IImageEmbeddingCallback");
            return iInterfaceQueryLocalInterface instanceof IImageEmbeddingCallback ? (IImageEmbeddingCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(ParcelFileDescriptor.CREATOR);
            enforceNoDataAvail(parcel);
            onNewEmbeddings(arrayListCreateTypedArrayList);
            return true;
        }
    }

    void onNewEmbeddings(List<ParcelFileDescriptor> list);
}
