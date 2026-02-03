package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class StyleSpan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StyleSpan> CREATOR = new ddse();
    public final StrokeStyle a;
    public final double b;

    public StyleSpan(StrokeStyle strokeStyle, double d) {
        if (d <= 0.0d) {
            throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
        }
        this.a = strokeStyle;
        this.b = d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        StrokeStyle strokeStyle = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 2, strokeStyle, i, false);
        dclw.g(parcel, 3, this.b);
        dclw.c(parcel, iA);
    }
}
