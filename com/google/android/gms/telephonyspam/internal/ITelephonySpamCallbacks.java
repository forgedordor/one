package com.google.android.gms.telephonyspam.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.telephonyspam.SettingsLookupResult;
import com.google.android.gms.telephonyspam.SpamLookupResult;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ITelephonySpamCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITelephonySpamCallbacks {
        static final int TRANSACTION_onSettingsLookupComplete = 3;
        static final int TRANSACTION_onSpamLookupComplete = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITelephonySpamCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.telephonyspam.internal.ITelephonySpamCallbacks");
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamCallbacks
            public void onSettingsLookupComplete(Status status, SettingsLookupResult settingsLookupResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, settingsLookupResult);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.telephonyspam.internal.ITelephonySpamCallbacks
            public void onSpamLookupComplete(Status status, SpamLookupResult spamLookupResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, spamLookupResult);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.telephonyspam.internal.ITelephonySpamCallbacks");
        }

        public static ITelephonySpamCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.telephonyspam.internal.ITelephonySpamCallbacks");
            return iInterfaceQueryLocalInterface instanceof ITelephonySpamCallbacks ? (ITelephonySpamCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                Status status = (Status) sgh.a(parcel, Status.CREATOR);
                SpamLookupResult spamLookupResult = (SpamLookupResult) sgh.a(parcel, SpamLookupResult.CREATOR);
                enforceNoDataAvail(parcel);
                onSpamLookupComplete(status, spamLookupResult);
                return true;
            }
            if (i != 3) {
                return false;
            }
            Status status2 = (Status) sgh.a(parcel, Status.CREATOR);
            SettingsLookupResult settingsLookupResult = (SettingsLookupResult) sgh.a(parcel, SettingsLookupResult.CREATOR);
            enforceNoDataAvail(parcel);
            onSettingsLookupComplete(status2, settingsLookupResult);
            return true;
        }
    }

    void onSettingsLookupComplete(Status status, SettingsLookupResult settingsLookupResult);

    void onSpamLookupComplete(Status status, SpamLookupResult spamLookupResult);
}
