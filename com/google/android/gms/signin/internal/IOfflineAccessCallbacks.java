package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.ISignInService;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOfflineAccessCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOfflineAccessCallbacks {
        static final int TRANSACTION_checkServerAuthorization = 2;
        static final int TRANSACTION_uploadServerAuthCode = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOfflineAccessCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
            }

            @Override // com.google.android.gms.signin.internal.IOfflineAccessCallbacks
            public void checkServerAuthorization(String str, List<Scope> list, ISignInService iSignInService) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSignInService);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.IOfflineAccessCallbacks
            public void uploadServerAuthCode(String str, String str2, ISignInService iSignInService) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSignInService);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
        }

        public static IOfflineAccessCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
            return iInterfaceQueryLocalInterface instanceof IOfflineAccessCallbacks ? (IOfflineAccessCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                String string = parcel.readString();
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Scope.CREATOR);
                ISignInService iSignInServiceAsInterface = ISignInService.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                checkServerAuthorization(string, arrayListCreateTypedArrayList, iSignInServiceAsInterface);
            } else {
                if (i != 3) {
                    return false;
                }
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                ISignInService iSignInServiceAsInterface2 = ISignInService.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                uploadServerAuthCode(string2, string3, iSignInServiceAsInterface2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void checkServerAuthorization(String str, List<Scope> list, ISignInService iSignInService);

    void uploadServerAuthCode(String str, String str2, ISignInService iSignInService);
}
