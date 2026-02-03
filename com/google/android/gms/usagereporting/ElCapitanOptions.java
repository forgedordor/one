package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dejg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ElCapitanOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ElCapitanOptions> CREATOR = new dejg();
    public final boolean a;
    public final int b;

    public ElCapitanOptions(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.d(parcel, 2, this.a);
        dclw.i(parcel, 3, this.b);
        dclw.c(parcel, iA);
    }
}
