package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddvx;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class BackupAndSyncSuggestion extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BackupAndSyncSuggestion> CREATOR = new ddvx();
    public final int a;
    public final int b;

    public BackupAndSyncSuggestion(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 2, i2);
        dclw.i(parcel, 3, this.b);
        dclw.c(parcel, iA);
    }
}
