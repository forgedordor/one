package com.google.android.gms.search.nativeapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.NativeApiInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcfx;
import defpackage.dclw;
import defpackage.decn;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetNativeApiInfoCall$Response extends AbstractSafeParcelable implements dcfx {
    public static final Parcelable.Creator<GetNativeApiInfoCall$Response> CREATOR = new decn();
    public Status a;
    public NativeApiInfo b;

    public GetNativeApiInfoCall$Response() {
    }

    @Override // defpackage.dcfx
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.c(parcel, iA);
    }

    public GetNativeApiInfoCall$Response(Status status, NativeApiInfo nativeApiInfo) {
        this.a = status;
        this.b = nativeApiInfo;
    }
}
