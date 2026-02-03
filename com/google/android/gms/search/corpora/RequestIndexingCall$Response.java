package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcfx;
import defpackage.dclw;
import defpackage.debt;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RequestIndexingCall$Response extends AbstractSafeParcelable implements dcfx {
    public static final Parcelable.Creator<RequestIndexingCall$Response> CREATOR = new debt();
    public Status a;
    public boolean b;

    public RequestIndexingCall$Response() {
    }

    @Override // defpackage.dcfx
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.d(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }

    public RequestIndexingCall$Response(Status status, boolean z) {
        this.a = status;
        this.b = z;
    }
}
