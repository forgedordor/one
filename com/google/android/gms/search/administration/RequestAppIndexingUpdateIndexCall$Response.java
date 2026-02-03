package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcfx;
import defpackage.dclw;
import defpackage.debf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RequestAppIndexingUpdateIndexCall$Response extends AbstractSafeParcelable implements dcfx {
    public static final Parcelable.Creator<RequestAppIndexingUpdateIndexCall$Response> CREATOR = new debf();
    public final Status a;
    public final long b;

    public RequestAppIndexingUpdateIndexCall$Response(Status status, long j) {
        this.a = status;
        this.b = j;
    }

    @Override // defpackage.dcfx
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.j(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }
}
