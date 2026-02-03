package com.google.android.gms.wallet.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.WebPaymentData;
import com.google.android.gms.wallet.button.GetInstrumentAvailabilityResponse;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenResponse;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysResponse;
import com.google.android.gms.wallet.firstparty.WarmUpUiProcessResponse;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsResponse;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IWalletServiceCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IWalletServiceCallbacks {
        static final int TRANSACTION_onBiometricAuthenticationKeysSetUp = 16;
        static final int TRANSACTION_onBuyFlowInitializationTokenReceived = 7;
        static final int TRANSACTION_onClientTokenReceived = 10;
        static final int TRANSACTION_onExecuteBuyFlowStatusReceived = 11;
        static final int TRANSACTION_onFullWalletLoaded = 2;
        static final int TRANSACTION_onGetInstrumentAvailabilityResponse = 20;
        static final int TRANSACTION_onGetSaveInstrumentDetailsResponse = 15;
        static final int TRANSACTION_onInitializeBuyFlowStatusReceived = 8;
        static final int TRANSACTION_onIsNewUserDetermined = 6;
        static final int TRANSACTION_onIsReadyToPayDetermined = 9;
        static final int TRANSACTION_onMaskedWalletLoaded = 1;
        static final int TRANSACTION_onPaymentCardRecognitionIntentResponseReceived = 19;
        static final int TRANSACTION_onPaymentDataLoaded = 14;
        static final int TRANSACTION_onPreAuthorizationDetermined = 3;
        static final int TRANSACTION_onSaveInstrumentStatusReceived = 13;
        static final int TRANSACTION_onSetupWizardIntentReceived = 18;
        static final int TRANSACTION_onWalletObjectsCreated = 4;
        static final int TRANSACTION_onWarmUpUiProcessResponseReceived = 17;
        static final int TRANSACTION_onWebPaymentDataLoaded = 12;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IWalletServiceCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onBiometricAuthenticationKeysSetUp(Status status, SetUpBiometricAuthenticationKeysResponse setUpBiometricAuthenticationKeysResponse, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, setUpBiometricAuthenticationKeysResponse);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(16, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onBuyFlowInitializationTokenReceived(Status status, GetBuyFlowInitializationTokenResponse getBuyFlowInitializationTokenResponse, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, getBuyFlowInitializationTokenResponse);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onClientTokenReceived(Status status, GetClientTokenResponse getClientTokenResponse, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, getClientTokenResponse);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onExecuteBuyFlowStatusReceived(Status status, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onFullWalletLoaded(int i, FullWallet fullWallet, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, fullWallet);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onGetInstrumentAvailabilityResponse(Status status, GetInstrumentAvailabilityResponse getInstrumentAvailabilityResponse, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, getInstrumentAvailabilityResponse);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(20, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onGetSaveInstrumentDetailsResponse(Status status, GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, getSaveInstrumentDetailsResponse);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(15, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onInitializeBuyFlowStatusReceived(Status status, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onIsNewUserDetermined(int i, boolean z, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                int i2 = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onIsReadyToPayDetermined(Status status, boolean z, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onMaskedWalletLoaded(int i, MaskedWallet maskedWallet, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, maskedWallet);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onPaymentCardRecognitionIntentResponseReceived(Status status, PaymentCardRecognitionIntentResponse paymentCardRecognitionIntentResponse, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, paymentCardRecognitionIntentResponse);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(19, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onPaymentDataLoaded(Status status, PaymentData paymentData, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, paymentData);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(14, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onPreAuthorizationDetermined(int i, boolean z, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                int i2 = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onSaveInstrumentStatusReceived(Status status, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(13, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onSetupWizardIntentReceived(int i, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(18, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onWalletObjectsCreated(int i, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onWarmUpUiProcessResponseReceived(Status status, WarmUpUiProcessResponse warmUpUiProcessResponse, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, warmUpUiProcessResponse);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(17, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
            public void onWebPaymentDataLoaded(Status status, WebPaymentData webPaymentData, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, webPaymentData);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(12, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
        }

        public static IWalletServiceCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            return iInterfaceQueryLocalInterface instanceof IWalletServiceCallbacks ? (IWalletServiceCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    int i3 = parcel.readInt();
                    MaskedWallet maskedWallet = (MaskedWallet) sgh.a(parcel, MaskedWallet.CREATOR);
                    Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onMaskedWalletLoaded(i3, maskedWallet, bundle);
                    return true;
                case 2:
                    int i4 = parcel.readInt();
                    FullWallet fullWallet = (FullWallet) sgh.a(parcel, FullWallet.CREATOR);
                    Bundle bundle2 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onFullWalletLoaded(i4, fullWallet, bundle2);
                    return true;
                case 3:
                    int i5 = parcel.readInt();
                    boolean zG = sgh.g(parcel);
                    Bundle bundle3 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onPreAuthorizationDetermined(i5, zG, bundle3);
                    return true;
                case 4:
                    int i6 = parcel.readInt();
                    Bundle bundle4 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onWalletObjectsCreated(i6, bundle4);
                    return true;
                case 5:
                default:
                    return false;
                case 6:
                    int i7 = parcel.readInt();
                    boolean zG2 = sgh.g(parcel);
                    Bundle bundle5 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onIsNewUserDetermined(i7, zG2, bundle5);
                    return true;
                case 7:
                    Status status = (Status) sgh.a(parcel, Status.CREATOR);
                    GetBuyFlowInitializationTokenResponse getBuyFlowInitializationTokenResponse = (GetBuyFlowInitializationTokenResponse) sgh.a(parcel, GetBuyFlowInitializationTokenResponse.CREATOR);
                    Bundle bundle6 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onBuyFlowInitializationTokenReceived(status, getBuyFlowInitializationTokenResponse, bundle6);
                    return true;
                case 8:
                    Status status2 = (Status) sgh.a(parcel, Status.CREATOR);
                    Bundle bundle7 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onInitializeBuyFlowStatusReceived(status2, bundle7);
                    return true;
                case 9:
                    Status status3 = (Status) sgh.a(parcel, Status.CREATOR);
                    boolean zG3 = sgh.g(parcel);
                    Bundle bundle8 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onIsReadyToPayDetermined(status3, zG3, bundle8);
                    return true;
                case 10:
                    Status status4 = (Status) sgh.a(parcel, Status.CREATOR);
                    GetClientTokenResponse getClientTokenResponse = (GetClientTokenResponse) sgh.a(parcel, GetClientTokenResponse.CREATOR);
                    Bundle bundle9 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onClientTokenReceived(status4, getClientTokenResponse, bundle9);
                    return true;
                case 11:
                    Status status5 = (Status) sgh.a(parcel, Status.CREATOR);
                    Bundle bundle10 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onExecuteBuyFlowStatusReceived(status5, bundle10);
                    return true;
                case 12:
                    Status status6 = (Status) sgh.a(parcel, Status.CREATOR);
                    WebPaymentData webPaymentData = (WebPaymentData) sgh.a(parcel, WebPaymentData.CREATOR);
                    Bundle bundle11 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onWebPaymentDataLoaded(status6, webPaymentData, bundle11);
                    return true;
                case 13:
                    Status status7 = (Status) sgh.a(parcel, Status.CREATOR);
                    Bundle bundle12 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSaveInstrumentStatusReceived(status7, bundle12);
                    return true;
                case 14:
                    Status status8 = (Status) sgh.a(parcel, Status.CREATOR);
                    PaymentData paymentData = (PaymentData) sgh.a(parcel, PaymentData.CREATOR);
                    Bundle bundle13 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onPaymentDataLoaded(status8, paymentData, bundle13);
                    return true;
                case 15:
                    Status status9 = (Status) sgh.a(parcel, Status.CREATOR);
                    GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse = (GetSaveInstrumentDetailsResponse) sgh.a(parcel, GetSaveInstrumentDetailsResponse.CREATOR);
                    Bundle bundle14 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetSaveInstrumentDetailsResponse(status9, getSaveInstrumentDetailsResponse, bundle14);
                    return true;
                case 16:
                    Status status10 = (Status) sgh.a(parcel, Status.CREATOR);
                    SetUpBiometricAuthenticationKeysResponse setUpBiometricAuthenticationKeysResponse = (SetUpBiometricAuthenticationKeysResponse) sgh.a(parcel, SetUpBiometricAuthenticationKeysResponse.CREATOR);
                    Bundle bundle15 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onBiometricAuthenticationKeysSetUp(status10, setUpBiometricAuthenticationKeysResponse, bundle15);
                    return true;
                case 17:
                    Status status11 = (Status) sgh.a(parcel, Status.CREATOR);
                    WarmUpUiProcessResponse warmUpUiProcessResponse = (WarmUpUiProcessResponse) sgh.a(parcel, WarmUpUiProcessResponse.CREATOR);
                    Bundle bundle16 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onWarmUpUiProcessResponseReceived(status11, warmUpUiProcessResponse, bundle16);
                    return true;
                case 18:
                    int i8 = parcel.readInt();
                    Bundle bundle17 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSetupWizardIntentReceived(i8, bundle17);
                    return true;
                case 19:
                    Status status12 = (Status) sgh.a(parcel, Status.CREATOR);
                    PaymentCardRecognitionIntentResponse paymentCardRecognitionIntentResponse = (PaymentCardRecognitionIntentResponse) sgh.a(parcel, PaymentCardRecognitionIntentResponse.CREATOR);
                    Bundle bundle18 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onPaymentCardRecognitionIntentResponseReceived(status12, paymentCardRecognitionIntentResponse, bundle18);
                    return true;
                case 20:
                    Status status13 = (Status) sgh.a(parcel, Status.CREATOR);
                    GetInstrumentAvailabilityResponse getInstrumentAvailabilityResponse = (GetInstrumentAvailabilityResponse) sgh.a(parcel, GetInstrumentAvailabilityResponse.CREATOR);
                    Bundle bundle19 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetInstrumentAvailabilityResponse(status13, getInstrumentAvailabilityResponse, bundle19);
                    return true;
            }
        }
    }

    void onBiometricAuthenticationKeysSetUp(Status status, SetUpBiometricAuthenticationKeysResponse setUpBiometricAuthenticationKeysResponse, Bundle bundle);

    void onBuyFlowInitializationTokenReceived(Status status, GetBuyFlowInitializationTokenResponse getBuyFlowInitializationTokenResponse, Bundle bundle);

    void onClientTokenReceived(Status status, GetClientTokenResponse getClientTokenResponse, Bundle bundle);

    void onExecuteBuyFlowStatusReceived(Status status, Bundle bundle);

    void onFullWalletLoaded(int i, FullWallet fullWallet, Bundle bundle);

    void onGetInstrumentAvailabilityResponse(Status status, GetInstrumentAvailabilityResponse getInstrumentAvailabilityResponse, Bundle bundle);

    void onGetSaveInstrumentDetailsResponse(Status status, GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse, Bundle bundle);

    void onInitializeBuyFlowStatusReceived(Status status, Bundle bundle);

    void onIsNewUserDetermined(int i, boolean z, Bundle bundle);

    void onIsReadyToPayDetermined(Status status, boolean z, Bundle bundle);

    void onMaskedWalletLoaded(int i, MaskedWallet maskedWallet, Bundle bundle);

    void onPaymentCardRecognitionIntentResponseReceived(Status status, PaymentCardRecognitionIntentResponse paymentCardRecognitionIntentResponse, Bundle bundle);

    void onPaymentDataLoaded(Status status, PaymentData paymentData, Bundle bundle);

    void onPreAuthorizationDetermined(int i, boolean z, Bundle bundle);

    void onSaveInstrumentStatusReceived(Status status, Bundle bundle);

    void onSetupWizardIntentReceived(int i, Bundle bundle);

    void onWalletObjectsCreated(int i, Bundle bundle);

    void onWarmUpUiProcessResponseReceived(Status status, WarmUpUiProcessResponse warmUpUiProcessResponse, Bundle bundle);

    void onWebPaymentDataLoaded(Status status, WebPaymentData webPaymentData, Bundle bundle);
}
