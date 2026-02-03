package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.delb;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LineItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LineItem> CREATOR = new delb();
    String a;
    String b;
    String c;
    String d;
    final int e;
    String f;

    LineItem() {
        this.e = 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, this.a, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.m(parcel, 4, this.c, false);
        dclw.m(parcel, 5, this.d, false);
        dclw.i(parcel, 6, this.e);
        dclw.m(parcel, 7, this.f, false);
        dclw.c(parcel, iA);
    }

    public LineItem(String str, String str2, String str3, String str4, int i, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = str5;
    }
}
