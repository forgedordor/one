package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddwd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetBackupSyncSuggestionResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetBackupSyncSuggestionResponse> CREATOR = new ddwd();
    public final int a;
    public final String b;
    public final BackupSyncContactInfo c;

    public GetBackupSyncSuggestionResponse(int i, String str, BackupSyncContactInfo backupSyncContactInfo) {
        this.a = i;
        this.b = str;
        this.c = backupSyncContactInfo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.m(parcel, 2, this.b, false);
        dclw.k(parcel, 3, this.c, i, false);
        dclw.c(parcel, iA);
    }
}
