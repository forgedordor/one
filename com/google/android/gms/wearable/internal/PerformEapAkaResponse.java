package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.desz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PerformEapAkaResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PerformEapAkaResponse> CREATOR = new desz();
    public final int a;
    public final String b;

    public PerformEapAkaResponse(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 2, this.a);
        dclw.m(parcel, 3, this.b, false);
        dclw.c(parcel, iA);
    }
}
