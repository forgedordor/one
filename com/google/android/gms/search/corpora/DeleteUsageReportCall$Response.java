package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcfx;
import defpackage.dclw;
import defpackage.debl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DeleteUsageReportCall$Response extends AbstractSafeParcelable implements dcfx {
    public static final Parcelable.Creator<DeleteUsageReportCall$Response> CREATOR = new debl();
    public Status a;

    public DeleteUsageReportCall$Response() {
    }

    @Override // defpackage.dcfx
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.c(parcel, iA);
    }

    public DeleteUsageReportCall$Response(Status status) {
        this.a = status;
    }
}
