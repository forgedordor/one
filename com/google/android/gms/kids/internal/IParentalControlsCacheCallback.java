package com.google.android.gms.kids.internal;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IParentalControlsCacheCallback extends IInterface {
    public static final int FLAG_CLEAR_CACHE = 2;
    public static final int FLAG_DEFAULT_ALLOWED = 8;
    public static final int FLAG_MORE_DATA = 1;
    public static final int FLAG_REMOVE_RESOURCES = 4;

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IParentalControlsCacheCallback {
        static final int TRANSACTION_updateCache = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IParentalControlsCacheCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.kids.internal.IParentalControlsCacheCallback");
            }

            @Override // com.google.android.gms.kids.internal.IParentalControlsCacheCallback
            public void updateCache(String str, List<Uri> list, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.kids.internal.IParentalControlsCacheCallback");
        }

        public static IParentalControlsCacheCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.kids.internal.IParentalControlsCacheCallback");
            return iInterfaceQueryLocalInterface instanceof IParentalControlsCacheCallback ? (IParentalControlsCacheCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            String string = parcel.readString();
            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            updateCache(string, arrayListCreateTypedArrayList, i3);
            return true;
        }
    }

    void updateCache(String str, List<Uri> list, int i);
}
