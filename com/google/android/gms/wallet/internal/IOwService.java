package com.google.android.gms.wallet.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentRequest;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.WebPaymentDataRequest;
import com.google.android.gms.wallet.firstparty.ExecuteBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenRequest;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.InitializeBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysRequest;
import com.google.android.gms.wallet.firstparty.WarmUpUiProcessRequest;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsRequest;
import com.google.android.gms.wallet.firstparty.saveinstrument.SaveInstrumentRequest;
import com.google.android.gms.wallet.firstparty.setupwizard.GetSetupWizardIntentRequest;
import com.google.android.gms.wallet.internal.IWalletServiceCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOwService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOwService {
        static final int TRANSACTION_changeMaskedWallet = 3;
        static final int TRANSACTION_checkForPreAuthorization = 5;
        static final int TRANSACTION_createWalletObjects = 6;
        static final int TRANSACTION_executeBuyFlow = 16;
        static final int TRANSACTION_getBuyFlowInitializationToken = 12;
        static final int TRANSACTION_getClientToken = 15;
        static final int TRANSACTION_getFullWallet = 2;
        static final int TRANSACTION_getInstrumentAvailability = 25;
        static final int TRANSACTION_getMaskedWalletForPreauthorizedBuyer = 1;
        static final int TRANSACTION_getPaymentCardRecognitionIntent = 24;
        static final int TRANSACTION_getSaveInstrumentDetails = 20;
        static final int TRANSACTION_getSetupWizardIntent = 23;
        static final int TRANSACTION_initializeBuyFlow = 13;
        static final int TRANSACTION_isNewUser = 11;
        static final int TRANSACTION_isReadyToPay = 14;
        static final int TRANSACTION_loadPaymentData = 19;
        static final int TRANSACTION_loadWebPaymentData = 17;
        static final int TRANSACTION_notifyTransactionStatus = 4;
        static final int TRANSACTION_saveInstrument = 18;
        static final int TRANSACTION_setUpBiometricAuthenticationKeys = 21;
        static final int TRANSACTION_trackWalletFragmentButtonClicked = 10;
        static final int TRANSACTION_trackWalletFragmentButtonInitialized = 9;
        static final int TRANSACTION_warmUpUiProcess = 22;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOwService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.wallet.internal.IOwService");
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void changeMaskedWallet(String str, String str2, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void checkForPreAuthorization(Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void createWalletObjects(CreateWalletObjectsRequest createWalletObjectsRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, createWalletObjectsRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void executeBuyFlow(ExecuteBuyFlowRequest executeBuyFlowRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, executeBuyFlowRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(16, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void getBuyFlowInitializationToken(GetBuyFlowInitializationTokenRequest getBuyFlowInitializationTokenRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getBuyFlowInitializationTokenRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(12, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void getClientToken(GetClientTokenRequest getClientTokenRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getClientTokenRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(15, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void getFullWallet(FullWalletRequest fullWalletRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, fullWalletRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void getInstrumentAvailability(Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(25, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void getMaskedWalletForPreauthorizedBuyer(MaskedWalletRequest maskedWalletRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, maskedWalletRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void getPaymentCardRecognitionIntent(PaymentCardRecognitionIntentRequest paymentCardRecognitionIntentRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, paymentCardRecognitionIntentRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(24, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void getSaveInstrumentDetails(GetSaveInstrumentDetailsRequest getSaveInstrumentDetailsRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getSaveInstrumentDetailsRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(20, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void getSetupWizardIntent(GetSetupWizardIntentRequest getSetupWizardIntentRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getSetupWizardIntentRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(23, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void initializeBuyFlow(InitializeBuyFlowRequest initializeBuyFlowRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, initializeBuyFlowRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(13, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void isNewUser(Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void isReadyToPay(IsReadyToPayRequest isReadyToPayRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, isReadyToPayRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(14, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void loadPaymentData(PaymentDataRequest paymentDataRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, paymentDataRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(19, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void loadWebPaymentData(WebPaymentDataRequest webPaymentDataRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, webPaymentDataRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(17, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void notifyTransactionStatus(NotifyTransactionStatusRequest notifyTransactionStatusRequest, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, notifyTransactionStatusRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void saveInstrument(SaveInstrumentRequest saveInstrumentRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, saveInstrumentRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(18, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void setUpBiometricAuthenticationKeys(SetUpBiometricAuthenticationKeysRequest setUpBiometricAuthenticationKeysRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, setUpBiometricAuthenticationKeysRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(21, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void trackWalletFragmentButtonClicked(Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void trackWalletFragmentButtonInitialized(Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.internal.IOwService
            public void warmUpUiProcess(WarmUpUiProcessRequest warmUpUiProcessRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, warmUpUiProcessRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.f(parcelObtainAndWriteInterfaceToken, iWalletServiceCallbacks);
                transactOneway(22, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.wallet.internal.IOwService");
        }

        public static IOwService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
            return iInterfaceQueryLocalInterface instanceof IOwService ? (IOwService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    MaskedWalletRequest maskedWalletRequest = (MaskedWalletRequest) sgh.a(parcel, MaskedWalletRequest.CREATOR);
                    Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks iWalletServiceCallbacksAsInterface = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getMaskedWalletForPreauthorizedBuyer(maskedWalletRequest, bundle, iWalletServiceCallbacksAsInterface);
                    return true;
                case 2:
                    FullWalletRequest fullWalletRequest = (FullWalletRequest) sgh.a(parcel, FullWalletRequest.CREATOR);
                    Bundle bundle2 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks iWalletServiceCallbacksAsInterface2 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getFullWallet(fullWalletRequest, bundle2, iWalletServiceCallbacksAsInterface2);
                    return true;
                case 3:
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    Bundle bundle3 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks iWalletServiceCallbacksAsInterface3 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    changeMaskedWallet(string, string2, bundle3, iWalletServiceCallbacksAsInterface3);
                    return true;
                case 4:
                    NotifyTransactionStatusRequest notifyTransactionStatusRequest = (NotifyTransactionStatusRequest) sgh.a(parcel, NotifyTransactionStatusRequest.CREATOR);
                    Bundle bundle4 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    notifyTransactionStatus(notifyTransactionStatusRequest, bundle4);
                    return true;
                case 5:
                    Bundle bundle5 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks iWalletServiceCallbacksAsInterface4 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    checkForPreAuthorization(bundle5, iWalletServiceCallbacksAsInterface4);
                    return true;
                case 6:
                    CreateWalletObjectsRequest createWalletObjectsRequest = (CreateWalletObjectsRequest) sgh.a(parcel, CreateWalletObjectsRequest.CREATOR);
                    Bundle bundle6 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks iWalletServiceCallbacksAsInterface5 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    createWalletObjects(createWalletObjectsRequest, bundle6, iWalletServiceCallbacksAsInterface5);
                    return true;
                case 7:
                case 8:
                default:
                    return false;
                case 9:
                    Bundle bundle7 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    trackWalletFragmentButtonInitialized(bundle7);
                    return true;
                case 10:
                    Bundle bundle8 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    trackWalletFragmentButtonClicked(bundle8);
                    return true;
                case 11:
                    Bundle bundle9 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks iWalletServiceCallbacksAsInterface6 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    isNewUser(bundle9, iWalletServiceCallbacksAsInterface6);
                    return true;
                case 12:
                    GetBuyFlowInitializationTokenRequest getBuyFlowInitializationTokenRequest = (GetBuyFlowInitializationTokenRequest) sgh.a(parcel, GetBuyFlowInitializationTokenRequest.CREATOR);
                    Bundle bundle10 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks iWalletServiceCallbacksAsInterface7 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getBuyFlowInitializationToken(getBuyFlowInitializationTokenRequest, bundle10, iWalletServiceCallbacksAsInterface7);
                    return true;
                case 13:
                    InitializeBuyFlowRequest initializeBuyFlowRequest = (InitializeBuyFlowRequest) sgh.a(parcel, InitializeBuyFlowRequest.CREATOR);
                    Bundle bundle11 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks iWalletServiceCallbacksAsInterface8 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    initializeBuyFlow(initializeBuyFlowRequest, bundle11, iWalletServiceCallbacksAsInterface8);
                    return true;
                case 14:
                    IsReadyToPayRequest isReadyToPayRequest = (IsReadyToPayRequest) sgh.a(parcel, IsReadyToPayRequest.CREATOR);
                    Bundle bundle12 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks iWalletServiceCallbacksAsInterface9 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    isReadyToPay(isReadyToPayRequest, bundle12, iWalletServiceCallbacksAsInterface9);
                    return true;
                case 15:
                    GetClientTokenRequest getClientTokenRequest = (GetClientTokenRequest) sgh.a(parcel, GetClientTokenRequest.CREATOR);
                    Bundle bundle13 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks iWalletServiceCallbacksAsInterface10 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getClientToken(getClientTokenRequest, bundle13, iWalletServiceCallbacksAsInterface10);
                    return true;
                case 16:
                    ExecuteBuyFlowRequest executeBuyFlowRequest = (ExecuteBuyFlowRequest) sgh.a(parcel, ExecuteBuyFlowRequest.CREATOR);
                    Bundle bundle14 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks iWalletServiceCallbacksAsInterface11 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    executeBuyFlow(executeBuyFlowRequest, bundle14, iWalletServiceCallbacksAsInterface11);
                    return true;
                case 17:
                    WebPaymentDataRequest webPaymentDataRequest = (WebPaymentDataRequest) sgh.a(parcel, WebPaymentDataRequest.CREATOR);
                    Bundle bundle15 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks iWalletServiceCallbacksAsInterface12 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    loadWebPaymentData(webPaymentDataRequest, bundle15, iWalletServiceCallbacksAsInterface12);
                    return true;
                case 18:
                    SaveInstrumentRequest saveInstrumentRequest = (SaveInstrumentRequest) sgh.a(parcel, SaveInstrumentRequest.CREATOR);
                    Bundle bundle16 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks iWalletServiceCallbacksAsInterface13 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    saveInstrument(saveInstrumentRequest, bundle16, iWalletServiceCallbacksAsInterface13);
                    return true;
                case 19:
                    PaymentDataRequest paymentDataRequest = (PaymentDataRequest) sgh.a(parcel, PaymentDataRequest.CREATOR);
                    Bundle bundle17 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks iWalletServiceCallbacksAsInterface14 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    loadPaymentData(paymentDataRequest, bundle17, iWalletServiceCallbacksAsInterface14);
                    return true;
                case 20:
                    GetSaveInstrumentDetailsRequest getSaveInstrumentDetailsRequest = (GetSaveInstrumentDetailsRequest) sgh.a(parcel, GetSaveInstrumentDetailsRequest.CREATOR);
                    Bundle bundle18 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks iWalletServiceCallbacksAsInterface15 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getSaveInstrumentDetails(getSaveInstrumentDetailsRequest, bundle18, iWalletServiceCallbacksAsInterface15);
                    return true;
                case 21:
                    SetUpBiometricAuthenticationKeysRequest setUpBiometricAuthenticationKeysRequest = (SetUpBiometricAuthenticationKeysRequest) sgh.a(parcel, SetUpBiometricAuthenticationKeysRequest.CREATOR);
                    Bundle bundle19 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks iWalletServiceCallbacksAsInterface16 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setUpBiometricAuthenticationKeys(setUpBiometricAuthenticationKeysRequest, bundle19, iWalletServiceCallbacksAsInterface16);
                    return true;
                case 22:
                    WarmUpUiProcessRequest warmUpUiProcessRequest = (WarmUpUiProcessRequest) sgh.a(parcel, WarmUpUiProcessRequest.CREATOR);
                    Bundle bundle20 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks iWalletServiceCallbacksAsInterface17 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    warmUpUiProcess(warmUpUiProcessRequest, bundle20, iWalletServiceCallbacksAsInterface17);
                    return true;
                case 23:
                    GetSetupWizardIntentRequest getSetupWizardIntentRequest = (GetSetupWizardIntentRequest) sgh.a(parcel, GetSetupWizardIntentRequest.CREATOR);
                    Bundle bundle21 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks iWalletServiceCallbacksAsInterface18 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getSetupWizardIntent(getSetupWizardIntentRequest, bundle21, iWalletServiceCallbacksAsInterface18);
                    return true;
                case 24:
                    PaymentCardRecognitionIntentRequest paymentCardRecognitionIntentRequest = (PaymentCardRecognitionIntentRequest) sgh.a(parcel, PaymentCardRecognitionIntentRequest.CREATOR);
                    Bundle bundle22 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks iWalletServiceCallbacksAsInterface19 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getPaymentCardRecognitionIntent(paymentCardRecognitionIntentRequest, bundle22, iWalletServiceCallbacksAsInterface19);
                    return true;
                case 25:
                    Bundle bundle23 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    IWalletServiceCallbacks iWalletServiceCallbacksAsInterface20 = IWalletServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getInstrumentAvailability(bundle23, iWalletServiceCallbacksAsInterface20);
                    return true;
            }
        }
    }

    void changeMaskedWallet(String str, String str2, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void checkForPreAuthorization(Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void createWalletObjects(CreateWalletObjectsRequest createWalletObjectsRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void executeBuyFlow(ExecuteBuyFlowRequest executeBuyFlowRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void getBuyFlowInitializationToken(GetBuyFlowInitializationTokenRequest getBuyFlowInitializationTokenRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void getClientToken(GetClientTokenRequest getClientTokenRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void getFullWallet(FullWalletRequest fullWalletRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void getInstrumentAvailability(Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void getMaskedWalletForPreauthorizedBuyer(MaskedWalletRequest maskedWalletRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void getPaymentCardRecognitionIntent(PaymentCardRecognitionIntentRequest paymentCardRecognitionIntentRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void getSaveInstrumentDetails(GetSaveInstrumentDetailsRequest getSaveInstrumentDetailsRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void getSetupWizardIntent(GetSetupWizardIntentRequest getSetupWizardIntentRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void initializeBuyFlow(InitializeBuyFlowRequest initializeBuyFlowRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void isNewUser(Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void isReadyToPay(IsReadyToPayRequest isReadyToPayRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void loadPaymentData(PaymentDataRequest paymentDataRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void loadWebPaymentData(WebPaymentDataRequest webPaymentDataRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void notifyTransactionStatus(NotifyTransactionStatusRequest notifyTransactionStatusRequest, Bundle bundle);

    void saveInstrument(SaveInstrumentRequest saveInstrumentRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void setUpBiometricAuthenticationKeys(SetUpBiometricAuthenticationKeysRequest setUpBiometricAuthenticationKeysRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);

    void trackWalletFragmentButtonClicked(Bundle bundle);

    void trackWalletFragmentButtonInitialized(Bundle bundle);

    void warmUpUiProcess(WarmUpUiProcessRequest warmUpUiProcessRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks);
}
