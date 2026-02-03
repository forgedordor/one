package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcfx;
import defpackage.dclw;
import defpackage.ddok;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FusedLocationProviderResult extends AbstractSafeParcelable implements dcfx {
    public static final Parcelable.Creator<FusedLocationProviderResult> CREATOR = new ddok();
    public final Status a;

    public FusedLocationProviderResult(Status status) {
        this.a = status;
    }

    @Override // defpackage.dcfx
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, status, i, false);
        dclw.c(parcel, iA);
    }
}
