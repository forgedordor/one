package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import defpackage.dclw;
import defpackage.derx;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class GetConfigResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetConfigResponse> CREATOR = new derx();
    public final int a;
    public final ConnectionConfiguration b;

    public GetConfigResponse(int i, ConnectionConfiguration connectionConfiguration) {
        this.a = i;
        this.b = connectionConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 2, this.a);
        dclw.k(parcel, 3, this.b, i, false);
        dclw.c(parcel, iA);
    }
}
