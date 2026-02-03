package com.google.android.gms.usagereporting.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.usagereporting.ConsentInformation;
import com.google.android.gms.usagereporting.ElCapitanOptions;
import com.google.android.gms.usagereporting.SafetyOptions;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks;
import com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IUsageReportingService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IUsageReportingService {
        static final int TRANSACTION_canLog = 8;
        static final int TRANSACTION_checkConsents = 16;
        static final int TRANSACTION_getAppWhitelist = 6;
        static final int TRANSACTION_getCheckboxSettingsPendingIntent = 11;
        static final int TRANSACTION_getElCapitanOptions = 13;
        static final int TRANSACTION_getOptInOptions = 2;
        static final int TRANSACTION_getPassedWhitelists = 9;
        static final int TRANSACTION_getSafetyOptions = 15;
        static final int TRANSACTION_registerOptInOptionsChangedListener = 4;
        static final int TRANSACTION_setAppWhitelist = 7;
        static final int TRANSACTION_setElCapitanOptions = 12;
        static final int TRANSACTION_setOptInOptions = 3;
        static final int TRANSACTION_setSafetyOptions = 14;
        static final int TRANSACTION_unregisterOptInOptionsChangedListener = 5;
        static final int TRANSACTION_unregisterOptInOptionsChangedListenerConnectionless = 10;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IUsageReportingService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingService");
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void canLog(String str, IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.f(parcelObtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void checkConsents(String str, IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.f(parcelObtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(16, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void getAppWhitelist(int i, IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.f(parcelObtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void getCheckboxSettingsPendingIntent(IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void getElCapitanOptions(IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(13, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void getOptInOptions(IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void getPassedWhitelists(String str, ConsentInformation consentInformation, IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, consentInformation);
                sgh.f(parcelObtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void getSafetyOptions(IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(15, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void registerOptInOptionsChangedListener(IUsageReportingOptInOptionsChangedListener iUsageReportingOptInOptionsChangedListener, IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iUsageReportingOptInOptionsChangedListener);
                sgh.f(parcelObtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void setAppWhitelist(int i, List<String> list, IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeStringList(list);
                sgh.f(parcelObtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void setElCapitanOptions(ElCapitanOptions elCapitanOptions, IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, elCapitanOptions);
                sgh.f(parcelObtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void setOptInOptions(UsageReportingOptInOptions usageReportingOptInOptions, IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, usageReportingOptInOptions);
                sgh.f(parcelObtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void setSafetyOptions(SafetyOptions safetyOptions, IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, safetyOptions);
                sgh.f(parcelObtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(14, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void unregisterOptInOptionsChangedListener(IUsageReportingOptInOptionsChangedListener iUsageReportingOptInOptionsChangedListener, IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iUsageReportingOptInOptionsChangedListener);
                sgh.f(parcelObtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingService
            public void unregisterOptInOptionsChangedListenerConnectionless(IUsageReportingOptInOptionsChangedListener iUsageReportingOptInOptionsChangedListener, IUsageReportingCallbacks iUsageReportingCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iUsageReportingOptInOptionsChangedListener);
                sgh.f(parcelObtainAndWriteInterfaceToken, iUsageReportingCallbacks);
                transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        }

        public static IUsageReportingService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
            return iInterfaceQueryLocalInterface instanceof IUsageReportingService ? (IUsageReportingService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    IUsageReportingCallbacks iUsageReportingCallbacksAsInterface = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getOptInOptions(iUsageReportingCallbacksAsInterface);
                    break;
                case 3:
                    UsageReportingOptInOptions usageReportingOptInOptions = (UsageReportingOptInOptions) sgh.a(parcel, UsageReportingOptInOptions.CREATOR);
                    IUsageReportingCallbacks iUsageReportingCallbacksAsInterface2 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setOptInOptions(usageReportingOptInOptions, iUsageReportingCallbacksAsInterface2);
                    break;
                case 4:
                    IUsageReportingOptInOptionsChangedListener iUsageReportingOptInOptionsChangedListenerAsInterface = IUsageReportingOptInOptionsChangedListener.Stub.asInterface(parcel.readStrongBinder());
                    IUsageReportingCallbacks iUsageReportingCallbacksAsInterface3 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    registerOptInOptionsChangedListener(iUsageReportingOptInOptionsChangedListenerAsInterface, iUsageReportingCallbacksAsInterface3);
                    break;
                case 5:
                    IUsageReportingOptInOptionsChangedListener iUsageReportingOptInOptionsChangedListenerAsInterface2 = IUsageReportingOptInOptionsChangedListener.Stub.asInterface(parcel.readStrongBinder());
                    IUsageReportingCallbacks iUsageReportingCallbacksAsInterface4 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    unregisterOptInOptionsChangedListener(iUsageReportingOptInOptionsChangedListenerAsInterface2, iUsageReportingCallbacksAsInterface4);
                    break;
                case 6:
                    int i3 = parcel.readInt();
                    IUsageReportingCallbacks iUsageReportingCallbacksAsInterface5 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getAppWhitelist(i3, iUsageReportingCallbacksAsInterface5);
                    break;
                case 7:
                    int i4 = parcel.readInt();
                    ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                    IUsageReportingCallbacks iUsageReportingCallbacksAsInterface6 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setAppWhitelist(i4, arrayListCreateStringArrayList, iUsageReportingCallbacksAsInterface6);
                    break;
                case 8:
                    String string = parcel.readString();
                    IUsageReportingCallbacks iUsageReportingCallbacksAsInterface7 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    canLog(string, iUsageReportingCallbacksAsInterface7);
                    break;
                case 9:
                    String string2 = parcel.readString();
                    ConsentInformation consentInformation = (ConsentInformation) sgh.a(parcel, ConsentInformation.CREATOR);
                    IUsageReportingCallbacks iUsageReportingCallbacksAsInterface8 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getPassedWhitelists(string2, consentInformation, iUsageReportingCallbacksAsInterface8);
                    break;
                case 10:
                    IUsageReportingOptInOptionsChangedListener iUsageReportingOptInOptionsChangedListenerAsInterface3 = IUsageReportingOptInOptionsChangedListener.Stub.asInterface(parcel.readStrongBinder());
                    IUsageReportingCallbacks iUsageReportingCallbacksAsInterface9 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    unregisterOptInOptionsChangedListenerConnectionless(iUsageReportingOptInOptionsChangedListenerAsInterface3, iUsageReportingCallbacksAsInterface9);
                    break;
                case 11:
                    IUsageReportingCallbacks iUsageReportingCallbacksAsInterface10 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getCheckboxSettingsPendingIntent(iUsageReportingCallbacksAsInterface10);
                    break;
                case 12:
                    ElCapitanOptions elCapitanOptions = (ElCapitanOptions) sgh.a(parcel, ElCapitanOptions.CREATOR);
                    IUsageReportingCallbacks iUsageReportingCallbacksAsInterface11 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setElCapitanOptions(elCapitanOptions, iUsageReportingCallbacksAsInterface11);
                    break;
                case 13:
                    IUsageReportingCallbacks iUsageReportingCallbacksAsInterface12 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getElCapitanOptions(iUsageReportingCallbacksAsInterface12);
                    break;
                case 14:
                    SafetyOptions safetyOptions = (SafetyOptions) sgh.a(parcel, SafetyOptions.CREATOR);
                    IUsageReportingCallbacks iUsageReportingCallbacksAsInterface13 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setSafetyOptions(safetyOptions, iUsageReportingCallbacksAsInterface13);
                    break;
                case 15:
                    IUsageReportingCallbacks iUsageReportingCallbacksAsInterface14 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getSafetyOptions(iUsageReportingCallbacksAsInterface14);
                    break;
                case 16:
                    String string3 = parcel.readString();
                    IUsageReportingCallbacks iUsageReportingCallbacksAsInterface15 = IUsageReportingCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    checkConsents(string3, iUsageReportingCallbacksAsInterface15);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void canLog(String str, IUsageReportingCallbacks iUsageReportingCallbacks);

    void checkConsents(String str, IUsageReportingCallbacks iUsageReportingCallbacks);

    void getAppWhitelist(int i, IUsageReportingCallbacks iUsageReportingCallbacks);

    void getCheckboxSettingsPendingIntent(IUsageReportingCallbacks iUsageReportingCallbacks);

    void getElCapitanOptions(IUsageReportingCallbacks iUsageReportingCallbacks);

    void getOptInOptions(IUsageReportingCallbacks iUsageReportingCallbacks);

    void getPassedWhitelists(String str, ConsentInformation consentInformation, IUsageReportingCallbacks iUsageReportingCallbacks);

    void getSafetyOptions(IUsageReportingCallbacks iUsageReportingCallbacks);

    void registerOptInOptionsChangedListener(IUsageReportingOptInOptionsChangedListener iUsageReportingOptInOptionsChangedListener, IUsageReportingCallbacks iUsageReportingCallbacks);

    void setAppWhitelist(int i, List<String> list, IUsageReportingCallbacks iUsageReportingCallbacks);

    void setElCapitanOptions(ElCapitanOptions elCapitanOptions, IUsageReportingCallbacks iUsageReportingCallbacks);

    void setOptInOptions(UsageReportingOptInOptions usageReportingOptInOptions, IUsageReportingCallbacks iUsageReportingCallbacks);

    void setSafetyOptions(SafetyOptions safetyOptions, IUsageReportingCallbacks iUsageReportingCallbacks);

    void unregisterOptInOptionsChangedListener(IUsageReportingOptInOptionsChangedListener iUsageReportingOptInOptionsChangedListener, IUsageReportingCallbacks iUsageReportingCallbacks);

    void unregisterOptInOptionsChangedListenerConnectionless(IUsageReportingOptInOptionsChangedListener iUsageReportingOptInOptionsChangedListener, IUsageReportingCallbacks iUsageReportingCallbacks);
}
