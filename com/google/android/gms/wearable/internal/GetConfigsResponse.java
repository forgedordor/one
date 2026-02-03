package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import defpackage.dclw;
import defpackage.dery;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetConfigsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetConfigsResponse> CREATOR = new dery();
    public final int a;
    public final ConnectionConfiguration[] b;

    public GetConfigsResponse(int i, ConnectionConfiguration[] connectionConfigurationArr) {
        this.a = i;
        this.b = connectionConfigurationArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 2, this.a);
        dclw.E(parcel, 3, this.b, i);
        dclw.c(parcel, iA);
    }
}
