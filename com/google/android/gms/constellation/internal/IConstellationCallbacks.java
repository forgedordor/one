package com.google.android.gms.constellation.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.constellation.GetIidTokenResponse;
import com.google.android.gms.constellation.GetPnvCapabilitiesResponse;
import com.google.android.gms.constellation.PhoneNumberInfo;
import com.google.android.gms.constellation.VerifyPhoneNumberResponse;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IConstellationCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IConstellationCallbacks {
        static final int TRANSACTION_onGetPnvCapabilitiesCompleted = 4;
        static final int TRANSACTION_onIidTokenGenerated = 3;
        static final int TRANSACTION_onPhoneNumberVerificationsCompleted = 2;
        static final int TRANSACTION_onPhoneNumberVerified = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IConstellationCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.constellation.internal.IConstellationCallbacks");
            }

            @Override // com.google.android.gms.constellation.internal.IConstellationCallbacks
            public void onGetPnvCapabilitiesCompleted(Status status, GetPnvCapabilitiesResponse getPnvCapabilitiesResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, getPnvCapabilitiesResponse);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.constellation.internal.IConstellationCallbacks
            public void onIidTokenGenerated(Status status, GetIidTokenResponse getIidTokenResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, getIidTokenResponse);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.constellation.internal.IConstellationCallbacks
            public void onPhoneNumberVerificationsCompleted(Status status, VerifyPhoneNumberResponse verifyPhoneNumberResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, verifyPhoneNumberResponse);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.constellation.internal.IConstellationCallbacks
            public void onPhoneNumberVerified(Status status, List<PhoneNumberInfo> list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.constellation.internal.IConstellationCallbacks");
        }

        public static IConstellationCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.constellation.internal.IConstellationCallbacks");
            return iInterfaceQueryLocalInterface instanceof IConstellationCallbacks ? (IConstellationCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) sgh.a(parcel, Status.CREATOR);
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(PhoneNumberInfo.CREATOR);
                enforceNoDataAvail(parcel);
                onPhoneNumberVerified(status, arrayListCreateTypedArrayList);
            } else if (i == 2) {
                Status status2 = (Status) sgh.a(parcel, Status.CREATOR);
                VerifyPhoneNumberResponse verifyPhoneNumberResponse = (VerifyPhoneNumberResponse) sgh.a(parcel, VerifyPhoneNumberResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onPhoneNumberVerificationsCompleted(status2, verifyPhoneNumberResponse);
            } else if (i == 3) {
                Status status3 = (Status) sgh.a(parcel, Status.CREATOR);
                GetIidTokenResponse getIidTokenResponse = (GetIidTokenResponse) sgh.a(parcel, GetIidTokenResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onIidTokenGenerated(status3, getIidTokenResponse);
            } else {
                if (i != 4) {
                    return false;
                }
                Status status4 = (Status) sgh.a(parcel, Status.CREATOR);
                GetPnvCapabilitiesResponse getPnvCapabilitiesResponse = (GetPnvCapabilitiesResponse) sgh.a(parcel, GetPnvCapabilitiesResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onGetPnvCapabilitiesCompleted(status4, getPnvCapabilitiesResponse);
            }
            return true;
        }
    }

    void onGetPnvCapabilitiesCompleted(Status status, GetPnvCapabilitiesResponse getPnvCapabilitiesResponse);

    void onIidTokenGenerated(Status status, GetIidTokenResponse getIidTokenResponse);

    void onPhoneNumberVerificationsCompleted(Status status, VerifyPhoneNumberResponse verifyPhoneNumberResponse);

    void onPhoneNumberVerified(Status status, List<PhoneNumberInfo> list);
}
