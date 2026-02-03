package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.deru;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetCloudSyncOptInStatusResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetCloudSyncOptInStatusResponse> CREATOR = new deru();
    public final int a;
    public final boolean b;
    public final boolean c;

    public GetCloudSyncOptInStatusResponse(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 2, this.a);
        dclw.d(parcel, 3, this.b);
        dclw.d(parcel, 4, this.c);
        dclw.c(parcel, iA);
    }
}
