package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcfx;
import defpackage.dclw;
import defpackage.deca;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetGlobalSearchSourcesCall$Response extends AbstractSafeParcelable implements dcfx {
    public static final Parcelable.Creator<GetGlobalSearchSourcesCall$Response> CREATOR = new deca();
    public Status a;
    public GetGlobalSearchSourcesCall$GlobalSearchSource[] b;

    public GetGlobalSearchSourcesCall$Response() {
    }

    @Override // defpackage.dcfx
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.E(parcel, 2, this.b, i);
        dclw.c(parcel, iA);
    }

    public GetGlobalSearchSourcesCall$Response(Status status, GetGlobalSearchSourcesCall$GlobalSearchSource[] getGlobalSearchSourcesCall$GlobalSearchSourceArr) {
        this.a = status;
        this.b = getGlobalSearchSourcesCall$GlobalSearchSourceArr;
    }
}
