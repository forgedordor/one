package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcfx;
import defpackage.dclw;
import defpackage.deav;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ClearDebugUiCacheCall$Response extends AbstractSafeParcelable implements dcfx {
    public static final Parcelable.Creator<ClearDebugUiCacheCall$Response> CREATOR = new deav();
    public final Status a;

    public ClearDebugUiCacheCall$Response(Status status) {
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
