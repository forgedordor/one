package com.google.android.gms.spatula.settings.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.spatula.settings.SpatulaSettingPreference;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISpatulaSettingsCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISpatulaSettingsCallbacks {
        static final int TRANSACTION_onGetSpatulaPreference = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISpatulaSettingsCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.spatula.settings.internal.ISpatulaSettingsCallbacks");
            }

            @Override // com.google.android.gms.spatula.settings.internal.ISpatulaSettingsCallbacks
            public void onGetSpatulaPreference(Status status, SpatulaSettingPreference spatulaSettingPreference) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, spatulaSettingPreference);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.spatula.settings.internal.ISpatulaSettingsCallbacks");
        }

        public static ISpatulaSettingsCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.spatula.settings.internal.ISpatulaSettingsCallbacks");
            return iInterfaceQueryLocalInterface instanceof ISpatulaSettingsCallbacks ? (ISpatulaSettingsCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            SpatulaSettingPreference spatulaSettingPreference = (SpatulaSettingPreference) sgh.a(parcel, SpatulaSettingPreference.CREATOR);
            enforceNoDataAvail(parcel);
            onGetSpatulaPreference(status, spatulaSettingPreference);
            return true;
        }
    }

    void onGetSpatulaPreference(Status status, SpatulaSettingPreference spatulaSettingPreference);
}
