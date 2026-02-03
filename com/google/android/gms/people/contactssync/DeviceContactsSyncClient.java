package com.google.android.gms.people.contactssync;

import android.content.Context;
import com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting;
import defpackage.defn;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface DeviceContactsSyncClient {

    /* compiled from: PG */
    public interface SyncSettingUpdatedListener {
        void onDeviceContactsSyncSettingUpdated();
    }

    defn<DeviceContactsSyncSetting> getDeviceContactsSyncSetting();

    defn<Void> launchDeviceContactsSyncSettingActivity(Context context);

    defn<Void> registerSyncSettingUpdatedListener(SyncSettingUpdatedListener syncSettingUpdatedListener);

    defn<Boolean> unregisterSyncSettingUpdatedListener(SyncSettingUpdatedListener syncSettingUpdatedListener);
}
