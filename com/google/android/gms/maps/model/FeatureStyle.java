package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddrj;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FeatureStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FeatureStyle> CREATOR = new ddrj();
    public final Integer a;
    public final Integer b;
    public final Float c;
    public final Float d;

    public FeatureStyle(Integer num, Integer num2, Float f, Float f2) {
        this.a = num;
        this.b = num2;
        this.c = f;
        this.d = f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        int iA = dclw.a(parcel);
        dclw.x(parcel, 1, num);
        dclw.x(parcel, 2, this.b);
        dclw.t(parcel, 3, this.c);
        dclw.t(parcel, 4, this.d);
        dclw.c(parcel, iA);
    }
}
