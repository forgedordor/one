package com.google.android.gms.auth.api.credentials.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.internal.IBundleCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ICredentialsInternalService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICredentialsInternalService {
        static final int TRANSACTION_disableYoloSaveDialogForApp = 12;
        static final int TRANSACTION_getAccountSettings = 6;
        static final int TRANSACTION_getFullCredential = 3;
        static final int TRANSACTION_listCredentialsForEnabledAccounts = 1;
        static final int TRANSACTION_listHints = 2;
        static final int TRANSACTION_requestIdToken = 4;
        static final int TRANSACTION_saveCredential = 5;
        static final int TRANSACTION_setAppNeverSave = 11;
        static final int TRANSACTION_setAutoSignInEnabled = 9;
        static final int TRANSACTION_setAutoSignInEnabledForApp = 10;
        static final int TRANSACTION_setIsFirstTimeWelcomeShown = 7;
        static final int TRANSACTION_setServiceEnabled = 8;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICredentialsInternalService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService");
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService
            public void disableYoloSaveDialogForApp(IBundleCallbacks iBundleCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iBundleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService
            public void getAccountSettings(IBundleCallbacks iBundleCallbacks, Account account) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iBundleCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService
            public void getFullCredential(IBundleCallbacks iBundleCallbacks, Account account, String str, Credential credential, boolean z, String str2, String str3) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iBundleCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, credential);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService
            public void listCredentialsForEnabledAccounts(IBundleCallbacks iBundleCallbacks, String str, CredentialRequest credentialRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iBundleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, credentialRequest);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService
            public void listHints(IBundleCallbacks iBundleCallbacks, HintRequest hintRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iBundleCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, hintRequest);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService
            public void requestIdToken(IBundleCallbacks iBundleCallbacks, Account account, String str, String str2, String str3) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iBundleCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService
            public void saveCredential(IBundleCallbacks iBundleCallbacks, Account account, String str, Credential credential) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iBundleCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, credential);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService
            public void setAppNeverSave(IBundleCallbacks iBundleCallbacks, Account account, String str, boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iBundleCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService
            public void setAutoSignInEnabled(IBundleCallbacks iBundleCallbacks, Account account, boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iBundleCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService
            public void setAutoSignInEnabledForApp(IBundleCallbacks iBundleCallbacks, String str, boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iBundleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService
            public void setIsFirstTimeWelcomeShown(IBundleCallbacks iBundleCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iBundleCallbacks);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService
            public void setServiceEnabled(IBundleCallbacks iBundleCallbacks, Account account, boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iBundleCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService");
        }

        public static ICredentialsInternalService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService");
            return iInterfaceQueryLocalInterface instanceof ICredentialsInternalService ? (ICredentialsInternalService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IBundleCallbacks iBundleCallbacksAsInterface = IBundleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string = parcel.readString();
                    CredentialRequest credentialRequest = (CredentialRequest) sgh.a(parcel, CredentialRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    listCredentialsForEnabledAccounts(iBundleCallbacksAsInterface, string, credentialRequest);
                    break;
                case 2:
                    IBundleCallbacks iBundleCallbacksAsInterface2 = IBundleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    HintRequest hintRequest = (HintRequest) sgh.a(parcel, HintRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    listHints(iBundleCallbacksAsInterface2, hintRequest);
                    break;
                case 3:
                    IBundleCallbacks iBundleCallbacksAsInterface3 = IBundleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account = (Account) sgh.a(parcel, Account.CREATOR);
                    String string2 = parcel.readString();
                    Credential credential = (Credential) sgh.a(parcel, Credential.CREATOR);
                    boolean zG = sgh.g(parcel);
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getFullCredential(iBundleCallbacksAsInterface3, account, string2, credential, zG, string3, string4);
                    break;
                case 4:
                    IBundleCallbacks iBundleCallbacksAsInterface4 = IBundleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account2 = (Account) sgh.a(parcel, Account.CREATOR);
                    String string5 = parcel.readString();
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    requestIdToken(iBundleCallbacksAsInterface4, account2, string5, string6, string7);
                    break;
                case 5:
                    IBundleCallbacks iBundleCallbacksAsInterface5 = IBundleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account3 = (Account) sgh.a(parcel, Account.CREATOR);
                    String string8 = parcel.readString();
                    Credential credential2 = (Credential) sgh.a(parcel, Credential.CREATOR);
                    enforceNoDataAvail(parcel);
                    saveCredential(iBundleCallbacksAsInterface5, account3, string8, credential2);
                    break;
                case 6:
                    IBundleCallbacks iBundleCallbacksAsInterface6 = IBundleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account4 = (Account) sgh.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    getAccountSettings(iBundleCallbacksAsInterface6, account4);
                    break;
                case 7:
                    IBundleCallbacks iBundleCallbacksAsInterface7 = IBundleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setIsFirstTimeWelcomeShown(iBundleCallbacksAsInterface7);
                    break;
                case 8:
                    IBundleCallbacks iBundleCallbacksAsInterface8 = IBundleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account5 = (Account) sgh.a(parcel, Account.CREATOR);
                    boolean zG2 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setServiceEnabled(iBundleCallbacksAsInterface8, account5, zG2);
                    break;
                case 9:
                    IBundleCallbacks iBundleCallbacksAsInterface9 = IBundleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account6 = (Account) sgh.a(parcel, Account.CREATOR);
                    boolean zG3 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setAutoSignInEnabled(iBundleCallbacksAsInterface9, account6, zG3);
                    break;
                case 10:
                    IBundleCallbacks iBundleCallbacksAsInterface10 = IBundleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string9 = parcel.readString();
                    boolean zG4 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setAutoSignInEnabledForApp(iBundleCallbacksAsInterface10, string9, zG4);
                    break;
                case 11:
                    IBundleCallbacks iBundleCallbacksAsInterface11 = IBundleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account7 = (Account) sgh.a(parcel, Account.CREATOR);
                    String string10 = parcel.readString();
                    boolean zG5 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setAppNeverSave(iBundleCallbacksAsInterface11, account7, string10, zG5);
                    break;
                case 12:
                    IBundleCallbacks iBundleCallbacksAsInterface12 = IBundleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string11 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    disableYoloSaveDialogForApp(iBundleCallbacksAsInterface12, string11);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void disableYoloSaveDialogForApp(IBundleCallbacks iBundleCallbacks, String str);

    void getAccountSettings(IBundleCallbacks iBundleCallbacks, Account account);

    void getFullCredential(IBundleCallbacks iBundleCallbacks, Account account, String str, Credential credential, boolean z, String str2, String str3);

    void listCredentialsForEnabledAccounts(IBundleCallbacks iBundleCallbacks, String str, CredentialRequest credentialRequest);

    void listHints(IBundleCallbacks iBundleCallbacks, HintRequest hintRequest);

    void requestIdToken(IBundleCallbacks iBundleCallbacks, Account account, String str, String str2, String str3);

    void saveCredential(IBundleCallbacks iBundleCallbacks, Account account, String str, Credential credential);

    void setAppNeverSave(IBundleCallbacks iBundleCallbacks, Account account, String str, boolean z);

    void setAutoSignInEnabled(IBundleCallbacks iBundleCallbacks, Account account, boolean z);

    void setAutoSignInEnabledForApp(IBundleCallbacks iBundleCallbacks, String str, boolean z);

    void setIsFirstTimeWelcomeShown(IBundleCallbacks iBundleCallbacks);

    void setServiceEnabled(IBundleCallbacks iBundleCallbacks, Account account, boolean z);
}
