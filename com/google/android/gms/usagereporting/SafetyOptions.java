package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dejr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SafetyOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SafetyOptions> CREATOR = new dejr();
    public final boolean a;
    public final boolean b;
    public final int c;

    public SafetyOptions(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.d(parcel, 2, this.a);
        dclw.d(parcel, 3, this.b);
        dclw.i(parcel, 4, this.c);
        dclw.c(parcel, iA);
    }
}
