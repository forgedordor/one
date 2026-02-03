package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddwg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RecordBackupSyncUserActionResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RecordBackupSyncUserActionResponse> CREATOR = new ddwg();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dclw.c(parcel, dclw.a(parcel));
    }
}
