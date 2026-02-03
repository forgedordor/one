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
public interface ICommonTextRecognizerCreator extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICommonTextRecognizerCreator {
        static final int TRANSACTION_newTextRecognizerWithOptions = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICommonTextRecognizerCreator {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.mlkit.vision.text.aidls.ICommonTextRecognizerCreator");
            }

            @Override // com.google.mlkit.vision.text.aidls.ICommonTextRecognizerCreator
            public ITextRecognizer newTextRecognizerWithOptions(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, evbi evbiVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper2);
                sgh.d(parcelObtainAndWriteInterfaceToken, evbiVar);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                ITextRecognizer iTextRecognizerAsInterface = ITextRecognizer.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iTextRecognizerAsInterface;
            }
        }

        public Stub() {
            super("com.google.mlkit.vision.text.aidls.ICommonTextRecognizerCreator");
        }

        public static ICommonTextRecognizerCreator asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ICommonTextRecognizerCreator");
            return iInterfaceQueryLocalInterface instanceof ICommonTextRecognizerCreator ? (ICommonTextRecognizerCreator) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            evbi evbiVar = (evbi) sgh.a(parcel, evbi.CREATOR);
            enforceNoDataAvail(parcel);
            ITextRecognizer iTextRecognizerNewTextRecognizerWithOptions = newTextRecognizerWithOptions(iObjectWrapperAsInterface, iObjectWrapperAsInterface2, evbiVar);
            parcel2.writeNoException();
            sgh.f(parcel2, iTextRecognizerNewTextRecognizerWithOptions);
            return true;
        }
    }

    ITextRecognizer newTextRecognizerWithOptions(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, evbi evbiVar);
}
