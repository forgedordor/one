package com.google.android.gms.googlehelp.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGoogleHelpCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGoogleHelpCallbacks {
        static final int TRANSACTION_onAsyncPsbdSaved = 8;
        static final int TRANSACTION_onAsyncPsdSaved = 7;
        static final int TRANSACTION_onC2cSupportRequestFailed = 12;
        static final int TRANSACTION_onC2cSupportRequestSuccess = 11;
        static final int TRANSACTION_onChatSupportRequestFailed = 10;
        static final int TRANSACTION_onChatSupportRequestSuccess = 9;
        static final int TRANSACTION_onEscalationOptionsReceived = 15;
        static final int TRANSACTION_onEscalationOptionsRequestFailed = 16;
        static final int TRANSACTION_onGoogleHelpProcessed = 1;
        static final int TRANSACTION_onInProductHelpProcessed = 17;
        static final int TRANSACTION_onPipClick = 4;
        static final int TRANSACTION_onPipInCallingAppDisabled = 6;
        static final int TRANSACTION_onPipInCallingAppHidden = 5;
        static final int TRANSACTION_onPipShown = 3;
        static final int TRANSACTION_onRealtimeSupportStatusRequestFailed = 19;
        static final int TRANSACTION_onRealtimeSupportStatusSuccess = 18;
        static final int TRANSACTION_onSuggestionsReceived = 13;
        static final int TRANSACTION_onSuggestionsRequestFailed = 14;
        static final int TRANSACTION_onTogglingPipProcessed = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGoogleHelpCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
            public void onAsyncPsbdSaved() {
                transactOneway(8, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
            public void onAsyncPsdSaved() {
                transactOneway(7, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
            public void onC2cSupportRequestFailed() {
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
            public void onC2cSupportRequestSuccess() {
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
            public void onChatSupportRequestFailed() {
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
            public void onChatSupportRequestSuccess(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
            public void onEscalationOptionsReceived(byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(15, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
            public void onEscalationOptionsRequestFailed() {
                transactAndReadExceptionReturnVoid(16, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
            public void onGoogleHelpProcessed(GoogleHelp googleHelp) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, googleHelp);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
            public void onInProductHelpProcessed(InProductHelp inProductHelp) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, inProductHelp);
                transactAndReadExceptionReturnVoid(17, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
            public void onPipClick() {
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
            public void onPipInCallingAppDisabled() {
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
            public void onPipInCallingAppHidden() {
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
            public void onPipShown() {
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
            public void onRealtimeSupportStatusRequestFailed() {
                transactAndReadExceptionReturnVoid(19, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
            public void onRealtimeSupportStatusSuccess(byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(18, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
            public void onSuggestionsReceived(byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(13, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
            public void onSuggestionsRequestFailed() {
                transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
            public void onTogglingPipProcessed(TogglingData togglingData) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, togglingData);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
        }

        public static IGoogleHelpCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
            return iInterfaceQueryLocalInterface instanceof IGoogleHelpCallbacks ? (IGoogleHelpCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    GoogleHelp googleHelp = (GoogleHelp) sgh.a(parcel, GoogleHelp.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGoogleHelpProcessed(googleHelp);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    TogglingData togglingData = (TogglingData) sgh.a(parcel, TogglingData.CREATOR);
                    enforceNoDataAvail(parcel);
                    onTogglingPipProcessed(togglingData);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    onPipShown();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    onPipClick();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    onPipInCallingAppHidden();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    onPipInCallingAppDisabled();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    onAsyncPsdSaved();
                    return true;
                case 8:
                    onAsyncPsbdSaved();
                    return true;
                case 9:
                    int i3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    onChatSupportRequestSuccess(i3);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    onChatSupportRequestFailed();
                    parcel2.writeNoException();
                    return true;
                case 11:
                    onC2cSupportRequestSuccess();
                    parcel2.writeNoException();
                    return true;
                case 12:
                    onC2cSupportRequestFailed();
                    parcel2.writeNoException();
                    return true;
                case 13:
                    byte[] bArrCreateByteArray = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    onSuggestionsReceived(bArrCreateByteArray);
                    parcel2.writeNoException();
                    return true;
                case 14:
                    onSuggestionsRequestFailed();
                    parcel2.writeNoException();
                    return true;
                case 15:
                    byte[] bArrCreateByteArray2 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    onEscalationOptionsReceived(bArrCreateByteArray2);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    onEscalationOptionsRequestFailed();
                    parcel2.writeNoException();
                    return true;
                case 17:
                    InProductHelp inProductHelp = (InProductHelp) sgh.a(parcel, InProductHelp.CREATOR);
                    enforceNoDataAvail(parcel);
                    onInProductHelpProcessed(inProductHelp);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    byte[] bArrCreateByteArray3 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    onRealtimeSupportStatusSuccess(bArrCreateByteArray3);
                    parcel2.writeNoException();
                    return true;
                case 19:
                    onRealtimeSupportStatusRequestFailed();
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    void onAsyncPsbdSaved();

    void onAsyncPsdSaved();

    void onC2cSupportRequestFailed();

    void onC2cSupportRequestSuccess();

    void onChatSupportRequestFailed();

    void onChatSupportRequestSuccess(int i);

    void onEscalationOptionsReceived(byte[] bArr);

    void onEscalationOptionsRequestFailed();

    void onGoogleHelpProcessed(GoogleHelp googleHelp);

    void onInProductHelpProcessed(InProductHelp inProductHelp);

    void onPipClick();

    void onPipInCallingAppDisabled();

    void onPipInCallingAppHidden();

    void onPipShown();

    void onRealtimeSupportStatusRequestFailed();

    void onRealtimeSupportStatusSuccess(byte[] bArr);

    void onSuggestionsReceived(byte[] bArr);

    void onSuggestionsRequestFailed();

    void onTogglingPipProcessed(TogglingData togglingData);
}
