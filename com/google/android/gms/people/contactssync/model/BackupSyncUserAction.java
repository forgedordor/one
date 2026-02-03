package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddvz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BackupSyncUserAction extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BackupSyncUserAction> CREATOR = new ddvz();
    public final String a;
    public final int b;

    public BackupSyncUserAction(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.i(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }
}
