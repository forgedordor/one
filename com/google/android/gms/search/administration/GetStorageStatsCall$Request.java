package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.debc;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetStorageStatsCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetStorageStatsCall$Request> CREATOR = new debc();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dclw.c(parcel, dclw.a(parcel));
    }
}
