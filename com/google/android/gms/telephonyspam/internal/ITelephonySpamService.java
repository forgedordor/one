package com.google.android.gms.telephonyspam.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.telephonyspam.CallSpamOptions;
import com.google.android.gms.telephonyspam.LookupSpamSettingsOptions;
import com.google.android.gms.telephonyspam.LookupSpamStatusOptions;
import com.google.android.gms.telephonyspam.MessageSpamOptions;
import com.google.android.gms.telephonyspam.ReportAsNotSpamOptions;
import com.google.android.gms.telephonyspam.ReportAsSpamOptions;
import com.google.android.gms.telephonyspam.UpdateSpamSettingsOptions;
import com.google.android.gms.telephonyspam.internal.ITelephonySpamCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ITelephonySpamService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITelephonySpamService {
        static final int TRANSACTION_getSpamSettings = 5;
        static final int TRANSACTION_getSpamStatus = 2;
        static final int TRANSACTION_lookupSpamSettings = 10;
        static final int TRANSACTION_lookupSpamStatus = 7;
        static final int TRANSACTION_reportAsNotSpam = 9;
        static final int TRANSACTION_reportAsSpam = 8;
        static final int TRANSACTION_reportCallSpamStatus = 14;
        static final int TRANSACTION_reportMessageSpamStatus = 15;
        static final int TRANSACTION_reportNotSpam = 4;
        static final int TRANSACTION_reportSpam = 3;
        static final int TRANSACTION_setSpamSettings = 6;
        static final int TRANSACTION_updateSpamSettings = 11;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITelephonySpamService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.telephonyspam.internal.ITelephonySpamService");
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamService
            public void getSpamSettings(ITelephonySpamCallbacks iTelephonySpamCallbacks, int i, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iTelephonySpamCallbacks);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamService
            public void getSpamStatus(ITelephonySpamCallbacks iTelephonySpamCallbacks, String str, int i, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iTelephonySpamCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamService
            public void lookupSpamSettings(ITelephonySpamCallbacks iTelephonySpamCallbacks, int i, LookupSpamSettingsOptions lookupSpamSettingsOptions, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iTelephonySpamCallbacks);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, lookupSpamSettingsOptions);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamService
            public void lookupSpamStatus(ITelephonySpamCallbacks iTelephonySpamCallbacks, String str, int i, LookupSpamStatusOptions lookupSpamStatusOptions, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iTelephonySpamCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, lookupSpamStatusOptions);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamService
            public void reportAsNotSpam(IStatusCallback iStatusCallback, String str, int i, ReportAsNotSpamOptions reportAsNotSpamOptions, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, reportAsNotSpamOptions);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamService
            public void reportAsSpam(IStatusCallback iStatusCallback, String str, int i, ReportAsSpamOptions reportAsSpamOptions, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, reportAsSpamOptions);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamService
            public void reportCallSpamStatus(IStatusCallback iStatusCallback, String str, boolean z, CallSpamOptions callSpamOptions, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, callSpamOptions);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(14, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamService
            public void reportMessageSpamStatus(IStatusCallback iStatusCallback, String str, boolean z, MessageSpamOptions messageSpamOptions, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, messageSpamOptions);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(15, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamService
            public void reportNotSpam(IStatusCallback iStatusCallback, String str, int i, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamService
            public void reportSpam(IStatusCallback iStatusCallback, String str, int i, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamService
            public void setSpamSettings(IStatusCallback iStatusCallback, int i, boolean z, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamService
            public void updateSpamSettings(IStatusCallback iStatusCallback, int i, boolean z, UpdateSpamSettingsOptions updateSpamSettingsOptions, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, updateSpamSettingsOptions);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.telephonyspam.internal.ITelephonySpamService");
        }

        public static ITelephonySpamService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.telephonyspam.internal.ITelephonySpamService");
            return iInterfaceQueryLocalInterface instanceof ITelephonySpamService ? (ITelephonySpamService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    ITelephonySpamCallbacks iTelephonySpamCallbacksAsInterface = ITelephonySpamCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string = parcel.readString();
                    int i3 = parcel.readInt();
                    ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getSpamStatus(iTelephonySpamCallbacksAsInterface, string, i3, apiMetadata);
                    break;
                case 3:
                    IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string2 = parcel.readString();
                    int i4 = parcel.readInt();
                    ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    reportSpam(iStatusCallbackAsInterface, string2, i4, apiMetadata2);
                    break;
                case 4:
                    IStatusCallback iStatusCallbackAsInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string3 = parcel.readString();
                    int i5 = parcel.readInt();
                    ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    reportNotSpam(iStatusCallbackAsInterface2, string3, i5, apiMetadata3);
                    break;
                case 5:
                    ITelephonySpamCallbacks iTelephonySpamCallbacksAsInterface2 = ITelephonySpamCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    int i6 = parcel.readInt();
                    ApiMetadata apiMetadata4 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getSpamSettings(iTelephonySpamCallbacksAsInterface2, i6, apiMetadata4);
                    break;
                case 6:
                    IStatusCallback iStatusCallbackAsInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    int i7 = parcel.readInt();
                    boolean zG = sgh.g(parcel);
                    ApiMetadata apiMetadata5 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    setSpamSettings(iStatusCallbackAsInterface3, i7, zG, apiMetadata5);
                    break;
                case 7:
                    ITelephonySpamCallbacks iTelephonySpamCallbacksAsInterface3 = ITelephonySpamCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string4 = parcel.readString();
                    int i8 = parcel.readInt();
                    LookupSpamStatusOptions lookupSpamStatusOptions = (LookupSpamStatusOptions) sgh.a(parcel, LookupSpamStatusOptions.CREATOR);
                    ApiMetadata apiMetadata6 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    lookupSpamStatus(iTelephonySpamCallbacksAsInterface3, string4, i8, lookupSpamStatusOptions, apiMetadata6);
                    break;
                case 8:
                    IStatusCallback iStatusCallbackAsInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string5 = parcel.readString();
                    int i9 = parcel.readInt();
                    ReportAsSpamOptions reportAsSpamOptions = (ReportAsSpamOptions) sgh.a(parcel, ReportAsSpamOptions.CREATOR);
                    ApiMetadata apiMetadata7 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    reportAsSpam(iStatusCallbackAsInterface4, string5, i9, reportAsSpamOptions, apiMetadata7);
                    break;
                case 9:
                    IStatusCallback iStatusCallbackAsInterface5 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string6 = parcel.readString();
                    int i10 = parcel.readInt();
                    ReportAsNotSpamOptions reportAsNotSpamOptions = (ReportAsNotSpamOptions) sgh.a(parcel, ReportAsNotSpamOptions.CREATOR);
                    ApiMetadata apiMetadata8 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    reportAsNotSpam(iStatusCallbackAsInterface5, string6, i10, reportAsNotSpamOptions, apiMetadata8);
                    break;
                case 10:
                    ITelephonySpamCallbacks iTelephonySpamCallbacksAsInterface4 = ITelephonySpamCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    int i11 = parcel.readInt();
                    LookupSpamSettingsOptions lookupSpamSettingsOptions = (LookupSpamSettingsOptions) sgh.a(parcel, LookupSpamSettingsOptions.CREATOR);
                    ApiMetadata apiMetadata9 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    lookupSpamSettings(iTelephonySpamCallbacksAsInterface4, i11, lookupSpamSettingsOptions, apiMetadata9);
                    break;
                case 11:
                    IStatusCallback iStatusCallbackAsInterface6 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    int i12 = parcel.readInt();
                    boolean zG2 = sgh.g(parcel);
                    UpdateSpamSettingsOptions updateSpamSettingsOptions = (UpdateSpamSettingsOptions) sgh.a(parcel, UpdateSpamSettingsOptions.CREATOR);
                    ApiMetadata apiMetadata10 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    updateSpamSettings(iStatusCallbackAsInterface6, i12, zG2, updateSpamSettingsOptions, apiMetadata10);
                    break;
                case 12:
                case 13:
                default:
                    return false;
                case 14:
                    IStatusCallback iStatusCallbackAsInterface7 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string7 = parcel.readString();
                    boolean zG3 = sgh.g(parcel);
                    CallSpamOptions callSpamOptions = (CallSpamOptions) sgh.a(parcel, CallSpamOptions.CREATOR);
                    ApiMetadata apiMetadata11 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    reportCallSpamStatus(iStatusCallbackAsInterface7, string7, zG3, callSpamOptions, apiMetadata11);
                    break;
                case 15:
                    IStatusCallback iStatusCallbackAsInterface8 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string8 = parcel.readString();
                    boolean zG4 = sgh.g(parcel);
                    MessageSpamOptions messageSpamOptions = (MessageSpamOptions) sgh.a(parcel, MessageSpamOptions.CREATOR);
                    ApiMetadata apiMetadata12 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    reportMessageSpamStatus(iStatusCallbackAsInterface8, string8, zG4, messageSpamOptions, apiMetadata12);
                    break;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getSpamSettings(ITelephonySpamCallbacks iTelephonySpamCallbacks, int i, ApiMetadata apiMetadata);

    void getSpamStatus(ITelephonySpamCallbacks iTelephonySpamCallbacks, String str, int i, ApiMetadata apiMetadata);

    void lookupSpamSettings(ITelephonySpamCallbacks iTelephonySpamCallbacks, int i, LookupSpamSettingsOptions lookupSpamSettingsOptions, ApiMetadata apiMetadata);

    void lookupSpamStatus(ITelephonySpamCallbacks iTelephonySpamCallbacks, String str, int i, LookupSpamStatusOptions lookupSpamStatusOptions, ApiMetadata apiMetadata);

    void reportAsNotSpam(IStatusCallback iStatusCallback, String str, int i, ReportAsNotSpamOptions reportAsNotSpamOptions, ApiMetadata apiMetadata);

    void reportAsSpam(IStatusCallback iStatusCallback, String str, int i, ReportAsSpamOptions reportAsSpamOptions, ApiMetadata apiMetadata);

    void reportCallSpamStatus(IStatusCallback iStatusCallback, String str, boolean z, CallSpamOptions callSpamOptions, ApiMetadata apiMetadata);

    void reportMessageSpamStatus(IStatusCallback iStatusCallback, String str, boolean z, MessageSpamOptions messageSpamOptions, ApiMetadata apiMetadata);

    void reportNotSpam(IStatusCallback iStatusCallback, String str, int i, ApiMetadata apiMetadata);

    void reportSpam(IStatusCallback iStatusCallback, String str, int i, ApiMetadata apiMetadata);

    void setSpamSettings(IStatusCallback iStatusCallback, int i, boolean z, ApiMetadata apiMetadata);

    void updateSpamSettings(IStatusCallback iStatusCallback, int i, boolean z, UpdateSpamSettingsOptions updateSpamSettingsOptions, ApiMetadata apiMetadata);
}
