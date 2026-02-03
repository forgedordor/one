package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import defpackage.shr;
import defpackage.siq;
import defpackage.skc;
import defpackage.slc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IMockService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMockService {
        static final int TRANSACTION_queueImageDescriptionResult = 4;
        static final int TRANSACTION_queueLLMResult = 2;
        static final int TRANSACTION_queueRosieRobotResult = 5;
        static final int TRANSACTION_queueSummarizationResult = 3;
        static final int TRANSACTION_reset = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMockService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IMockService");
            }

            @Override // com.google.android.apps.aicore.aidl.IMockService
            public void queueImageDescriptionResult(shr shrVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, shrVar);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IMockService
            public void queueLLMResult(siq siqVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, siqVar);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IMockService
            public void queueRosieRobotResult(skc skcVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, skcVar);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IMockService
            public void queueSummarizationResult(slc slcVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, slcVar);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IMockService
            public void reset() {
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IMockService");
        }

        public static IMockService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IMockService");
            return iInterfaceQueryLocalInterface instanceof IMockService ? (IMockService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                reset();
            } else if (i == 2) {
                siq siqVar = (siq) sgh.a(parcel, siq.CREATOR);
                enforceNoDataAvail(parcel);
                queueLLMResult(siqVar);
            } else if (i == 3) {
                slc slcVar = (slc) sgh.a(parcel, slc.CREATOR);
                enforceNoDataAvail(parcel);
                queueSummarizationResult(slcVar);
            } else if (i == 4) {
                shr shrVar = (shr) sgh.a(parcel, shr.CREATOR);
                enforceNoDataAvail(parcel);
                queueImageDescriptionResult(shrVar);
            } else {
                if (i != 5) {
                    return false;
                }
                skc skcVar = (skc) sgh.a(parcel, skc.CREATOR);
                enforceNoDataAvail(parcel);
                queueRosieRobotResult(skcVar);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void queueImageDescriptionResult(shr shrVar);

    void queueLLMResult(siq siqVar);

    void queueRosieRobotResult(skc skcVar);

    void queueSummarizationResult(slc slcVar);

    void reset();
}
