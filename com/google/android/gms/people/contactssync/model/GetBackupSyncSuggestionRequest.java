package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddwc;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetBackupSyncSuggestionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetBackupSyncSuggestionRequest> CREATOR = new ddwc();
    public final int a;
    public final int b;

    public GetBackupSyncSuggestionRequest(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.i(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }
}
