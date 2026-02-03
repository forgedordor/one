package com.google.android.gms.search.administration;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcfx;
import defpackage.dclw;
import defpackage.deat;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class BundleResponse extends AbstractSafeParcelable implements dcfx {
    public static final Parcelable.Creator<BundleResponse> CREATOR = new deat();
    public Status a;
    public Bundle b;

    public BundleResponse() {
    }

    @Override // defpackage.dcfx
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.p(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }

    public BundleResponse(Status status, Bundle bundle) {
        this.a = status;
        this.b = bundle;
    }
}
