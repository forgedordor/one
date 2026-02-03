package com.google.android.ims.rcs.singleregistration;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface ISingleRegistrationVendorImsController extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISingleRegistrationVendorImsController {
        static final int TRANSACTION_setupVendorIms = 1;
        static final int TRANSACTION_terminateVendorIms = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISingleRegistrationVendorImsController {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController");
            }

            @Override // com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController
            public SingleRegistrationVendorImsServiceResult setupVendorIms(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                SingleRegistrationVendorImsServiceResult singleRegistrationVendorImsServiceResult = (SingleRegistrationVendorImsServiceResult) sgh.a(parcelTransactAndReadException, SingleRegistrationVendorImsServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return singleRegistrationVendorImsServiceResult;
            }

            @Override // com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController
            public SingleRegistrationVendorImsServiceResult terminateVendorIms(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                SingleRegistrationVendorImsServiceResult singleRegistrationVendorImsServiceResult = (SingleRegistrationVendorImsServiceResult) sgh.a(parcelTransactAndReadException, SingleRegistrationVendorImsServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return singleRegistrationVendorImsServiceResult;
            }
        }

        public Stub() {
            super("com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController");
        }

        public static ISingleRegistrationVendorImsController asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController");
            return iInterfaceQueryLocalInterface instanceof ISingleRegistrationVendorImsController ? (ISingleRegistrationVendorImsController) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                int i3 = parcel.readInt();
                enforceNoDataAvail(parcel);
                SingleRegistrationVendorImsServiceResult singleRegistrationVendorImsServiceResult = setupVendorIms(i3);
                parcel2.writeNoException();
                sgh.e(parcel2, singleRegistrationVendorImsServiceResult);
            } else {
                if (i != 2) {
                    return false;
                }
                int i4 = parcel.readInt();
                enforceNoDataAvail(parcel);
                SingleRegistrationVendorImsServiceResult singleRegistrationVendorImsServiceResultTerminateVendorIms = terminateVendorIms(i4);
                parcel2.writeNoException();
                sgh.e(parcel2, singleRegistrationVendorImsServiceResultTerminateVendorIms);
            }
            return true;
        }
    }

    SingleRegistrationVendorImsServiceResult setupVendorIms(int i);

    SingleRegistrationVendorImsServiceResult terminateVendorIms(int i);
}
