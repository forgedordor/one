package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.detf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RemoveLocalCapabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoveLocalCapabilityResponse> CREATOR = new detf();
    public final int a;

    public RemoveLocalCapabilityResponse(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 2, this.a);
        dclw.c(parcel, iA);
    }
}
