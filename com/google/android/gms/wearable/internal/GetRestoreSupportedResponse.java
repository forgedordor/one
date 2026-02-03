package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.desj;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetRestoreSupportedResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetRestoreSupportedResponse> CREATOR = new desj();
    public final int a;
    public final boolean b;

    public GetRestoreSupportedResponse(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.d(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }
}
