package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dekn;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LineBoxParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LineBoxParcel> CREATOR = new dekn();
    public final WordBoxParcel[] a;
    public final BoundingBoxParcel b;
    public final BoundingBoxParcel c;
    public final BoundingBoxParcel d;
    public final String e;
    public final float f;
    public final String g;
    public final int h;
    public final boolean i;
    public final int j;
    public final int k;

    public LineBoxParcel(WordBoxParcel[] wordBoxParcelArr, BoundingBoxParcel boundingBoxParcel, BoundingBoxParcel boundingBoxParcel2, BoundingBoxParcel boundingBoxParcel3, String str, float f, String str2, int i, boolean z, int i2, int i3) {
        this.a = wordBoxParcelArr;
        this.b = boundingBoxParcel;
        this.c = boundingBoxParcel2;
        this.d = boundingBoxParcel3;
        this.e = str;
        this.f = f;
        this.g = str2;
        this.h = i;
        this.i = z;
        this.j = i2;
        this.k = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.E(parcel, 2, this.a, i);
        dclw.k(parcel, 3, this.b, i, false);
        dclw.k(parcel, 4, this.c, i, false);
        dclw.k(parcel, 5, this.d, i, false);
        dclw.m(parcel, 6, this.e, false);
        dclw.h(parcel, 7, this.f);
        dclw.m(parcel, 8, this.g, false);
        dclw.i(parcel, 9, this.h);
        dclw.d(parcel, 10, this.i);
        dclw.i(parcel, 11, this.j);
        dclw.i(parcel, 12, this.k);
        dclw.c(parcel, iA);
    }
}
