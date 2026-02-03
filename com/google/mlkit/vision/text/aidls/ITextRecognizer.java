package com.google.mlkit.vision.text.aidls;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.vision.text.internal.client.LineBoxParcel;
import defpackage.evay;
import defpackage.evbg;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface ITextRecognizer extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITextRecognizer {
        static final int TRANSACTION_init = 1;
        static final int TRANSACTION_process = 3;
        static final int TRANSACTION_recognizeBitmap = 4;
        static final int TRANSACTION_release = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITextRecognizer {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.mlkit.vision.text.aidls.ITextRecognizer");
            }

            @Override // com.google.mlkit.vision.text.aidls.ITextRecognizer
            public void init() {
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.mlkit.vision.text.aidls.ITextRecognizer
            public evbg process(IObjectWrapper iObjectWrapper, evay evayVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.d(parcelObtainAndWriteInterfaceToken, evayVar);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                evbg evbgVar = (evbg) sgh.a(parcelTransactAndReadException, evbg.CREATOR);
                parcelTransactAndReadException.recycle();
                return evbgVar;
            }

            @Override // com.google.mlkit.vision.text.aidls.ITextRecognizer
            public LineBoxParcel[] recognizeBitmap(IObjectWrapper iObjectWrapper, evay evayVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.d(parcelObtainAndWriteInterfaceToken, evayVar);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                LineBoxParcel[] lineBoxParcelArr = (LineBoxParcel[]) parcelTransactAndReadException.createTypedArray(LineBoxParcel.CREATOR);
                parcelTransactAndReadException.recycle();
                return lineBoxParcelArr;
            }

            @Override // com.google.mlkit.vision.text.aidls.ITextRecognizer
            public void release() {
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.mlkit.vision.text.aidls.ITextRecognizer");
        }

        public static ITextRecognizer asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
            return iInterfaceQueryLocalInterface instanceof ITextRecognizer ? (ITextRecognizer) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                init();
                parcel2.writeNoException();
            } else if (i == 2) {
                release();
                parcel2.writeNoException();
            } else if (i == 3) {
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                evay evayVar = (evay) sgh.a(parcel, evay.CREATOR);
                enforceNoDataAvail(parcel);
                evbg evbgVarProcess = process(iObjectWrapperAsInterface, evayVar);
                parcel2.writeNoException();
                sgh.e(parcel2, evbgVarProcess);
            } else {
                if (i != 4) {
                    return false;
                }
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                evay evayVar2 = (evay) sgh.a(parcel, evay.CREATOR);
                enforceNoDataAvail(parcel);
                LineBoxParcel[] lineBoxParcelArrRecognizeBitmap = recognizeBitmap(iObjectWrapperAsInterface2, evayVar2);
                parcel2.writeNoException();
                parcel2.writeTypedArray(lineBoxParcelArrRecognizeBitmap, 1);
            }
            return true;
        }
    }

    void init();

    evbg process(IObjectWrapper iObjectWrapper, evay evayVar);

    LineBoxParcel[] recognizeBitmap(IObjectWrapper iObjectWrapper, evay evayVar);

    void release();
}
