package com.google.android.gms.learning.internal.http;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IHttpRequestCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IHttpRequestCallback {
        static final int TRANSACTION_onResponseBody = 4;
        static final int TRANSACTION_onResponseBodyError = 5;
        static final int TRANSACTION_onResponseCompleted = 6;
        static final int TRANSACTION_onResponseError = 3;
        static final int TRANSACTION_onResponseStarted = 2;
        static final int TRANSACTION_readRequestBody = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IHttpRequestCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.http.IHttpRequestCallback");
            }

            @Override // com.google.android.gms.learning.internal.http.IHttpRequestCallback
            public boolean onResponseBody(byte[] bArr, int i, int i2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.learning.internal.http.IHttpRequestCallback
            public void onResponseBodyError(byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.http.IHttpRequestCallback
            public void onResponseCompleted() {
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.learning.internal.http.IHttpRequestCallback
            public void onResponseError(byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.http.IHttpRequestCallback
            public boolean onResponseStarted(byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.learning.internal.http.IHttpRequestCallback
            public boolean readRequestBody(byte[] bArr, long j, int[] iArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                parcelObtainAndWriteInterfaceToken.writeIntArray(iArr);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.readByteArray(bArr);
                parcelTransactAndReadException.readIntArray(iArr);
                parcelTransactAndReadException.recycle();
                return zG;
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.http.IHttpRequestCallback");
        }

        public static IHttpRequestCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.http.IHttpRequestCallback");
            return iInterfaceQueryLocalInterface instanceof IHttpRequestCallback ? (IHttpRequestCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    byte[] bArrCreateByteArray = parcel.createByteArray();
                    long j = parcel.readLong();
                    int[] iArrCreateIntArray = parcel.createIntArray();
                    enforceNoDataAvail(parcel);
                    boolean requestBody = readRequestBody(bArrCreateByteArray, j, iArrCreateIntArray);
                    parcel2.writeNoException();
                    int i3 = sgh.a;
                    parcel2.writeInt(requestBody ? 1 : 0);
                    parcel2.writeByteArray(bArrCreateByteArray);
                    parcel2.writeIntArray(iArrCreateIntArray);
                    return true;
                case 2:
                    byte[] bArrCreateByteArray2 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    boolean zOnResponseStarted = onResponseStarted(bArrCreateByteArray2);
                    parcel2.writeNoException();
                    int i4 = sgh.a;
                    parcel2.writeInt(zOnResponseStarted ? 1 : 0);
                    return true;
                case 3:
                    byte[] bArrCreateByteArray3 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    onResponseError(bArrCreateByteArray3);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    byte[] bArrCreateByteArray4 = parcel.createByteArray();
                    int i5 = parcel.readInt();
                    int i6 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    boolean zOnResponseBody = onResponseBody(bArrCreateByteArray4, i5, i6);
                    parcel2.writeNoException();
                    int i7 = sgh.a;
                    parcel2.writeInt(zOnResponseBody ? 1 : 0);
                    return true;
                case 5:
                    byte[] bArrCreateByteArray5 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    onResponseBodyError(bArrCreateByteArray5);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    onResponseCompleted();
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean onResponseBody(byte[] bArr, int i, int i2);

    void onResponseBodyError(byte[] bArr);

    void onResponseCompleted();

    void onResponseError(byte[] bArr);

    boolean onResponseStarted(byte[] bArr);

    boolean readRequestBody(byte[] bArr, long j, int[] iArr);
}
