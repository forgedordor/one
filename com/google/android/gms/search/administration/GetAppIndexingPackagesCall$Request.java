package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.deaz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetAppIndexingPackagesCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetAppIndexingPackagesCall$Request> CREATOR = new deaz();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dclw.c(parcel, dclw.a(parcel));
    }
}
