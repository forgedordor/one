package com.google.android.ims.rcs.engine;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IRcsEngineTemporaryController extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IRcsEngineTemporaryController {
        static final int TRANSACTION_triggerStartRcsStack = 1;
        static final int TRANSACTION_triggerStopRcsStack = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IRcsEngineTemporaryController {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcs.engine.IRcsEngineTemporaryController");
            }

            @Override // com.google.android.ims.rcs.engine.IRcsEngineTemporaryController
            public void triggerStartRcsStack(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.rcs.engine.IRcsEngineTemporaryController
            public void triggerStopRcsStack(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.ims.rcs.engine.IRcsEngineTemporaryController");
        }

        public static IRcsEngineTemporaryController asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcs.engine.IRcsEngineTemporaryController");
            return iInterfaceQueryLocalInterface instanceof IRcsEngineTemporaryController ? (IRcsEngineTemporaryController) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                String string = parcel.readString();
                enforceNoDataAvail(parcel);
                triggerStartRcsStack(string);
            } else {
                if (i != 2) {
                    return false;
                }
                String string2 = parcel.readString();
                enforceNoDataAvail(parcel);
                triggerStopRcsStack(string2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void triggerStartRcsStack(String str);

    void triggerStopRcsStack(String str);
}
