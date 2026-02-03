package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dekm;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class BoundingBoxParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BoundingBoxParcel> CREATOR = new dekm();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public BoundingBoxParcel(int i, int i2, int i3, int i4, float f) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 2, this.a);
        dclw.i(parcel, 3, this.b);
        dclw.i(parcel, 4, this.c);
        dclw.i(parcel, 5, this.d);
        dclw.h(parcel, 6, this.e);
        dclw.c(parcel, iA);
    }
}
