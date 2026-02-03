package com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.IBooleanCallback;
import com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreCallbacks;
import com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.IStatusCallback;
import defpackage.dhzd;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface ISafetyCoreService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISafetyCoreService {
        static final int TRANSACTION_classifyImageFileDescriptor = 4;
        static final int TRANSACTION_classifyVideoFileDescriptor = 6;
        static final int TRANSACTION_isClassifierAvailable = 5;
        static final int TRANSACTION_prewarm = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISafetyCoreService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreService");
            }

            @Override // com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreService
            public void classifyImageFileDescriptor(int i, ParcelFileDescriptor parcelFileDescriptor, ISafetyCoreCallbacks iSafetyCoreCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, parcelFileDescriptor);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSafetyCoreCallbacks);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreService
            public void classifyVideoFileDescriptor(int i, ParcelFileDescriptor parcelFileDescriptor, dhzd dhzdVar, ISafetyCoreCallbacks iSafetyCoreCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, parcelFileDescriptor);
                sgh.d(parcelObtainAndWriteInterfaceToken, dhzdVar);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSafetyCoreCallbacks);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreService
            public void isClassifierAvailable(int i, IBooleanCallback iBooleanCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.f(parcelObtainAndWriteInterfaceToken, iBooleanCallback);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreService
            public void prewarm(int[] iArr, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeIntArray(iArr);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreService");
        }

        public static ISafetyCoreService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreService");
            return iInterfaceQueryLocalInterface instanceof ISafetyCoreService ? (ISafetyCoreService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 3) {
                int[] iArrCreateIntArray = parcel.createIntArray();
                IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                prewarm(iArrCreateIntArray, iStatusCallbackAsInterface);
            } else if (i == 4) {
                int i3 = parcel.readInt();
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) sgh.a(parcel, ParcelFileDescriptor.CREATOR);
                ISafetyCoreCallbacks iSafetyCoreCallbacksAsInterface = ISafetyCoreCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                classifyImageFileDescriptor(i3, parcelFileDescriptor, iSafetyCoreCallbacksAsInterface);
            } else if (i == 5) {
                int i4 = parcel.readInt();
                IBooleanCallback iBooleanCallbackAsInterface = IBooleanCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                isClassifierAvailable(i4, iBooleanCallbackAsInterface);
            } else {
                if (i != 6) {
                    return false;
                }
                int i5 = parcel.readInt();
                ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) sgh.a(parcel, ParcelFileDescriptor.CREATOR);
                dhzd dhzdVar = (dhzd) sgh.a(parcel, dhzd.CREATOR);
                ISafetyCoreCallbacks iSafetyCoreCallbacksAsInterface2 = ISafetyCoreCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                classifyVideoFileDescriptor(i5, parcelFileDescriptor2, dhzdVar, iSafetyCoreCallbacksAsInterface2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void classifyImageFileDescriptor(int i, ParcelFileDescriptor parcelFileDescriptor, ISafetyCoreCallbacks iSafetyCoreCallbacks);

    void classifyVideoFileDescriptor(int i, ParcelFileDescriptor parcelFileDescriptor, dhzd dhzdVar, ISafetyCoreCallbacks iSafetyCoreCallbacks);

    void isClassifierAvailable(int i, IBooleanCallback iBooleanCallback);

    void prewarm(int[] iArr, IStatusCallback iStatusCallback);
}
