package com.google.mlkit.vision.text.aidls;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.mlkit.vision.text.aidls.ITextRecognizer;
import defpackage.evbi;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface ITextRecognizerCreator extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITextRecognizerCreator {
        static final int TRANSACTION_newTextRecognizer = 1;
        static final int TRANSACTION_newTextRecognizerWithOptions = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITextRecognizerCreator {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
            }

            @Override // com.google.mlkit.vision.text.aidls.ITextRecognizerCreator
            public ITextRecognizer newTextRecognizer(IObjectWrapper iObjectWrapper) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                ITextRecognizer iTextRecognizerAsInterface = ITextRecognizer.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iTextRecognizerAsInterface;
            }

            @Override // com.google.mlkit.vision.text.aidls.ITextRecognizerCreator
            public ITextRecognizer newTextRecognizerWithOptions(IObjectWrapper iObjectWrapper, evbi evbiVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.d(parcelObtainAndWriteInterfaceToken, evbiVar);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                ITextRecognizer iTextRecognizerAsInterface = ITextRecognizer.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iTextRecognizerAsInterface;
            }
        }

        public Stub() {
            super("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
        }

        public static ITextRecognizerCreator asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
            return iInterfaceQueryLocalInterface instanceof ITextRecognizerCreator ? (ITextRecognizerCreator) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ITextRecognizer iTextRecognizerNewTextRecognizer = newTextRecognizer(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                sgh.f(parcel2, iTextRecognizerNewTextRecognizer);
            } else {
                if (i != 2) {
                    return false;
                }
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                evbi evbiVar = (evbi) sgh.a(parcel, evbi.CREATOR);
                enforceNoDataAvail(parcel);
                ITextRecognizer iTextRecognizerNewTextRecognizerWithOptions = newTextRecognizerWithOptions(iObjectWrapperAsInterface2, evbiVar);
                parcel2.writeNoException();
                sgh.f(parcel2, iTextRecognizerNewTextRecognizerWithOptions);
            }
            return true;
        }
    }

    ITextRecognizer newTextRecognizer(IObjectWrapper iObjectWrapper);

    ITextRecognizer newTextRecognizerWithOptions(IObjectWrapper iObjectWrapper, evbi evbiVar);
}
