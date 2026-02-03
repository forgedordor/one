package com.google.android.gms.people.contactssync.model;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddwa;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DeviceContactsSyncSetting extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceContactsSyncSetting> CREATOR = new ddwa();
    public static final int NOT_APPLICABLE = 1;
    public static final int OFF = 2;
    public static final int ON = 3;
    public static final int UNKNOWN_SYNC_SETTING = 0;
    private final int a;
    private final Account b;

    public DeviceContactsSyncSetting(int i, Account account) {
        this.a = i;
        this.b = account;
    }

    public static DeviceContactsSyncSetting create(int i) {
        return new DeviceContactsSyncSetting(i, null);
    }

    public Account getAccount() {
        return this.b;
    }

    public int getSyncSetting() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, getSyncSetting());
        dclw.k(parcel, 2, getAccount(), i, false);
        dclw.c(parcel, iA);
    }

    public static DeviceContactsSyncSetting create(int i, Account account) {
        return new DeviceContactsSyncSetting(i, account);
    }
}
