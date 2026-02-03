package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dert;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetCloudSyncOptInOutDoneResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetCloudSyncOptInOutDoneResponse> CREATOR = new dert();
    public final int a;
    public final boolean b;

    public GetCloudSyncOptInOutDoneResponse(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 2, this.a);
        dclw.d(parcel, 3, this.b);
        dclw.c(parcel, iA);
    }
}
